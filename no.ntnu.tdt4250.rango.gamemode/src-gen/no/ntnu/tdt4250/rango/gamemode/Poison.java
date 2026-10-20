/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Damage over time: the player loses hearts at a fixed interval while it lasts. A shield blocks the ticks too.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Poison#getAmount <em>Amount</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Poison#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPoison()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveAmount intervalWithinDuration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveAmount='amount &gt; 0' intervalWithinDuration='interval &gt; 0 and interval &lt;= duration'"
 * @generated
 */
public interface Poison extends TimedEffect {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hearts lost per tick.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPoison_Amount()
	 * @model required="true"
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Poison#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seconds between two ticks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPoison_Interval()
	 * @model required="true"
	 * @generated
	 */
	float getInterval();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Poison#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(float value);

} // Poison
