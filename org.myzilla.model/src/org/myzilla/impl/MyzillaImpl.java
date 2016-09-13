/**
 */
package org.myzilla.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.myzilla.Comment;
import org.myzilla.Myzilla;
import org.myzilla.MyzillaPackage;
import org.myzilla.Priority;
import org.myzilla.Resolution;
import org.myzilla.Severity;
import org.myzilla.Status;
import org.myzilla.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Myzilla</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getBugID <em>Bug ID</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.myzilla.impl.MyzillaImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyzillaImpl extends CDOObjectImpl implements Myzilla
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyzillaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyzillaPackage.Literals.MYZILLA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected int eStaticFeatureCount()
  {
    return 0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBugID()
  {
    return (String)eGet(MyzillaPackage.Literals.MYZILLA__BUG_ID, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBugID(String newBugID)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__BUG_ID, newBugID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return (String)eGet(MyzillaPackage.Literals.MYZILLA__TITLE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__TITLE, newTitle);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Severity getSeverity()
  {
    return (Severity)eGet(MyzillaPackage.Literals.MYZILLA__SEVERITY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeverity(Severity newSeverity)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__SEVERITY, newSeverity);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority getPriority()
  {
    return (Priority)eGet(MyzillaPackage.Literals.MYZILLA__PRIORITY, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(Priority newPriority)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__PRIORITY, newPriority);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Status getStatus()
  {
    return (Status)eGet(MyzillaPackage.Literals.MYZILLA__STATUS, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(Status newStatus)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__STATUS, newStatus);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resolution getResolution()
  {
    return (Resolution)eGet(MyzillaPackage.Literals.MYZILLA__RESOLUTION, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResolution(Resolution newResolution)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__RESOLUTION, newResolution);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getReporter()
  {
    return (User)eGet(MyzillaPackage.Literals.MYZILLA__REPORTER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReporter(User newReporter)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__REPORTER, newReporter);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public User getAssignee()
  {
    return (User)eGet(MyzillaPackage.Literals.MYZILLA__ASSIGNEE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignee(User newAssignee)
  {
    eSet(MyzillaPackage.Literals.MYZILLA__ASSIGNEE, newAssignee);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  public EList<Comment> getComments()
  {
    return (EList<Comment>)eGet(MyzillaPackage.Literals.MYZILLA__COMMENTS, true);
  }

} //MyzillaImpl
