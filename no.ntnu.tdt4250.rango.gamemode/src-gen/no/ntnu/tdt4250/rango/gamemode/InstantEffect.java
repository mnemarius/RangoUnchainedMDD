/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instant Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An effect that happens once, at the moment it is applied: it changes the player's hearts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.InstantEffect#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getInstantEffect()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveAmount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveAmount='amount &gt; 0'"
 * @generated
 */
public interface InstantEffect extends PlayerEffect {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of hearts lost or gained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getInstantEffect_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.InstantEffect#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

} // InstantEffect
