/**
 */
package org.myzilla;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.myzilla.Version#getValue <em>Value</em>}</li>
 *   <li>{@link org.myzilla.Version#getMyzillas <em>Myzillas</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.myzilla.MyzillaPackage#getVersion()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Version extends CDOObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.myzilla.MyzillaPackage#getVersion_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.myzilla.Version#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Myzillas</b></em>' containment reference list.
   * The list contents are of type {@link org.myzilla.Myzilla}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Myzillas</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Myzillas</em>' containment reference list.
   * @see org.myzilla.MyzillaPackage#getVersion_Myzillas()
   * @model containment="true"
   * @generated
   */
  EList<Myzilla> getMyzillas();

} // Version
