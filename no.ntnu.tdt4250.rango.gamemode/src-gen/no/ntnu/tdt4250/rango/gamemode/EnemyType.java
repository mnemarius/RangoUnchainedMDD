/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A kind of enemy. Its kind is given by its tuning and by the behaviour it owns: what happens when it is popped and what it does to the player on contact. Enemies come in three sizes (3 is the largest).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSprite <em>Sprite</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getScale <em>Scale</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getBounce <em>Bounce</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSpeed <em>Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSplitRule <em>Split Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getContactEffects <em>Contact Effects</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getProducedTypes <em>Produced Types</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveScale positiveBounce positiveSpeed nonNegativePoints distinctEffectKinds'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveScale='scale &gt; 0' positiveBounce='bounce &gt; 0' positiveSpeed='speed &gt; 0' nonNegativePoints='points &gt;= 0'"
 * @generated
 */
public interface EnemyType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image of the enemy, as a path in the game's assets folder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sprite</em>' attribute.
	 * @see #setSprite(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_Sprite()
	 * @model required="true"
	 * @generated
	 */
	String getSprite();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSprite <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprite</em>' attribute.
	 * @see #getSprite()
	 * @generated
	 */
	void setSprite(String value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size relative to a standard enemy of the same size class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_Scale()
	 * @model default="1.0"
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Returns the value of the '<em><b>Bounce</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bounce height relative to a standard enemy of the same size class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounce</em>' attribute.
	 * @see #setBounce(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_Bounce()
	 * @model default="1.0"
	 * @generated
	 */
	float getBounce();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getBounce <em>Bounce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounce</em>' attribute.
	 * @see #getBounce()
	 * @generated
	 */
	void setBounce(float value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Horizontal speed, in metres per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_Speed()
	 * @model default="5.0"
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Score awarded for each pop of a enemy of this type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_Points()
	 * @model default="10"
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Split Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens when a enemy of this type is hit by the tongue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split Rule</em>' containment reference.
	 * @see #setSplitRule(SplitRule)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_SplitRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SplitRule getSplitRule();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSplitRule <em>Split Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Rule</em>' containment reference.
	 * @see #getSplitRule()
	 * @generated
	 */
	void setSplitRule(SplitRule value);

	/**
	 * Returns the value of the '<em><b>Contact Effects</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.PlayerEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What a enemy of this type does to the player when they touch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Effects</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_ContactEffects()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlayerEffect> getContactEffects();

	/**
	 * Returns the value of the '<em><b>Produced Types</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EnemyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enemy types that popping a enemy of this type can create: none if it vanishes, otherwise the type of its fragments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Produced Types</em>' reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemyType_ProducedTypes()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EnemyType> getProducedTypes();

} // EnemyType
