/**
 */
package idm.uikit.mm.uikit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.uikit.mm.uikit.Page#getName <em>Name</em>}</li>
 *   <li>{@link idm.uikit.mm.uikit.Page#getPagecontents <em>Pagecontents</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see idm.uikit.mm.uikit.UikitPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link idm.uikit.mm.uikit.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pagecontents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagecontents</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getPage_Pagecontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getPagecontents();

} // Page
