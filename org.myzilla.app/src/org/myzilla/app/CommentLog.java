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
package org.myzilla.app;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

import org.myzilla.Comment;
import org.myzilla.Myzilla;
import org.myzilla.MyzillaPackage;
import org.myzilla.User;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Eike Stepper
 */
public class CommentLog extends Browser
{
  private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yy-M-d H:m:s");

  private static final EList<Comment> NO_COMMENTS = ECollections.emptyEList();

  private static final String LOG_ID = "log";

  private final Adapter adapter = new MyzillaAdapter();

  private Myzilla myzilla;

  public CommentLog(Composite parent, int style)
  {
    super(parent, style);
    setJavascriptEnabled(true);
    setText("<dl style='font-family:Segoe UI;font-size:9pt;' id='" + LOG_ID + "'></dl>");
  }

  @Override
  protected void checkSubclass()
  {
    // Allow subclassing
  }

  @Override
  public void dispose()
  {
    if (myzilla != null)
    {
      myzilla.eAdapters().remove(adapter);
      myzilla = null;
    }

    super.dispose();
  }

  public Myzilla getMyzilla()
  {
    return myzilla;
  }

  public void setMyzilla(Myzilla myzilla)
  {
    Myzilla old = this.myzilla;
    if (myzilla != old)
    {
      if (old != null)
      {
        old.eAdapters().remove(adapter);
      }

      this.myzilla = myzilla;

      if (myzilla != null)
      {
        addComments(myzilla.getComments(), false);
        myzilla.eAdapters().add(adapter);
      }
      else if (old != null)
      {
        addComments(NO_COMMENTS, false);
      }
    }
  }

  protected void addComments(List<Comment> comments, final boolean append)
  {
    final StringBuilder builder = new StringBuilder();
    builder.append("document.getElementById(\"");
    builder.append(LOG_ID);
    builder.append("\").innerHTML");

    if (append)
    {
      builder.append("+");
    }

    builder.append("='");

    for (Comment comment : comments)
    {
      formatComment(builder, comment);
    }

    builder.append("'");
    String script = builder.toString();

    getDisplay().asyncExec(new BrowserUpdater(script, append));
  }

  protected void formatComment(final StringBuilder builder, Comment comment)
  {
    Date when = comment.getWhen();
    User commenter = comment.getCommenter();
    String text = getTrimmedText(comment);

    builder.append("<dt>");
    builder.append("<b><font color=\\'#0000CD\\'>");
    builder.append(commenter == null ? "Anonymous" : commenter.getName());
    builder.append("</font></b>&nbsp;&nbsp;");
    builder.append(when == null ? "" : "20" + DATE_FORMAT.format(when).replace(" ", "&nbsp;"));
    builder.append("</dt>");
    builder.append("<dd style=\\'margin:5 0 8 16;\\'>");
    builder.append(text.replace("<", "&lt;").replace("\n", "<br>").replace("\r", "").replace("'", "\\'"));
    builder.append("</dd>");
  }

  private String getTrimmedText(Comment comment)
  {
    String text = comment.getText();
    int start = 0;
    int end = text.length();
    boolean trimmed = false;
    while (start < end && text.charAt(start) == '\n')
    {
      ++start;
      trimmed = true;
    }

    while (end > start && text.charAt(end - 1) == '\n')
    {
      --end;
      trimmed = true;
    }

    if (trimmed)
    {
      text = text.substring(start, end - 1);
    }

    return text;
  }

  /**
   * @author Eike Stepper
   */
  private final class MyzillaAdapter extends AdapterImpl
  {
    @Override
    @SuppressWarnings("unchecked")
    public void notifyChanged(Notification msg)
    {
      if (msg.getFeature() == MyzillaPackage.Literals.MYZILLA__COMMENTS)
      {
        switch (msg.getEventType())
        {
        case Notification.ADD:
          addComments(Collections.singletonList((Comment)msg.getNewValue()), true);
          break;

        case Notification.ADD_MANY:
          addComments((List<Comment>)msg.getNewValue(), true);
          break;
        }
      }
    }
  }

  /**
   * @author Eike Stepper
   */
  private final class BrowserUpdater implements Runnable
  {
    private final String script;

    private final boolean append;

    private BrowserUpdater(String script, boolean append)
    {
      this.script = script;
      this.append = append;
    }

    public void run()
    {
      execute(script);

      // The following is needed because of the asynchronicity of the browser widget ;-(
      getDisplay().asyncExec(new Runnable()
      {
        public void run()
        {
          if (append)
          {
            execute("window.scrollTo(0, document.body.scrollHeight)");
          }
          else
          {
            execute("window.scrollTo(0, 0)");
          }
        }
      });
    }
  }
}
