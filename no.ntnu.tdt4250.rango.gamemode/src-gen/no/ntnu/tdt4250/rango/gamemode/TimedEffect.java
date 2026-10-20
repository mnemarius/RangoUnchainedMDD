/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An effect that lasts for a while and then wears off. Getting the same kind of effect again restarts its timer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.TimedEffect#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimedEffect()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveDuration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveDuration='duration &gt; 0'"
 * @generated
 */
public interface TimedEffect extends PlayerEffect {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How long the effect lasts, in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTimedEffect_Duration()
	 * @model required="true"
	 * @generated
	 */
	float getDuration();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.TimedEffect#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(float value);

} // TimedEffect
