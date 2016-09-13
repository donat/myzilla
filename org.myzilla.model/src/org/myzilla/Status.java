/**
 */
package org.myzilla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.myzilla.MyzillaPackage#getStatus()
 * @model
 * @generated
 */
public enum Status implements Enumerator
{
  /**
   * The '<em><b>NEW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEW_VALUE
   * @generated
   * @ordered
   */
  NEW(0, "NEW", "NEW"),

  /**
   * The '<em><b>ASSIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASSIGNED_VALUE
   * @generated
   * @ordered
   */
  ASSIGNED(1, "ASSIGNED", "ASSIGNED"),

  /**
   * The '<em><b>RESOLVED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RESOLVED_VALUE
   * @generated
   * @ordered
   */
  RESOLVED(2, "RESOLVED", "RESOLVED"),

  /**
   * The '<em><b>CLOSED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLOSED_VALUE
   * @generated
   * @ordered
   */
  CLOSED(3, "CLOSED", "CLOSED"),

  /**
   * The '<em><b>REOPENED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REOPENED_VALUE
   * @generated
   * @ordered
   */
  REOPENED(4, "REOPENED", "REOPENED"),

  /**
   * The '<em><b>VERIFIED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VERIFIED_VALUE
   * @generated
   * @ordered
   */
  VERIFIED(5, "VERIFIED", "VERIFIED");

  /**
   * The '<em><b>NEW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NEW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEW
   * @model
   * @generated
   * @ordered
   */
  public static final int NEW_VALUE = 0;

  /**
   * The '<em><b>ASSIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASSIGNED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASSIGNED
   * @model
   * @generated
   * @ordered
   */
  public static final int ASSIGNED_VALUE = 1;

  /**
   * The '<em><b>RESOLVED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>RESOLVED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RESOLVED
   * @model
   * @generated
   * @ordered
   */
  public static final int RESOLVED_VALUE = 2;

  /**
   * The '<em><b>CLOSED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLOSED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLOSED
   * @model
   * @generated
   * @ordered
   */
  public static final int CLOSED_VALUE = 3;

  /**
   * The '<em><b>REOPENED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REOPENED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REOPENED
   * @model
   * @generated
   * @ordered
   */
  public static final int REOPENED_VALUE = 4;

  /**
   * The '<em><b>VERIFIED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VERIFIED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VERIFIED
   * @model
   * @generated
   * @ordered
   */
  public static final int VERIFIED_VALUE = 5;

  /**
   * An array of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Status[] VALUES_ARRAY = new Status[] { NEW, ASSIGNED, RESOLVED, CLOSED, REOPENED, VERIFIED, };

  /**
   * A public read-only list of all the '<em><b>Status</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Status> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Status result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Status result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Status</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Status get(int value)
  {
    switch (value)
    {
    case NEW_VALUE:
      return NEW;
    case ASSIGNED_VALUE:
      return ASSIGNED;
    case RESOLVED_VALUE:
      return RESOLVED;
    case CLOSED_VALUE:
      return CLOSED;
    case REOPENED_VALUE:
      return REOPENED;
    case VERIFIED_VALUE:
      return VERIFIED;
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
  private Status(int value, String name, String literal)
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

} //Status
