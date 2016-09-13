/**
 */
package org.myzilla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.myzilla.MyzillaPackage#getSeverity()
 * @model
 * @generated
 */
public enum Severity implements Enumerator
{
  /**
   * The '<em><b>Enhancement</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENHANCEMENT_VALUE
   * @generated
   * @ordered
   */
  ENHANCEMENT(0, "enhancement", "enhancement"),

  /**
   * The '<em><b>Trivial</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRIVIAL_VALUE
   * @generated
   * @ordered
   */
  TRIVIAL(1, "trivial", "trivial"),

  /**
   * The '<em><b>Minor</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINOR_VALUE
   * @generated
   * @ordered
   */
  MINOR(2, "minor", "minor"),

  /**
   * The '<em><b>Normal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NORMAL_VALUE
   * @generated
   * @ordered
   */
  NORMAL(3, "normal", "normal"),

  /**
   * The '<em><b>Major</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAJOR_VALUE
   * @generated
   * @ordered
   */
  MAJOR(4, "major", "major"),

  /**
   * The '<em><b>Critical</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CRITICAL_VALUE
   * @generated
   * @ordered
   */
  CRITICAL(5, "critical", "critical"),

  /**
   * The '<em><b>Blocker</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLOCKER_VALUE
   * @generated
   * @ordered
   */
  BLOCKER(6, "blocker", "blocker");

  /**
   * The '<em><b>Enhancement</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Enhancement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENHANCEMENT
   * @model name="enhancement"
   * @generated
   * @ordered
   */
  public static final int ENHANCEMENT_VALUE = 0;

  /**
   * The '<em><b>Trivial</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Trivial</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRIVIAL
   * @model name="trivial"
   * @generated
   * @ordered
   */
  public static final int TRIVIAL_VALUE = 1;

  /**
   * The '<em><b>Minor</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Minor</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINOR
   * @model name="minor"
   * @generated
   * @ordered
   */
  public static final int MINOR_VALUE = 2;

  /**
   * The '<em><b>Normal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Normal</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NORMAL
   * @model name="normal"
   * @generated
   * @ordered
   */
  public static final int NORMAL_VALUE = 3;

  /**
   * The '<em><b>Major</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Major</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAJOR
   * @model name="major"
   * @generated
   * @ordered
   */
  public static final int MAJOR_VALUE = 4;

  /**
   * The '<em><b>Critical</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Critical</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CRITICAL
   * @model name="critical"
   * @generated
   * @ordered
   */
  public static final int CRITICAL_VALUE = 5;

  /**
   * The '<em><b>Blocker</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Blocker</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLOCKER
   * @model name="blocker"
   * @generated
   * @ordered
   */
  public static final int BLOCKER_VALUE = 6;

  /**
   * An array of all the '<em><b>Severity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Severity[] VALUES_ARRAY = new Severity[] { ENHANCEMENT, TRIVIAL, MINOR, NORMAL, MAJOR, CRITICAL,
      BLOCKER, };

  /**
   * A public read-only list of all the '<em><b>Severity</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Severity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Severity</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Severity get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Severity result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Severity</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Severity getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Severity result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Severity</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Severity get(int value)
  {
    switch (value)
    {
    case ENHANCEMENT_VALUE:
      return ENHANCEMENT;
    case TRIVIAL_VALUE:
      return TRIVIAL;
    case MINOR_VALUE:
      return MINOR;
    case NORMAL_VALUE:
      return NORMAL;
    case MAJOR_VALUE:
      return MAJOR;
    case CRITICAL_VALUE:
      return CRITICAL;
    case BLOCKER_VALUE:
      return BLOCKER;
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
  private Severity(int value, String name, String literal)
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

} //Severity
