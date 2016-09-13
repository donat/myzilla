/**
 */
package org.myzilla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.myzilla.MyzillaFactory
 * @model kind="package"
 * @generated
 */
public interface MyzillaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myzilla";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://myzilla/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myzilla";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyzillaPackage eINSTANCE = org.myzilla.impl.MyzillaPackageImpl.init();

  /**
   * The meta object id for the '{@link org.myzilla.impl.UserImpl <em>User</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.UserImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getUser()
   * @generated
   */
  int USER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER__NAME = 0;

  /**
   * The number of structural features of the '<em>User</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.myzilla.impl.ClassificationImpl <em>Classification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.ClassificationImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getClassification()
   * @generated
   */
  int CLASSIFICATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION__PRODUCTS = 1;

  /**
   * The number of structural features of the '<em>Classification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.myzilla.impl.ProductImpl <em>Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.ProductImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getProduct()
   * @generated
   */
  int PRODUCT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__NAME = 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT__COMPONENTS = 1;

  /**
   * The number of structural features of the '<em>Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.myzilla.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.ComponentImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Versions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__VERSIONS = 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.myzilla.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.VersionImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__VALUE = 0;

  /**
   * The feature id for the '<em><b>Myzillas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MYZILLAS = 1;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.myzilla.impl.MyzillaImpl <em>Myzilla</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.MyzillaImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getMyzilla()
   * @generated
   */
  int MYZILLA = 5;

  /**
   * The feature id for the '<em><b>Bug ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__BUG_ID = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__TITLE = 1;

  /**
   * The feature id for the '<em><b>Severity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__SEVERITY = 2;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__PRIORITY = 3;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__STATUS = 4;

  /**
   * The feature id for the '<em><b>Resolution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__RESOLUTION = 5;

  /**
   * The feature id for the '<em><b>Reporter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__REPORTER = 6;

  /**
   * The feature id for the '<em><b>Assignee</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__ASSIGNEE = 7;

  /**
   * The feature id for the '<em><b>Comments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA__COMMENTS = 8;

  /**
   * The number of structural features of the '<em>Myzilla</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MYZILLA_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.myzilla.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.impl.CommentImpl
   * @see org.myzilla.impl.MyzillaPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 6;

  /**
   * The feature id for the '<em><b>Commenter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__COMMENTER = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__TEXT = 1;

  /**
   * The feature id for the '<em><b>When</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__WHEN = 2;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.myzilla.Severity <em>Severity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.Severity
   * @see org.myzilla.impl.MyzillaPackageImpl#getSeverity()
   * @generated
   */
  int SEVERITY = 7;

  /**
   * The meta object id for the '{@link org.myzilla.Priority <em>Priority</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.Priority
   * @see org.myzilla.impl.MyzillaPackageImpl#getPriority()
   * @generated
   */
  int PRIORITY = 8;

  /**
   * The meta object id for the '{@link org.myzilla.Status <em>Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.Status
   * @see org.myzilla.impl.MyzillaPackageImpl#getStatus()
   * @generated
   */
  int STATUS = 9;

  /**
   * The meta object id for the '{@link org.myzilla.Resolution <em>Resolution</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.myzilla.Resolution
   * @see org.myzilla.impl.MyzillaPackageImpl#getResolution()
   * @generated
   */
  int RESOLUTION = 10;

  /**
   * Returns the meta object for class '{@link org.myzilla.User <em>User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User</em>'.
   * @see org.myzilla.User
   * @generated
   */
  EClass getUser();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.User#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.myzilla.User#getName()
   * @see #getUser()
   * @generated
   */
  EAttribute getUser_Name();

  /**
   * Returns the meta object for class '{@link org.myzilla.Classification <em>Classification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classification</em>'.
   * @see org.myzilla.Classification
   * @generated
   */
  EClass getClassification();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Classification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.myzilla.Classification#getName()
   * @see #getClassification()
   * @generated
   */
  EAttribute getClassification_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.myzilla.Classification#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Products</em>'.
   * @see org.myzilla.Classification#getProducts()
   * @see #getClassification()
   * @generated
   */
  EReference getClassification_Products();

  /**
   * Returns the meta object for class '{@link org.myzilla.Product <em>Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product</em>'.
   * @see org.myzilla.Product
   * @generated
   */
  EClass getProduct();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Product#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.myzilla.Product#getName()
   * @see #getProduct()
   * @generated
   */
  EAttribute getProduct_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.myzilla.Product#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.myzilla.Product#getComponents()
   * @see #getProduct()
   * @generated
   */
  EReference getProduct_Components();

  /**
   * Returns the meta object for class '{@link org.myzilla.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.myzilla.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.myzilla.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.myzilla.Component#getVersions <em>Versions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Versions</em>'.
   * @see org.myzilla.Component#getVersions()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Versions();

  /**
   * Returns the meta object for class '{@link org.myzilla.Version <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see org.myzilla.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Version#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.myzilla.Version#getValue()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Value();

  /**
   * Returns the meta object for the containment reference list '{@link org.myzilla.Version#getMyzillas <em>Myzillas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Myzillas</em>'.
   * @see org.myzilla.Version#getMyzillas()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_Myzillas();

  /**
   * Returns the meta object for class '{@link org.myzilla.Myzilla <em>Myzilla</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Myzilla</em>'.
   * @see org.myzilla.Myzilla
   * @generated
   */
  EClass getMyzilla();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getBugID <em>Bug ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bug ID</em>'.
   * @see org.myzilla.Myzilla#getBugID()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_BugID();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.myzilla.Myzilla#getTitle()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_Title();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getSeverity <em>Severity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Severity</em>'.
   * @see org.myzilla.Myzilla#getSeverity()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_Severity();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see org.myzilla.Myzilla#getPriority()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_Priority();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see org.myzilla.Myzilla#getStatus()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_Status();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Myzilla#getResolution <em>Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Resolution</em>'.
   * @see org.myzilla.Myzilla#getResolution()
   * @see #getMyzilla()
   * @generated
   */
  EAttribute getMyzilla_Resolution();

  /**
   * Returns the meta object for the reference '{@link org.myzilla.Myzilla#getReporter <em>Reporter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reporter</em>'.
   * @see org.myzilla.Myzilla#getReporter()
   * @see #getMyzilla()
   * @generated
   */
  EReference getMyzilla_Reporter();

  /**
   * Returns the meta object for the reference '{@link org.myzilla.Myzilla#getAssignee <em>Assignee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assignee</em>'.
   * @see org.myzilla.Myzilla#getAssignee()
   * @see #getMyzilla()
   * @generated
   */
  EReference getMyzilla_Assignee();

  /**
   * Returns the meta object for the containment reference list '{@link org.myzilla.Myzilla#getComments <em>Comments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Comments</em>'.
   * @see org.myzilla.Myzilla#getComments()
   * @see #getMyzilla()
   * @generated
   */
  EReference getMyzilla_Comments();

  /**
   * Returns the meta object for class '{@link org.myzilla.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see org.myzilla.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the reference '{@link org.myzilla.Comment#getCommenter <em>Commenter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Commenter</em>'.
   * @see org.myzilla.Comment#getCommenter()
   * @see #getComment()
   * @generated
   */
  EReference getComment_Commenter();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Comment#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see org.myzilla.Comment#getText()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Text();

  /**
   * Returns the meta object for the attribute '{@link org.myzilla.Comment#getWhen <em>When</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>When</em>'.
   * @see org.myzilla.Comment#getWhen()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_When();

  /**
   * Returns the meta object for enum '{@link org.myzilla.Severity <em>Severity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Severity</em>'.
   * @see org.myzilla.Severity
   * @generated
   */
  EEnum getSeverity();

  /**
   * Returns the meta object for enum '{@link org.myzilla.Priority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Priority</em>'.
   * @see org.myzilla.Priority
   * @generated
   */
  EEnum getPriority();

  /**
   * Returns the meta object for enum '{@link org.myzilla.Status <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Status</em>'.
   * @see org.myzilla.Status
   * @generated
   */
  EEnum getStatus();

  /**
   * Returns the meta object for enum '{@link org.myzilla.Resolution <em>Resolution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Resolution</em>'.
   * @see org.myzilla.Resolution
   * @generated
   */
  EEnum getResolution();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyzillaFactory getMyzillaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.myzilla.impl.UserImpl <em>User</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.UserImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getUser()
     * @generated
     */
    EClass USER = eINSTANCE.getUser();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER__NAME = eINSTANCE.getUser_Name();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.ClassificationImpl <em>Classification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.ClassificationImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getClassification()
     * @generated
     */
    EClass CLASSIFICATION = eINSTANCE.getClassification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFICATION__NAME = eINSTANCE.getClassification_Name();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFICATION__PRODUCTS = eINSTANCE.getClassification_Products();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.ProductImpl <em>Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.ProductImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getProduct()
     * @generated
     */
    EClass PRODUCT = eINSTANCE.getProduct();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT__COMPONENTS = eINSTANCE.getProduct_Components();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.ComponentImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__VERSIONS = eINSTANCE.getComponent_Versions();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.VersionImpl <em>Version</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.VersionImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getVersion()
     * @generated
     */
    EClass VERSION = eINSTANCE.getVersion();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERSION__VALUE = eINSTANCE.getVersion_Value();

    /**
     * The meta object literal for the '<em><b>Myzillas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERSION__MYZILLAS = eINSTANCE.getVersion_Myzillas();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.MyzillaImpl <em>Myzilla</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.MyzillaImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getMyzilla()
     * @generated
     */
    EClass MYZILLA = eINSTANCE.getMyzilla();

    /**
     * The meta object literal for the '<em><b>Bug ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__BUG_ID = eINSTANCE.getMyzilla_BugID();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__TITLE = eINSTANCE.getMyzilla_Title();

    /**
     * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__SEVERITY = eINSTANCE.getMyzilla_Severity();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__PRIORITY = eINSTANCE.getMyzilla_Priority();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__STATUS = eINSTANCE.getMyzilla_Status();

    /**
     * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MYZILLA__RESOLUTION = eINSTANCE.getMyzilla_Resolution();

    /**
     * The meta object literal for the '<em><b>Reporter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MYZILLA__REPORTER = eINSTANCE.getMyzilla_Reporter();

    /**
     * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MYZILLA__ASSIGNEE = eINSTANCE.getMyzilla_Assignee();

    /**
     * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MYZILLA__COMMENTS = eINSTANCE.getMyzilla_Comments();

    /**
     * The meta object literal for the '{@link org.myzilla.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.impl.CommentImpl
     * @see org.myzilla.impl.MyzillaPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Commenter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENT__COMMENTER = eINSTANCE.getComment_Commenter();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__TEXT = eINSTANCE.getComment_Text();

    /**
     * The meta object literal for the '<em><b>When</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__WHEN = eINSTANCE.getComment_When();

    /**
     * The meta object literal for the '{@link org.myzilla.Severity <em>Severity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.Severity
     * @see org.myzilla.impl.MyzillaPackageImpl#getSeverity()
     * @generated
     */
    EEnum SEVERITY = eINSTANCE.getSeverity();

    /**
     * The meta object literal for the '{@link org.myzilla.Priority <em>Priority</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.Priority
     * @see org.myzilla.impl.MyzillaPackageImpl#getPriority()
     * @generated
     */
    EEnum PRIORITY = eINSTANCE.getPriority();

    /**
     * The meta object literal for the '{@link org.myzilla.Status <em>Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.Status
     * @see org.myzilla.impl.MyzillaPackageImpl#getStatus()
     * @generated
     */
    EEnum STATUS = eINSTANCE.getStatus();

    /**
     * The meta object literal for the '{@link org.myzilla.Resolution <em>Resolution</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.myzilla.Resolution
     * @see org.myzilla.impl.MyzillaPackageImpl#getResolution()
     * @generated
     */
    EEnum RESOLUTION = eINSTANCE.getResolution();

  }

} //MyzillaPackage
