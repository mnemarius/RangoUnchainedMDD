/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teleporter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Moves what passes through it to another teleporter, keeping its speed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Teleporter#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTeleporter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='notToItself targetInSameArena'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG notToItself='target &lt;&gt; self'"
 * @generated
 */
public interface Teleporter extends Trigger {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where things that enter this teleporter come out.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Teleporter)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTeleporter_Target()
	 * @model required="true"
	 * @generated
	 */
	Teleporter getTarget();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Teleporter#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Teleporter value);

} // Teleporter
