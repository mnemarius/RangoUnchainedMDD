/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group of enemies that enter the arena together.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Wave#getDelay <em>Delay</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Wave#getSpawns <em>Spawns</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Wave#getNumber <em>Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Wave#getPopsToClear <em>Pops To Clear</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWave()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNegativeDelay'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG nonNegativeDelay='delay &gt;= 0'"
 * @generated
 */
public interface Wave extends EObject {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seconds of calm before the wave starts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWave_Delay()
	 * @model default="0.0"
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Wave#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

	/**
	 * Returns the value of the '<em><b>Spawns</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spawns</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWave_Spawns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnemySpawn> getSpawns();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The 1-based position of the wave in its schedule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWave_Number()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Returns the value of the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tongue hits needed to clear the wave the first time it is played.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pops To Clear</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWave_PopsToClear()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPopsToClear();

} // Wave
