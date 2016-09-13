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

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import org.myzilla.Myzilla;
import org.myzilla.app.bundle.Activator;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author Eike Stepper
 */
public class MyzillaNavigatorView extends ViewPart
{
  public static final String ID = "org.myzilla.app.navigator";

  private static final Object[] NO_CHILDREN = {};

  private TreeViewer treeViewer;

  public MyzillaNavigatorView()
  {
  }

  @Override
  public void setFocus()
  {
    treeViewer.getTree().setFocus();
  }

  @Override
  public void createPartControl(Composite parent)
  {
    ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
        ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

    treeViewer = new TreeViewer(parent, SWT.NONE);
    treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory)
    {
      @Override
      public boolean hasChildren(Object object)
      {
        if (object instanceof Myzilla)
        {
          return false;
        }

        return super.hasChildren(object);
      }

      @Override
      public Object[] getChildren(Object object)
      {
        if (object instanceof Myzilla)
        {
          return NO_CHILDREN;
        }

        return super.getChildren(object);
      }
    });

    treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
    getViewSite().setSelectionProvider(treeViewer);

    resetInput();
    Activator.getStorage().addPropertyChangeListener("resourceSet", new PropertyChangeListener()
    {
      public void propertyChange(PropertyChangeEvent event)
      {
        resetInput();
      }
    });

    setupViewMenu();
    setupToolBar();
    setupDoubleClick();
  }

  private void resetInput()
  {
    Resource resource = Activator.getStorage().getResource("bugs");
    treeViewer.setInput(resource);
  }

  private void setupViewMenu()
  {
    IMenuManager manager = getViewSite().getActionBars().getMenuManager();
    manager.add(new RealtimeAction());
    manager.add(new RefreshAction());
  }

  private void setupToolBar()
  {
    IToolBarManager manager = getViewSite().getActionBars().getToolBarManager();
    manager.add(new CommitAction());
    manager.add(new RollbackAction());
    manager.add(new ExpandAction());
    manager.add(new CollapseAllAction());
  }

  private void setupDoubleClick()
  {
    treeViewer.addDoubleClickListener(new DoubleClickListener());
  }

  /**
   * @author Eike Stepper
   */
  public class DoubleClickListener implements IDoubleClickListener
  {
    public void doubleClick(DoubleClickEvent event)
    {
      IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
      Object object = selection.getFirstElement();
      treeViewer.setExpandedState(object, !treeViewer.getExpandedState(object));
    }
  }

  /**
   * @author Eike Stepper
   */
  public abstract class ActionWithIcon extends Action
  {
    public ActionWithIcon(String text, String icon)
    {
      super(text);
      setIcon(icon);
    }

    public ActionWithIcon(String text, String icon, int style)
    {
      super(text, style);
      setIcon(icon);
    }

    private void setIcon(String icon)
    {
      setImageDescriptor(Activator.getImageDescriptor("icons/" + icon));
    }
  }

  /**
   * @author Eike Stepper
   */
  public abstract class LongRunningAction extends ActionWithIcon
  {
    public LongRunningAction(String text, String icon)
    {
      super(text, icon);
    }

    @Override
    public final void run()
    {
      BusyIndicator.showWhile(getSite().getShell().getDisplay(), new Runnable()
      {
        public void run()
        {
          runLong();
        }
      });
    }

    protected abstract void runLong();
  }

  /**
   * @author Eike Stepper
   */
  public abstract class DirtyStateAction extends LongRunningAction
  {
    public DirtyStateAction(String text, String icon)
    {
      super(text, icon);
      updateEnablement();
      Activator.getStorage().addPropertyChangeListener("dirty", new PropertyChangeListener()
      {
        public void propertyChange(PropertyChangeEvent event)
        {
          updateEnablement();
        }
      });
    }

    private void updateEnablement()
    {
      setEnabled(Activator.getStorage().isDirty());
    }
  }

  /**
   * @author Eike Stepper
   */
  public class CommitAction extends DirtyStateAction
  {
    public CommitAction()
    {
      super("Commit", "commit.gif");
    }

    @Override
    protected void runLong()
    {
      Activator.getStorage().commit();
    }
  }

  /**
   * @author Eike Stepper
   */
  public class RollbackAction extends DirtyStateAction
  {
    public RollbackAction()
    {
      super("Rollback", "rollback.gif");
    }

    @Override
    protected void runLong()
    {
      Activator.getStorage().commit();
    }
  }

  /**
   * @author Eike Stepper
   */
  public class ExpandAction extends ActionWithIcon
  {
    private ITreeContentProvider contentProvider = (ITreeContentProvider)treeViewer.getContentProvider();

    public ExpandAction()
    {
      super("Expand", "expand.gif");
    }

    @Override
    public void run()
    {
      Object element = treeViewer.getInput();

      IStructuredSelection selection = (IStructuredSelection)treeViewer.getSelection();
      if (!selection.isEmpty())
      {
        element = selection.getFirstElement();
      }

      while (element != null)
      {
        Object[] children = contentProvider.getChildren(element);
        if (children.length == 0)
        {
          break;
        }

        element = children[0];
      }

      treeViewer.setSelection(new StructuredSelection(element));
    }
  }

  /**
   * @author Eike Stepper
   */
  public class CollapseAllAction extends ActionWithIcon
  {
    public CollapseAllAction()
    {
      super("Collapse All", "collapse_all.gif");
    }

    @Override
    public void run()
    {
      treeViewer.collapseAll();
    }
  }

  /**
   * @author Eike Stepper
   */
  public class RealtimeAction extends Action
  {
    public RealtimeAction()
    {
      super("Real-Time Editing", SWT.CHECK);
      updateEnablement();
      Activator.getStorage().addPropertyChangeListener("realTime", new PropertyChangeListener()
      {
        public void propertyChange(PropertyChangeEvent event)
        {
          updateEnablement();
        }
      });
    }

    private void updateEnablement()
    {
      setChecked(Activator.getStorage().isRealTime());
    }

    @Override
    public void run()
    {
      Activator.getStorage().setRealTime(!Activator.getStorage().isRealTime());
    }
  }

  /**
   * @author Eike Stepper
   */
  public class RefreshAction extends ActionWithIcon
  {
    public RefreshAction()
    {
      super("Refresh", "refresh.gif");
    }

    @Override
    public void run()
    {
      treeViewer.refresh(true);
    }
  }
}
