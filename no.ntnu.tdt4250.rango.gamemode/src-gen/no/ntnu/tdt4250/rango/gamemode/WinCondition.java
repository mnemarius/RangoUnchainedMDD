/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When a round is won: as soon as any of the conditions set here holds. A condition is set when it is true or its value is above 0. Each condition is a single value, and winning and losing are decided by different conditions, so the conditions are fields of one class per role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#isCleared <em>Cleared</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getSurviveSeconds <em>Survive Seconds</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getPoints <em>Points</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getEnemiesPopped <em>Enemies Popped</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getWavesSurvived <em>Waves Survived</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNegativeValues setsACondition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG nonNegativeValues='surviveSeconds &gt;= 0 and points &gt;= 0 and enemiesPopped &gt;= 0 and wavesSurvived &gt;= 0' setsACondition='cleared or surviveSeconds &gt; 0 or points &gt; 0 or enemiesPopped &gt; 0 or wavesSurvived &gt; 0'"
 * @generated
 */
public interface WinCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Cleared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Won when no enemy is left and none is still to come.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cleared</em>' attribute.
	 * @see #setCleared(boolean)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition_Cleared()
	 * @model
	 * @generated
	 */
	boolean isCleared();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#isCleared <em>Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleared</em>' attribute.
	 * @see #isCleared()
	 * @generated
	 */
	void setCleared(boolean value);

	/**
	 * Returns the value of the '<em><b>Survive Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Won when the player has survived this many seconds. 0 if the round is not won by time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Survive Seconds</em>' attribute.
	 * @see #setSurviveSeconds(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition_SurviveSeconds()
	 * @model
	 * @generated
	 */
	float getSurviveSeconds();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getSurviveSeconds <em>Survive Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Survive Seconds</em>' attribute.
	 * @see #getSurviveSeconds()
	 * @generated
	 */
	void setSurviveSeconds(float value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Won when the score reaches this many points. 0 if the round is not won by score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Enemies Popped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Won when the player has popped this many enemies. 0 if the round is not won by pops.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enemies Popped</em>' attribute.
	 * @see #setEnemiesPopped(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition_EnemiesPopped()
	 * @model
	 * @generated
	 */
	int getEnemiesPopped();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getEnemiesPopped <em>Enemies Popped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enemies Popped</em>' attribute.
	 * @see #getEnemiesPopped()
	 * @generated
	 */
	void setEnemiesPopped(int value);

	/**
	 * Returns the value of the '<em><b>Waves Survived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Won when the player has cleared this many waves. 0 if the round is not won by waves.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Waves Survived</em>' attribute.
	 * @see #setWavesSurvived(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWinCondition_WavesSurvived()
	 * @model
	 * @generated
	 */
	int getWavesSurvived();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WinCondition#getWavesSurvived <em>Waves Survived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waves Survived</em>' attribute.
	 * @see #getWavesSurvived()
	 * @generated
	 */
	void setWavesSurvived(int value);

} // WinCondition
