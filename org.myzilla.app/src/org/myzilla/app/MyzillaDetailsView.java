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

import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;

import org.myzilla.Comment;
import org.myzilla.Myzilla;
import org.myzilla.MyzillaFactory;
import org.myzilla.MyzillaPackage.Literals;
import org.myzilla.Priority;
import org.myzilla.Resolution;
import org.myzilla.Severity;
import org.myzilla.Status;
import org.myzilla.app.bundle.Activator;

import java.util.Date;

/**
 * @author Eike Stepper
 */
public class MyzillaDetailsView extends ViewPart
{
  public static final String ID = "org.myzilla.app.details";

  private static final int WIDTH_1 = 80;

  private static final int WIDTH_2 = 120;

  private DataBindingContext bindingContext;

  private Myzilla myzilla;

  private Text bugID;

  private Text title;

  private ComboViewer severity;

  private ComboViewer priority;

  private ComboViewer status;

  private ComboViewer resolution;

  private Text reporter;

  private ComboViewer assignee;

  private CommentLog comments;

  private Text newComment;

  private Composite details;

  public MyzillaDetailsView()
  {
  }

  @Override
  public void setFocus()
  {
    title.setFocus();
  }

  @Override
  public void createPartControl(Composite parent)
  {
    ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
        ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

    GridLayout gl_parent = new GridLayout(1, false);
    gl_parent.verticalSpacing = 0;
    gl_parent.marginWidth = 0;
    gl_parent.marginHeight = 0;
    gl_parent.horizontalSpacing = 0;
    parent.setLayout(gl_parent);

    details = new Composite(parent, SWT.NONE);
    details.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
    details.setLayout(new GridLayout(4, false));
    details.setBounds(0, 0, 64, 64);

    // BUG-ID
    {
      GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
      gd.widthHint = WIDTH_1;

      bugID = new Text(details, SWT.RIGHT);
      bugID.setForeground(org.eclipse.wb.swt.SWTResourceManager.getColor(0, 0, 205));
      bugID.setText("bugID");
      bugID.setLayoutData(gd);
      bugID.setEditable(false);
      bugID.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
    }

    // TITLE
    {
      title = new Text(details, SWT.BORDER);
      title.setForeground(org.eclipse.wb.swt.SWTResourceManager.getColor(0, 0, 205));
      title.setText("title");
      title.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
      title.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
    }

    // SEVERITY
    {
      severity = new ComboViewer(details, SWT.NONE);
      severity.setContentProvider(new ArrayContentProvider());
      severity.setLabelProvider(new LabelProvider());
      severity.setInput(Severity.values());

      GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
      gd.widthHint = WIDTH_1;

      Combo combo = severity.getCombo();
      combo.setLayoutData(gd);
      combo.setText("severity");
    }

    // STATUS
    {
      status = new ComboViewer(details, SWT.NONE);
      status.setContentProvider(new ArrayContentProvider());
      status.setLabelProvider(new LabelProvider());
      status.setInput(Status.values());

      GridData gd = new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1);
      gd.widthHint = WIDTH_2;

      Combo combo = status.getCombo();
      combo.setLayoutData(gd);
      combo.setText("status");
    }

    // REPORTER
    {
      Label label = new Label(details, SWT.NONE);
      label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
      label.setText("Reporter:");

      reporter = new Text(details, SWT.BORDER);
      reporter.setText("reporter");
      reporter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
      reporter.setEditable(false);
    }

    // PRIORITY
    {
      priority = new ComboViewer(details, SWT.NONE);
      priority.setContentProvider(new ArrayContentProvider());
      priority.setLabelProvider(new LabelProvider());
      priority.setInput(Priority.values());

      GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
      gd.widthHint = WIDTH_1;

      Combo combo = priority.getCombo();
      combo.setLayoutData(gd);
      combo.setText("priority");
    }

    // RESOLUTION
    {
      resolution = new ComboViewer(details, SWT.NONE);
      resolution.setContentProvider(new ArrayContentProvider());
      resolution.setLabelProvider(new LabelProvider());
      resolution.setInput(Resolution.values());

      GridData gd = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
      gd.widthHint = WIDTH_2;

      Combo combo = resolution.getCombo();
      combo.setLayoutData(gd);
      combo.setText("resolution");
    }

    // ASSIGNEE
    {
      Label label = new Label(details, SWT.NONE);
      label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
      label.setText("Assignee:");

      assignee = new ComboViewer(details, SWT.NONE);
      assignee.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
      assignee.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
      assignee.setInput(Activator.getStorage().getResource("users"));

      Combo combo = assignee.getCombo();
      combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
      combo.setText("assignee");
    }

    SashForm sashForm = new SashForm(parent, SWT.VERTICAL);
    sashForm.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
    sashForm.setLocation(0, 0);

