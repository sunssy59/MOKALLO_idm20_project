/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Text#getText <em>Text</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.Text#getEmphasis <em>Emphasis</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getText()
 * @model
 * @generated
 */
public interface Text extends TextElements {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getText_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.Text#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getText_Emphasis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Emphasis> getEmphasis();

} // Text
