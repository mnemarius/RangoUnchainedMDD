/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.Arena;
import no.ntnu.tdt4250.rango.gamemode.EnemySpawn;
import no.ntnu.tdt4250.rango.gamemode.EnemyType;
import no.ntnu.tdt4250.rango.gamemode.EnemiesAlive;
import no.ntnu.tdt4250.rango.gamemode.EnemiesPopped;
import no.ntnu.tdt4250.rango.gamemode.Block;
import no.ntnu.tdt4250.rango.gamemode.Cleared;
import no.ntnu.tdt4250.rango.gamemode.Damage;
import no.ntnu.tdt4250.rango.gamemode.Difficulty;
import no.ntnu.tdt4250.rango.gamemode.DifficultyTier;
import no.ntnu.tdt4250.rango.gamemode.Direction;
import no.ntnu.tdt4250.rango.gamemode.Drop;
import no.ntnu.tdt4250.rango.gamemode.DropTable;
import no.ntnu.tdt4250.rango.gamemode.Edition;
import no.ntnu.tdt4250.rango.gamemode.EndCondition;
import no.ntnu.tdt4250.rango.gamemode.FixedLayout;
import no.ntnu.tdt4250.rango.gamemode.GameMode;
import no.ntnu.tdt4250.rango.gamemode.GamemodeFactory;
import no.ntnu.tdt4250.rango.gamemode.GamemodePackage;
import no.ntnu.tdt4250.rango.gamemode.Heal;
import no.ntnu.tdt4250.rango.gamemode.HealthDepleted;
import no.ntnu.tdt4250.rango.gamemode.JumpPad;
import no.ntnu.tdt4250.rango.gamemode.Level;
import no.ntnu.tdt4250.rango.gamemode.Material;
import no.ntnu.tdt4250.rango.gamemode.Modifier;
import no.ntnu.tdt4250.rango.gamemode.ModifierTarget;
import no.ntnu.tdt4250.rango.gamemode.NamedElement;
import no.ntnu.tdt4250.rango.gamemode.Obstacle;
import no.ntnu.tdt4250.rango.gamemode.PlayerEffect;
import no.ntnu.tdt4250.rango.gamemode.PlayerProfile;
import no.ntnu.tdt4250.rango.gamemode.Poison;
import no.ntnu.tdt4250.rango.gamemode.Positioned;
import no.ntnu.tdt4250.rango.gamemode.PowerUp;
import no.ntnu.tdt4250.rango.gamemode.ScoreReached;
import no.ntnu.tdt4250.rango.gamemode.Shield;
import no.ntnu.tdt4250.rango.gamemode.SpawnStrategy;
import no.ntnu.tdt4250.rango.gamemode.SpeedBonus;
import no.ntnu.tdt4250.rango.gamemode.SpeedChange;
import no.ntnu.tdt4250.rango.gamemode.Split;
import no.ntnu.tdt4250.rango.gamemode.SplitRule;
import no.ntnu.tdt4250.rango.gamemode.Target;
import no.ntnu.tdt4250.rango.gamemode.Teleporter;
import no.ntnu.tdt4250.rango.gamemode.TimeReached;
import no.ntnu.tdt4250.rango.gamemode.TimedEffect;
import no.ntnu.tdt4250.rango.gamemode.Trigger;
import no.ntnu.tdt4250.rango.gamemode.Vanish;
import no.ntnu.tdt4250.rango.gamemode.Wave;
import no.ntnu.tdt4250.rango.gamemode.WaveSchedule;
import no.ntnu.tdt4250.rango.gamemode.WavesSurvived;

