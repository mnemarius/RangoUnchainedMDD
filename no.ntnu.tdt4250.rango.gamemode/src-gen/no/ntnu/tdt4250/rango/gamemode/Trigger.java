/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An obstacle that does not block anything but acts on what passes through it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Trigger#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTrigger()
 * @model abstract="true"
 * @generated
 */
public interface Trigger extends Obstacle {
	/**
	 * Returns the value of the '<em><b>Affects</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.rango.gamemode.Target}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the trigger acts on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affects</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Target
	 * @see #setAffects(Target)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getTrigger_Affects()
	 * @model
	 * @generated
	 */
	Target getAffects();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Trigger#getAffects <em>Affects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affects</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Target
	 * @see #getAffects()
	 * @generated
	 */
	void setAffects(Target value);

} // Trigger
