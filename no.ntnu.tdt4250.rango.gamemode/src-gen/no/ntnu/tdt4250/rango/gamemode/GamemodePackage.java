/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Game modes of the Rango Unchained product line. A model (rooted in an Edition) configures one product: the enemy types, power-ups and player profiles it ships, and the game modes built from them. A game mode decides what spawns and when, how every enemy behaves when it is popped or touches the player, what the arena contains, what can drop, and when a round is won or lost.
 * <!-- end-model-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/LPG'"
 * @generated
 */
public interface GamemodePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gamemode";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/tdt4250/rango/gamemode/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gamemode";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamemodePackage eINSTANCE = no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.NamedElementImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PositionedImpl <em>Positioned</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PositionedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPositioned()
	 * @generated
	 */
	int POSITIONED = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED__Y = 1;

	/**
	 * The number of structural features of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Positioned</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIONED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl <em>Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEdition()
	 * @generated
	 */
	int EDITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enemy Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__ENEMY_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Ups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__POWER_UPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__PLAYERS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__MODES = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Drops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__DROPS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl <em>Enemy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemyType()
	 * @generated
	 */
	int ENEMY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__SPRITE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__SCALE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__BOUNCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__SPEED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__POINTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Split Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__SPLIT_RULE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__CONTACT_EFFECTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Produced Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE__PRODUCED_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Enemy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Enemy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitRuleImpl <em>Split Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SplitRuleImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSplitRule()
	 * @generated
	 */
	int SPLIT_RULE = 4;

	/**
	 * The number of structural features of the '<em>Split Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_RULE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Split Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.VanishImpl <em>Vanish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.VanishImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getVanish()
	 * @generated
	 */
	int VANISH = 5;

	/**
	 * The number of structural features of the '<em>Vanish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VANISH_FEATURE_COUNT = SPLIT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vanish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VANISH_OPERATION_COUNT = SPLIT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 6;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FRAGMENTS = SPLIT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FRAGMENT_TYPE = SPLIT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Launch Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__LAUNCH_SPEED = SPLIT_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__RESULT_TYPE = SPLIT_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__SPACING = SPLIT_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = SPLIT_RULE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = SPLIT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl <em>Player Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerEffect()
	 * @generated
	 */
	int PLAYER_EFFECT = 7;

	/**
	 * The number of structural features of the '<em>Player Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_EFFECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Player Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DamageImpl <em>Damage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.DamageImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDamage()
	 * @generated
	 */
	int DAMAGE = 8;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAGE__AMOUNT = PLAYER_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Damage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAGE_FEATURE_COUNT = PLAYER_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Damage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAMAGE_OPERATION_COUNT = PLAYER_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.HealImpl <em>Heal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.HealImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getHeal()
	 * @generated
	 */
	int HEAL = 9;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAL__AMOUNT = PLAYER_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAL_FEATURE_COUNT = PLAYER_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Heal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAL_OPERATION_COUNT = PLAYER_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TimedEffectImpl <em>Timed Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.TimedEffectImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTimedEffect()
	 * @generated
	 */
	int TIMED_EFFECT = 10;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EFFECT__DURATION = PLAYER_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EFFECT_FEATURE_COUNT = PLAYER_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timed Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EFFECT_OPERATION_COUNT = PLAYER_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ShieldImpl <em>Shield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ShieldImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getShield()
	 * @generated
	 */
	int SHIELD = 11;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIELD__DURATION = TIMED_EFFECT__DURATION;

	/**
	 * The number of structural features of the '<em>Shield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIELD_FEATURE_COUNT = TIMED_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Shield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIELD_OPERATION_COUNT = TIMED_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpeedChangeImpl <em>Speed Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpeedChangeImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpeedChange()
	 * @generated
	 */
	int SPEED_CHANGE = 12;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_CHANGE__DURATION = TIMED_EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_CHANGE__FACTOR = TIMED_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Speed Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_CHANGE_FEATURE_COUNT = TIMED_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Speed Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_CHANGE_OPERATION_COUNT = TIMED_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PoisonImpl <em>Poison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PoisonImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPoison()
	 * @generated
	 */
	int POISON = 13;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISON__DURATION = TIMED_EFFECT__DURATION;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISON__AMOUNT = TIMED_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISON__INTERVAL = TIMED_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISON_FEATURE_COUNT = TIMED_EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Poison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POISON_OPERATION_COUNT = TIMED_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl <em>Power Up</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPowerUp()
	 * @generated
	 */
	int POWER_UP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_UP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_UP__SPRITE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_UP__EFFECTS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Power Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_UP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Power Up</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_UP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl <em>Player Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerProfile()
	 * @generated
	 */
	int PLAYER_PROFILE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__CHARACTER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__HEALTH = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__MAX_HEALTH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__SPEED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tongue Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__TONGUE_TIME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cooldown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__COOLDOWN = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Grace Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE__GRACE_TIME = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Player Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Player Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_PROFILE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl <em>Game Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getGameMode()
	 * @generated
	 */
	int GAME_MODE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__TITLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__PLAYER = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Enemy Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__ENEMY_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__GRAVITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Speed Bonus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__SPEED_BONUS = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__LEVELS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Drops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__DROPS = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Win Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__WIN_CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lose Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__LOSE_CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Power Ups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__POWER_UPS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__POPS_TO_CLEAR = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__MAX_SCORE = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Effective Drops</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__EFFECTIVE_DROPS = NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Game Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Game Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Arena</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__ARENA = 1;

	/**
	 * The feature id for the '<em><b>Spawning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__SPAWNING = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__POPS_TO_CLEAR = 4;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL__MAX_SCORE = 5;

	/**
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpeedBonusImpl <em>Speed Bonus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpeedBonusImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpeedBonus()
	 * @generated
	 */
	int SPEED_BONUS = 18;

	/**
	 * The feature id for the '<em><b>Max Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_BONUS__MAX_FACTOR = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_BONUS__DURATION = 1;

	/**
	 * The number of structural features of the '<em>Speed Bonus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_BONUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Bonus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_BONUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl <em>Arena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getArena()
	 * @generated
	 */
	int ARENA = 19;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Player Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__PLAYER_START = 1;

	/**
	 * The feature id for the '<em><b>Obstacles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__OBSTACLES = 2;

	/**
	 * The number of structural features of the '<em>Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ObstacleImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__X = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE__Y = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BlockImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = OBSTACLE__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__X = OBSTACLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__Y = OBSTACLE__Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__WIDTH = OBSTACLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HEIGHT = OBSTACLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = OBSTACLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = OBSTACLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.TriggerImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = OBSTACLE__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__X = OBSTACLE__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__Y = OBSTACLE__Y;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__AFFECTS = OBSTACLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = OBSTACLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = OBSTACLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.JumpPadImpl <em>Jump Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.JumpPadImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getJumpPad()
	 * @generated
	 */
	int JUMP_PAD = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD__X = TRIGGER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD__Y = TRIGGER__Y;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD__AFFECTS = TRIGGER__AFFECTS;

	/**
	 * The feature id for the '<em><b>Launch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD__LAUNCH = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Jump Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_PAD_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TeleporterImpl <em>Teleporter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.TeleporterImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTeleporter()
	 * @generated
	 */
	int TELEPORTER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER__NAME = TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER__X = TRIGGER__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER__Y = TRIGGER__Y;

	/**
	 * The feature id for the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER__AFFECTS = TRIGGER__AFFECTS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER__TARGET = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Teleporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Teleporter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEPORTER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpawnStrategyImpl <em>Spawn Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpawnStrategyImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpawnStrategy()
	 * @generated
	 */
	int SPAWN_STRATEGY = 25;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWN_STRATEGY__POPS_TO_CLEAR = 0;

	/**
	 * The number of structural features of the '<em>Spawn Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWN_STRATEGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spawn Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAWN_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.FixedLayoutImpl <em>Fixed Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.FixedLayoutImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getFixedLayout()
	 * @generated
	 */
	int FIXED_LAYOUT = 26;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LAYOUT__POPS_TO_CLEAR = SPAWN_STRATEGY__POPS_TO_CLEAR;

	/**
	 * The feature id for the '<em><b>Spawns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LAYOUT__SPAWNS = SPAWN_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fixed Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LAYOUT_FEATURE_COUNT = SPAWN_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fixed Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_LAYOUT_OPERATION_COUNT = SPAWN_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl <em>Wave Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWaveSchedule()
	 * @generated
	 */
	int WAVE_SCHEDULE = 27;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE__POPS_TO_CLEAR = SPAWN_STRATEGY__POPS_TO_CLEAR;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE__LOOP = SPAWN_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Escalation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE__ESCALATION = SPAWN_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Waves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE__WAVES = SPAWN_STRATEGY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wave Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE_FEATURE_COUNT = SPAWN_STRATEGY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Wave Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_SCHEDULE_OPERATION_COUNT = SPAWN_STRATEGY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl <em>Wave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWave()
	 * @generated
	 */
	int WAVE = 28;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE__DELAY = 0;

	/**
	 * The feature id for the '<em><b>Spawns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE__SPAWNS = 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE__NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE__POPS_TO_CLEAR = 3;

	/**
	 * The number of structural features of the '<em>Wave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Wave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl <em>Enemy Spawn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemySpawn()
	 * @generated
	 */
	int ENEMY_SPAWN = 29;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__X = POSITIONED__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__Y = POSITIONED__Y;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__TYPE = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__SIZE = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__COUNT = POSITIONED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__DIRECTION = POSITIONED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN__POPS_TO_CLEAR = POSITIONED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Enemy Spawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Enemy Spawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_SPAWN_OPERATION_COUNT = POSITIONED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl <em>Drop Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDropTable()
	 * @generated
	 */
	int DROP_TABLE = 30;

	/**
	 * The feature id for the '<em><b>Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__CHANCE = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__ENTRIES = 1;

	/**
	 * The feature id for the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__TOTAL_WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Enemy Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE__ENEMY_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Drop Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drop Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DropImpl <em>Drop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.DropImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDrop()
	 * @generated
	 */
	int DROP = 31;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Power Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__POWER_UP = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__PROBABILITY = 3;

	/**
	 * The feature id for the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP__SHARE = 4;

	/**
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EndConditionImpl <em>End Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EndConditionImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEndCondition()
	 * @generated
	 */
	int END_CONDITION = 32;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_CONDITION__WIN = 0;

	/**
	 * The number of structural features of the '<em>End Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>End Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ClearedImpl <em>Cleared</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ClearedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getCleared()
	 * @generated
	 */
	int CLEARED = 33;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARED__WIN = END_CONDITION__WIN;

	/**
	 * The number of structural features of the '<em>Cleared</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cleared</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TimeReachedImpl <em>Time Reached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.TimeReachedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTimeReached()
	 * @generated
	 */
	int TIME_REACHED = 34;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REACHED__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REACHED__SECONDS = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Reached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REACHED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Reached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_REACHED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ScoreReachedImpl <em>Score Reached</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ScoreReachedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getScoreReached()
	 * @generated
	 */
	int SCORE_REACHED = 35;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_REACHED__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_REACHED__POINTS = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Score Reached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_REACHED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Score Reached</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCORE_REACHED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemiesPoppedImpl <em>Enemies Popped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemiesPoppedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemiesPopped()
	 * @generated
	 */
	int ENEMIES_POPPED = 36;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_POPPED__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_POPPED__COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enemies Popped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_POPPED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enemies Popped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_POPPED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl <em>Waves Survived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWavesSurvived()
	 * @generated
	 */
	int WAVES_SURVIVED = 37;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVES_SURVIVED__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVES_SURVIVED__COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Waves Survived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVES_SURVIVED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Waves Survived</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVES_SURVIVED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.HealthDepletedImpl <em>Health Depleted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.HealthDepletedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getHealthDepleted()
	 * @generated
	 */
	int HEALTH_DEPLETED = 38;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DEPLETED__WIN = END_CONDITION__WIN;

	/**
	 * The number of structural features of the '<em>Health Depleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DEPLETED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Health Depleted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_DEPLETED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemiesAliveImpl <em>Enemies Alive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemiesAliveImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemiesAlive()
	 * @generated
	 */
	int ENEMIES_ALIVE = 39;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_ALIVE__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_ALIVE__COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enemies Alive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_ALIVE_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enemies Alive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMIES_ALIVE_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.Target <em>Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.Target
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 40;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.Direction
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 41;


	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positioned</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Positioned
	 * @generated
	 */
	EClass getPositioned();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Positioned#getX()
	 * @see #getPositioned()
	 * @generated
	 */
	EAttribute getPositioned_X();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Positioned#getY()
	 * @see #getPositioned()
	 * @generated
	 */
	EAttribute getPositioned_Y();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edition</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition
	 * @generated
	 */
	EClass getEdition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getTitle()
	 * @see #getEdition()
	 * @generated
	 */
	EAttribute getEdition_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getEnemyTypes <em>Enemy Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enemy Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getEnemyTypes()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_EnemyTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPowerUps <em>Power Ups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Ups</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getPowerUps()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_PowerUps();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getPlayers()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getModes <em>Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modes</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getModes()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Modes();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getDrops <em>Drops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drops</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getDrops()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Drops();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType <em>Enemy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType
	 * @generated
	 */
	EClass getEnemyType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprite</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getSprite()
	 * @see #getEnemyType()
	 * @generated
	 */
	EAttribute getEnemyType_Sprite();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getScale()
	 * @see #getEnemyType()
	 * @generated
	 */
	EAttribute getEnemyType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getBounce <em>Bounce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounce</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getBounce()
	 * @see #getEnemyType()
	 * @generated
	 */
	EAttribute getEnemyType_Bounce();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getSpeed()
	 * @see #getEnemyType()
	 * @generated
	 */
	EAttribute getEnemyType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getPoints()
	 * @see #getEnemyType()
	 * @generated
	 */
	EAttribute getEnemyType_Points();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getSplitRule <em>Split Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split Rule</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getSplitRule()
	 * @see #getEnemyType()
	 * @generated
	 */
	EReference getEnemyType_SplitRule();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getContactEffects <em>Contact Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact Effects</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getContactEffects()
	 * @see #getEnemyType()
	 * @generated
	 */
	EReference getEnemyType_ContactEffects();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType#getProducedTypes <em>Produced Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType#getProducedTypes()
	 * @see #getEnemyType()
	 * @generated
	 */
	EReference getEnemyType_ProducedTypes();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.SplitRule <em>Split Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Rule</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SplitRule
	 * @generated
	 */
	EClass getSplitRule();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Vanish <em>Vanish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vanish</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Vanish
	 * @generated
	 */
	EClass getVanish();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split
	 * @generated
	 */
	EClass getSplit();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragments</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split#getFragments()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_Fragments();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragmentType <em>Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fragment Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split#getFragmentType()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_FragmentType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Split#getLaunchSpeed <em>Launch Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Speed</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split#getLaunchSpeed()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_LaunchSpeed();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Split#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split#getResultType()
	 * @see #getSplit()
	 * @generated
	 */
	EReference getSplit_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Split#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split#getSpacing()
	 * @see #getSplit()
	 * @generated
	 */
	EAttribute getSplit_Spacing();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.PlayerEffect <em>Player Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Effect</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerEffect
	 * @generated
	 */
	EClass getPlayerEffect();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Damage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Damage</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Damage
	 * @generated
	 */
	EClass getDamage();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Damage#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Damage#getAmount()
	 * @see #getDamage()
	 * @generated
	 */
	EAttribute getDamage_Amount();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Heal <em>Heal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heal</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Heal
	 * @generated
	 */
	EClass getHeal();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Heal#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Heal#getAmount()
	 * @see #getHeal()
	 * @generated
	 */
	EAttribute getHeal_Amount();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.TimedEffect <em>Timed Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Effect</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimedEffect
	 * @generated
	 */
	EClass getTimedEffect();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.TimedEffect#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimedEffect#getDuration()
	 * @see #getTimedEffect()
	 * @generated
	 */
	EAttribute getTimedEffect_Duration();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Shield <em>Shield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shield</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Shield
	 * @generated
	 */
	EClass getShield();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.SpeedChange <em>Speed Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Change</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedChange
	 * @generated
	 */
	EClass getSpeedChange();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.SpeedChange#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedChange#getFactor()
	 * @see #getSpeedChange()
	 * @generated
	 */
	EAttribute getSpeedChange_Factor();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Poison <em>Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poison</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Poison
	 * @generated
	 */
	EClass getPoison();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Poison#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Poison#getAmount()
	 * @see #getPoison()
	 * @generated
	 */
	EAttribute getPoison_Amount();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Poison#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Poison#getInterval()
	 * @see #getPoison()
	 * @generated
	 */
	EAttribute getPoison_Interval();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.PowerUp <em>Power Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Up</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PowerUp
	 * @generated
	 */
	EClass getPowerUp();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PowerUp#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprite</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PowerUp#getSprite()
	 * @see #getPowerUp()
	 * @generated
	 */
	EAttribute getPowerUp_Sprite();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.PowerUp#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PowerUp#getEffects()
	 * @see #getPowerUp()
	 * @generated
	 */
	EReference getPowerUp_Effects();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile <em>Player Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player Profile</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile
	 * @generated
	 */
	EClass getPlayerProfile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCharacter()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_Character();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getHealth <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getHealth()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_Health();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getMaxHealth <em>Max Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Health</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getMaxHealth()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_MaxHealth();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getSpeed()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_Speed();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getTongueTime <em>Tongue Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tongue Time</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getTongueTime()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_TongueTime();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCooldown <em>Cooldown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cooldown</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getCooldown()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_Cooldown();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getGraceTime <em>Grace Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grace Time</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile#getGraceTime()
	 * @see #getPlayerProfile()
	 * @generated
	 */
	EAttribute getPlayerProfile_GraceTime();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.GameMode <em>Game Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Mode</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode
	 * @generated
	 */
	EClass getGameMode();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getTitle()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_Title();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getDescription()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_Description();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getPlayer()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_Player();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getEnemyTypes <em>Enemy Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enemy Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getEnemyTypes()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_EnemyTypes();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getGravity <em>Gravity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravity</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getGravity()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_Gravity();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getSpeedBonus <em>Speed Bonus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speed Bonus</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getSpeedBonus()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_SpeedBonus();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getLevels()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_Levels();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDrops <em>Drops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drops</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getDrops()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_Drops();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getWinConditions <em>Win Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Win Conditions</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getWinConditions()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_WinConditions();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getLoseConditions <em>Lose Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lose Conditions</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getLoseConditions()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_LoseConditions();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPowerUps <em>Power Ups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Power Ups</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getPowerUps()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_PowerUps();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getPopsToClear()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_PopsToClear();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getMaxScore <em>Max Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Score</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getMaxScore()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_MaxScore();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getEffectiveDrops <em>Effective Drops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effective Drops</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getEffectiveDrops()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_EffectiveDrops();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level
	 * @generated
	 */
	EClass getLevel();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Level#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getTitle()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Title();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.Level#getArena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arena</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getArena()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Arena();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.Level#getSpawning <em>Spawning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spawning</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getSpawning()
	 * @see #getLevel()
	 * @generated
	 */
	EReference getLevel_Spawning();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Level#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getNumber()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_Number();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Level#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getPopsToClear()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_PopsToClear();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Level#getMaxScore <em>Max Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Score</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level#getMaxScore()
	 * @see #getLevel()
	 * @generated
	 */
	EAttribute getLevel_MaxScore();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus <em>Speed Bonus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Bonus</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedBonus
	 * @generated
	 */
	EClass getSpeedBonus();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getMaxFactor <em>Max Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Factor</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getMaxFactor()
	 * @see #getSpeedBonus()
	 * @generated
	 */
	EAttribute getSpeedBonus_MaxFactor();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedBonus#getDuration()
	 * @see #getSpeedBonus()
	 * @generated
	 */
	EAttribute getSpeedBonus_Duration();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Arena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arena</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena
	 * @generated
	 */
	EClass getArena();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena#getBackground()
	 * @see #getArena()
	 * @generated
	 */
	EAttribute getArena_Background();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getPlayerStart <em>Player Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Start</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena#getPlayerStart()
	 * @see #getArena()
	 * @generated
	 */
	EAttribute getArena_PlayerStart();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getObstacles <em>Obstacles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Obstacles</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena#getObstacles()
	 * @see #getArena()
	 * @generated
	 */
	EReference getArena_Obstacles();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Block#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Block#getWidth()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Width();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Block#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Block#getHeight()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Height();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Trigger#getAffects <em>Affects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affects</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Trigger#getAffects()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Affects();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.JumpPad <em>Jump Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Pad</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.JumpPad
	 * @generated
	 */
	EClass getJumpPad();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.JumpPad#getLaunch <em>Launch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.JumpPad#getLaunch()
	 * @see #getJumpPad()
	 * @generated
	 */
	EAttribute getJumpPad_Launch();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Teleporter <em>Teleporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teleporter</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Teleporter
	 * @generated
	 */
	EClass getTeleporter();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Teleporter#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Teleporter#getTarget()
	 * @see #getTeleporter()
	 * @generated
	 */
	EReference getTeleporter_Target();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.SpawnStrategy <em>Spawn Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spawn Strategy</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpawnStrategy
	 * @generated
	 */
	EClass getSpawnStrategy();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.SpawnStrategy#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpawnStrategy#getPopsToClear()
	 * @see #getSpawnStrategy()
	 * @generated
	 */
	EAttribute getSpawnStrategy_PopsToClear();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.FixedLayout <em>Fixed Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Layout</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.FixedLayout
	 * @generated
	 */
	EClass getFixedLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.FixedLayout#getSpawns <em>Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spawns</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.FixedLayout#getSpawns()
	 * @see #getFixedLayout()
	 * @generated
	 */
	EReference getFixedLayout_Spawns();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule <em>Wave Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wave Schedule</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WaveSchedule
	 * @generated
	 */
	EClass getWaveSchedule();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WaveSchedule#isLoop()
	 * @see #getWaveSchedule()
	 * @generated
	 */
	EAttribute getWaveSchedule_Loop();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getEscalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escalation</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getEscalation()
	 * @see #getWaveSchedule()
	 * @generated
	 */
	EAttribute getWaveSchedule_Escalation();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getWaves <em>Waves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Waves</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getWaves()
	 * @see #getWaveSchedule()
	 * @generated
	 */
	EReference getWaveSchedule_Waves();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Wave <em>Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wave</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave
	 * @generated
	 */
	EClass getWave();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Wave#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave#getDelay()
	 * @see #getWave()
	 * @generated
	 */
	EAttribute getWave_Delay();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Wave#getSpawns <em>Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spawns</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave#getSpawns()
	 * @see #getWave()
	 * @generated
	 */
	EReference getWave_Spawns();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Wave#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave#getNumber()
	 * @see #getWave()
	 * @generated
	 */
	EAttribute getWave_Number();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Wave#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave#getPopsToClear()
	 * @see #getWave()
	 * @generated
	 */
	EAttribute getWave_PopsToClear();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn <em>Enemy Spawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy Spawn</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn
	 * @generated
	 */
	EClass getEnemySpawn();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getType()
	 * @see #getEnemySpawn()
	 * @generated
	 */
	EReference getEnemySpawn_Type();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getSize()
	 * @see #getEnemySpawn()
	 * @generated
	 */
	EAttribute getEnemySpawn_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getCount()
	 * @see #getEnemySpawn()
	 * @generated
	 */
	EAttribute getEnemySpawn_Count();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getDirection()
	 * @see #getEnemySpawn()
	 * @generated
	 */
	EAttribute getEnemySpawn_Direction();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getPopsToClear()
	 * @see #getEnemySpawn()
	 * @generated
	 */
	EAttribute getEnemySpawn_PopsToClear();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.DropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop Table</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable
	 * @generated
	 */
	EClass getDropTable();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getChance <em>Chance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chance</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable#getChance()
	 * @see #getDropTable()
	 * @generated
	 */
	EAttribute getDropTable_Chance();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable#getEntries()
	 * @see #getDropTable()
	 * @generated
	 */
	EReference getDropTable_Entries();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getTotalWeight <em>Total Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Weight</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable#getTotalWeight()
	 * @see #getDropTable()
	 * @generated
	 */
	EAttribute getDropTable_TotalWeight();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getEnemyType <em>Enemy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enemy Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable#getEnemyType()
	 * @see #getDropTable()
	 * @generated
	 */
	EReference getDropTable_EnemyType();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drop</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop
	 * @generated
	 */
	EClass getDrop();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getTable()
	 * @see #getDrop()
	 * @generated
	 */
	EReference getDrop_Table();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getPowerUp <em>Power Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Power Up</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getPowerUp()
	 * @see #getDrop()
	 * @generated
	 */
	EReference getDrop_PowerUp();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getWeight()
	 * @see #getDrop()
	 * @generated
	 */
	EAttribute getDrop_Weight();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getProbability()
	 * @see #getDrop()
	 * @generated
	 */
	EAttribute getDrop_Probability();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getShare <em>Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getShare()
	 * @see #getDrop()
	 * @generated
	 */
	EAttribute getDrop_Share();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.EndCondition <em>End Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Condition</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EndCondition
	 * @generated
	 */
	EClass getEndCondition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EndCondition#isWin <em>Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EndCondition#isWin()
	 * @see #getEndCondition()
	 * @generated
	 */
	EAttribute getEndCondition_Win();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Cleared <em>Cleared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cleared</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Cleared
	 * @generated
	 */
	EClass getCleared();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.TimeReached <em>Time Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Reached</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimeReached
	 * @generated
	 */
	EClass getTimeReached();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.TimeReached#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimeReached#getSeconds()
	 * @see #getTimeReached()
	 * @generated
	 */
	EAttribute getTimeReached_Seconds();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.ScoreReached <em>Score Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Score Reached</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.ScoreReached
	 * @generated
	 */
	EClass getScoreReached();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.ScoreReached#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.ScoreReached#getPoints()
	 * @see #getScoreReached()
	 * @generated
	 */
	EAttribute getScoreReached_Points();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesPopped <em>Enemies Popped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemies Popped</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesPopped
	 * @generated
	 */
	EClass getEnemiesPopped();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesPopped#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesPopped#getCount()
	 * @see #getEnemiesPopped()
	 * @generated
	 */
	EAttribute getEnemiesPopped_Count();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.WavesSurvived <em>Waves Survived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waves Survived</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WavesSurvived
	 * @generated
	 */
	EClass getWavesSurvived();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.WavesSurvived#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.WavesSurvived#getCount()
	 * @see #getWavesSurvived()
	 * @generated
	 */
	EAttribute getWavesSurvived_Count();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.HealthDepleted <em>Health Depleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Depleted</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.HealthDepleted
	 * @generated
	 */
	EClass getHealthDepleted();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesAlive <em>Enemies Alive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemies Alive</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesAlive
	 * @generated
	 */
	EClass getEnemiesAlive();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesAlive#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesAlive#getCount()
	 * @see #getEnemiesAlive()
	 * @generated
	 */
	EAttribute getEnemiesAlive_Count();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.rango.gamemode.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Target</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Target
	 * @generated
	 */
	EEnum getTarget();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.rango.gamemode.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GamemodeFactory getGamemodeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.NamedElementImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PositionedImpl <em>Positioned</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.PositionedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPositioned()
		 * @generated
		 */
		EClass POSITIONED = eINSTANCE.getPositioned();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED__X = eINSTANCE.getPositioned_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITIONED__Y = eINSTANCE.getPositioned_Y();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl <em>Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EditionImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEdition()
		 * @generated
		 */
		EClass EDITION = eINSTANCE.getEdition();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITION__TITLE = eINSTANCE.getEdition_Title();

		/**
		 * The meta object literal for the '<em><b>Enemy Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__ENEMY_TYPES = eINSTANCE.getEdition_EnemyTypes();

		/**
		 * The meta object literal for the '<em><b>Power Ups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__POWER_UPS = eINSTANCE.getEdition_PowerUps();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__PLAYERS = eINSTANCE.getEdition_Players();

		/**
		 * The meta object literal for the '<em><b>Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__MODES = eINSTANCE.getEdition_Modes();

		/**
		 * The meta object literal for the '<em><b>Drops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__DROPS = eINSTANCE.getEdition_Drops();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl <em>Enemy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemyTypeImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemyType()
		 * @generated
		 */
		EClass ENEMY_TYPE = eINSTANCE.getEnemyType();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_TYPE__SPRITE = eINSTANCE.getEnemyType_Sprite();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_TYPE__SCALE = eINSTANCE.getEnemyType_Scale();

		/**
		 * The meta object literal for the '<em><b>Bounce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_TYPE__BOUNCE = eINSTANCE.getEnemyType_Bounce();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_TYPE__SPEED = eINSTANCE.getEnemyType_Speed();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_TYPE__POINTS = eINSTANCE.getEnemyType_Points();

		/**
		 * The meta object literal for the '<em><b>Split Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY_TYPE__SPLIT_RULE = eINSTANCE.getEnemyType_SplitRule();

		/**
		 * The meta object literal for the '<em><b>Contact Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY_TYPE__CONTACT_EFFECTS = eINSTANCE.getEnemyType_ContactEffects();

		/**
		 * The meta object literal for the '<em><b>Produced Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY_TYPE__PRODUCED_TYPES = eINSTANCE.getEnemyType_ProducedTypes();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitRuleImpl <em>Split Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.SplitRuleImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSplitRule()
		 * @generated
		 */
		EClass SPLIT_RULE = eINSTANCE.getSplitRule();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.VanishImpl <em>Vanish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.VanishImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getVanish()
		 * @generated
		 */
		EClass VANISH = eINSTANCE.getVanish();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl <em>Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSplit()
		 * @generated
		 */
		EClass SPLIT = eINSTANCE.getSplit();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__FRAGMENTS = eINSTANCE.getSplit_Fragments();

		/**
		 * The meta object literal for the '<em><b>Fragment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__FRAGMENT_TYPE = eINSTANCE.getSplit_FragmentType();

		/**
		 * The meta object literal for the '<em><b>Launch Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__LAUNCH_SPEED = eINSTANCE.getSplit_LaunchSpeed();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT__RESULT_TYPE = eINSTANCE.getSplit_ResultType();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLIT__SPACING = eINSTANCE.getSplit_Spacing();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl <em>Player Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerEffect()
		 * @generated
		 */
		EClass PLAYER_EFFECT = eINSTANCE.getPlayerEffect();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DamageImpl <em>Damage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.DamageImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDamage()
		 * @generated
		 */
		EClass DAMAGE = eINSTANCE.getDamage();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAMAGE__AMOUNT = eINSTANCE.getDamage_Amount();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.HealImpl <em>Heal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.HealImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getHeal()
		 * @generated
		 */
		EClass HEAL = eINSTANCE.getHeal();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAL__AMOUNT = eINSTANCE.getHeal_Amount();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TimedEffectImpl <em>Timed Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.TimedEffectImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTimedEffect()
		 * @generated
		 */
		EClass TIMED_EFFECT = eINSTANCE.getTimedEffect();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_EFFECT__DURATION = eINSTANCE.getTimedEffect_Duration();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ShieldImpl <em>Shield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.ShieldImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getShield()
		 * @generated
		 */
		EClass SHIELD = eINSTANCE.getShield();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpeedChangeImpl <em>Speed Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpeedChangeImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpeedChange()
		 * @generated
		 */
		EClass SPEED_CHANGE = eINSTANCE.getSpeedChange();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_CHANGE__FACTOR = eINSTANCE.getSpeedChange_Factor();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PoisonImpl <em>Poison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.PoisonImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPoison()
		 * @generated
		 */
		EClass POISON = eINSTANCE.getPoison();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISON__AMOUNT = eINSTANCE.getPoison_Amount();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POISON__INTERVAL = eINSTANCE.getPoison_Interval();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl <em>Power Up</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.PowerUpImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPowerUp()
		 * @generated
		 */
		EClass POWER_UP = eINSTANCE.getPowerUp();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_UP__SPRITE = eINSTANCE.getPowerUp_Sprite();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_UP__EFFECTS = eINSTANCE.getPowerUp_Effects();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl <em>Player Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerProfile()
		 * @generated
		 */
		EClass PLAYER_PROFILE = eINSTANCE.getPlayerProfile();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__CHARACTER = eINSTANCE.getPlayerProfile_Character();

		/**
		 * The meta object literal for the '<em><b>Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__HEALTH = eINSTANCE.getPlayerProfile_Health();

		/**
		 * The meta object literal for the '<em><b>Max Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__MAX_HEALTH = eINSTANCE.getPlayerProfile_MaxHealth();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__SPEED = eINSTANCE.getPlayerProfile_Speed();

		/**
		 * The meta object literal for the '<em><b>Tongue Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__TONGUE_TIME = eINSTANCE.getPlayerProfile_TongueTime();

		/**
		 * The meta object literal for the '<em><b>Cooldown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__COOLDOWN = eINSTANCE.getPlayerProfile_Cooldown();

		/**
		 * The meta object literal for the '<em><b>Grace Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER_PROFILE__GRACE_TIME = eINSTANCE.getPlayerProfile_GraceTime();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl <em>Game Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GameModeImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getGameMode()
		 * @generated
		 */
		EClass GAME_MODE = eINSTANCE.getGameMode();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__TITLE = eINSTANCE.getGameMode_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__DESCRIPTION = eINSTANCE.getGameMode_Description();

		/**
		 * The meta object literal for the '<em><b>Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__PLAYER = eINSTANCE.getGameMode_Player();

		/**
		 * The meta object literal for the '<em><b>Enemy Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__ENEMY_TYPES = eINSTANCE.getGameMode_EnemyTypes();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__GRAVITY = eINSTANCE.getGameMode_Gravity();

		/**
		 * The meta object literal for the '<em><b>Speed Bonus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__SPEED_BONUS = eINSTANCE.getGameMode_SpeedBonus();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__LEVELS = eINSTANCE.getGameMode_Levels();

		/**
		 * The meta object literal for the '<em><b>Drops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__DROPS = eINSTANCE.getGameMode_Drops();

		/**
		 * The meta object literal for the '<em><b>Win Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__WIN_CONDITIONS = eINSTANCE.getGameMode_WinConditions();

		/**
		 * The meta object literal for the '<em><b>Lose Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__LOSE_CONDITIONS = eINSTANCE.getGameMode_LoseConditions();

		/**
		 * The meta object literal for the '<em><b>Power Ups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__POWER_UPS = eINSTANCE.getGameMode_PowerUps();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__POPS_TO_CLEAR = eINSTANCE.getGameMode_PopsToClear();

		/**
		 * The meta object literal for the '<em><b>Max Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__MAX_SCORE = eINSTANCE.getGameMode_MaxScore();

		/**
		 * The meta object literal for the '<em><b>Effective Drops</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__EFFECTIVE_DROPS = eINSTANCE.getGameMode_EffectiveDrops();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.LevelImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getLevel()
		 * @generated
		 */
		EClass LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__TITLE = eINSTANCE.getLevel_Title();

		/**
		 * The meta object literal for the '<em><b>Arena</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__ARENA = eINSTANCE.getLevel_Arena();

		/**
		 * The meta object literal for the '<em><b>Spawning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEVEL__SPAWNING = eINSTANCE.getLevel_Spawning();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__NUMBER = eINSTANCE.getLevel_Number();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__POPS_TO_CLEAR = eINSTANCE.getLevel_PopsToClear();

		/**
		 * The meta object literal for the '<em><b>Max Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEVEL__MAX_SCORE = eINSTANCE.getLevel_MaxScore();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpeedBonusImpl <em>Speed Bonus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpeedBonusImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpeedBonus()
		 * @generated
		 */
		EClass SPEED_BONUS = eINSTANCE.getSpeedBonus();

		/**
		 * The meta object literal for the '<em><b>Max Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_BONUS__MAX_FACTOR = eINSTANCE.getSpeedBonus_MaxFactor();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_BONUS__DURATION = eINSTANCE.getSpeedBonus_Duration();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl <em>Arena</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getArena()
		 * @generated
		 */
		EClass ARENA = eINSTANCE.getArena();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARENA__BACKGROUND = eINSTANCE.getArena_Background();

		/**
		 * The meta object literal for the '<em><b>Player Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARENA__PLAYER_START = eINSTANCE.getArena_PlayerStart();

		/**
		 * The meta object literal for the '<em><b>Obstacles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARENA__OBSTACLES = eINSTANCE.getArena_Obstacles();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.ObstacleImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BlockImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__WIDTH = eINSTANCE.getBlock_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__HEIGHT = eINSTANCE.getBlock_Height();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.TriggerImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Affects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__AFFECTS = eINSTANCE.getTrigger_Affects();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.JumpPadImpl <em>Jump Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.JumpPadImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getJumpPad()
		 * @generated
		 */
		EClass JUMP_PAD = eINSTANCE.getJumpPad();

		/**
		 * The meta object literal for the '<em><b>Launch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_PAD__LAUNCH = eINSTANCE.getJumpPad_Launch();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TeleporterImpl <em>Teleporter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.TeleporterImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTeleporter()
		 * @generated
		 */
		EClass TELEPORTER = eINSTANCE.getTeleporter();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELEPORTER__TARGET = eINSTANCE.getTeleporter_Target();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SpawnStrategyImpl <em>Spawn Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.SpawnStrategyImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSpawnStrategy()
		 * @generated
		 */
		EClass SPAWN_STRATEGY = eINSTANCE.getSpawnStrategy();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAWN_STRATEGY__POPS_TO_CLEAR = eINSTANCE.getSpawnStrategy_PopsToClear();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.FixedLayoutImpl <em>Fixed Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.FixedLayoutImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getFixedLayout()
		 * @generated
		 */
		EClass FIXED_LAYOUT = eINSTANCE.getFixedLayout();

		/**
		 * The meta object literal for the '<em><b>Spawns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXED_LAYOUT__SPAWNS = eINSTANCE.getFixedLayout_Spawns();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl <em>Wave Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.WaveScheduleImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWaveSchedule()
		 * @generated
		 */
		EClass WAVE_SCHEDULE = eINSTANCE.getWaveSchedule();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVE_SCHEDULE__LOOP = eINSTANCE.getWaveSchedule_Loop();

		/**
		 * The meta object literal for the '<em><b>Escalation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVE_SCHEDULE__ESCALATION = eINSTANCE.getWaveSchedule_Escalation();

		/**
		 * The meta object literal for the '<em><b>Waves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAVE_SCHEDULE__WAVES = eINSTANCE.getWaveSchedule_Waves();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl <em>Wave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.WaveImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWave()
		 * @generated
		 */
		EClass WAVE = eINSTANCE.getWave();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVE__DELAY = eINSTANCE.getWave_Delay();

		/**
		 * The meta object literal for the '<em><b>Spawns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAVE__SPAWNS = eINSTANCE.getWave_Spawns();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVE__NUMBER = eINSTANCE.getWave_Number();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVE__POPS_TO_CLEAR = eINSTANCE.getWave_PopsToClear();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl <em>Enemy Spawn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemySpawnImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemySpawn()
		 * @generated
		 */
		EClass ENEMY_SPAWN = eINSTANCE.getEnemySpawn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY_SPAWN__TYPE = eINSTANCE.getEnemySpawn_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_SPAWN__SIZE = eINSTANCE.getEnemySpawn_Size();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_SPAWN__COUNT = eINSTANCE.getEnemySpawn_Count();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_SPAWN__DIRECTION = eINSTANCE.getEnemySpawn_Direction();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_SPAWN__POPS_TO_CLEAR = eINSTANCE.getEnemySpawn_PopsToClear();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl <em>Drop Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDropTable()
		 * @generated
		 */
		EClass DROP_TABLE = eINSTANCE.getDropTable();

		/**
		 * The meta object literal for the '<em><b>Chance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE__CHANCE = eINSTANCE.getDropTable_Chance();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_TABLE__ENTRIES = eINSTANCE.getDropTable_Entries();

		/**
		 * The meta object literal for the '<em><b>Total Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP_TABLE__TOTAL_WEIGHT = eINSTANCE.getDropTable_TotalWeight();

		/**
		 * The meta object literal for the '<em><b>Enemy Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP_TABLE__ENEMY_TYPE = eINSTANCE.getDropTable_EnemyType();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DropImpl <em>Drop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.DropImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDrop()
		 * @generated
		 */
		EClass DROP = eINSTANCE.getDrop();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP__TABLE = eINSTANCE.getDrop_Table();

		/**
		 * The meta object literal for the '<em><b>Power Up</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DROP__POWER_UP = eINSTANCE.getDrop_PowerUp();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP__WEIGHT = eINSTANCE.getDrop_Weight();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP__PROBABILITY = eINSTANCE.getDrop_Probability();

		/**
		 * The meta object literal for the '<em><b>Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROP__SHARE = eINSTANCE.getDrop_Share();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EndConditionImpl <em>End Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EndConditionImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEndCondition()
		 * @generated
		 */
		EClass END_CONDITION = eINSTANCE.getEndCondition();

		/**
		 * The meta object literal for the '<em><b>Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_CONDITION__WIN = eINSTANCE.getEndCondition_Win();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ClearedImpl <em>Cleared</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.ClearedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getCleared()
		 * @generated
		 */
		EClass CLEARED = eINSTANCE.getCleared();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.TimeReachedImpl <em>Time Reached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.TimeReachedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTimeReached()
		 * @generated
		 */
		EClass TIME_REACHED = eINSTANCE.getTimeReached();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_REACHED__SECONDS = eINSTANCE.getTimeReached_Seconds();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ScoreReachedImpl <em>Score Reached</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.ScoreReachedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getScoreReached()
		 * @generated
		 */
		EClass SCORE_REACHED = eINSTANCE.getScoreReached();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCORE_REACHED__POINTS = eINSTANCE.getScoreReached_Points();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemiesPoppedImpl <em>Enemies Popped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemiesPoppedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemiesPopped()
		 * @generated
		 */
		EClass ENEMIES_POPPED = eINSTANCE.getEnemiesPopped();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMIES_POPPED__COUNT = eINSTANCE.getEnemiesPopped_Count();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl <em>Waves Survived</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWavesSurvived()
		 * @generated
		 */
		EClass WAVES_SURVIVED = eINSTANCE.getWavesSurvived();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAVES_SURVIVED__COUNT = eINSTANCE.getWavesSurvived_Count();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.HealthDepletedImpl <em>Health Depleted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.HealthDepletedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getHealthDepleted()
		 * @generated
		 */
		EClass HEALTH_DEPLETED = eINSTANCE.getHealthDepleted();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.EnemiesAliveImpl <em>Enemies Alive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.EnemiesAliveImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getEnemiesAlive()
		 * @generated
		 */
		EClass ENEMIES_ALIVE = eINSTANCE.getEnemiesAlive();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMIES_ALIVE__COUNT = eINSTANCE.getEnemiesAlive_Count();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.Target <em>Target</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.Target
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTarget()
		 * @generated
		 */
		EEnum TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.Direction
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //GamemodePackage
