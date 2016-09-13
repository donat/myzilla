/**
 */
package org.myzilla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resolution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.myzilla.MyzillaPackage#getResolution()
 * @model
 * @generated
 */
public enum Resolution implements Enumerator
{
  /**
   * The '<em><b>FIXED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FIXED_VALUE
   * @generated
   * @ordered
   */
  FIXED(0, "FIXED", "FIXED"),

  /**
   * The '<em><b>INVALID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INVALID_VALUE
   * @generated
   * @ordered
   */
  INVALID(1, "INVALID", "INVALID"),

  /**
   * The '<em><b>WONTFIX</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WONTFIX_VALUE
   * @generated
   * @ordered
   */
  WONTFIX(2, "WONTFIX", "WONTFIX"),

  /**
   * The '<em><b>DUPLICATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DUPLICATE_VALUE
   * @generated
   * @ordered
   */
  DUPLICATE(3, "DUPLICATE", "DUPLICATE"),

  /**
   * The '<em><b>WORKSFORME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WORKSFORME_VALUE
   * @generated
   * @ordered
   */
  WORKSFORME(4, "WORKSFORME", "WORKSFORME"),

  /**
   * The '<em><b>NOT ECLIPSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_ECLIPSE_VALUE
   * @generated
   * @ordered
   */
  NOT_ECLIPSE(5, "NOT_ECLIPSE", "NOT_ECLIPSE");

  /**
   * The '<em><b>FIXED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FIXED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FIXED
   * @model
   * @generated
   * @ordered
   */
  public static final int FIXED_VALUE = 0;

  /**
   * The '<em><b>INVALID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INVALID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INVALID
   * @model
   * @generated
   * @ordered
   */
  public static final int INVALID_VALUE = 1;

  /**
   * The '<em><b>WONTFIX</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WONTFIX</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WONTFIX
   * @model
   * @generated
   * @ordered
   */
  public static final int WONTFIX_VALUE = 2;

  /**
   * The '<em><b>DUPLICATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DUPLICATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DUPLICATE
   * @model
   * @generated
   * @ordered
   */
  public static final int DUPLICATE_VALUE = 3;

  /**
   * The '<em><b>WORKSFORME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WORKSFORME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WORKSFORME
   * @model
   * @generated
   * @ordered
   */
  public static final int WORKSFORME_VALUE = 4;

  /**
   * The '<em><b>NOT ECLIPSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT ECLIPSE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_ECLIPSE
   * @model
   * @generated
   * @ordered
   */
  public static final int NOT_ECLIPSE_VALUE = 5;

  /**
   * An array of all the '<em><b>Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Resolution[] VALUES_ARRAY = new Resolution[] { FIXED, INVALID, WONTFIX, DUPLICATE, WORKSFORME,
      NOT_ECLIPSE, };

  /**
   * A public read-only list of all the '<em><b>Resolution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Resolution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Resolution</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Resolution get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Resolution result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resolution</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Resolution getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Resolution result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Resolution</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Resolution get(int value)
  {
    switch (value)
    {
    case FIXED_VALUE:
      return FIXED;
    case INVALID_VALUE:
      return INVALID;
    case WONTFIX_VALUE:
      return WONTFIX;
    case DUPLICATE_VALUE:
      return DUPLICATE;
    case WORKSFORME_VALUE:
      return WORKSFORME;
    case NOT_ECLIPSE_VALUE:
      return NOT_ECLIPSE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Resolution(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }

} //Resolution
