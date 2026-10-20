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
 * Game modes of the Rango Unchained product line. A model (rooted in an Edition) configures one product: the ball types, power-ups, surface materials and player profiles it ships, and the game modes built from them. A game mode decides what spawns and when, how every ball behaves when it is popped or touches the player, what the arena contains, what can drop, and when a round is won or lost.
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
	 * The feature id for the '<em><b>Ball Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__BALL_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Power Ups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__POWER_UPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Materials</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__MATERIALS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__PLAYERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITION__MODES = NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallTypeImpl <em>Ball Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallTypeImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallType()
	 * @generated
	 */
	int BALL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__SPRITE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__SCALE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__BOUNCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__SPEED = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__POINTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Split Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__SPLIT_RULE = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__CONTACT_EFFECTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Produced Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE__PRODUCED_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ball Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ball Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl <em>Fragmenting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getFragmenting()
	 * @generated
	 */
	int FRAGMENTING = 6;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING__FRAGMENTS = SPLIT_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fragment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING__FRAGMENT_TYPE = SPLIT_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Launch Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING__LAUNCH_SPEED = SPLIT_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING__RESULT_TYPE = SPLIT_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fragmenting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING_FEATURE_COUNT = SPLIT_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Fragmenting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENTING_OPERATION_COUNT = SPLIT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl <em>Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.SplitImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getSplit()
	 * @generated
	 */
	int SPLIT = 7;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FRAGMENTS = FRAGMENTING__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Fragment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__FRAGMENT_TYPE = FRAGMENTING__FRAGMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Launch Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__LAUNCH_SPEED = FRAGMENTING__LAUNCH_SPEED;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT__RESULT_TYPE = FRAGMENTING__RESULT_TYPE;

	/**
	 * The number of structural features of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_FEATURE_COUNT = FRAGMENTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_OPERATION_COUNT = FRAGMENTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BurstImpl <em>Burst</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BurstImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBurst()
	 * @generated
	 */
	int BURST = 8;

	/**
	 * The feature id for the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__FRAGMENTS = FRAGMENTING__FRAGMENTS;

	/**
	 * The feature id for the '<em><b>Fragment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__FRAGMENT_TYPE = FRAGMENTING__FRAGMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Launch Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__LAUNCH_SPEED = FRAGMENTING__LAUNCH_SPEED;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST__RESULT_TYPE = FRAGMENTING__RESULT_TYPE;

	/**
	 * The number of structural features of the '<em>Burst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_FEATURE_COUNT = FRAGMENTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Burst</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BURST_OPERATION_COUNT = FRAGMENTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl <em>Player Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerEffectImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerEffect()
	 * @generated
	 */
	int PLAYER_EFFECT = 9;

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
	int DAMAGE = 10;

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
	int HEAL = 11;

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
	int TIMED_EFFECT = 12;

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
	int SHIELD = 13;

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
	int SPEED_CHANGE = 14;

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
	int POISON = 15;

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
	int POWER_UP = 16;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getMaterial()
	 * @generated
	 */
	int MATERIAL = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bounce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__BOUNCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL__SPRITE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl <em>Player Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.PlayerProfileImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getPlayerProfile()
	 * @generated
	 */
	int PLAYER_PROFILE = 18;

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
	int GAME_MODE = 19;

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
	 * The feature id for the '<em><b>Ball Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__BALL_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gravity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__GRAVITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scoring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__SCORING = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Arena</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__ARENA = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Spawning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__SPAWNING = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Drops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__DROPS = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Win Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__WIN_CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Lose Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__LOSE_CONDITIONS = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Power Ups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__POWER_UPS = NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__POPS_TO_CLEAR = NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_MODE__MAX_SCORE = NAMED_ELEMENT_FEATURE_COUNT + 13;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl <em>Arena</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.ArenaImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getArena()
	 * @generated
	 */
	int ARENA = 20;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__FLOOR = 1;

	/**
	 * The feature id for the '<em><b>Walls</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__WALLS = 2;

	/**
	 * The feature id for the '<em><b>Player Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__PLAYER_START = 3;

	/**
	 * The feature id for the '<em><b>Obstacles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA__OBSTACLES = 4;

	/**
	 * The number of structural features of the '<em>Arena</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARENA_FEATURE_COUNT = 5;

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
	int OBSTACLE = 21;

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
	int BLOCK = 22;

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
	 * The feature id for the '<em><b>Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__MATERIAL = OBSTACLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = OBSTACLE_FEATURE_COUNT + 3;

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
	int TRIGGER = 23;

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
	int JUMP_PAD = 24;

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
	int TELEPORTER = 25;

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
	int SPAWN_STRATEGY = 26;

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
	int FIXED_LAYOUT = 27;

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
	int WAVE_SCHEDULE = 28;

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
	int WAVE = 29;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallSpawnImpl <em>Ball Spawn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallSpawnImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallSpawn()
	 * @generated
	 */
	int BALL_SPAWN = 30;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__X = POSITIONED__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__Y = POSITIONED__Y;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__TYPE = POSITIONED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__SIZE = POSITIONED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__COUNT = POSITIONED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__DIRECTION = POSITIONED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN__POPS_TO_CLEAR = POSITIONED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ball Spawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN_FEATURE_COUNT = POSITIONED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ball Spawn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALL_SPAWN_OPERATION_COUNT = POSITIONED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl <em>Drop Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.DropTableImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDropTable()
	 * @generated
	 */
	int DROP_TABLE = 31;

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
	 * The number of structural features of the '<em>Drop Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_TABLE_FEATURE_COUNT = 3;

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
	int DROP = 32;

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
	 * The number of structural features of the '<em>Drop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROP_FEATURE_COUNT = 4;

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
	int END_CONDITION = 33;

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
	int CLEARED = 34;

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
	int TIME_REACHED = 35;

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
	int SCORE_REACHED = 36;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallsPoppedImpl <em>Balls Popped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallsPoppedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallsPopped()
	 * @generated
	 */
	int BALLS_POPPED = 37;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_POPPED__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_POPPED__COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Balls Popped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_POPPED_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Balls Popped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_POPPED_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl <em>Waves Survived</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.WavesSurvivedImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getWavesSurvived()
	 * @generated
	 */
	int WAVES_SURVIVED = 38;

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
	int HEALTH_DEPLETED = 39;

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
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallsAliveImpl <em>Balls Alive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallsAliveImpl
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallsAlive()
	 * @generated
	 */
	int BALLS_ALIVE = 40;

	/**
	 * The feature id for the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_ALIVE__WIN = END_CONDITION__WIN;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_ALIVE__COUNT = END_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Balls Alive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_ALIVE_FEATURE_COUNT = END_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Balls Alive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLS_ALIVE_OPERATION_COUNT = END_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.Scoring <em>Scoring</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.Scoring
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getScoring()
	 * @generated
	 */
	int SCORING = 41;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.Target <em>Target</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.Target
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 42;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.rango.gamemode.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.rango.gamemode.Direction
	 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 43;


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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getBallTypes <em>Ball Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ball Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getBallTypes()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_BallTypes();

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
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getMaterials <em>Materials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Materials</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition#getMaterials()
	 * @see #getEdition()
	 * @generated
	 */
	EReference getEdition_Materials();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.BallType <em>Ball Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ball Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType
	 * @generated
	 */
	EClass getBallType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprite</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getSprite()
	 * @see #getBallType()
	 * @generated
	 */
	EAttribute getBallType_Sprite();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getScale()
	 * @see #getBallType()
	 * @generated
	 */
	EAttribute getBallType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getBounce <em>Bounce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounce</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getBounce()
	 * @see #getBallType()
	 * @generated
	 */
	EAttribute getBallType_Bounce();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getSpeed()
	 * @see #getBallType()
	 * @generated
	 */
	EAttribute getBallType_Speed();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getPoints()
	 * @see #getBallType()
	 * @generated
	 */
	EAttribute getBallType_Points();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getSplitRule <em>Split Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Split Rule</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getSplitRule()
	 * @see #getBallType()
	 * @generated
	 */
	EReference getBallType_SplitRule();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getContactEffects <em>Contact Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact Effects</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getContactEffects()
	 * @see #getBallType()
	 * @generated
	 */
	EReference getBallType_ContactEffects();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.BallType#getProducedTypes <em>Produced Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produced Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallType#getProducedTypes()
	 * @see #getBallType()
	 * @generated
	 */
	EReference getBallType_ProducedTypes();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting <em>Fragmenting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragmenting</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Fragmenting
	 * @generated
	 */
	EClass getFragmenting();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragments <em>Fragments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragments</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragments()
	 * @see #getFragmenting()
	 * @generated
	 */
	EAttribute getFragmenting_Fragments();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragmentType <em>Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fragment Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragmentType()
	 * @see #getFragmenting()
	 * @generated
	 */
	EReference getFragmenting_FragmentType();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getLaunchSpeed <em>Launch Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Speed</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Fragmenting#getLaunchSpeed()
	 * @see #getFragmenting()
	 * @generated
	 */
	EAttribute getFragmenting_LaunchSpeed();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Fragmenting#getResultType()
	 * @see #getFragmenting()
	 * @generated
	 */
	EReference getFragmenting_ResultType();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Burst <em>Burst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Burst</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Burst
	 * @generated
	 */
	EClass getBurst();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.Material <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Material
	 * @generated
	 */
	EClass getMaterial();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Material#getBounce <em>Bounce</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounce</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Material#getBounce()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Bounce();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.Material#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprite</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Material#getSprite()
	 * @see #getMaterial()
	 * @generated
	 */
	EAttribute getMaterial_Sprite();

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
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getBallTypes <em>Ball Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ball Types</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getBallTypes()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_BallTypes();

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
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getScoring <em>Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scoring</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getScoring()
	 * @see #getGameMode()
	 * @generated
	 */
	EAttribute getGameMode_Scoring();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getArena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arena</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getArena()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_Arena();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getSpawning <em>Spawning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spawning</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode#getSpawning()
	 * @see #getGameMode()
	 * @generated
	 */
	EReference getGameMode_Spawning();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDrops <em>Drops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drops</em>'.
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
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Floor</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena#getFloor()
	 * @see #getArena()
	 * @generated
	 */
	EReference getArena_Floor();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getWalls <em>Walls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Walls</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena#getWalls()
	 * @see #getArena()
	 * @generated
	 */
	EReference getArena_Walls();

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
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.Block#getMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Material</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Block#getMaterial()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Material();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn <em>Ball Spawn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ball Spawn</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn
	 * @generated
	 */
	EClass getBallSpawn();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn#getType()
	 * @see #getBallSpawn()
	 * @generated
	 */
	EReference getBallSpawn_Type();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn#getSize()
	 * @see #getBallSpawn()
	 * @generated
	 */
	EAttribute getBallSpawn_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn#getCount()
	 * @see #getBallSpawn()
	 * @generated
	 */
	EAttribute getBallSpawn_Count();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn#getDirection()
	 * @see #getBallSpawn()
	 * @generated
	 */
	EAttribute getBallSpawn_Direction();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallSpawn#getPopsToClear <em>Pops To Clear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pops To Clear</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallSpawn#getPopsToClear()
	 * @see #getBallSpawn()
	 * @generated
	 */
	EAttribute getBallSpawn_PopsToClear();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.BallsPopped <em>Balls Popped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balls Popped</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallsPopped
	 * @generated
	 */
	EClass getBallsPopped();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallsPopped#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallsPopped#getCount()
	 * @see #getBallsPopped()
	 * @generated
	 */
	EAttribute getBallsPopped_Count();

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
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.rango.gamemode.BallsAlive <em>Balls Alive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balls Alive</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallsAlive
	 * @generated
	 */
	EClass getBallsAlive();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.rango.gamemode.BallsAlive#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.BallsAlive#getCount()
	 * @see #getBallsAlive()
	 * @generated
	 */
	EAttribute getBallsAlive_Count();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.rango.gamemode.Scoring <em>Scoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scoring</em>'.
	 * @see no.ntnu.tdt4250.rango.gamemode.Scoring
	 * @generated
	 */
	EEnum getScoring();

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
		 * The meta object literal for the '<em><b>Ball Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__BALL_TYPES = eINSTANCE.getEdition_BallTypes();

		/**
		 * The meta object literal for the '<em><b>Power Ups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__POWER_UPS = eINSTANCE.getEdition_PowerUps();

		/**
		 * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITION__MATERIALS = eINSTANCE.getEdition_Materials();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallTypeImpl <em>Ball Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallTypeImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallType()
		 * @generated
		 */
		EClass BALL_TYPE = eINSTANCE.getBallType();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_TYPE__SPRITE = eINSTANCE.getBallType_Sprite();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_TYPE__SCALE = eINSTANCE.getBallType_Scale();

		/**
		 * The meta object literal for the '<em><b>Bounce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_TYPE__BOUNCE = eINSTANCE.getBallType_Bounce();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_TYPE__SPEED = eINSTANCE.getBallType_Speed();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_TYPE__POINTS = eINSTANCE.getBallType_Points();

		/**
		 * The meta object literal for the '<em><b>Split Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALL_TYPE__SPLIT_RULE = eINSTANCE.getBallType_SplitRule();

		/**
		 * The meta object literal for the '<em><b>Contact Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALL_TYPE__CONTACT_EFFECTS = eINSTANCE.getBallType_ContactEffects();

		/**
		 * The meta object literal for the '<em><b>Produced Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALL_TYPE__PRODUCED_TYPES = eINSTANCE.getBallType_ProducedTypes();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl <em>Fragmenting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.FragmentingImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getFragmenting()
		 * @generated
		 */
		EClass FRAGMENTING = eINSTANCE.getFragmenting();

		/**
		 * The meta object literal for the '<em><b>Fragments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENTING__FRAGMENTS = eINSTANCE.getFragmenting_Fragments();

		/**
		 * The meta object literal for the '<em><b>Fragment Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENTING__FRAGMENT_TYPE = eINSTANCE.getFragmenting_FragmentType();

		/**
		 * The meta object literal for the '<em><b>Launch Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAGMENTING__LAUNCH_SPEED = eINSTANCE.getFragmenting_LaunchSpeed();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRAGMENTING__RESULT_TYPE = eINSTANCE.getFragmenting_ResultType();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BurstImpl <em>Burst</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BurstImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBurst()
		 * @generated
		 */
		EClass BURST = eINSTANCE.getBurst();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.MaterialImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getMaterial()
		 * @generated
		 */
		EClass MATERIAL = eINSTANCE.getMaterial();

		/**
		 * The meta object literal for the '<em><b>Bounce</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__BOUNCE = eINSTANCE.getMaterial_Bounce();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL__SPRITE = eINSTANCE.getMaterial_Sprite();

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
		 * The meta object literal for the '<em><b>Ball Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__BALL_TYPES = eINSTANCE.getGameMode_BallTypes();

		/**
		 * The meta object literal for the '<em><b>Gravity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__GRAVITY = eINSTANCE.getGameMode_Gravity();

		/**
		 * The meta object literal for the '<em><b>Scoring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_MODE__SCORING = eINSTANCE.getGameMode_Scoring();

		/**
		 * The meta object literal for the '<em><b>Arena</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__ARENA = eINSTANCE.getGameMode_Arena();

		/**
		 * The meta object literal for the '<em><b>Spawning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_MODE__SPAWNING = eINSTANCE.getGameMode_Spawning();

		/**
		 * The meta object literal for the '<em><b>Drops</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Floor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARENA__FLOOR = eINSTANCE.getArena_Floor();

		/**
		 * The meta object literal for the '<em><b>Walls</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARENA__WALLS = eINSTANCE.getArena_Walls();

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
		 * The meta object literal for the '<em><b>Material</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__MATERIAL = eINSTANCE.getBlock_Material();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallSpawnImpl <em>Ball Spawn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallSpawnImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallSpawn()
		 * @generated
		 */
		EClass BALL_SPAWN = eINSTANCE.getBallSpawn();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALL_SPAWN__TYPE = eINSTANCE.getBallSpawn_Type();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_SPAWN__SIZE = eINSTANCE.getBallSpawn_Size();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_SPAWN__COUNT = eINSTANCE.getBallSpawn_Count();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_SPAWN__DIRECTION = eINSTANCE.getBallSpawn_Direction();

		/**
		 * The meta object literal for the '<em><b>Pops To Clear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALL_SPAWN__POPS_TO_CLEAR = eINSTANCE.getBallSpawn_PopsToClear();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallsPoppedImpl <em>Balls Popped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallsPoppedImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallsPopped()
		 * @generated
		 */
		EClass BALLS_POPPED = eINSTANCE.getBallsPopped();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLS_POPPED__COUNT = eINSTANCE.getBallsPopped_Count();

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
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.impl.BallsAliveImpl <em>Balls Alive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.BallsAliveImpl
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getBallsAlive()
		 * @generated
		 */
		EClass BALLS_ALIVE = eINSTANCE.getBallsAlive();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLS_ALIVE__COUNT = eINSTANCE.getBallsAlive_Count();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.rango.gamemode.Scoring <em>Scoring</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.rango.gamemode.Scoring
		 * @see no.ntnu.tdt4250.rango.gamemode.impl.GamemodePackageImpl#getScoring()
		 * @generated
		 */
		EEnum SCORING = eINSTANCE.getScoring();

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
