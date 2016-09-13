/**
 */
package org.myzilla;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Myzilla</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.myzilla.Myzilla#getBugID <em>Bug ID</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getTitle <em>Title</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getStatus <em>Status</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.myzilla.Myzilla#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.myzilla.MyzillaPackage#getMyzilla()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Myzilla extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Bug ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bug ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bug ID</em>' attribute.
   * @see #setBugID(String)
   * @see org.myzilla.MyzillaPackage#getMyzilla_BugID()
   * @model
   * @generated
   */
  String getBugID();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getBugID <em>Bug ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bug ID</em>' attribute.
   * @see #getBugID()
   * @generated
   */
  void setBugID(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Severity</b></em>' attribute.
   * The literals are from the enumeration {@link org.myzilla.Severity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Severity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Severity</em>' attribute.
   * @see org.myzilla.Severity
   * @see #setSeverity(Severity)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Severity()
   * @model required="true"
   * @generated
   */
  Severity getSeverity();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getSeverity <em>Severity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Severity</em>' attribute.
   * @see org.myzilla.Severity
   * @see #getSeverity()
   * @generated
   */
  void setSeverity(Severity value);

  /**
   * Returns the value of the '<em><b>Priority</b></em>' attribute.
   * The literals are from the enumeration {@link org.myzilla.Priority}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priority</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priority</em>' attribute.
   * @see org.myzilla.Priority
   * @see #setPriority(Priority)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Priority()
   * @model required="true"
   * @generated
   */
  Priority getPriority();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getPriority <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priority</em>' attribute.
   * @see org.myzilla.Priority
   * @see #getPriority()
   * @generated
   */
  void setPriority(Priority value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * The literals are from the enumeration {@link org.myzilla.Status}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see org.myzilla.Status
   * @see #setStatus(Status)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Status()
   * @model required="true"
   * @generated
   */
  Status getStatus();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see org.myzilla.Status
   * @see #getStatus()
   * @generated
   */
  void setStatus(Status value);

  /**
   * Returns the value of the '<em><b>Resolution</b></em>' attribute.
   * The literals are from the enumeration {@link org.myzilla.Resolution}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resolution</em>' attribute.
   * @see org.myzilla.Resolution
   * @see #setResolution(Resolution)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Resolution()
   * @model
   * @generated
   */
  Resolution getResolution();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getResolution <em>Resolution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resolution</em>' attribute.
   * @see org.myzilla.Resolution
   * @see #getResolution()
   * @generated
   */
  void setResolution(Resolution value);

  /**
   * Returns the value of the '<em><b>Reporter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reporter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reporter</em>' reference.
   * @see #setReporter(User)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Reporter()
   * @model required="true"
   * @generated
   */
  User getReporter();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getReporter <em>Reporter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reporter</em>' reference.
   * @see #getReporter()
   * @generated
   */
  void setReporter(User value);

  /**
   * Returns the value of the '<em><b>Assignee</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignee</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignee</em>' reference.
   * @see #setAssignee(User)
   * @see org.myzilla.MyzillaPackage#getMyzilla_Assignee()
   * @model
   * @generated
   */
  User getAssignee();

  /**
   * Sets the value of the '{@link org.myzilla.Myzilla#getAssignee <em>Assignee</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignee</em>' reference.
   * @see #getAssignee()
   * @generated
   */
  void setAssignee(User value);

  /**
   * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
   * The list contents are of type {@link org.myzilla.Comment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' containment reference list.
   * @see org.myzilla.MyzillaPackage#getMyzilla_Comments()
   * @model containment="true"
   * @generated
   */
  EList<Comment> getComments();

} // Myzilla
