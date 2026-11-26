/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Survived</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Won when the player has survived a number of seconds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.TimeSurvived#getSeconds <em>Seconds</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimeSurvived()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveSeconds'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveSeconds='seconds &gt; 0'"
 * @generated
 */
public interface TimeSurvived extends WinCondition {
	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The seconds to survive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see #setSeconds(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimeSurvived_Seconds()
	 * @model required="true"
	 * @generated
	 */
	float getSeconds();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.TimeSurvived#getSeconds <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconds</em>' attribute.
	 * @see #getSeconds()
	 * @generated
	 */
	void setSeconds(float value);

} // TimeSurvived