import no.ntnu.tdt4250.rango.gamemode.util.GamemodeValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamemodePackageImpl extends EPackageImpl implements GamemodePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vanishEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass damageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerUpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playerProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedBonusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arenaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jumpPadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teleporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spawnStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waveScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemySpawnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeReachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scoreReachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemiesPoppedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wavesSurvivedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthDepletedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enemiesAliveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass difficultyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum targetEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum difficultyTierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modifierTargetEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GamemodePackageImpl() {
		super(eNS_URI, GamemodeFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GamemodePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GamemodePackage init() {
		if (isInited) return (GamemodePackage)EPackage.Registry.INSTANCE.getEPackage(GamemodePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGamemodePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GamemodePackageImpl theGamemodePackage = registeredGamemodePackage instanceof GamemodePackageImpl ? (GamemodePackageImpl)registeredGamemodePackage : new GamemodePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGamemodePackage.createPackageContents();

		// Initialize created meta-data
		theGamemodePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGamemodePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return GamemodeValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGamemodePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GamemodePackage.eNS_URI, theGamemodePackage);
		return theGamemodePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositioned() {
		return positionedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositioned_X() {
		return (EAttribute)positionedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPositioned_Y() {
		return (EAttribute)positionedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEdition() {
		return editionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEdition_Title() {
		return (EAttribute)editionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_EnemyTypes() {
		return (EReference)editionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_PowerUps() {
		return (EReference)editionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Materials() {
		return (EReference)editionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Players() {
		return (EReference)editionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Modes() {
		return (EReference)editionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Drops() {
		return (EReference)editionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEdition_Difficulties() {
		return (EReference)editionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnemyType() {
		return enemyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemyType_Sprite() {
		return (EAttribute)enemyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemyType_Scale() {
		return (EAttribute)enemyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemyType_Bounce() {
		return (EAttribute)enemyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemyType_Speed() {
		return (EAttribute)enemyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemyType_Points() {
		return (EAttribute)enemyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnemyType_SplitRule() {
		return (EReference)enemyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnemyType_ContactEffects() {
		return (EReference)enemyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnemyType_ProducedTypes() {
		return (EReference)enemyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSplitRule() {
		return splitRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVanish() {
		return vanishEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSplit() {
		return splitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSplit_Fragments() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSplit_FragmentType() {
		return (EReference)splitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSplit_LaunchSpeed() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSplit_ResultType() {
		return (EReference)splitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSplit_Spacing() {
		return (EAttribute)splitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerEffect() {
		return playerEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDamage() {
		return damageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDamage_Amount() {
		return (EAttribute)damageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHeal() {
		return healEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHeal_Amount() {
		return (EAttribute)healEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimedEffect() {
		return timedEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimedEffect_Duration() {
		return (EAttribute)timedEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShield() {
		return shieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeedChange() {
		return speedChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeedChange_Factor() {
		return (EAttribute)speedChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoison() {
		return poisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoison_Amount() {
		return (EAttribute)poisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoison_Interval() {
		return (EAttribute)poisonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPowerUp() {
		return powerUpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPowerUp_Sprite() {
		return (EAttribute)powerUpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPowerUp_Effects() {
		return (EReference)powerUpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Bounce() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaterial_Sprite() {
		return (EAttribute)materialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlayerProfile() {
		return playerProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_Character() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_Health() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_MaxHealth() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_Speed() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_TongueTime() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_Cooldown() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlayerProfile_GraceTime() {
		return (EAttribute)playerProfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGameMode() {
		return gameModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMode_Title() {
		return (EAttribute)gameModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMode_Description() {
		return (EAttribute)gameModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_Player() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_EnemyTypes() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMode_Gravity() {
		return (EAttribute)gameModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_SpeedBonus() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_Levels() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_Drops() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_WinConditions() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_LoseConditions() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_PowerUps() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMode_PopsToClear() {
		return (EAttribute)gameModeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGameMode_MaxScore() {
		return (EAttribute)gameModeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGameMode_EffectiveDrops() {
		return (EReference)gameModeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevel() {
		return levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_Title() {
		return (EAttribute)levelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevel_Arena() {
		return (EReference)levelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevel_Spawning() {
		return (EReference)levelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_Number() {
		return (EAttribute)levelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_PopsToClear() {
		return (EAttribute)levelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevel_MaxScore() {
		return (EAttribute)levelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpeedBonus() {
		return speedBonusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeedBonus_MaxFactor() {
		return (EAttribute)speedBonusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpeedBonus_Duration() {
		return (EAttribute)speedBonusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArena() {
		return arenaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArena_Background() {
		return (EAttribute)arenaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArena_Floor() {
		return (EReference)arenaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArena_Walls() {
		return (EReference)arenaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArena_PlayerStart() {
		return (EAttribute)arenaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArena_Obstacles() {
		return (EReference)arenaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Width() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Height() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Material() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrigger_Affects() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJumpPad() {
		return jumpPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJumpPad_Launch() {
		return (EAttribute)jumpPadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeleporter() {
		return teleporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeleporter_Target() {
		return (EReference)teleporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpawnStrategy() {
		return spawnStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpawnStrategy_PopsToClear() {
		return (EAttribute)spawnStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFixedLayout() {
		return fixedLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFixedLayout_Spawns() {
		return (EReference)fixedLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWaveSchedule() {
		return waveScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaveSchedule_Loop() {
		return (EAttribute)waveScheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWaveSchedule_Escalation() {
		return (EAttribute)waveScheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWaveSchedule_Waves() {
		return (EReference)waveScheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWave() {
		return waveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWave_Delay() {
		return (EAttribute)waveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWave_Spawns() {
		return (EReference)waveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWave_Number() {
		return (EAttribute)waveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWave_PopsToClear() {
		return (EAttribute)waveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnemySpawn() {
		return enemySpawnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnemySpawn_Type() {
		return (EReference)enemySpawnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemySpawn_Size() {
		return (EAttribute)enemySpawnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemySpawn_Count() {
		return (EAttribute)enemySpawnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemySpawn_Direction() {
		return (EAttribute)enemySpawnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemySpawn_PopsToClear() {
		return (EAttribute)enemySpawnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropTable() {
		return dropTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropTable_Chance() {
		return (EAttribute)dropTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDropTable_Entries() {
		return (EReference)dropTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropTable_TotalWeight() {
		return (EAttribute)dropTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDropTable_EnemyType() {
		return (EReference)dropTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDrop() {
		return dropEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDrop_Table() {
		return (EReference)dropEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDrop_PowerUp() {
		return (EReference)dropEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrop_Weight() {
		return (EAttribute)dropEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrop_Probability() {
		return (EAttribute)dropEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDrop_Share() {
		return (EAttribute)dropEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndCondition() {
		return endConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndCondition_Win() {
		return (EAttribute)endConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCleared() {
		return clearedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeReached() {
		return timeReachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeReached_Seconds() {
		return (EAttribute)timeReachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScoreReached() {
		return scoreReachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScoreReached_Points() {
		return (EAttribute)scoreReachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnemiesPopped() {
		return enemiesPoppedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemiesPopped_Count() {
		return (EAttribute)enemiesPoppedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWavesSurvived() {
		return wavesSurvivedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWavesSurvived_Count() {
		return (EAttribute)wavesSurvivedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealthDepleted() {
		return healthDepletedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnemiesAlive() {
		return enemiesAliveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnemiesAlive_Count() {
		return (EAttribute)enemiesAliveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDifficulty() {
		return difficultyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDifficulty_Tier() {
		return (EAttribute)difficultyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDifficulty_Modifiers() {
		return (EReference)difficultyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_Target() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_Factor() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTarget() {
		return targetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDifficultyTier() {
		return difficultyTierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModifierTarget() {
		return modifierTargetEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamemodeFactory getGamemodeFactory() {
		return (GamemodeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		positionedEClass = createEClass(POSITIONED);
		createEAttribute(positionedEClass, POSITIONED__X);
		createEAttribute(positionedEClass, POSITIONED__Y);

		editionEClass = createEClass(EDITION);
		createEAttribute(editionEClass, EDITION__TITLE);
		createEReference(editionEClass, EDITION__ENEMY_TYPES);
		createEReference(editionEClass, EDITION__POWER_UPS);
		createEReference(editionEClass, EDITION__MATERIALS);
		createEReference(editionEClass, EDITION__PLAYERS);
		createEReference(editionEClass, EDITION__MODES);
		createEReference(editionEClass, EDITION__DROPS);
		createEReference(editionEClass, EDITION__DIFFICULTIES);

		enemyTypeEClass = createEClass(ENEMY_TYPE);
		createEAttribute(enemyTypeEClass, ENEMY_TYPE__SPRITE);
		createEAttribute(enemyTypeEClass, ENEMY_TYPE__SCALE);
		createEAttribute(enemyTypeEClass, ENEMY_TYPE__BOUNCE);
		createEAttribute(enemyTypeEClass, ENEMY_TYPE__SPEED);
		createEAttribute(enemyTypeEClass, ENEMY_TYPE__POINTS);
		createEReference(enemyTypeEClass, ENEMY_TYPE__SPLIT_RULE);
		createEReference(enemyTypeEClass, ENEMY_TYPE__CONTACT_EFFECTS);
		createEReference(enemyTypeEClass, ENEMY_TYPE__PRODUCED_TYPES);

		splitRuleEClass = createEClass(SPLIT_RULE);

		vanishEClass = createEClass(VANISH);

		splitEClass = createEClass(SPLIT);
		createEAttribute(splitEClass, SPLIT__FRAGMENTS);
		createEReference(splitEClass, SPLIT__FRAGMENT_TYPE);
		createEAttribute(splitEClass, SPLIT__LAUNCH_SPEED);
		createEReference(splitEClass, SPLIT__RESULT_TYPE);
		createEAttribute(splitEClass, SPLIT__SPACING);

		playerEffectEClass = createEClass(PLAYER_EFFECT);

		damageEClass = createEClass(DAMAGE);
		createEAttribute(damageEClass, DAMAGE__AMOUNT);

		healEClass = createEClass(HEAL);
		createEAttribute(healEClass, HEAL__AMOUNT);

		timedEffectEClass = createEClass(TIMED_EFFECT);
		createEAttribute(timedEffectEClass, TIMED_EFFECT__DURATION);

		shieldEClass = createEClass(SHIELD);

		speedChangeEClass = createEClass(SPEED_CHANGE);
		createEAttribute(speedChangeEClass, SPEED_CHANGE__FACTOR);

		poisonEClass = createEClass(POISON);
		createEAttribute(poisonEClass, POISON__AMOUNT);
		createEAttribute(poisonEClass, POISON__INTERVAL);

		powerUpEClass = createEClass(POWER_UP);
		createEAttribute(powerUpEClass, POWER_UP__SPRITE);
		createEReference(powerUpEClass, POWER_UP__EFFECTS);

		materialEClass = createEClass(MATERIAL);
		createEAttribute(materialEClass, MATERIAL__BOUNCE);
		createEAttribute(materialEClass, MATERIAL__SPRITE);

		playerProfileEClass = createEClass(PLAYER_PROFILE);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__CHARACTER);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__HEALTH);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__MAX_HEALTH);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__SPEED);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__TONGUE_TIME);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__COOLDOWN);
		createEAttribute(playerProfileEClass, PLAYER_PROFILE__GRACE_TIME);

		gameModeEClass = createEClass(GAME_MODE);
		createEAttribute(gameModeEClass, GAME_MODE__TITLE);
		createEAttribute(gameModeEClass, GAME_MODE__DESCRIPTION);
		createEReference(gameModeEClass, GAME_MODE__PLAYER);
		createEReference(gameModeEClass, GAME_MODE__ENEMY_TYPES);
		createEAttribute(gameModeEClass, GAME_MODE__GRAVITY);
		createEReference(gameModeEClass, GAME_MODE__SPEED_BONUS);
		createEReference(gameModeEClass, GAME_MODE__LEVELS);
		createEReference(gameModeEClass, GAME_MODE__DROPS);
		createEReference(gameModeEClass, GAME_MODE__WIN_CONDITIONS);
		createEReference(gameModeEClass, GAME_MODE__LOSE_CONDITIONS);
		createEReference(gameModeEClass, GAME_MODE__POWER_UPS);
		createEAttribute(gameModeEClass, GAME_MODE__POPS_TO_CLEAR);
		createEAttribute(gameModeEClass, GAME_MODE__MAX_SCORE);
		createEReference(gameModeEClass, GAME_MODE__EFFECTIVE_DROPS);

		levelEClass = createEClass(LEVEL);
		createEAttribute(levelEClass, LEVEL__TITLE);
		createEReference(levelEClass, LEVEL__ARENA);
		createEReference(levelEClass, LEVEL__SPAWNING);
		createEAttribute(levelEClass, LEVEL__NUMBER);
		createEAttribute(levelEClass, LEVEL__POPS_TO_CLEAR);
		createEAttribute(levelEClass, LEVEL__MAX_SCORE);

		speedBonusEClass = createEClass(SPEED_BONUS);
		createEAttribute(speedBonusEClass, SPEED_BONUS__MAX_FACTOR);
		createEAttribute(speedBonusEClass, SPEED_BONUS__DURATION);

		arenaEClass = createEClass(ARENA);
		createEAttribute(arenaEClass, ARENA__BACKGROUND);
		createEReference(arenaEClass, ARENA__FLOOR);
		createEReference(arenaEClass, ARENA__WALLS);
		createEAttribute(arenaEClass, ARENA__PLAYER_START);
		createEReference(arenaEClass, ARENA__OBSTACLES);

		obstacleEClass = createEClass(OBSTACLE);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__WIDTH);
		createEAttribute(blockEClass, BLOCK__HEIGHT);
		createEReference(blockEClass, BLOCK__MATERIAL);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__AFFECTS);

		jumpPadEClass = createEClass(JUMP_PAD);
		createEAttribute(jumpPadEClass, JUMP_PAD__LAUNCH);

		teleporterEClass = createEClass(TELEPORTER);
		createEReference(teleporterEClass, TELEPORTER__TARGET);

		spawnStrategyEClass = createEClass(SPAWN_STRATEGY);
		createEAttribute(spawnStrategyEClass, SPAWN_STRATEGY__POPS_TO_CLEAR);

		fixedLayoutEClass = createEClass(FIXED_LAYOUT);
		createEReference(fixedLayoutEClass, FIXED_LAYOUT__SPAWNS);

		waveScheduleEClass = createEClass(WAVE_SCHEDULE);
		createEAttribute(waveScheduleEClass, WAVE_SCHEDULE__LOOP);
		createEAttribute(waveScheduleEClass, WAVE_SCHEDULE__ESCALATION);
		createEReference(waveScheduleEClass, WAVE_SCHEDULE__WAVES);

		waveEClass = createEClass(WAVE);
		createEAttribute(waveEClass, WAVE__DELAY);
		createEReference(waveEClass, WAVE__SPAWNS);
		createEAttribute(waveEClass, WAVE__NUMBER);
		createEAttribute(waveEClass, WAVE__POPS_TO_CLEAR);

		enemySpawnEClass = createEClass(ENEMY_SPAWN);
		createEReference(enemySpawnEClass, ENEMY_SPAWN__TYPE);
		createEAttribute(enemySpawnEClass, ENEMY_SPAWN__SIZE);
		createEAttribute(enemySpawnEClass, ENEMY_SPAWN__COUNT);
		createEAttribute(enemySpawnEClass, ENEMY_SPAWN__DIRECTION);
		createEAttribute(enemySpawnEClass, ENEMY_SPAWN__POPS_TO_CLEAR);

		dropTableEClass = createEClass(DROP_TABLE);
		createEAttribute(dropTableEClass, DROP_TABLE__CHANCE);
		createEReference(dropTableEClass, DROP_TABLE__ENTRIES);
		createEAttribute(dropTableEClass, DROP_TABLE__TOTAL_WEIGHT);
		createEReference(dropTableEClass, DROP_TABLE__ENEMY_TYPE);

		dropEClass = createEClass(DROP);
		createEReference(dropEClass, DROP__TABLE);
		createEReference(dropEClass, DROP__POWER_UP);
		createEAttribute(dropEClass, DROP__WEIGHT);
		createEAttribute(dropEClass, DROP__PROBABILITY);
		createEAttribute(dropEClass, DROP__SHARE);

		endConditionEClass = createEClass(END_CONDITION);
		createEAttribute(endConditionEClass, END_CONDITION__WIN);

		clearedEClass = createEClass(CLEARED);

		timeReachedEClass = createEClass(TIME_REACHED);
		createEAttribute(timeReachedEClass, TIME_REACHED__SECONDS);

		scoreReachedEClass = createEClass(SCORE_REACHED);
		createEAttribute(scoreReachedEClass, SCORE_REACHED__POINTS);

		enemiesPoppedEClass = createEClass(ENEMIES_POPPED);
		createEAttribute(enemiesPoppedEClass, ENEMIES_POPPED__COUNT);

		wavesSurvivedEClass = createEClass(WAVES_SURVIVED);
		createEAttribute(wavesSurvivedEClass, WAVES_SURVIVED__COUNT);

		healthDepletedEClass = createEClass(HEALTH_DEPLETED);

		enemiesAliveEClass = createEClass(ENEMIES_ALIVE);
		createEAttribute(enemiesAliveEClass, ENEMIES_ALIVE__COUNT);

		difficultyEClass = createEClass(DIFFICULTY);
		createEAttribute(difficultyEClass, DIFFICULTY__TIER);
		createEReference(difficultyEClass, DIFFICULTY__MODIFIERS);

		modifierEClass = createEClass(MODIFIER);
		createEAttribute(modifierEClass, MODIFIER__TARGET);
		createEAttribute(modifierEClass, MODIFIER__FACTOR);

		// Create enums
		targetEEnum = createEEnum(TARGET);
		directionEEnum = createEEnum(DIRECTION);
		difficultyTierEEnum = createEEnum(DIFFICULTY_TIER);
		modifierTargetEEnum = createEEnum(MODIFIER_TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		editionEClass.getESuperTypes().add(this.getNamedElement());
		enemyTypeEClass.getESuperTypes().add(this.getNamedElement());
		vanishEClass.getESuperTypes().add(this.getSplitRule());
		splitEClass.getESuperTypes().add(this.getSplitRule());
		damageEClass.getESuperTypes().add(this.getPlayerEffect());
		healEClass.getESuperTypes().add(this.getPlayerEffect());
		timedEffectEClass.getESuperTypes().add(this.getPlayerEffect());
		shieldEClass.getESuperTypes().add(this.getTimedEffect());
		speedChangeEClass.getESuperTypes().add(this.getTimedEffect());
		poisonEClass.getESuperTypes().add(this.getTimedEffect());
		powerUpEClass.getESuperTypes().add(this.getNamedElement());
		materialEClass.getESuperTypes().add(this.getNamedElement());
		playerProfileEClass.getESuperTypes().add(this.getNamedElement());
		gameModeEClass.getESuperTypes().add(this.getNamedElement());
		obstacleEClass.getESuperTypes().add(this.getNamedElement());
		obstacleEClass.getESuperTypes().add(this.getPositioned());
		blockEClass.getESuperTypes().add(this.getObstacle());
		triggerEClass.getESuperTypes().add(this.getObstacle());
		jumpPadEClass.getESuperTypes().add(this.getTrigger());
		teleporterEClass.getESuperTypes().add(this.getTrigger());
		fixedLayoutEClass.getESuperTypes().add(this.getSpawnStrategy());
		waveScheduleEClass.getESuperTypes().add(this.getSpawnStrategy());
		enemySpawnEClass.getESuperTypes().add(this.getPositioned());
		clearedEClass.getESuperTypes().add(this.getEndCondition());
		timeReachedEClass.getESuperTypes().add(this.getEndCondition());
		scoreReachedEClass.getESuperTypes().add(this.getEndCondition());
		enemiesPoppedEClass.getESuperTypes().add(this.getEndCondition());
		wavesSurvivedEClass.getESuperTypes().add(this.getEndCondition());
		healthDepletedEClass.getESuperTypes().add(this.getEndCondition());
		enemiesAliveEClass.getESuperTypes().add(this.getEndCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionedEClass, Positioned.class, "Positioned", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositioned_X(), ecorePackage.getEFloat(), "x", null, 1, 1, Positioned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPositioned_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, Positioned.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editionEClass, Edition.class, "Edition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdition_Title(), ecorePackage.getEString(), "title", null, 0, 1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_EnemyTypes(), this.getEnemyType(), null, "enemyTypes", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_PowerUps(), this.getPowerUp(), null, "powerUps", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_Materials(), this.getMaterial(), null, "materials", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_Players(), this.getPlayerProfile(), null, "players", null, 1, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_Modes(), this.getGameMode(), null, "modes", null, 1, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_Drops(), this.getDropTable(), null, "drops", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdition_Difficulties(), this.getDifficulty(), null, "difficulties", null, 0, -1, Edition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enemyTypeEClass, EnemyType.class, "EnemyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnemyType_Sprite(), ecorePackage.getEString(), "sprite", null, 1, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemyType_Scale(), ecorePackage.getEFloat(), "scale", "1.0", 0, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemyType_Bounce(), ecorePackage.getEFloat(), "bounce", "1.0", 0, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemyType_Speed(), ecorePackage.getEFloat(), "speed", "5.0", 0, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemyType_Points(), ecorePackage.getEInt(), "points", "10", 0, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnemyType_SplitRule(), this.getSplitRule(), null, "splitRule", null, 1, 1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnemyType_ContactEffects(), this.getPlayerEffect(), null, "contactEffects", null, 1, -1, EnemyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnemyType_ProducedTypes(), this.getEnemyType(), null, "producedTypes", null, 0, -1, EnemyType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(splitRuleEClass, SplitRule.class, "SplitRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vanishEClass, Vanish.class, "Vanish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitEClass, Split.class, "Split", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplit_Fragments(), ecorePackage.getEInt(), "fragments", null, 1, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplit_FragmentType(), this.getEnemyType(), null, "fragmentType", null, 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplit_LaunchSpeed(), ecorePackage.getEFloat(), "launchSpeed", "5.0", 0, 1, Split.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplit_ResultType(), this.getEnemyType(), null, "resultType", null, 1, 1, Split.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplit_Spacing(), ecorePackage.getEFloat(), "spacing", null, 1, 1, Split.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(playerEffectEClass, PlayerEffect.class, "PlayerEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(damageEClass, Damage.class, "Damage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDamage_Amount(), ecorePackage.getEInt(), "amount", null, 1, 1, Damage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healEClass, Heal.class, "Heal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeal_Amount(), ecorePackage.getEInt(), "amount", null, 1, 1, Heal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedEffectEClass, TimedEffect.class, "TimedEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedEffect_Duration(), ecorePackage.getEFloat(), "duration", null, 1, 1, TimedEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shieldEClass, Shield.class, "Shield", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(speedChangeEClass, SpeedChange.class, "SpeedChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeedChange_Factor(), ecorePackage.getEFloat(), "factor", null, 1, 1, SpeedChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poisonEClass, Poison.class, "Poison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoison_Amount(), ecorePackage.getEInt(), "amount", null, 1, 1, Poison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoison_Interval(), ecorePackage.getEFloat(), "interval", null, 1, 1, Poison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerUpEClass, PowerUp.class, "PowerUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerUp_Sprite(), ecorePackage.getEString(), "sprite", null, 1, 1, PowerUp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerUp_Effects(), this.getPlayerEffect(), null, "effects", null, 1, -1, PowerUp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMaterial_Bounce(), ecorePackage.getEFloat(), "bounce", "1.0", 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMaterial_Sprite(), ecorePackage.getEString(), "sprite", null, 0, 1, Material.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playerProfileEClass, PlayerProfile.class, "PlayerProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayerProfile_Character(), ecorePackage.getEString(), "character", "Rango", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_Health(), ecorePackage.getEInt(), "health", null, 1, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_MaxHealth(), ecorePackage.getEInt(), "maxHealth", "0", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_Speed(), ecorePackage.getEFloat(), "speed", "5.0", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_TongueTime(), ecorePackage.getEFloat(), "tongueTime", "0.8", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_Cooldown(), ecorePackage.getEFloat(), "cooldown", "1.0", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayerProfile_GraceTime(), ecorePackage.getEFloat(), "graceTime", "0.0", 0, 1, PlayerProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameModeEClass, GameMode.class, "GameMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGameMode_Title(), ecorePackage.getEString(), "title", null, 1, 1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMode_Description(), ecorePackage.getEString(), "description", null, 0, 1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_Player(), this.getPlayerProfile(), null, "player", null, 1, 1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_EnemyTypes(), this.getEnemyType(), null, "enemyTypes", null, 0, -1, GameMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMode_Gravity(), ecorePackage.getEFloat(), "gravity", "10.0", 0, 1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_SpeedBonus(), this.getSpeedBonus(), null, "speedBonus", null, 0, 1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_Levels(), this.getLevel(), null, "levels", null, 1, -1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_Drops(), this.getDropTable(), null, "drops", null, 0, -1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_WinConditions(), this.getEndCondition(), null, "winConditions", null, 0, -1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_LoseConditions(), this.getEndCondition(), null, "loseConditions", null, 1, -1, GameMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_PowerUps(), this.getPowerUp(), null, "powerUps", null, 0, -1, GameMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMode_PopsToClear(), ecorePackage.getEInt(), "popsToClear", null, 0, 1, GameMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getGameMode_MaxScore(), ecorePackage.getEInt(), "maxScore", null, 0, 1, GameMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGameMode_EffectiveDrops(), this.getDropTable(), null, "effectiveDrops", null, 0, -1, GameMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(levelEClass, Level.class, "Level", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLevel_Title(), ecorePackage.getEString(), "title", null, 0, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Arena(), this.getArena(), null, "arena", null, 1, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLevel_Spawning(), this.getSpawnStrategy(), null, "spawning", null, 1, 1, Level.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevel_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Level.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevel_PopsToClear(), ecorePackage.getEInt(), "popsToClear", null, 0, 1, Level.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLevel_MaxScore(), ecorePackage.getEInt(), "maxScore", null, 0, 1, Level.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(speedBonusEClass, SpeedBonus.class, "SpeedBonus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeedBonus_MaxFactor(), ecorePackage.getEFloat(), "maxFactor", "2.0", 0, 1, SpeedBonus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeedBonus_Duration(), ecorePackage.getEFloat(), "duration", "60.0", 0, 1, SpeedBonus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arenaEClass, Arena.class, "Arena", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArena_Background(), ecorePackage.getEString(), "background", null, 1, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArena_Floor(), this.getMaterial(), null, "floor", null, 0, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArena_Walls(), this.getMaterial(), null, "walls", null, 0, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArena_PlayerStart(), ecorePackage.getEFloat(), "playerStart", "10.0", 0, 1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArena_Obstacles(), this.getObstacle(), null, "obstacles", null, 0, -1, Arena.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Width(), ecorePackage.getEInt(), "width", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Material(), this.getMaterial(), null, "material", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Affects(), this.getTarget(), "affects", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jumpPadEClass, JumpPad.class, "JumpPad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJumpPad_Launch(), ecorePackage.getEFloat(), "launch", null, 1, 1, JumpPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teleporterEClass, Teleporter.class, "Teleporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeleporter_Target(), this.getTeleporter(), null, "target", null, 1, 1, Teleporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spawnStrategyEClass, SpawnStrategy.class, "SpawnStrategy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpawnStrategy_PopsToClear(), ecorePackage.getEInt(), "popsToClear", null, 0, 1, SpawnStrategy.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fixedLayoutEClass, FixedLayout.class, "FixedLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixedLayout_Spawns(), this.getEnemySpawn(), null, "spawns", null, 1, -1, FixedLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waveScheduleEClass, WaveSchedule.class, "WaveSchedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWaveSchedule_Loop(), ecorePackage.getEBoolean(), "loop", null, 0, 1, WaveSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWaveSchedule_Escalation(), ecorePackage.getEInt(), "escalation", null, 0, 1, WaveSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaveSchedule_Waves(), this.getWave(), null, "waves", null, 1, -1, WaveSchedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waveEClass, Wave.class, "Wave", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWave_Delay(), ecorePackage.getEFloat(), "delay", "0.0", 0, 1, Wave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWave_Spawns(), this.getEnemySpawn(), null, "spawns", null, 1, -1, Wave.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWave_Number(), ecorePackage.getEInt(), "number", null, 0, 1, Wave.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getWave_PopsToClear(), ecorePackage.getEInt(), "popsToClear", null, 0, 1, Wave.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(enemySpawnEClass, EnemySpawn.class, "EnemySpawn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnemySpawn_Type(), this.getEnemyType(), null, "type", null, 1, 1, EnemySpawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemySpawn_Size(), ecorePackage.getEInt(), "size", "3", 0, 1, EnemySpawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemySpawn_Count(), ecorePackage.getEInt(), "count", "1", 0, 1, EnemySpawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemySpawn_Direction(), this.getDirection(), "direction", "right", 0, 1, EnemySpawn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnemySpawn_PopsToClear(), ecorePackage.getEInt(), "popsToClear", null, 0, 1, EnemySpawn.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dropTableEClass, DropTable.class, "DropTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropTable_Chance(), ecorePackage.getEFloat(), "chance", null, 1, 1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDropTable_Entries(), this.getDrop(), this.getDrop_Table(), "entries", null, 1, -1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropTable_TotalWeight(), ecorePackage.getEInt(), "totalWeight", null, 0, 1, DropTable.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDropTable_EnemyType(), this.getEnemyType(), null, "enemyType", null, 1, 1, DropTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropEClass, Drop.class, "Drop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDrop_Table(), this.getDropTable(), this.getDropTable_Entries(), "table", null, 1, 1, Drop.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDrop_PowerUp(), this.getPowerUp(), null, "powerUp", null, 1, 1, Drop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrop_Weight(), ecorePackage.getEInt(), "weight", "1", 0, 1, Drop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrop_Probability(), ecorePackage.getEFloat(), "probability", null, 0, 1, Drop.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrop_Share(), ecorePackage.getEFloat(), "share", null, 0, 1, Drop.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endConditionEClass, EndCondition.class, "EndCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndCondition_Win(), ecorePackage.getEBoolean(), "win", null, 0, 1, EndCondition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(clearedEClass, Cleared.class, "Cleared", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeReachedEClass, TimeReached.class, "TimeReached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeReached_Seconds(), ecorePackage.getEFloat(), "seconds", null, 1, 1, TimeReached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scoreReachedEClass, ScoreReached.class, "ScoreReached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScoreReached_Points(), ecorePackage.getEInt(), "points", null, 1, 1, ScoreReached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enemiesPoppedEClass, EnemiesPopped.class, "EnemiesPopped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnemiesPopped_Count(), ecorePackage.getEInt(), "count", null, 1, 1, EnemiesPopped.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wavesSurvivedEClass, WavesSurvived.class, "WavesSurvived", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWavesSurvived_Count(), ecorePackage.getEInt(), "count", null, 1, 1, WavesSurvived.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthDepletedEClass, HealthDepleted.class, "HealthDepleted", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enemiesAliveEClass, EnemiesAlive.class, "EnemiesAlive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnemiesAlive_Count(), ecorePackage.getEInt(), "count", null, 1, 1, EnemiesAlive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(difficultyEClass, Difficulty.class, "Difficulty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDifficulty_Tier(), this.getDifficultyTier(), "tier", null, 1, 1, Difficulty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDifficulty_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, Difficulty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifier_Target(), this.getModifierTarget(), "target", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Factor(), ecorePackage.getEFloat(), "factor", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(targetEEnum, Target.class, "Target");
		addEEnumLiteral(targetEEnum, Target.ALL);
		addEEnumLiteral(targetEEnum, Target.ENEMIES);
		addEEnumLiteral(targetEEnum, Target.PLAYER);

		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.LEFT);
		addEEnumLiteral(directionEEnum, Direction.RIGHT);

		initEEnum(difficultyTierEEnum, DifficultyTier.class, "DifficultyTier");
		addEEnumLiteral(difficultyTierEEnum, DifficultyTier.EASY);
		addEEnumLiteral(difficultyTierEEnum, DifficultyTier.MEDIUM);
		addEEnumLiteral(difficultyTierEEnum, DifficultyTier.HARD);

		initEEnum(modifierTargetEEnum, ModifierTarget.class, "ModifierTarget");
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.ENEMY_SPEED);
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.ENEMY_POINTS);
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.PLAYER_HEALTH);
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.PLAYER_SPEED);
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.DROP_CHANCE);
		addEEnumLiteral(modifierTargetEEnum, ModifierTarget.WAVE_DELAY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/LPG
		createLPGAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG"
		   });
		addAnnotation
		  (namedElementEClass,
		   source,
		   new String[] {
			   "constraints", "nameUniqueAmongSiblings"
		   });
		addAnnotation
		  (positionedEClass,
		   source,
		   new String[] {
			   "constraints", "insideArena"
		   });
		addAnnotation
		  (enemyTypeEClass,
		   source,
		   new String[] {
			   "constraints", "positiveScale positiveBounce positiveSpeed nonNegativePoints distinctEffectKinds"
		   });
		addAnnotation
		  (splitEClass,
		   source,
		   new String[] {
			   "constraints", "atLeastOneFragment atMostSixteenFragments positiveLaunchSpeed"
		   });
		addAnnotation
		  (damageEClass,
		   source,
		   new String[] {
			   "constraints", "positiveAmount"
		   });
		addAnnotation
		  (healEClass,
		   source,
		   new String[] {
			   "constraints", "positiveAmount"
		   });
		addAnnotation
		  (timedEffectEClass,
		   source,
		   new String[] {
			   "constraints", "positiveDuration"
		   });
		addAnnotation
		  (speedChangeEClass,
		   source,
		   new String[] {
			   "constraints", "factorChangesSpeed"
		   });
		addAnnotation
		  (poisonEClass,
		   source,
		   new String[] {
			   "constraints", "positiveAmount intervalWithinDuration"
		   });
		addAnnotation
		  (powerUpEClass,
		   source,
		   new String[] {
			   "constraints", "distinctEffectKinds"
		   });
		addAnnotation
		  (materialEClass,
		   source,
		   new String[] {
			   "constraints", "bounceInRange"
		   });
		addAnnotation
		  (playerProfileEClass,
		   source,
		   new String[] {
			   "constraints", "positiveHealth healthWithinMaximum positiveSpeed positiveTongueTime nonNegativeTimes"
		   });
		addAnnotation
		  (gameModeEClass,
		   source,
		   new String[] {
			   "constraints", "positiveGravity noSimultaneousOutcome winnable endsSomehow healthDepletedWhenHarmful everyEnemyDrops"
		   });
		addAnnotation
		  (speedBonusEClass,
		   source,
		   new String[] {
			   "constraints", "bonusAboveOne positiveDuration"
		   });
		addAnnotation
		  (arenaEClass,
		   source,
		   new String[] {
			   "constraints", "playerStartInside"
		   });
		addAnnotation
		  (blockEClass,
		   source,
		   new String[] {
			   "constraints", "positiveSize"
		   });
		addAnnotation
		  (jumpPadEClass,
		   source,
		   new String[] {
			   "constraints", "positiveLaunch"
		   });
		addAnnotation
		  (teleporterEClass,
		   source,
		   new String[] {
			   "constraints", "notToItself targetInSameArena"
		   });
		addAnnotation
		  (waveScheduleEClass,
		   source,
		   new String[] {
			   "constraints", "nonNegativeEscalation escalationNeedsLoop"
		   });
		addAnnotation
		  (waveEClass,
		   source,
		   new String[] {
			   "constraints", "nonNegativeDelay"
		   });
		addAnnotation
		  (enemySpawnEClass,
		   source,
		   new String[] {
			   "constraints", "sizeInRange positiveCount"
		   });
		addAnnotation
		  (dropTableEClass,
		   source,
		   new String[] {
			   "constraints", "chanceIsPercentage distinctPowerUps oneTablePerEnemy"
		   });
		addAnnotation
		  (dropEClass,
		   source,
		   new String[] {
			   "constraints", "positiveWeight"
		   });
		addAnnotation
		  (endConditionEClass,
		   source,
		   new String[] {
			   "constraints", "fitsRole"
		   });
		addAnnotation
		  (timeReachedEClass,
		   source,
		   new String[] {
			   "constraints", "positiveSeconds"
		   });
		addAnnotation
		  (scoreReachedEClass,
		   source,
		   new String[] {
			   "constraints", "positivePoints"
		   });
		addAnnotation
		  (enemiesPoppedEClass,
		   source,
		   new String[] {
			   "constraints", "positiveCount"
		   });
		addAnnotation
		  (wavesSurvivedEClass,
		   source,
		   new String[] {
			   "constraints", "positiveCount"
		   });
		addAnnotation
		  (enemiesAliveEClass,
		   source,
		   new String[] {
			   "constraints", "positiveCount"
		   });
		addAnnotation
		  (difficultyEClass,
		   source,
		   new String[] {
			   "constraints", "distinctTargets onePerTier"
		   });
		addAnnotation
		  (modifierEClass,
		   source,
		   new String[] {
			   "constraints", "positiveFactor"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/LPG</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createLPGAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/LPG";
		addAnnotation
		  (positionedEClass,
		   source,
		   new String[] {
			   "insideArena", "x >= 0 and x <= 100 and y >= 0 and y <= 100"
		   });
		addAnnotation
		  (enemyTypeEClass,
		   source,
		   new String[] {
			   "positiveScale", "scale > 0",
			   "positiveBounce", "bounce > 0",
			   "positiveSpeed", "speed > 0",
			   "nonNegativePoints", "points >= 0"
		   });
		addAnnotation
		  (splitEClass,
		   source,
		   new String[] {
			   "atLeastOneFragment", "fragments >= 1",
			   "atMostSixteenFragments", "fragments <= 16",
			   "positiveLaunchSpeed", "launchSpeed > 0"
		   });
		addAnnotation
		  (damageEClass,
		   source,
		   new String[] {
			   "positiveAmount", "amount > 0"
		   });
		addAnnotation
		  (healEClass,
		   source,
		   new String[] {
			   "positiveAmount", "amount > 0"
		   });
		addAnnotation
		  (timedEffectEClass,
		   source,
		   new String[] {
			   "positiveDuration", "duration > 0"
		   });
		addAnnotation
		  (speedChangeEClass,
		   source,
		   new String[] {
			   "factorChangesSpeed", "factor > 0 and factor <> 1"
		   });
		addAnnotation
		  (poisonEClass,
		   source,
		   new String[] {
			   "positiveAmount", "amount > 0",
			   "intervalWithinDuration", "interval > 0 and interval <= duration"
		   });
		addAnnotation
		  (materialEClass,
		   source,
		   new String[] {
			   "bounceInRange", "bounce > 0 and bounce <= 2"
		   });
		addAnnotation
		  (playerProfileEClass,
		   source,
		   new String[] {
			   "positiveHealth", "health > 0",
			   "healthWithinMaximum", "maxHealth = 0 or health <= maxHealth",
			   "positiveSpeed", "speed > 0",
			   "positiveTongueTime", "tongueTime > 0",
			   "nonNegativeTimes", "cooldown >= 0 and graceTime >= 0"
		   });
		addAnnotation
		  (gameModeEClass,
		   source,
		   new String[] {
			   "positiveGravity", "gravity > 0"
		   });
		addAnnotation
		  (speedBonusEClass,
		   source,
		   new String[] {
			   "bonusAboveOne", "maxFactor > 1",
			   "positiveDuration", "duration > 0"
		   });
		addAnnotation
		  (arenaEClass,
		   source,
		   new String[] {
			   "playerStartInside", "playerStart >= 0 and playerStart <= 100"
		   });
		addAnnotation
		  (blockEClass,
		   source,
		   new String[] {
			   "positiveSize", "width > 0 and height > 0"
		   });
		addAnnotation
		  (jumpPadEClass,
		   source,
		   new String[] {
			   "positiveLaunch", "launch > 0"
		   });
		addAnnotation
		  (teleporterEClass,
		   source,
		   new String[] {
			   "notToItself", "target <> self"
		   });
		addAnnotation
		  (waveScheduleEClass,
		   source,
		   new String[] {
			   "nonNegativeEscalation", "escalation >= 0",
			   "escalationNeedsLoop", "escalation > 0 implies loop"
		   });
		addAnnotation
		  (waveEClass,
		   source,
		   new String[] {
			   "nonNegativeDelay", "delay >= 0"
		   });
		addAnnotation
		  (enemySpawnEClass,
		   source,
		   new String[] {
			   "sizeInRange", "size >= 1 and size <= 3",
			   "positiveCount", "count >= 1"
		   });
		addAnnotation
		  (dropTableEClass,
		   source,
		   new String[] {
			   "chanceIsPercentage", "chance > 0 and chance <= 100",
			   "distinctPowerUps", "entries->isUnique(powerUp)"
		   });
		addAnnotation
		  (dropEClass,
		   source,
		   new String[] {
			   "positiveWeight", "weight > 0"
		   });
		addAnnotation
		  (timeReachedEClass,
		   source,
		   new String[] {
			   "positiveSeconds", "seconds > 0"
		   });
		addAnnotation
		  (scoreReachedEClass,
		   source,
		   new String[] {
			   "positivePoints", "points > 0"
		   });
		addAnnotation
		  (enemiesPoppedEClass,
		   source,
		   new String[] {
			   "positiveCount", "count > 0"
		   });
		addAnnotation
		  (wavesSurvivedEClass,
		   source,
		   new String[] {
			   "positiveCount", "count > 0"
		   });
		addAnnotation
		  (enemiesAliveEClass,
		   source,
		   new String[] {
			   "positiveCount", "count > 0"
		   });
		addAnnotation
		  (difficultyEClass,
		   source,
		   new String[] {
			   "distinctTargets", "modifiers->isUnique(target)"
		   });
		addAnnotation
		  (modifierEClass,
		   source,
		   new String[] {
			   "positiveFactor", "factor > 0"
		   });
	}

} //GamemodePackageImpl
