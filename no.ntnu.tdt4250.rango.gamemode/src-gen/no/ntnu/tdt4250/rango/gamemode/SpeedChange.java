/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Change</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The player moves faster (factor above 1) or slower (factor below 1) while it lasts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.SpeedChange#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSpeedChange()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='factorChangesSpeed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG factorChangesSpeed='factor &gt; 0 and factor &lt;&gt; 1'"
 * @generated
 */
public interface SpeedChange extends TimedEffect {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the player's speed is multiplied by.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSpeedChange_Factor()
	 * @model required="true"
	 * @generated
	 */
	float getFactor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.SpeedChange#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(float value);

} // SpeedChange
