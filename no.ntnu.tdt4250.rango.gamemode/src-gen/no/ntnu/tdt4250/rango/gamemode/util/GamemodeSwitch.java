/**
 */
package no.ntnu.tdt4250.rango.gamemode.util;

import no.ntnu.tdt4250.rango.gamemode.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage
 * @generated
 */
public class GamemodeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamemodePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GamemodeSwitch() {
		if (modelPackage == null) {
			modelPackage = GamemodePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GamemodePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.POSITIONED: {
				Positioned positioned = (Positioned)theEObject;
				T result = casePositioned(positioned);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.EDITION: {
				Edition edition = (Edition)theEObject;
				T result = caseEdition(edition);
				if (result == null) result = caseNamedElement(edition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.ENEMY_TYPE: {
				EnemyType enemyType = (EnemyType)theEObject;
				T result = caseEnemyType(enemyType);
				if (result == null) result = caseNamedElement(enemyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SPLIT_RULE: {
				SplitRule splitRule = (SplitRule)theEObject;
				T result = caseSplitRule(splitRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.VANISH: {
				Vanish vanish = (Vanish)theEObject;
				T result = caseVanish(vanish);
				if (result == null) result = caseSplitRule(vanish);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SPLIT: {
				Split split = (Split)theEObject;
				T result = caseSplit(split);
				if (result == null) result = caseSplitRule(split);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.PLAYER_EFFECT: {
				PlayerEffect playerEffect = (PlayerEffect)theEObject;
				T result = casePlayerEffect(playerEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.DAMAGE: {
				Damage damage = (Damage)theEObject;
				T result = caseDamage(damage);
				if (result == null) result = casePlayerEffect(damage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.HEAL: {
				Heal heal = (Heal)theEObject;
				T result = caseHeal(heal);
				if (result == null) result = casePlayerEffect(heal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.TIMED_EFFECT: {
				TimedEffect timedEffect = (TimedEffect)theEObject;
				T result = caseTimedEffect(timedEffect);
				if (result == null) result = casePlayerEffect(timedEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SHIELD: {
				Shield shield = (Shield)theEObject;
				T result = caseShield(shield);
				if (result == null) result = caseTimedEffect(shield);
				if (result == null) result = casePlayerEffect(shield);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SPEED_CHANGE: {
				SpeedChange speedChange = (SpeedChange)theEObject;
				T result = caseSpeedChange(speedChange);
				if (result == null) result = caseTimedEffect(speedChange);
				if (result == null) result = casePlayerEffect(speedChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.POISON: {
				Poison poison = (Poison)theEObject;
				T result = casePoison(poison);
				if (result == null) result = caseTimedEffect(poison);
				if (result == null) result = casePlayerEffect(poison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.POWER_UP: {
				PowerUp powerUp = (PowerUp)theEObject;
				T result = casePowerUp(powerUp);
				if (result == null) result = caseNamedElement(powerUp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.MATERIAL: {
				Material material = (Material)theEObject;
				T result = caseMaterial(material);
				if (result == null) result = caseNamedElement(material);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.PLAYER_PROFILE: {
				PlayerProfile playerProfile = (PlayerProfile)theEObject;
				T result = casePlayerProfile(playerProfile);
				if (result == null) result = caseNamedElement(playerProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.GAME_MODE: {
				GameMode gameMode = (GameMode)theEObject;
				T result = caseGameMode(gameMode);
				if (result == null) result = caseNamedElement(gameMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.LEVEL: {
				Level level = (Level)theEObject;
				T result = caseLevel(level);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SPEED_BONUS: {
				SpeedBonus speedBonus = (SpeedBonus)theEObject;
				T result = caseSpeedBonus(speedBonus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.ARENA: {
				Arena arena = (Arena)theEObject;
				T result = caseArena(arena);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.OBSTACLE: {
				Obstacle obstacle = (Obstacle)theEObject;
				T result = caseObstacle(obstacle);
				if (result == null) result = caseNamedElement(obstacle);
				if (result == null) result = casePositioned(obstacle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseObstacle(block);
				if (result == null) result = caseNamedElement(block);
				if (result == null) result = casePositioned(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseObstacle(trigger);
				if (result == null) result = caseNamedElement(trigger);
				if (result == null) result = casePositioned(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.JUMP_PAD: {
				JumpPad jumpPad = (JumpPad)theEObject;
				T result = caseJumpPad(jumpPad);
				if (result == null) result = caseTrigger(jumpPad);
				if (result == null) result = caseObstacle(jumpPad);
				if (result == null) result = caseNamedElement(jumpPad);
				if (result == null) result = casePositioned(jumpPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.TELEPORTER: {
				Teleporter teleporter = (Teleporter)theEObject;
				T result = caseTeleporter(teleporter);
				if (result == null) result = caseTrigger(teleporter);
				if (result == null) result = caseObstacle(teleporter);
				if (result == null) result = caseNamedElement(teleporter);
				if (result == null) result = casePositioned(teleporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SPAWN_STRATEGY: {
				SpawnStrategy spawnStrategy = (SpawnStrategy)theEObject;
				T result = caseSpawnStrategy(spawnStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.FIXED_LAYOUT: {
				FixedLayout fixedLayout = (FixedLayout)theEObject;
				T result = caseFixedLayout(fixedLayout);
				if (result == null) result = caseSpawnStrategy(fixedLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.WAVE_SCHEDULE: {
				WaveSchedule waveSchedule = (WaveSchedule)theEObject;
				T result = caseWaveSchedule(waveSchedule);
				if (result == null) result = caseSpawnStrategy(waveSchedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.WAVE: {
				Wave wave = (Wave)theEObject;
				T result = caseWave(wave);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.ENEMY_SPAWN: {
				EnemySpawn enemySpawn = (EnemySpawn)theEObject;
				T result = caseEnemySpawn(enemySpawn);
				if (result == null) result = casePositioned(enemySpawn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.DROP_TABLE: {
				DropTable dropTable = (DropTable)theEObject;
				T result = caseDropTable(dropTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.DROP: {
				Drop drop = (Drop)theEObject;
				T result = caseDrop(drop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.END_CONDITION: {
				EndCondition endCondition = (EndCondition)theEObject;
				T result = caseEndCondition(endCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.CLEARED: {
				Cleared cleared = (Cleared)theEObject;
				T result = caseCleared(cleared);
				if (result == null) result = caseEndCondition(cleared);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.TIME_REACHED: {
				TimeReached timeReached = (TimeReached)theEObject;
				T result = caseTimeReached(timeReached);
				if (result == null) result = caseEndCondition(timeReached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.SCORE_REACHED: {
				ScoreReached scoreReached = (ScoreReached)theEObject;
				T result = caseScoreReached(scoreReached);
				if (result == null) result = caseEndCondition(scoreReached);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.ENEMIES_POPPED: {
				EnemiesPopped enemiesPopped = (EnemiesPopped)theEObject;
				T result = caseEnemiesPopped(enemiesPopped);
				if (result == null) result = caseEndCondition(enemiesPopped);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.WAVES_SURVIVED: {
				WavesSurvived wavesSurvived = (WavesSurvived)theEObject;
				T result = caseWavesSurvived(wavesSurvived);
				if (result == null) result = caseEndCondition(wavesSurvived);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.HEALTH_DEPLETED: {
				HealthDepleted healthDepleted = (HealthDepleted)theEObject;
				T result = caseHealthDepleted(healthDepleted);
				if (result == null) result = caseEndCondition(healthDepleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.ENEMIES_ALIVE: {
				EnemiesAlive enemiesAlive = (EnemiesAlive)theEObject;
				T result = caseEnemiesAlive(enemiesAlive);
				if (result == null) result = caseEndCondition(enemiesAlive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.DIFFICULTY: {
				Difficulty difficulty = (Difficulty)theEObject;
				T result = caseDifficulty(difficulty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GamemodePackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positioned</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositioned(Positioned object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdition(Edition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemyType(EnemyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitRule(SplitRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vanish</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vanish</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVanish(Vanish object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplit(Split object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerEffect(PlayerEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Damage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Damage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDamage(Damage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeal(Heal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedEffect(TimedEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shield</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shield</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShield(Shield object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedChange(SpeedChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoison(Poison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerUp(PowerUp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaterial(Material object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayerProfile(PlayerProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameMode(GameMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevel(Level object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Bonus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Bonus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedBonus(SpeedBonus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arena</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arena</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArena(Arena object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obstacle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObstacle(Obstacle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpPad(JumpPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teleporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teleporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeleporter(Teleporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spawn Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spawn Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpawnStrategy(SpawnStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedLayout(FixedLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wave Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wave Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaveSchedule(WaveSchedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWave(Wave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemy Spawn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemy Spawn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemySpawn(EnemySpawn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropTable(DropTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrop(Drop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndCondition(EndCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cleared</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cleared</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCleared(Cleared object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Reached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Reached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeReached(TimeReached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Score Reached</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Score Reached</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScoreReached(ScoreReached object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemies Popped</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemies Popped</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemiesPopped(EnemiesPopped object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waves Survived</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waves Survived</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWavesSurvived(WavesSurvived object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Depleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Depleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthDepleted(HealthDepleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemies Alive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemies Alive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemiesAlive(EnemiesAlive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Difficulty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Difficulty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDifficulty(Difficulty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GamemodeSwitch
