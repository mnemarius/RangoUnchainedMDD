/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A surface. It changes how fast enemies rebound from floors, walls and blocks made of it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Material#getBounce <em>Bounce</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Material#getSprite <em>Sprite</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getMaterial()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='bounceInRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG bounceInRange='bounce &gt; 0 and bounce &lt;= 2'"
 * @generated
 */
public interface Material extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bounce</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the speed of a rebounding enemy is multiplied by: below 1 dampens (ice), above 1 springs (grass).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounce</em>' attribute.
	 * @see #setBounce(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getMaterial_Bounce()
	 * @model default="1.0"
	 * @generated
	 */
	float getBounce();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Material#getBounce <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounce</em>' attribute.
	 * @see #getBounce()
	 * @generated
	 */
	void setBounce(float value);

	/**
	 * Returns the value of the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The texture of blocks made of this material, as a path in the game's assets folder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sprite</em>' attribute.
	 * @see #setSprite(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getMaterial_Sprite()
	 * @model
	 * @generated
	 */
	String getSprite();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Material#getSprite <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprite</em>' attribute.
	 * @see #getSprite()
	 * @generated
	 */
	void setSprite(String value);

} // Material
