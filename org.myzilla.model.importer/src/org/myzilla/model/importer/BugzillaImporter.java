/*
 * Copyright (c) 2004 - 2012 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.myzilla.model.importer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.myzilla.Classification;
import org.myzilla.Comment;
import org.myzilla.Component;
import org.myzilla.Myzilla;
import org.myzilla.MyzillaFactory;
import org.myzilla.Priority;
import org.myzilla.Product;
import org.myzilla.Resolution;
import org.myzilla.Severity;
import org.myzilla.Status;
import org.myzilla.User;
import org.myzilla.Version;
import org.myzilla.storage.CDOStorage;
import org.myzilla.storage.Storage;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Imports ~20.000 real bugzillas from /org.myzilla.model.importer/bugzillas.zip and commits them into the myzilla storage.
 *
 * @author Eike Stepper
 */
public class BugzillaImporter
{
  private static final SAXParserFactory PARSER_FACTORY = SAXParserFactory.newInstance();

  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("y-M-d H:m:s");

  private static final int MAX_STRING_LENGTH = 2000;

  private static final int MAX_CHILDREN = 50;

  private static Map<String, EObject> nodes = new HashMap<String, EObject>();

  private static Resource users;

  private static Resource bugs;

  private static int count;

  public static void main(String[] args) throws Exception
  {
    SAXParser parser = PARSER_FACTORY.newSAXParser();

    // Create model storage in the "myzillas" folder in this project
    Storage storage = new CDOStorage("localhost", "myzilla");

    try
    {
      // Create separate resources for bugs and users
      users = storage.createResource("users");
      bugs = storage.createResource("bugs");

      // Parse the Bugzilla XML files in this project
      ZipFile file = new ZipFile("bugzillas.zip");
      Enumeration<? extends ZipEntry> entries = file.entries();

      while (entries.hasMoreElements())
      {
        ZipEntry entry = entries.nextElement();
        InputStream in = null;

        try
        {
          in = file.getInputStream(entry);

          Myzilla myzilla = MyzillaFactory.eINSTANCE.createMyzilla();
          XMLHandler handler = new XMLHandler(myzilla);
          parser.parse(in, handler);
        }
        catch (Exception ex)
        {
          ex.printStackTrace();
        }
        finally
        {
          if (in != null)
          {
            in.close();
          }
        }
      }

      long start = System.currentTimeMillis();

      // Persist the imported data
      storage.commit();

      System.err.println("Duration: " + (System.currentTimeMillis() - start) + " millis");
    }
    finally
    {
      // Important: release of all storage-related resources!
      storage.dispose();
    }
  }

  private static Classification getClassification(String name)
  {
    Classification result = (Classification)nodes.get(name);
    if (result == null)
    {
      result = MyzillaFactory.eINSTANCE.createClassification();
      result.setName(name);
      nodes.put(name, result);
      bugs.getContents().add(result);
    }

    return result;
  }

  private static Product getProduct(Classification container, String name)
  {
    String key = container.getName() + "." + name;
    Product result = (Product)nodes.get(key);
    if (result == null)
    {
      result = MyzillaFactory.eINSTANCE.createProduct();
      result.setName(name);
      nodes.put(key, result);
      container.getProducts().add(result);
    }

    return result;
  }

  private static Component getComponent(Product container, String name)
  {
    String key = ((Classification)container.eContainer()).getName() + "." + container.getName() + "." + name;
    Component result = (Component)nodes.get(key);
    if (result == null)
    {
      result = MyzillaFactory.eINSTANCE.createComponent();
      result.setName(name);
      nodes.put(key, result);
      container.getComponents().add(result);
    }

    return result;
  }

  private static Version getVersion(Component container, String value)
  {
    int pos = value.lastIndexOf('.');
    if (pos == -1)
    {
      value = "1.0.0";
      pos = 3;
    }

    String key = ((Classification)container.eContainer().eContainer()).getName() + "." + ((Product)container.eContainer()).getName() + "." + container.getName() + ".v" + value;
    Version result = (Version)nodes.get(key);
    if (result == null)
    {
      result = MyzillaFactory.eINSTANCE.createVersion();
      result.setValue(value);
      nodes.put(key, result);
      container.getVersions().add(result);
    }
    else if (result.getMyzillas().size() > MAX_CHILDREN)
    {
      return null;
    }

    return result;
  }

  /**
   * @author Eike Stepper
   */
  private static final class XMLHandler extends DefaultHandler
  {
    private Myzilla myzilla;

    private StringBuilder builder;

    private Classification classification;

    private Product product;

    private Component component;

    private Version version;

    private Comment comment;

    public XMLHandler(Myzilla myzilla)
    {
      this.myzilla = myzilla;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {
      if (builder == null)
      {
        builder = new StringBuilder();
      }

      builder.append(ch, start, length);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
      builder = null;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
      if ("bug_id".equals(qName))
      {
        myzilla.setBugID(getText());
      }
      else if ("short_desc".equals(qName))
      {
        myzilla.setTitle(getText());
      }
      else if ("classification".equals(qName))
      {
        classification = getClassification(getText());
      }
      else if ("product".equals(qName))
      {
        product = getProduct(classification, getText());
      }
      else if ("component".equals(qName))
      {
        component = getComponent(product, getText());
      }
      else if ("version".equals(qName))
      {
        version = getVersion(component, getText());
        if (version != null)
        {
          version.getMyzillas().add(myzilla);
        }
      }
      else if ("bug_severity".equals(qName))
      {
        myzilla.setSeverity(Severity.get(getText()));
      }
      else if ("priority".equals(qName))
      {
        myzilla.setPriority(Priority.get(getText()));
      }
      else if ("bug_status".equals(qName))
      {
        myzilla.setStatus(Status.get(getText()));
      }
      else if ("resolution".equals(qName))
      {
        String text = getText();
        if (text.length() != 0)
        {
          myzilla.setResolution(Resolution.get(text));
          System.out.print(++count);
          System.out.print(": ");
          System.out.println("bug-" + myzilla.getBugID() + ".xml");
        }
      }
      else if ("reporter".equals(qName))
      {
        User user = FakeUsers.getUser(users.getContents(), getText());
        myzilla.setReporter(user);
      }
      else if ("assigned_to".equals(qName))
      {
        User user = FakeUsers.getUser(users.getContents(), getText());
        myzilla.setAssignee(user);
      }
      else if ("who".equals(qName))
      {
        User user = FakeUsers.getUser(users.getContents(), getText());

        comment = MyzillaFactory.eINSTANCE.createComment();
        comment.setCommenter(user);

        myzilla.getComments().add(comment);
      }
      else if ("bug_when".equals(qName))
      {
        String text = getText();
        text = text.substring(0, text.length() - 6);

        try
        {
          Date date = DATE_FORMAT.parse(text);
          comment.setWhen(date);
        }
        catch (ParseException ex)
        {
          comment.setWhen(new Date());
        }
      }
      else if ("thetext".equals(qName))
      {
        comment.setText(getText());
        comment = null;
      }
    }

    private String getText()
    {
      if (builder == null)
      {
        return "";
      }

      if (builder.length() > MAX_STRING_LENGTH)
      {
        builder.setLength(MAX_STRING_LENGTH);
      }

      return builder.toString();
    }
  }
}
