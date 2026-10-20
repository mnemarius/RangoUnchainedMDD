/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scoring</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How pops are turned into score.
 * <!-- end-model-doc -->
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getScoring()
 * @model
 * @generated
 */
public enum Scoring implements Enumerator {
	/**
	 * The '<em><b>POINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each pop is worth the points of the popped ball type.
	 * <!-- end-model-doc -->
	 * @see #POINTS_VALUE
	 * @generated
	 * @ordered
	 */
	POINTS(0, "POINTS", "points"),

	/**
	 * The '<em><b>SPEED BONUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each pop is worth the points of the ball type, times a bonus that shrinks as the round goes on (the scoring of the original campaign).
	 * <!-- end-model-doc -->
	 * @see #SPEED_BONUS_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED_BONUS(1, "SPEED_BONUS", "speed-bonus");

	/**
	 * The '<em><b>POINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each pop is worth the points of the popped ball type.
	 * <!-- end-model-doc -->
	 * @see #POINTS
	 * @model literal="points"
	 * @generated
	 * @ordered
	 */
	public static final int POINTS_VALUE = 0;

	/**
	 * The '<em><b>SPEED BONUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each pop is worth the points of the ball type, times a bonus that shrinks as the round goes on (the scoring of the original campaign).
	 * <!-- end-model-doc -->
	 * @see #SPEED_BONUS
	 * @model literal="speed-bonus"
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_BONUS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Scoring</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scoring[] VALUES_ARRAY =
		new Scoring[] {
			POINTS,
			SPEED_BONUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Scoring</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scoring> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scoring</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scoring get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scoring result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scoring</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scoring getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scoring result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scoring</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scoring get(int value) {
		switch (value) {
			case POINTS_VALUE: return POINTS;
			case SPEED_BONUS_VALUE: return SPEED_BONUS;
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
	private Scoring(int value, String name, String literal) {
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
	
} //Scoring
