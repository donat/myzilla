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
package org.myzilla.storage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.io.File;
import java.io.IOException;

/**
 * @author Eike Stepper
 */
public class FileSystemStorage extends Storage
{
  private static final String EXTENSION = "myzilla";

  private static final XMIResourceFactoryImpl FACTORY = new XMIResourceFactoryImpl();

  private File root;

  public FileSystemStorage(String root)
  {
    this.root = new File(root);
  }

  @Override
  public void commit()
  {
    try
    {
      System.out.println("Saving all resources to " + root.getAbsolutePath() + "...");
      for (Resource resource : getResourceSet().getResources())
      {
        resource.save(null);
      }

      setDirty(false);
    }
    catch (Exception ex)
    {
      throw new Error("I've totally screwed your persistent data! Good bye. Have a nice day...");
    }
  }

  @Override
  protected URI getURI(String path)
  {
    String absolutePath = new File(root, path).getAbsolutePath();
    return URI.createFileURI(absolutePath + "." + EXTENSION);
  }

  @Override
  protected ResourceSet createResourceSet()
  {
    ResourceSet resourceSet = new ResourceSetImpl()
    {
      @Override
      protected void demandLoad(Resource resource) throws IOException
      {
        super.demandLoad(resource);

        // Listen to model changes and adjust the dirty state accordingly
        resource.eAdapters().add(new EContentAdapter()
        {
          @Override
          public void notifyChanged(Notification notification)
          {
            super.notifyChanged(notification);
            if (!notification.isTouch())
            {
              setDirty(true);
            }
          }
        });
      }
    };

    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EXTENSION, FACTORY);
    return resourceSet;
  }
}
