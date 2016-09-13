/**
 */
package org.myzilla.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.myzilla.Comment;
import org.myzilla.MyzillaPackage;
import org.myzilla.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.myzilla.impl.CommentImpl#getCommenter <em>Commenter</em>}</li>
 *   <li>{@link org.myzilla.impl.CommentImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.myzilla.impl.CommentImpl#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommentImpl extends CDOObjectImpl implements Comment
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommentImpl()
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
    return MyzillaPackage.Literals.COMMENT;
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
  public User getCommenter()
  {
    return (User)eGet(MyzillaPackage.Literals.COMMENT__COMMENTER, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCommenter(User newCommenter)
  {
    eSet(MyzillaPackage.Literals.COMMENT__COMMENTER, newCommenter);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return (String)eGet(MyzillaPackage.Literals.COMMENT__TEXT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    eSet(MyzillaPackage.Literals.COMMENT__TEXT, newText);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getWhen()
  {
    return (Date)eGet(MyzillaPackage.Literals.COMMENT__WHEN, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhen(Date newWhen)
  {
    eSet(MyzillaPackage.Literals.COMMENT__WHEN, newWhen);
  }

} //CommentImpl
