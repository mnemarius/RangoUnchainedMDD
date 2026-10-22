/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Modifier Target</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The kinds of modelled values a difficulty can change: the speed and points of every enemy type, the health and speed of the player, the drop chance of every drop table (at most 100%), and the delay before every wave.
 * <!-- end-model-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getModifierTarget()
 * @model
 * @generated
 */
public enum ModifierTarget implements Enumerator {
	/**
	 * The '<em><b>ENEMY SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	ENEMY_SPEED(0, "ENEMY_SPEED", "enemy.speed"),

	/**
	 * The '<em><b>ENEMY POINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	ENEMY_POINTS(1, "ENEMY_POINTS", "enemy.points"),

	/**
	 * The '<em><b>PLAYER HEALTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_HEALTH_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYER_HEALTH(2, "PLAYER_HEALTH", "player.health"),

	/**
	 * The '<em><b>PLAYER SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYER_SPEED(3, "PLAYER_SPEED", "player.speed"),

	/**
	 * The '<em><b>DROP CHANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_CHANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DROP_CHANCE(4, "DROP_CHANCE", "drop.chance"),

	/**
	 * The '<em><b>WAVE DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	WAVE_DELAY(5, "WAVE_DELAY", "wave.delay");

	/**
	 * The '<em><b>ENEMY SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_SPEED
	 * @model literal="enemy.speed"
	 * @generated
	 * @ordered
	 */
	public static final int ENEMY_SPEED_VALUE = 0;

	/**
	 * The '<em><b>ENEMY POINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENEMY_POINTS
	 * @model literal="enemy.points"
	 * @generated
	 * @ordered
	 */
	public static final int ENEMY_POINTS_VALUE = 1;

	/**
	 * The '<em><b>PLAYER HEALTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_HEALTH
	 * @model literal="player.health"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_HEALTH_VALUE = 2;

	/**
	 * The '<em><b>PLAYER SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYER_SPEED
	 * @model literal="player.speed"
	 * @generated
	 * @ordered
	 */
	public static final int PLAYER_SPEED_VALUE = 3;

	/**
	 * The '<em><b>DROP CHANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_CHANCE
	 * @model literal="drop.chance"
	 * @generated
	 * @ordered
	 */
	public static final int DROP_CHANCE_VALUE = 4;

	/**
	 * The '<em><b>WAVE DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAVE_DELAY
	 * @model literal="wave.delay"
	 * @generated
	 * @ordered
	 */
	public static final int WAVE_DELAY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Modifier Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModifierTarget[] VALUES_ARRAY =
		new ModifierTarget[] {
			ENEMY_SPEED,
			ENEMY_POINTS,
			PLAYER_HEALTH,
			PLAYER_SPEED,
			DROP_CHANCE,
			WAVE_DELAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Modifier Target</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ModifierTarget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Modifier Target</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModifierTarget get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModifierTarget result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modifier Target</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModifierTarget getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModifierTarget result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Modifier Target</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ModifierTarget get(int value) {
		switch (value) {
			case ENEMY_SPEED_VALUE: return ENEMY_SPEED;
			case ENEMY_POINTS_VALUE: return ENEMY_POINTS;
			case PLAYER_HEALTH_VALUE: return PLAYER_HEALTH;
			case PLAYER_SPEED_VALUE: return PLAYER_SPEED;
			case DROP_CHANCE_VALUE: return DROP_CHANCE;
			case WAVE_DELAY_VALUE: return WAVE_DELAY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModifierTarget(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ModifierTarget
