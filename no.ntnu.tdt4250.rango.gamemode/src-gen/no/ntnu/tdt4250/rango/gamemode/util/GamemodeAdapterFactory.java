/**
 */
package no.ntnu.tdt4250.rango.gamemode.util;

import no.ntnu.tdt4250.rango.gamemode.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage
 * @generated
 */
public class GamemodeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamemodePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamemodeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GamemodePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamemodeSwitch<Adapter> modelSwitch =
		new GamemodeSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePositioned(Positioned object) {
				return createPositionedAdapter();
			}
			@Override
			public Adapter caseEdition(Edition object) {
				return createEditionAdapter();
			}
			@Override
			public Adapter caseEnemyType(EnemyType object) {
				return createEnemyTypeAdapter();
			}
			@Override
			public Adapter caseSplitRule(SplitRule object) {
				return createSplitRuleAdapter();
			}
			@Override
			public Adapter caseVanish(Vanish object) {
				return createVanishAdapter();
			}
			@Override
			public Adapter caseSplit(Split object) {
				return createSplitAdapter();
			}
			@Override
			public Adapter casePlayerEffect(PlayerEffect object) {
				return createPlayerEffectAdapter();
			}
			@Override
			public Adapter caseDamage(Damage object) {
				return createDamageAdapter();
			}
			@Override
			public Adapter caseHeal(Heal object) {
				return createHealAdapter();
			}
			@Override
			public Adapter caseTimedEffect(TimedEffect object) {
				return createTimedEffectAdapter();
			}
			@Override
			public Adapter caseShield(Shield object) {
				return createShieldAdapter();
			}
			@Override
			public Adapter caseSpeedChange(SpeedChange object) {
				return createSpeedChangeAdapter();
			}
			@Override
			public Adapter casePoison(Poison object) {
				return createPoisonAdapter();
			}
			@Override
			public Adapter casePowerUp(PowerUp object) {
				return createPowerUpAdapter();
			}
			@Override
			public Adapter casePlayerProfile(PlayerProfile object) {
				return createPlayerProfileAdapter();
			}
			@Override
			public Adapter caseGameMode(GameMode object) {
				return createGameModeAdapter();
			}
			@Override
			public Adapter caseLevel(Level object) {
				return createLevelAdapter();
			}
			@Override
			public Adapter caseSpeedBonus(SpeedBonus object) {
				return createSpeedBonusAdapter();
			}
			@Override
			public Adapter caseArena(Arena object) {
				return createArenaAdapter();
			}
			@Override
			public Adapter caseObstacle(Obstacle object) {
				return createObstacleAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseJumpPad(JumpPad object) {
				return createJumpPadAdapter();
			}
			@Override
			public Adapter caseTeleporter(Teleporter object) {
				return createTeleporterAdapter();
			}
			@Override
			public Adapter caseSpawnStrategy(SpawnStrategy object) {
				return createSpawnStrategyAdapter();
			}
			@Override
			public Adapter caseFixedLayout(FixedLayout object) {
				return createFixedLayoutAdapter();
			}
			@Override
			public Adapter caseWaveSchedule(WaveSchedule object) {
				return createWaveScheduleAdapter();
			}
			@Override
			public Adapter caseWave(Wave object) {
				return createWaveAdapter();
			}
			@Override
			public Adapter caseEnemySpawn(EnemySpawn object) {
				return createEnemySpawnAdapter();
			}
			@Override
			public Adapter caseDropTable(DropTable object) {
				return createDropTableAdapter();
			}
			@Override
			public Adapter caseDrop(Drop object) {
				return createDropAdapter();
			}
			@Override
			public Adapter caseEndCondition(EndCondition object) {
				return createEndConditionAdapter();
			}
			@Override
			public Adapter caseCleared(Cleared object) {
				return createClearedAdapter();
			}
			@Override
			public Adapter caseTimeReached(TimeReached object) {
				return createTimeReachedAdapter();
			}
			@Override
			public Adapter caseScoreReached(ScoreReached object) {
				return createScoreReachedAdapter();
			}
			@Override
			public Adapter caseEnemiesPopped(EnemiesPopped object) {
				return createEnemiesPoppedAdapter();
			}
			@Override
			public Adapter caseWavesSurvived(WavesSurvived object) {
				return createWavesSurvivedAdapter();
			}
			@Override
			public Adapter caseHealthDepleted(HealthDepleted object) {
				return createHealthDepletedAdapter();
			}
			@Override
			public Adapter caseEnemiesAlive(EnemiesAlive object) {
				return createEnemiesAliveAdapter();
			}
			@Override
			public Adapter caseDifficulty(Difficulty object) {
				return createDifficultyAdapter();
			}
			@Override
			public Adapter caseModifier(Modifier object) {
				return createModifierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Positioned <em>Positioned</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Positioned
	 * @generated
	 */
	public Adapter createPositionedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Edition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Edition
	 * @generated
	 */
	public Adapter createEditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.EnemyType <em>Enemy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemyType
	 * @generated
	 */
	public Adapter createEnemyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.SplitRule <em>Split Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.SplitRule
	 * @generated
	 */
	public Adapter createSplitRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Vanish <em>Vanish</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Vanish
	 * @generated
	 */
	public Adapter createVanishAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Split <em>Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Split
	 * @generated
	 */
	public Adapter createSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.PlayerEffect <em>Player Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerEffect
	 * @generated
	 */
	public Adapter createPlayerEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Damage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Damage
	 * @generated
	 */
	public Adapter createDamageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Heal <em>Heal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Heal
	 * @generated
	 */
	public Adapter createHealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.TimedEffect <em>Timed Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimedEffect
	 * @generated
	 */
	public Adapter createTimedEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Shield <em>Shield</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Shield
	 * @generated
	 */
	public Adapter createShieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.SpeedChange <em>Speed Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedChange
	 * @generated
	 */
	public Adapter createSpeedChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Poison <em>Poison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Poison
	 * @generated
	 */
	public Adapter createPoisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.PowerUp <em>Power Up</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.PowerUp
	 * @generated
	 */
	public Adapter createPowerUpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile <em>Player Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.PlayerProfile
	 * @generated
	 */
	public Adapter createPlayerProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.GameMode <em>Game Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.GameMode
	 * @generated
	 */
	public Adapter createGameModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Level
	 * @generated
	 */
	public Adapter createLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.SpeedBonus <em>Speed Bonus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpeedBonus
	 * @generated
	 */
	public Adapter createSpeedBonusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Arena <em>Arena</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Arena
	 * @generated
	 */
	public Adapter createArenaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Obstacle
	 * @generated
	 */
	public Adapter createObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.JumpPad <em>Jump Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.JumpPad
	 * @generated
	 */
	public Adapter createJumpPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Teleporter <em>Teleporter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Teleporter
	 * @generated
	 */
	public Adapter createTeleporterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.SpawnStrategy <em>Spawn Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.SpawnStrategy
	 * @generated
	 */
	public Adapter createSpawnStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.FixedLayout <em>Fixed Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.FixedLayout
	 * @generated
	 */
	public Adapter createFixedLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule <em>Wave Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.WaveSchedule
	 * @generated
	 */
	public Adapter createWaveScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Wave <em>Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Wave
	 * @generated
	 */
	public Adapter createWaveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn <em>Enemy Spawn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemySpawn
	 * @generated
	 */
	public Adapter createEnemySpawnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.DropTable <em>Drop Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable
	 * @generated
	 */
	public Adapter createDropTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Drop <em>Drop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop
	 * @generated
	 */
	public Adapter createDropAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.EndCondition <em>End Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.EndCondition
	 * @generated
	 */
	public Adapter createEndConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Cleared <em>Cleared</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Cleared
	 * @generated
	 */
	public Adapter createClearedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.TimeReached <em>Time Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.TimeReached
	 * @generated
	 */
	public Adapter createTimeReachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.ScoreReached <em>Score Reached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.ScoreReached
	 * @generated
	 */
	public Adapter createScoreReachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesPopped <em>Enemies Popped</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesPopped
	 * @generated
	 */
	public Adapter createEnemiesPoppedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.WavesSurvived <em>Waves Survived</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.WavesSurvived
	 * @generated
	 */
	public Adapter createWavesSurvivedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.HealthDepleted <em>Health Depleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.HealthDepleted
	 * @generated
	 */
	public Adapter createHealthDepletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesAlive <em>Enemies Alive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.EnemiesAlive
	 * @generated
	 */
	public Adapter createEnemiesAliveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Difficulty <em>Difficulty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Difficulty
	 * @generated
	 */
	public Adapter createDifficultyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.ntnu.tdt4250.rango.gamemode.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.ntnu.tdt4250.rango.gamemode.Modifier
	 * @generated
	 */
	public Adapter createModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GamemodeAdapterFactory
