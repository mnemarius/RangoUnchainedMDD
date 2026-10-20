/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Reached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The round has lasted a number of seconds. As a win condition the player must survive that long, as a lose condition it is a time limit.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.TimeReached#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimeReached()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveSeconds'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveSeconds='seconds &gt; 0'"
 * @generated
 */
public interface TimeReached extends EndCondition {
	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimeReached_Seconds()
	 * @model required="true"
	 * @generated
	 */
	float getSeconds();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.TimeReached#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(float value);

} // TimeReached
