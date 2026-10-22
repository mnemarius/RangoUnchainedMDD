/**
 */
package no.ntnu.tdt4250.rango.gamemode.impl;

import no.ntnu.tdt4250.rango.gamemode.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GamemodeFactoryImpl extends EFactoryImpl implements GamemodeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GamemodeFactory init() {
		try {
			GamemodeFactory theGamemodeFactory = (GamemodeFactory)EPackage.Registry.INSTANCE.getEFactory(GamemodePackage.eNS_URI);
			if (theGamemodeFactory != null) {
				return theGamemodeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GamemodeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamemodeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GamemodePackage.EDITION: return createEdition();
			case GamemodePackage.ENEMY_TYPE: return createEnemyType();
			case GamemodePackage.VANISH: return createVanish();
			case GamemodePackage.SPLIT: return createSplit();
			case GamemodePackage.DAMAGE: return createDamage();
			case GamemodePackage.HEAL: return createHeal();
			case GamemodePackage.SHIELD: return createShield();
			case GamemodePackage.SPEED_CHANGE: return createSpeedChange();
			case GamemodePackage.POISON: return createPoison();
			case GamemodePackage.POWER_UP: return createPowerUp();
			case GamemodePackage.PLAYER_PROFILE: return createPlayerProfile();
			case GamemodePackage.GAME_MODE: return createGameMode();
			case GamemodePackage.LEVEL: return createLevel();
			case GamemodePackage.SPEED_BONUS: return createSpeedBonus();
			case GamemodePackage.ARENA: return createArena();
			case GamemodePackage.BLOCK: return createBlock();
			case GamemodePackage.JUMP_PAD: return createJumpPad();
			case GamemodePackage.TELEPORTER: return createTeleporter();
			case GamemodePackage.FIXED_LAYOUT: return createFixedLayout();
			case GamemodePackage.WAVE_SCHEDULE: return createWaveSchedule();
			case GamemodePackage.WAVE: return createWave();
			case GamemodePackage.ENEMY_SPAWN: return createEnemySpawn();
			case GamemodePackage.DROP_TABLE: return createDropTable();
			case GamemodePackage.DROP: return createDrop();
			case GamemodePackage.CLEARED: return createCleared();
			case GamemodePackage.TIME_REACHED: return createTimeReached();
			case GamemodePackage.SCORE_REACHED: return createScoreReached();
			case GamemodePackage.ENEMIES_POPPED: return createEnemiesPopped();
			case GamemodePackage.WAVES_SURVIVED: return createWavesSurvived();
			case GamemodePackage.HEALTH_DEPLETED: return createHealthDepleted();
			case GamemodePackage.ENEMIES_ALIVE: return createEnemiesAlive();
			case GamemodePackage.DIFFICULTY: return createDifficulty();
			case GamemodePackage.MODIFIER: return createModifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GamemodePackage.TARGET:
				return createTargetFromString(eDataType, initialValue);
			case GamemodePackage.DIRECTION:
				return createDirectionFromString(eDataType, initialValue);
			case GamemodePackage.DIFFICULTY_TIER:
				return createDifficultyTierFromString(eDataType, initialValue);
			case GamemodePackage.MODIFIER_TARGET:
				return createModifierTargetFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GamemodePackage.TARGET:
				return convertTargetToString(eDataType, instanceValue);
			case GamemodePackage.DIRECTION:
				return convertDirectionToString(eDataType, instanceValue);
			case GamemodePackage.DIFFICULTY_TIER:
				return convertDifficultyTierToString(eDataType, instanceValue);
			case GamemodePackage.MODIFIER_TARGET:
				return convertModifierTargetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Edition createEdition() {
		EditionImpl edition = new EditionImpl();
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemyType createEnemyType() {
		EnemyTypeImpl enemyType = new EnemyTypeImpl();
		return enemyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vanish createVanish() {
		VanishImpl vanish = new VanishImpl();
		return vanish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Split createSplit() {
		SplitImpl split = new SplitImpl();
		return split;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Damage createDamage() {
		DamageImpl damage = new DamageImpl();
		return damage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heal createHeal() {
		HealImpl heal = new HealImpl();
		return heal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shield createShield() {
		ShieldImpl shield = new ShieldImpl();
		return shield;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedChange createSpeedChange() {
		SpeedChangeImpl speedChange = new SpeedChangeImpl();
		return speedChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Poison createPoison() {
		PoisonImpl poison = new PoisonImpl();
		return poison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PowerUp createPowerUp() {
		PowerUpImpl powerUp = new PowerUpImpl();
		return powerUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlayerProfile createPlayerProfile() {
		PlayerProfileImpl playerProfile = new PlayerProfileImpl();
		return playerProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMode createGameMode() {
		GameModeImpl gameMode = new GameModeImpl();
		return gameMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Level createLevel() {
		LevelImpl level = new LevelImpl();
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedBonus createSpeedBonus() {
		SpeedBonusImpl speedBonus = new SpeedBonusImpl();
		return speedBonus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Arena createArena() {
		ArenaImpl arena = new ArenaImpl();
		return arena;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JumpPad createJumpPad() {
		JumpPadImpl jumpPad = new JumpPadImpl();
		return jumpPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teleporter createTeleporter() {
		TeleporterImpl teleporter = new TeleporterImpl();
		return teleporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedLayout createFixedLayout() {
		FixedLayoutImpl fixedLayout = new FixedLayoutImpl();
		return fixedLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaveSchedule createWaveSchedule() {
		WaveScheduleImpl waveSchedule = new WaveScheduleImpl();
		return waveSchedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wave createWave() {
		WaveImpl wave = new WaveImpl();
		return wave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemySpawn createEnemySpawn() {
		EnemySpawnImpl enemySpawn = new EnemySpawnImpl();
		return enemySpawn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DropTable createDropTable() {
		DropTableImpl dropTable = new DropTableImpl();
		return dropTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Drop createDrop() {
		DropImpl drop = new DropImpl();
		return drop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cleared createCleared() {
		ClearedImpl cleared = new ClearedImpl();
		return cleared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeReached createTimeReached() {
		TimeReachedImpl timeReached = new TimeReachedImpl();
		return timeReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScoreReached createScoreReached() {
		ScoreReachedImpl scoreReached = new ScoreReachedImpl();
		return scoreReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemiesPopped createEnemiesPopped() {
		EnemiesPoppedImpl enemiesPopped = new EnemiesPoppedImpl();
		return enemiesPopped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WavesSurvived createWavesSurvived() {
		WavesSurvivedImpl wavesSurvived = new WavesSurvivedImpl();
		return wavesSurvived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HealthDepleted createHealthDepleted() {
		HealthDepletedImpl healthDepleted = new HealthDepletedImpl();
		return healthDepleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnemiesAlive createEnemiesAlive() {
		EnemiesAliveImpl enemiesAlive = new EnemiesAliveImpl();
		return enemiesAlive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Difficulty createDifficulty() {
		DifficultyImpl difficulty = new DifficultyImpl();
		return difficulty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTargetFromString(EDataType eDataType, String initialValue) {
		Target result = Target.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DifficultyTier createDifficultyTierFromString(EDataType eDataType, String initialValue) {
		DifficultyTier result = DifficultyTier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDifficultyTierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifierTarget createModifierTargetFromString(EDataType eDataType, String initialValue) {
		ModifierTarget result = ModifierTarget.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModifierTargetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GamemodePackage getGamemodePackage() {
		return (GamemodePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GamemodePackage getPackage() {
		return GamemodePackage.eINSTANCE;
	}

} //GamemodeFactoryImpl
