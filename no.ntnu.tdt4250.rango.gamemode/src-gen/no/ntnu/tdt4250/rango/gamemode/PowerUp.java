/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Up</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A pick-up that popped enemies can drop. Its kind is given by the effects it has on the player who catches it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PowerUp#getSprite <em>Sprite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.PowerUp#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPowerUp()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='distinctEffectKinds'"
 * @generated
 */
public interface PowerUp extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image of the power-up, as a path in the game's assets folder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sprite</em>' attribute.
	 * @see #setSprite(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPowerUp_Sprite()
	 * @model required="true"
	 * @generated
	 */
	String getSprite();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.PowerUp#getSprite <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprite</em>' attribute.
	 * @see #getSprite()
	 * @generated
	 */
	void setSprite(String value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.PlayerEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the power-up does to the player who catches it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPowerUp_Effects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlayerEffect> getEffects();

} // PowerUp
