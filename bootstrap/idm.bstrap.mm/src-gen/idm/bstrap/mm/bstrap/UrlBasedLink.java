/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Url Based Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.UrlBasedLink#getUrl <em>Url</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.UrlBasedLink#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getUrlBasedLink()
 * @model abstract="true"
 * @generated
 */
public interface UrlBasedLink extends CompositeTextElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getUrlBasedLink_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.UrlBasedLink#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getUrlBasedLink_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.UrlBasedLink#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // UrlBasedLink
