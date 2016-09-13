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

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOPostEventTransactionHandler;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CDOURIUtil;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDODirtyStateAdapter;

import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author Eike Stepper
 */
public class CDOStorage extends Storage
{
  private IConnector connector;

  private CDOSession session;

  private CDOTransaction transaction;

  public CDOStorage(String server, String repository)
  {
    connector = (IConnector)IPluginContainer.INSTANCE.getElement("org.eclipse.net4j.connectors", "tcp", server);

    CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
    config.setConnector(connector);
    config.setRepositoryName(repository);

    session = config.openNet4jSession();

    transaction = session.openTransaction();
    transaction.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
    transaction.addListener(new CDODirtyStateAdapter()
    {
      @Override
      protected void onDirtyStateChanged(boolean dirty)
      {
        setDirty(dirty);
      }
    });

    transaction.addTransactionHandler(new CDOPostEventTransactionHandler.Default()
    {
      @Override
      protected void modifiedObject(CDOTransaction transaction, CDOObject object, Notification msg)
      {
        if (isRealTime())
        {
          commit();
        }
      }
    });
  }

  @Override
  public void dispose()
  {
    if (session != null)
    {
      session.close(); // Also closes all open transactions
      session = null;
      transaction = null;
    }

    if (connector != null)
    {
      connector.close();
      connector = null;
    }

    super.dispose();
  }

  @Override
  public void commit()
  {
    try
    {
      System.out.println("Committing changes to the CDO repository.\nThe large initial commit may take a while...");
      transaction.commit();
    }
    catch (CommitException ex)
    {
      transaction.rollback();
    }
  }

  @Override
  protected URI getURI(String path)
  {
    return CDOURIUtil.createResourceURI(session, path);
  }

  @Override
  protected ResourceSet createResourceSet()
  {
    return transaction.getResourceSet();
  }

  static
  {
    if (!OMPlatform.INSTANCE.isExtensionRegistryAvailable())
    {
      Net4jUtil.prepareContainer(IPluginContainer.INSTANCE);
      TCPUtil.prepareContainer(IPluginContainer.INSTANCE);
    }
  }
}
