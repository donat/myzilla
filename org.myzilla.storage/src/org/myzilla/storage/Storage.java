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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.myzilla.storage.util.Bean;

/**
 * @author Eike Stepper
 */
public abstract class Storage extends Bean
{
  private ResourceSet resourceSet;

  private boolean dirty;

  private boolean realTime;

  private String userID;

  protected Storage()
  {
  }

  public boolean isDirty()
  {
    return dirty;
  }

  protected void setDirty(boolean dirty)
  {
    firePropertyChange("dirty", this.dirty, this.dirty = dirty);
  }

  public boolean isRealTime()
  {
    return realTime;
  }

  public void setRealTime(boolean realTime)
  {
    firePropertyChange("realTime", this.realTime, this.realTime = realTime);
  }

  public String getUserID()
  {
    return userID;
  }

  protected void setUserID(String userID)
  {
    firePropertyChange("userID", this.userID, this.userID = userID);
  }

  public synchronized ResourceSet getResourceSet()
  {
    if (resourceSet == null)
    {
      resourceSet = createResourceSet();
    }

    return resourceSet;
  }

  public void dispose()
  {
    resourceSet = null;
  }

  public Resource getResource(String path)
  {
    URI uri = getURI(path);
    return getResourceSet().getResource(uri, true);
  }

  public Resource createResource(String path)
  {
    URI uri = getURI(path);
    return getResourceSet().createResource(uri);
  }

  public void rollback()
  {
    reload();
  }

  protected void reload()
  {
    ResourceSet resourceSet = createResourceSet();
    firePropertyChange("resourceSet", this.resourceSet, this.resourceSet = resourceSet);
    setDirty(false);
  }

  public abstract void commit();

  protected abstract URI getURI(String path);

  protected abstract ResourceSet createResourceSet();
}