    // COMMENTS
    {
      comments = new CommentLog(sashForm, SWT.NONE);
      comments.setJavascriptEnabled(true);
    }

    // NEW COMMENT
    {
      newComment = new Text(sashForm, SWT.WRAP | SWT.V_SCROLL | SWT.MULTI);
      sashForm.setWeights(new int[] { 402, 48 });
      newComment.addKeyListener(new KeyAdapter()
      {
        @Override
        public void keyPressed(KeyEvent e)
        {
          if (e.keyCode == 13 && (e.stateMask & SWT.CTRL) == 0)
          {
            handleNewComment();
            e.character = SWT.NONE;
            e.doit = false;
          }
        }
      });
    }

    getViewSite().getPage().addSelectionListener(new ISelectionListener()
    {
      public void selectionChanged(IWorkbenchPart part, ISelection selection)
      {
        if (selection instanceof IStructuredSelection)
        {
          handlePageSelection(((IStructuredSelection)selection).getFirstElement());
        }
      }
    });

    bindingContext = initDataBindings();
  }

  protected void handlePageSelection(Object element)
  {
    if (element instanceof Myzilla)
    {
      myzilla = (Myzilla)element;
    }

    if (bindingContext != null)
    {
      bindingContext.dispose();
      bindingContext = null;
    }

    bindingContext = initDataBindings();
  }

  protected void handleNewComment()
  {
    String text = newComment.getText();
    if (text.length() != 0)
    {
      Comment comment = MyzillaFactory.eINSTANCE.createComment();
      comment.setText(text);
      comment.setWhen(new Date());

      myzilla.getComments().add(comment);
      newComment.setText("");

      Activator.getStorage().commit();
    }
  }

  protected DataBindingContext initDataBindings()
  {
    if (myzilla == null)
    {
      myzilla = MyzillaFactory.eINSTANCE.createMyzilla();
      details.setEnabled(false);
    }
    else
    {
      details.setEnabled(true);
    }

    comments.setMyzilla(myzilla);

    DataBindingContext bindingContext = new DataBindingContext();
    //
    IObservableValue observeTextBugIDObserveWidget = WidgetProperties.text(SWT.Modify).observe(bugID);
    IObservableValue myzillaBugIDObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__BUG_ID);
    bindingContext.bindValue(observeTextBugIDObserveWidget, myzillaBugIDObserveValue, null, null);
    //
    IObservableValue observeTextTitleObserveWidget = WidgetProperties.text(SWT.Modify).observe(title);
    IObservableValue myzillaTitleObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__TITLE);
    bindingContext.bindValue(observeTextTitleObserveWidget, myzillaTitleObserveValue, null, null);
    //
    IObservableValue observeSingleSelectionSeverity = ViewerProperties.singleSelection().observe(severity);
    IObservableValue myzillaSeverityObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__SEVERITY);
    bindingContext.bindValue(observeSingleSelectionSeverity, myzillaSeverityObserveValue, null, null);
    //
    IObservableValue observeSingleSelectionStatus = ViewerProperties.singleSelection().observe(status);
    IObservableValue myzillaStatusObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__STATUS);
    bindingContext.bindValue(observeSingleSelectionStatus, myzillaStatusObserveValue, null, null);
    //
    IObservableValue observeTextReporterObserveWidget = WidgetProperties.text(SWT.Modify).observe(reporter);
    IObservableValue myzillaNameObserveValue = EMFProperties.value(
        FeaturePath.fromList(Literals.MYZILLA__REPORTER, Literals.USER__NAME)).observe(myzilla);
    bindingContext.bindValue(observeTextReporterObserveWidget, myzillaNameObserveValue, null, null);
    //
    IObservableValue observeSingleSelectionPriority = ViewerProperties.singleSelection().observe(priority);
    IObservableValue myzillaPriorityObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__PRIORITY);
    bindingContext.bindValue(observeSingleSelectionPriority, myzillaPriorityObserveValue, null, null);
    //
    IObservableValue observeSingleSelectionResolution = ViewerProperties.singleSelection().observe(resolution);
    IObservableValue myzillaResolutionObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__RESOLUTION);
    bindingContext.bindValue(observeSingleSelectionResolution, myzillaResolutionObserveValue, null, null);
    //
    IObservableValue observeSingleSelectionAssignee = ViewerProperties.singleSelection().observe(assignee);
    IObservableValue myzillaAssigneeObserveValue = EMFObservables.observeValue(myzilla, Literals.MYZILLA__ASSIGNEE);
    bindingContext.bindValue(observeSingleSelectionAssignee, myzillaAssigneeObserveValue, null, null);
    //
    return bindingContext;
  }
}
