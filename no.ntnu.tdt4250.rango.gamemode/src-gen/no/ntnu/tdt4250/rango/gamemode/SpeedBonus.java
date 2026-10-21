/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Speed Bonus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Early pops are worth more: each pop is worth the points of the enemy type times a bonus, which starts at the maximum factor and falls evenly to 1 over the duration of the bonus.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getMaxFactor <em>Max Factor</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSpeedBonus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='bonusAboveOne positiveDuration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG bonusAboveOne='maxFactor &gt; 1' positiveDuration='duration &gt; 0'"
 * @generated
 */
public interface SpeedBonus extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Factor</b></em>' attribute.
	 * The default value is <code>"2.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What a pop is worth at the start of the round, as a multiple of the points of its enemy type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Factor</em>' attribute.
	 * @see #setMaxFactor(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSpeedBonus_MaxFactor()
	 * @model default="2.0"
	 * @generated
	 */
	float getMaxFactor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getMaxFactor <em>Max Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Factor</em>' attribute.
	 * @see #getMaxFactor()
	 * @generated
	 */
	void setMaxFactor(float value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"60.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seconds until the bonus has worn off and pops are worth their plain points.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSpeedBonus_Duration()
	 * @model default="60.0"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

} // SpeedBonus
