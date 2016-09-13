/**
 */
package org.myzilla;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.myzilla.Classification#getName <em>Name</em>}</li>
 *   <li>{@link org.myzilla.Classification#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.myzilla.MyzillaPackage#getClassification()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Classification extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.myzilla.MyzillaPackage#getClassification_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.myzilla.Classification#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link org.myzilla.Product}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see org.myzilla.MyzillaPackage#getClassification_Products()
   * @model containment="true"
   * @generated
   */
  EList<Product> getProducts();

} // Classification
