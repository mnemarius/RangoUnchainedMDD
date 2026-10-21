/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiplies one kind of modelled value by a factor, such as the speed of every enemy.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Modifier#getTarget <em>Target</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Modifier#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getModifier()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveFactor'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveFactor='factor &gt; 0'"
 * @generated
 */
public interface Modifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.rango.gamemode.ModifierTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of value that is changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.ModifierTarget
	 * @see #setTarget(ModifierTarget)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getModifier_Target()
	 * @model required="true"
	 * @generated
	 */
	ModifierTarget getTarget();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Modifier#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.ModifierTarget
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ModifierTarget value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the value is multiplied by: below 1 makes it smaller, above 1 larger.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getModifier_Factor()
	 * @model required="true"
	 * @generated
	 */
	float getFactor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Modifier#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(float value);

} // Modifier
