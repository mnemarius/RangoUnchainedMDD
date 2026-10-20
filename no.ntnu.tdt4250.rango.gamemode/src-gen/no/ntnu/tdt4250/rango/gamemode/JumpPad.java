/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jump Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Launches what passes through it straight up.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.JumpPad#getLaunch <em>Launch</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getJumpPad()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveLaunch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveLaunch='launch &gt; 0'"
 * @generated
 */
public interface JumpPad extends Trigger {
	/**
	 * Returns the value of the '<em><b>Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upward speed given, in metres per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch</em>' attribute.
	 * @see #setLaunch(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getJumpPad_Launch()
	 * @model required="true"
	 * @generated
	 */
	float getLaunch();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.JumpPad#getLaunch <em>Launch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch</em>' attribute.
	 * @see #getLaunch()
	 * @generated
	 */
	void setLaunch(float value);

} // JumpPad
