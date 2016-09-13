/**
 */
package org.myzilla.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.myzilla.Classification;
import org.myzilla.Comment;
import org.myzilla.Component;
import org.myzilla.Myzilla;
import org.myzilla.MyzillaFactory;
import org.myzilla.MyzillaPackage;
import org.myzilla.Priority;
import org.myzilla.Product;
import org.myzilla.Resolution;
import org.myzilla.Severity;
import org.myzilla.Status;
import org.myzilla.User;
import org.myzilla.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyzillaPackageImpl extends EPackageImpl implements MyzillaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass myzillaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum severityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum priorityEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum statusEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum resolutionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.myzilla.MyzillaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyzillaPackageImpl()
  {
    super(eNS_URI, MyzillaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyzillaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyzillaPackage init()
  {
    if (isInited)
      return (MyzillaPackage)EPackage.Registry.INSTANCE.getEPackage(MyzillaPackage.eNS_URI);

    // Obtain or create and register package
    MyzillaPackageImpl theMyzillaPackage = (MyzillaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyzillaPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new MyzillaPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyzillaPackage.createPackageContents();

    // Initialize created meta-data
    theMyzillaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyzillaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyzillaPackage.eNS_URI, theMyzillaPackage);
    return theMyzillaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUser()
  {
    return userEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUser_Name()
  {
    return (EAttribute)userEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassification()
  {
    return classificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassification_Name()
  {
    return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassification_Products()
  {
    return (EReference)classificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProduct()
  {
    return productEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProduct_Name()
  {
    return (EAttribute)productEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProduct_Components()
  {
    return (EReference)productEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_Name()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Versions()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVersion()
  {
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVersion_Value()
  {
    return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVersion_Myzillas()
  {
    return (EReference)versionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMyzilla()
  {
    return myzillaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_BugID()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_Title()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_Severity()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_Priority()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_Status()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMyzilla_Resolution()
  {
    return (EAttribute)myzillaEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyzilla_Reporter()
  {
    return (EReference)myzillaEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyzilla_Assignee()
  {
    return (EReference)myzillaEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMyzilla_Comments()
  {
    return (EReference)myzillaEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComment_Commenter()
  {
    return (EReference)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Text()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_When()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSeverity()
  {
    return severityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getPriority()
  {
    return priorityEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getStatus()
  {
    return statusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getResolution()
  {
    return resolutionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyzillaFactory getMyzillaFactory()
  {
    return (MyzillaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
      return;
    isCreated = true;

    // Create classes and their features
    userEClass = createEClass(USER);
    createEAttribute(userEClass, USER__NAME);

    classificationEClass = createEClass(CLASSIFICATION);
    createEAttribute(classificationEClass, CLASSIFICATION__NAME);
    createEReference(classificationEClass, CLASSIFICATION__PRODUCTS);

    productEClass = createEClass(PRODUCT);
    createEAttribute(productEClass, PRODUCT__NAME);
    createEReference(productEClass, PRODUCT__COMPONENTS);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NAME);
    createEReference(componentEClass, COMPONENT__VERSIONS);

    versionEClass = createEClass(VERSION);
    createEAttribute(versionEClass, VERSION__VALUE);
    createEReference(versionEClass, VERSION__MYZILLAS);

    myzillaEClass = createEClass(MYZILLA);
    createEAttribute(myzillaEClass, MYZILLA__BUG_ID);
    createEAttribute(myzillaEClass, MYZILLA__TITLE);
    createEAttribute(myzillaEClass, MYZILLA__SEVERITY);
    createEAttribute(myzillaEClass, MYZILLA__PRIORITY);
    createEAttribute(myzillaEClass, MYZILLA__STATUS);
    createEAttribute(myzillaEClass, MYZILLA__RESOLUTION);
    createEReference(myzillaEClass, MYZILLA__REPORTER);
    createEReference(myzillaEClass, MYZILLA__ASSIGNEE);
    createEReference(myzillaEClass, MYZILLA__COMMENTS);

    commentEClass = createEClass(COMMENT);
    createEReference(commentEClass, COMMENT__COMMENTER);
    createEAttribute(commentEClass, COMMENT__TEXT);
    createEAttribute(commentEClass, COMMENT__WHEN);

    // Create enums
    severityEEnum = createEEnum(SEVERITY);
    priorityEEnum = createEEnum(PRIORITY);
    statusEEnum = createEEnum(STATUS);
    resolutionEEnum = createEEnum(RESOLUTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
      return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE,
        IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Classification.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassification_Products(), this.getProduct(), null, "products", null, 0, -1,
        Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
        !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProduct_Components(), this.getComponent(), null, "components", null, 0, -1, Product.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Versions(), this.getVersion(), null, "versions", null, 0, -1, Component.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVersion_Value(), ecorePackage.getEString(), "value", null, 0, 1, Version.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVersion_Myzillas(), this.getMyzilla(), null, "myzillas", null, 0, -1, Version.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(myzillaEClass, Myzilla.class, "Myzilla", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMyzilla_BugID(), ecorePackage.getEString(), "bugID", null, 0, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyzilla_Title(), ecorePackage.getEString(), "title", null, 0, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyzilla_Severity(), this.getSeverity(), "severity", null, 1, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyzilla_Priority(), this.getPriority(), "priority", null, 1, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyzilla_Status(), this.getStatus(), "status", null, 1, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMyzilla_Resolution(), this.getResolution(), "resolution", null, 0, 1, Myzilla.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMyzilla_Reporter(), this.getUser(), null, "reporter", null, 1, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getMyzilla_Assignee(), this.getUser(), null, "assignee", null, 0, 1, Myzilla.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEReference(getMyzilla_Comments(), this.getComment(), null, "comments", null, 0, -1, Myzilla.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
        !IS_DERIVED, IS_ORDERED);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComment_Commenter(), this.getUser(), null, "commenter", null, 1, 1, Comment.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
        IS_ORDERED);
    initEAttribute(getComment_Text(), ecorePackage.getEString(), "text", null, 0, 1, Comment.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComment_When(), ecorePackage.getEDate(), "when", null, 0, 1, Comment.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(severityEEnum, Severity.class, "Severity");
    addEEnumLiteral(severityEEnum, Severity.ENHANCEMENT);
    addEEnumLiteral(severityEEnum, Severity.TRIVIAL);
    addEEnumLiteral(severityEEnum, Severity.MINOR);
    addEEnumLiteral(severityEEnum, Severity.NORMAL);
    addEEnumLiteral(severityEEnum, Severity.MAJOR);
    addEEnumLiteral(severityEEnum, Severity.CRITICAL);
    addEEnumLiteral(severityEEnum, Severity.BLOCKER);

    initEEnum(priorityEEnum, Priority.class, "Priority");
    addEEnumLiteral(priorityEEnum, Priority.P1);
    addEEnumLiteral(priorityEEnum, Priority.P2);
    addEEnumLiteral(priorityEEnum, Priority.P3);
    addEEnumLiteral(priorityEEnum, Priority.P4);
    addEEnumLiteral(priorityEEnum, Priority.P5);

    initEEnum(statusEEnum, Status.class, "Status");
    addEEnumLiteral(statusEEnum, Status.NEW);
    addEEnumLiteral(statusEEnum, Status.ASSIGNED);
    addEEnumLiteral(statusEEnum, Status.RESOLVED);
    addEEnumLiteral(statusEEnum, Status.CLOSED);
    addEEnumLiteral(statusEEnum, Status.REOPENED);
    addEEnumLiteral(statusEEnum, Status.VERIFIED);

    initEEnum(resolutionEEnum, Resolution.class, "Resolution");
    addEEnumLiteral(resolutionEEnum, Resolution.FIXED);
    addEEnumLiteral(resolutionEEnum, Resolution.INVALID);
    addEEnumLiteral(resolutionEEnum, Resolution.WONTFIX);
    addEEnumLiteral(resolutionEEnum, Resolution.DUPLICATE);
    addEEnumLiteral(resolutionEEnum, Resolution.WORKSFORME);
    addEEnumLiteral(resolutionEEnum, Resolution.NOT_ECLIPSE);

    // Create resource
    createResource(eNS_URI);
  }

} //MyzillaPackageImpl
