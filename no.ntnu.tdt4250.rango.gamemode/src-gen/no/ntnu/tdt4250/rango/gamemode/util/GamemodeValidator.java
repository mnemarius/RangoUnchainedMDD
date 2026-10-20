/**
 */
package no.ntnu.tdt4250.rango.gamemode.util;

import java.util.List;
import java.util.Map;

import no.ntnu.tdt4250.rango.gamemode.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage
 * @generated
 */
public class GamemodeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GamemodeValidator INSTANCE = new GamemodeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.rango.gamemode";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamemodeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GamemodePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GamemodePackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case GamemodePackage.POSITIONED:
				return validatePositioned((Positioned)value, diagnostics, context);
			case GamemodePackage.EDITION:
				return validateEdition((Edition)value, diagnostics, context);
			case GamemodePackage.BALL_TYPE:
				return validateBallType((BallType)value, diagnostics, context);
			case GamemodePackage.SPLIT_RULE:
				return validateSplitRule((SplitRule)value, diagnostics, context);
			case GamemodePackage.VANISH:
				return validateVanish((Vanish)value, diagnostics, context);
			case GamemodePackage.FRAGMENTING:
				return validateFragmenting((Fragmenting)value, diagnostics, context);
			case GamemodePackage.SPLIT:
				return validateSplit((Split)value, diagnostics, context);
			case GamemodePackage.BURST:
				return validateBurst((Burst)value, diagnostics, context);
			case GamemodePackage.PLAYER_EFFECT:
				return validatePlayerEffect((PlayerEffect)value, diagnostics, context);
			case GamemodePackage.DAMAGE:
				return validateDamage((Damage)value, diagnostics, context);
			case GamemodePackage.HEAL:
				return validateHeal((Heal)value, diagnostics, context);
			case GamemodePackage.TIMED_EFFECT:
				return validateTimedEffect((TimedEffect)value, diagnostics, context);
			case GamemodePackage.SHIELD:
				return validateShield((Shield)value, diagnostics, context);
			case GamemodePackage.SPEED_CHANGE:
				return validateSpeedChange((SpeedChange)value, diagnostics, context);
			case GamemodePackage.POISON:
				return validatePoison((Poison)value, diagnostics, context);
			case GamemodePackage.POWER_UP:
				return validatePowerUp((PowerUp)value, diagnostics, context);
			case GamemodePackage.MATERIAL:
				return validateMaterial((Material)value, diagnostics, context);
			case GamemodePackage.PLAYER_PROFILE:
				return validatePlayerProfile((PlayerProfile)value, diagnostics, context);
			case GamemodePackage.GAME_MODE:
				return validateGameMode((GameMode)value, diagnostics, context);
			case GamemodePackage.ARENA:
				return validateArena((Arena)value, diagnostics, context);
			case GamemodePackage.OBSTACLE:
				return validateObstacle((Obstacle)value, diagnostics, context);
			case GamemodePackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case GamemodePackage.TRIGGER:
				return validateTrigger((Trigger)value, diagnostics, context);
			case GamemodePackage.JUMP_PAD:
				return validateJumpPad((JumpPad)value, diagnostics, context);
			case GamemodePackage.TELEPORTER:
				return validateTeleporter((Teleporter)value, diagnostics, context);
			case GamemodePackage.SPAWN_STRATEGY:
				return validateSpawnStrategy((SpawnStrategy)value, diagnostics, context);
			case GamemodePackage.FIXED_LAYOUT:
				return validateFixedLayout((FixedLayout)value, diagnostics, context);
			case GamemodePackage.WAVE_SCHEDULE:
				return validateWaveSchedule((WaveSchedule)value, diagnostics, context);
			case GamemodePackage.WAVE:
				return validateWave((Wave)value, diagnostics, context);
			case GamemodePackage.BALL_SPAWN:
				return validateBallSpawn((BallSpawn)value, diagnostics, context);
			case GamemodePackage.DROP_TABLE:
				return validateDropTable((DropTable)value, diagnostics, context);
			case GamemodePackage.DROP:
				return validateDrop((Drop)value, diagnostics, context);
			case GamemodePackage.END_CONDITION:
				return validateEndCondition((EndCondition)value, diagnostics, context);
			case GamemodePackage.CLEARED:
				return validateCleared((Cleared)value, diagnostics, context);
			case GamemodePackage.TIME_REACHED:
				return validateTimeReached((TimeReached)value, diagnostics, context);
			case GamemodePackage.SCORE_REACHED:
				return validateScoreReached((ScoreReached)value, diagnostics, context);
			case GamemodePackage.BALLS_POPPED:
				return validateBallsPopped((BallsPopped)value, diagnostics, context);
			case GamemodePackage.WAVES_SURVIVED:
				return validateWavesSurvived((WavesSurvived)value, diagnostics, context);
			case GamemodePackage.HEALTH_DEPLETED:
				return validateHealthDepleted((HealthDepleted)value, diagnostics, context);
			case GamemodePackage.BALLS_ALIVE:
				return validateBallsAlive((BallsAlive)value, diagnostics, context);
			case GamemodePackage.SCORING:
				return validateScoring((Scoring)value, diagnostics, context);
			case GamemodePackage.TARGET:
				return validateTarget((Target)value, diagnostics, context);
			case GamemodePackage.DIRECTION:
				return validateDirection((Direction)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(namedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(namedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(namedElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameUniqueAmongSiblings constraint of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateNamedElement_nameUniqueAmongSiblings(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.nameUniqueAmongSiblings(namedElement), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioned(Positioned positioned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(positioned, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(positioned, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(positioned, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the insideArena constraint of '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POSITIONED__INSIDE_ARENA__EEXPRESSION = "x >= 0 and x <= 100 and y >= 0 and y <= 100";

	/**
	 * Validates the insideArena constraint of '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositioned_insideArena(Positioned positioned, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.POSITIONED,
				 positioned,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "insideArena",
				 POSITIONED__INSIDE_ARENA__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEdition(Edition edition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(edition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(edition, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(edition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallType(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ballType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallType_positiveScale(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallType_positiveBounce(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallType_positiveSpeed(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallType_nonNegativePoints(ballType, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallType_distinctEffectKinds(ballType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveScale constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_TYPE__POSITIVE_SCALE__EEXPRESSION = "scale > 0";

	/**
	 * Validates the positiveScale constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallType_positiveScale(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_TYPE,
				 ballType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveScale",
				 BALL_TYPE__POSITIVE_SCALE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveBounce constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_TYPE__POSITIVE_BOUNCE__EEXPRESSION = "bounce > 0";

	/**
	 * Validates the positiveBounce constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallType_positiveBounce(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_TYPE,
				 ballType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveBounce",
				 BALL_TYPE__POSITIVE_BOUNCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveSpeed constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_TYPE__POSITIVE_SPEED__EEXPRESSION = "speed > 0";

	/**
	 * Validates the positiveSpeed constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallType_positiveSpeed(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_TYPE,
				 ballType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveSpeed",
				 BALL_TYPE__POSITIVE_SPEED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nonNegativePoints constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_TYPE__NON_NEGATIVE_POINTS__EEXPRESSION = "points >= 0";

	/**
	 * Validates the nonNegativePoints constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallType_nonNegativePoints(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_TYPE,
				 ballType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "nonNegativePoints",
				 BALL_TYPE__NON_NEGATIVE_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the distinctEffectKinds constraint of '<em>Ball Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBallType_distinctEffectKinds(BallType ballType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.distinctEffectKinds(ballType, ballType.getContactEffects()), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitRule(SplitRule splitRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVanish(Vanish vanish, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vanish, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFragmenting(Fragmenting fragmenting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fragmenting, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_atLeastOneFragment(fragmenting, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_positiveLaunchSpeed(fragmenting, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the atLeastOneFragment constraint of '<em>Fragmenting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FRAGMENTING__AT_LEAST_ONE_FRAGMENT__EEXPRESSION = "fragments >= 1";

	/**
	 * Validates the atLeastOneFragment constraint of '<em>Fragmenting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFragmenting_atLeastOneFragment(Fragmenting fragmenting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.FRAGMENTING,
				 fragmenting,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "atLeastOneFragment",
				 FRAGMENTING__AT_LEAST_ONE_FRAGMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveLaunchSpeed constraint of '<em>Fragmenting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FRAGMENTING__POSITIVE_LAUNCH_SPEED__EEXPRESSION = "launchSpeed > 0";

	/**
	 * Validates the positiveLaunchSpeed constraint of '<em>Fragmenting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFragmenting_positiveLaunchSpeed(Fragmenting fragmenting, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.FRAGMENTING,
				 fragmenting,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveLaunchSpeed",
				 FRAGMENTING__POSITIVE_LAUNCH_SPEED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplit(Split split, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(split, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(split, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(split, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_atLeastOneFragment(split, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_positiveLaunchSpeed(split, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBurst(Burst burst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(burst, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_atLeastOneFragment(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validateFragmenting_positiveLaunchSpeed(burst, diagnostics, context);
		if (result || diagnostics != null) result &= validateBurst_enoughFragmentsToBurst(burst, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the enoughFragmentsToBurst constraint of '<em>Burst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BURST__ENOUGH_FRAGMENTS_TO_BURST__EEXPRESSION = "fragments >= 3";

	/**
	 * Validates the enoughFragmentsToBurst constraint of '<em>Burst</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBurst_enoughFragmentsToBurst(Burst burst, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BURST,
				 burst,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "enoughFragmentsToBurst",
				 BURST__ENOUGH_FRAGMENTS_TO_BURST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerEffect(PlayerEffect playerEffect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(playerEffect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDamage(Damage damage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(damage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(damage, diagnostics, context);
		if (result || diagnostics != null) result &= validateDamage_positiveAmount(damage, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveAmount constraint of '<em>Damage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DAMAGE__POSITIVE_AMOUNT__EEXPRESSION = "amount > 0";

	/**
	 * Validates the positiveAmount constraint of '<em>Damage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDamage_positiveAmount(Damage damage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.DAMAGE,
				 damage,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveAmount",
				 DAMAGE__POSITIVE_AMOUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeal(Heal heal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(heal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(heal, diagnostics, context);
		if (result || diagnostics != null) result &= validateHeal_positiveAmount(heal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveAmount constraint of '<em>Heal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HEAL__POSITIVE_AMOUNT__EEXPRESSION = "amount > 0";

	/**
	 * Validates the positiveAmount constraint of '<em>Heal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeal_positiveAmount(Heal heal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.HEAL,
				 heal,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveAmount",
				 HEAL__POSITIVE_AMOUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedEffect(TimedEffect timedEffect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timedEffect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timedEffect, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEffect_positiveDuration(timedEffect, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveDuration constraint of '<em>Timed Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIMED_EFFECT__POSITIVE_DURATION__EEXPRESSION = "duration > 0";

	/**
	 * Validates the positiveDuration constraint of '<em>Timed Effect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimedEffect_positiveDuration(TimedEffect timedEffect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.TIMED_EFFECT,
				 timedEffect,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveDuration",
				 TIMED_EFFECT__POSITIVE_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShield(Shield shield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(shield, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(shield, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEffect_positiveDuration(shield, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedChange(SpeedChange speedChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(speedChange, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEffect_positiveDuration(speedChange, diagnostics, context);
		if (result || diagnostics != null) result &= validateSpeedChange_factorChangesSpeed(speedChange, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the factorChangesSpeed constraint of '<em>Speed Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SPEED_CHANGE__FACTOR_CHANGES_SPEED__EEXPRESSION = "factor > 0 and factor <> 1";

	/**
	 * Validates the factorChangesSpeed constraint of '<em>Speed Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpeedChange_factorChangesSpeed(SpeedChange speedChange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.SPEED_CHANGE,
				 speedChange,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "factorChangesSpeed",
				 SPEED_CHANGE__FACTOR_CHANGES_SPEED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoison(Poison poison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(poison, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimedEffect_positiveDuration(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validatePoison_positiveAmount(poison, diagnostics, context);
		if (result || diagnostics != null) result &= validatePoison_intervalWithinDuration(poison, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveAmount constraint of '<em>Poison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POISON__POSITIVE_AMOUNT__EEXPRESSION = "amount > 0";

	/**
	 * Validates the positiveAmount constraint of '<em>Poison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoison_positiveAmount(Poison poison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.POISON,
				 poison,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveAmount",
				 POISON__POSITIVE_AMOUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the intervalWithinDuration constraint of '<em>Poison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POISON__INTERVAL_WITHIN_DURATION__EEXPRESSION = "interval > 0 and interval <= duration";

	/**
	 * Validates the intervalWithinDuration constraint of '<em>Poison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoison_intervalWithinDuration(Poison poison, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.POISON,
				 poison,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "intervalWithinDuration",
				 POISON__INTERVAL_WITHIN_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePowerUp(PowerUp powerUp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(powerUp, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(powerUp, diagnostics, context);
		if (result || diagnostics != null) result &= validatePowerUp_distinctEffectKinds(powerUp, diagnostics, context);
		return result;
	}

	/**
	 * Validates the distinctEffectKinds constraint of '<em>Power Up</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePowerUp_distinctEffectKinds(PowerUp powerUp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.distinctEffectKinds(powerUp, powerUp.getEffects()), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(material, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(material, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(material, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(material, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaterial_bounceInRange(material, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the bounceInRange constraint of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MATERIAL__BOUNCE_IN_RANGE__EEXPRESSION = "bounce > 0 and bounce <= 2";

	/**
	 * Validates the bounceInRange constraint of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterial_bounceInRange(Material material, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.MATERIAL,
				 material,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "bounceInRange",
				 MATERIAL__BOUNCE_IN_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(playerProfile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayerProfile_positiveHealth(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayerProfile_healthWithinMaximum(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayerProfile_positiveSpeed(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayerProfile_positiveTongueTime(playerProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayerProfile_nonNegativeTimes(playerProfile, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveHealth constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLAYER_PROFILE__POSITIVE_HEALTH__EEXPRESSION = "health > 0";

	/**
	 * Validates the positiveHealth constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile_positiveHealth(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.PLAYER_PROFILE,
				 playerProfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveHealth",
				 PLAYER_PROFILE__POSITIVE_HEALTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the healthWithinMaximum constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLAYER_PROFILE__HEALTH_WITHIN_MAXIMUM__EEXPRESSION = "maxHealth = 0 or health <= maxHealth";

	/**
	 * Validates the healthWithinMaximum constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile_healthWithinMaximum(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.PLAYER_PROFILE,
				 playerProfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "healthWithinMaximum",
				 PLAYER_PROFILE__HEALTH_WITHIN_MAXIMUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveSpeed constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLAYER_PROFILE__POSITIVE_SPEED__EEXPRESSION = "speed > 0";

	/**
	 * Validates the positiveSpeed constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile_positiveSpeed(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.PLAYER_PROFILE,
				 playerProfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveSpeed",
				 PLAYER_PROFILE__POSITIVE_SPEED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveTongueTime constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLAYER_PROFILE__POSITIVE_TONGUE_TIME__EEXPRESSION = "tongueTime > 0";

	/**
	 * Validates the positiveTongueTime constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile_positiveTongueTime(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.PLAYER_PROFILE,
				 playerProfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveTongueTime",
				 PLAYER_PROFILE__POSITIVE_TONGUE_TIME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the nonNegativeTimes constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLAYER_PROFILE__NON_NEGATIVE_TIMES__EEXPRESSION = "cooldown >= 0 and graceTime >= 0";

	/**
	 * Validates the nonNegativeTimes constraint of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayerProfile_nonNegativeTimes(PlayerProfile playerProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.PLAYER_PROFILE,
				 playerProfile,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "nonNegativeTimes",
				 PLAYER_PROFILE__NON_NEGATIVE_TIMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMode(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gameMode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_positiveGravity(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_fragmentTypesAvailable(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_noSimultaneousOutcome(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_winnable(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_endsSomehow(gameMode, diagnostics, context);
		if (result || diagnostics != null) result &= validateGameMode_healthDepletedWhenHarmful(gameMode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveGravity constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GAME_MODE__POSITIVE_GRAVITY__EEXPRESSION = "gravity > 0";

	/**
	 * Validates the positiveGravity constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMode_positiveGravity(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.GAME_MODE,
				 gameMode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveGravity",
				 GAME_MODE__POSITIVE_GRAVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the fragmentTypesAvailable constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameMode_fragmentTypesAvailable(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.fragmentTypesAvailable(gameMode), diagnostics);
	}

	/**
	 * Validates the noSimultaneousOutcome constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameMode_noSimultaneousOutcome(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.noSimultaneousOutcome(gameMode), diagnostics);
	}

	/**
	 * Validates the winnable constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameMode_winnable(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.winnable(gameMode), diagnostics);
	}

	/**
	 * Validates the endsSomehow constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameMode_endsSomehow(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.endsSomehow(gameMode), diagnostics);
	}

	/**
	 * Validates the healthDepletedWhenHarmful constraint of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameMode_healthDepletedWhenHarmful(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.healthDepletedWhenHarmful(gameMode), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArena(Arena arena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(arena, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(arena, diagnostics, context);
		if (result || diagnostics != null) result &= validateArena_playerStartInside(arena, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the playerStartInside constraint of '<em>Arena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ARENA__PLAYER_START_INSIDE__EEXPRESSION = "playerStart >= 0 and playerStart <= 100";

	/**
	 * Validates the playerStartInside constraint of '<em>Arena</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArena_playerStartInside(Arena arena, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.ARENA,
				 arena,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "playerStartInside",
				 ARENA__PLAYER_START_INSIDE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstacle(Obstacle obstacle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(obstacle, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(obstacle, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(obstacle, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(block, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(block, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(block, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(block, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(block, diagnostics, context);
		if (result || diagnostics != null) result &= validateBlock_positiveSize(block, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveSize constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BLOCK__POSITIVE_SIZE__EEXPRESSION = "width > 0 and height > 0";

	/**
	 * Validates the positiveSize constraint of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_positiveSize(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BLOCK,
				 block,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveSize",
				 BLOCK__POSITIVE_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrigger(Trigger trigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(trigger, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(trigger, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(trigger, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpPad(JumpPad jumpPad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jumpPad, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(jumpPad, diagnostics, context);
		if (result || diagnostics != null) result &= validateJumpPad_positiveLaunch(jumpPad, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveLaunch constraint of '<em>Jump Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JUMP_PAD__POSITIVE_LAUNCH__EEXPRESSION = "launch > 0";

	/**
	 * Validates the positiveLaunch constraint of '<em>Jump Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJumpPad_positiveLaunch(JumpPad jumpPad, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.JUMP_PAD,
				 jumpPad,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveLaunch",
				 JUMP_PAD__POSITIVE_LAUNCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeleporter(Teleporter teleporter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(teleporter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validateNamedElement_nameUniqueAmongSiblings(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeleporter_notToItself(teleporter, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeleporter_targetInSameArena(teleporter, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the notToItself constraint of '<em>Teleporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TELEPORTER__NOT_TO_ITSELF__EEXPRESSION = "target <> self";

	/**
	 * Validates the notToItself constraint of '<em>Teleporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeleporter_notToItself(Teleporter teleporter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.TELEPORTER,
				 teleporter,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "notToItself",
				 TELEPORTER__NOT_TO_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the targetInSameArena constraint of '<em>Teleporter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTeleporter_targetInSameArena(Teleporter teleporter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.targetInSameArena(teleporter), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpawnStrategy(SpawnStrategy spawnStrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spawnStrategy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFixedLayout(FixedLayout fixedLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fixedLayout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveSchedule(WaveSchedule waveSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(waveSchedule, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaveSchedule_nonNegativeEscalation(waveSchedule, diagnostics, context);
		if (result || diagnostics != null) result &= validateWaveSchedule_escalationNeedsLoop(waveSchedule, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonNegativeEscalation constraint of '<em>Wave Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAVE_SCHEDULE__NON_NEGATIVE_ESCALATION__EEXPRESSION = "escalation >= 0";

	/**
	 * Validates the nonNegativeEscalation constraint of '<em>Wave Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveSchedule_nonNegativeEscalation(WaveSchedule waveSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.WAVE_SCHEDULE,
				 waveSchedule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "nonNegativeEscalation",
				 WAVE_SCHEDULE__NON_NEGATIVE_ESCALATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the escalationNeedsLoop constraint of '<em>Wave Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAVE_SCHEDULE__ESCALATION_NEEDS_LOOP__EEXPRESSION = "escalation > 0 implies loop";

	/**
	 * Validates the escalationNeedsLoop constraint of '<em>Wave Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWaveSchedule_escalationNeedsLoop(WaveSchedule waveSchedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.WAVE_SCHEDULE,
				 waveSchedule,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "escalationNeedsLoop",
				 WAVE_SCHEDULE__ESCALATION_NEEDS_LOOP__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWave(Wave wave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wave, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wave, diagnostics, context);
		if (result || diagnostics != null) result &= validateWave_nonNegativeDelay(wave, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nonNegativeDelay constraint of '<em>Wave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAVE__NON_NEGATIVE_DELAY__EEXPRESSION = "delay >= 0";

	/**
	 * Validates the nonNegativeDelay constraint of '<em>Wave</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWave_nonNegativeDelay(Wave wave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.WAVE,
				 wave,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "nonNegativeDelay",
				 WAVE__NON_NEGATIVE_DELAY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallSpawn(BallSpawn ballSpawn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ballSpawn, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validatePositioned_insideArena(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallSpawn_sizeInRange(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallSpawn_positiveCount(ballSpawn, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallSpawn_typeAvailableInMode(ballSpawn, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sizeInRange constraint of '<em>Ball Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_SPAWN__SIZE_IN_RANGE__EEXPRESSION = "size >= 1 and size <= 3";

	/**
	 * Validates the sizeInRange constraint of '<em>Ball Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallSpawn_sizeInRange(BallSpawn ballSpawn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_SPAWN,
				 ballSpawn,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "sizeInRange",
				 BALL_SPAWN__SIZE_IN_RANGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the positiveCount constraint of '<em>Ball Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALL_SPAWN__POSITIVE_COUNT__EEXPRESSION = "count >= 1";

	/**
	 * Validates the positiveCount constraint of '<em>Ball Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallSpawn_positiveCount(BallSpawn ballSpawn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALL_SPAWN,
				 ballSpawn,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveCount",
				 BALL_SPAWN__POSITIVE_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Validates the typeAvailableInMode constraint of '<em>Ball Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBallSpawn_typeAvailableInMode(BallSpawn ballSpawn, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.typeAvailableInMode(ballSpawn), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropTable(DropTable dropTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dropTable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validateDropTable_chanceIsPercentage(dropTable, diagnostics, context);
		if (result || diagnostics != null) result &= validateDropTable_distinctPowerUps(dropTable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the chanceIsPercentage constraint of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DROP_TABLE__CHANCE_IS_PERCENTAGE__EEXPRESSION = "chance > 0 and chance <= 100";

	/**
	 * Validates the chanceIsPercentage constraint of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropTable_chanceIsPercentage(DropTable dropTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.DROP_TABLE,
				 dropTable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "chanceIsPercentage",
				 DROP_TABLE__CHANCE_IS_PERCENTAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the distinctPowerUps constraint of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DROP_TABLE__DISTINCT_POWER_UPS__EEXPRESSION = "entries->isUnique(powerUp)";

	/**
	 * Validates the distinctPowerUps constraint of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropTable_distinctPowerUps(DropTable dropTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.DROP_TABLE,
				 dropTable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "distinctPowerUps",
				 DROP_TABLE__DISTINCT_POWER_UPS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrop(Drop drop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(drop, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(drop, diagnostics, context);
		if (result || diagnostics != null) result &= validateDrop_positiveWeight(drop, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveWeight constraint of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DROP__POSITIVE_WEIGHT__EEXPRESSION = "weight > 0";

	/**
	 * Validates the positiveWeight constraint of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDrop_positiveWeight(Drop drop, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.DROP,
				 drop,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveWeight",
				 DROP__POSITIVE_WEIGHT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndCondition(EndCondition endCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endCondition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endCondition, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(endCondition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the fitsRole constraint of '<em>End Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEndCondition_fitsRole(EndCondition endCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return report(GamemodeConstraints.fitsRole(endCondition), diagnostics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCleared(Cleared cleared, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cleared, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cleared, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(cleared, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReached(TimeReached timeReached, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(timeReached, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(timeReached, diagnostics, context);
		if (result || diagnostics != null) result &= validateTimeReached_positiveSeconds(timeReached, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveSeconds constraint of '<em>Time Reached</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TIME_REACHED__POSITIVE_SECONDS__EEXPRESSION = "seconds > 0";

	/**
	 * Validates the positiveSeconds constraint of '<em>Time Reached</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeReached_positiveSeconds(TimeReached timeReached, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.TIME_REACHED,
				 timeReached,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveSeconds",
				 TIME_REACHED__POSITIVE_SECONDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreReached(ScoreReached scoreReached, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scoreReached, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(scoreReached, diagnostics, context);
		if (result || diagnostics != null) result &= validateScoreReached_positivePoints(scoreReached, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positivePoints constraint of '<em>Score Reached</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SCORE_REACHED__POSITIVE_POINTS__EEXPRESSION = "points > 0";

	/**
	 * Validates the positivePoints constraint of '<em>Score Reached</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreReached_positivePoints(ScoreReached scoreReached, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.SCORE_REACHED,
				 scoreReached,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positivePoints",
				 SCORE_REACHED__POSITIVE_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallsPopped(BallsPopped ballsPopped, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ballsPopped, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(ballsPopped, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallsPopped_positiveCount(ballsPopped, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveCount constraint of '<em>Balls Popped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALLS_POPPED__POSITIVE_COUNT__EEXPRESSION = "count > 0";

	/**
	 * Validates the positiveCount constraint of '<em>Balls Popped</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallsPopped_positiveCount(BallsPopped ballsPopped, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALLS_POPPED,
				 ballsPopped,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveCount",
				 BALLS_POPPED__POSITIVE_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWavesSurvived(WavesSurvived wavesSurvived, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wavesSurvived, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(wavesSurvived, diagnostics, context);
		if (result || diagnostics != null) result &= validateWavesSurvived_positiveCount(wavesSurvived, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveCount constraint of '<em>Waves Survived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WAVES_SURVIVED__POSITIVE_COUNT__EEXPRESSION = "count > 0";

	/**
	 * Validates the positiveCount constraint of '<em>Waves Survived</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWavesSurvived_positiveCount(WavesSurvived wavesSurvived, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.WAVES_SURVIVED,
				 wavesSurvived,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveCount",
				 WAVES_SURVIVED__POSITIVE_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHealthDepleted(HealthDepleted healthDepleted, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(healthDepleted, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(healthDepleted, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(healthDepleted, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallsAlive(BallsAlive ballsAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ballsAlive, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndCondition_fitsRole(ballsAlive, diagnostics, context);
		if (result || diagnostics != null) result &= validateBallsAlive_positiveCount(ballsAlive, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveCount constraint of '<em>Balls Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BALLS_ALIVE__POSITIVE_COUNT__EEXPRESSION = "count > 0";

	/**
	 * Validates the positiveCount constraint of '<em>Balls Alive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBallsAlive_positiveCount(BallsAlive ballsAlive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(GamemodePackage.Literals.BALLS_ALIVE,
				 ballsAlive,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
				 "positiveCount",
				 BALLS_ALIVE__POSITIVE_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoring(Scoring scoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTarget(Target target, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirection(Direction direction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * Makes diagnostic messages name objects by their name, or by their kind and the named element
	 * they belong to, instead of by their Java identity. Feature and value labels are left to the
	 * label provider already in the context, if any.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (context != null && !(context.get(SubstitutionLabelProvider.class) instanceof GamemodeLabels)) {
			try {
				context.put(SubstitutionLabelProvider.class,
						new GamemodeLabels((SubstitutionLabelProvider) context.get(SubstitutionLabelProvider.class)));
			} catch (UnsupportedOperationException e) {
				// a read-only context keeps its labels
			}
		}
		return super.validate(eClass, eObject, diagnostics, context);
	}

	/**
	 * Turns the violations found by a Java constraint into diagnostics. The data of a diagnostic is the
	 * offending object and, when known, the offending feature, so that editors can mark the right spot.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */

	private boolean report(List<GamemodeConstraints.Violation> violations, DiagnosticChain diagnostics) {
		if (diagnostics != null) {
			for (GamemodeConstraints.Violation violation : violations) {
				Object[] data = violation.feature() == null
					? new Object[] { violation.target() }
					: new Object[] { violation.target(), violation.feature() };
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, violation.code(), violation.message(), data));
			}
		}
		return violations.isEmpty();
	}

} //GamemodeValidator
