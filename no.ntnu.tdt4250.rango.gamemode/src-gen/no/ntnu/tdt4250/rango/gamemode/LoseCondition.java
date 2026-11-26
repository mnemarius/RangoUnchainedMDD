/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lose Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * When a round is lost: as soon as any of the conditions set here holds. A condition is set when it is true or its value is above 0.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#isHealthDepleted <em>Health Depleted</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#getTimeLimit <em>Time Limit</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#getEnemiesAlive <em>Enemies Alive</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLoseCondition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNegativeValues setsACondition'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG nonNegativeValues='timeLimit &gt;= 0 and enemiesAlive &gt;= 0' setsACondition='healthDepleted or timeLimit &gt; 0 or enemiesAlive &gt; 0'"
 * @generated
 */
public interface LoseCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Health Depleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lost when the player has no hearts left.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Health Depleted</em>' attribute.
	 * @see #setHealthDepleted(boolean)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLoseCondition_HealthDepleted()
	 * @model
	 * @generated
	 */
	boolean isHealthDepleted();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#isHealthDepleted <em>Health Depleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Depleted</em>' attribute.
	 * @see #isHealthDepleted()
	 * @generated
	 */
	void setHealthDepleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lost when the round has lasted this many seconds. 0 if the round has no time limit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Limit</em>' attribute.
	 * @see #setTimeLimit(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLoseCondition_TimeLimit()
	 * @model
	 * @generated
	 */
	float getTimeLimit();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#getTimeLimit <em>Time Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit</em>' attribute.
	 * @see #getTimeLimit()
	 * @generated
	 */
	void setTimeLimit(float value);

	/**
	 * Returns the value of the '<em><b>Enemies Alive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lost when this many enemies are in the arena at the same time: the player is overrun. 0 if the round cannot be lost that way.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enemies Alive</em>' attribute.
	 * @see #setEnemiesAlive(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLoseCondition_EnemiesAlive()
	 * @model
	 * @generated
	 */
	int getEnemiesAlive();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.LoseCondition#getEnemiesAlive <em>Enemies Alive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enemies Alive</em>' attribute.
	 * @see #getEnemiesAlive()
	 * @generated
	 */
	void setEnemiesAlive(int value);

} // LoseCondition
