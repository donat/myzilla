/**
 */
package org.myzilla;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.myzilla.Comment#getCommenter <em>Commenter</em>}</li>
 *   <li>{@link org.myzilla.Comment#getText <em>Text</em>}</li>
 *   <li>{@link org.myzilla.Comment#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.myzilla.MyzillaPackage#getComment()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Comment extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Commenter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commenter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commenter</em>' reference.
   * @see #setCommenter(User)
   * @see org.myzilla.MyzillaPackage#getComment_Commenter()
   * @model required="true"
   * @generated
   */
  User getCommenter();

  /**
   * Sets the value of the '{@link org.myzilla.Comment#getCommenter <em>Commenter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commenter</em>' reference.
   * @see #getCommenter()
   * @generated
   */
  void setCommenter(User value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see org.myzilla.MyzillaPackage#getComment_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link org.myzilla.Comment#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' attribute.
   * @see #setWhen(Date)
   * @see org.myzilla.MyzillaPackage#getComment_When()
   * @model
   * @generated
   */
  Date getWhen();

  /**
   * Sets the value of the '{@link org.myzilla.Comment#getWhen <em>When</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>When</em>' attribute.
   * @see #getWhen()
   * @generated
   */
  void setWhen(Date value);

} // Comment
