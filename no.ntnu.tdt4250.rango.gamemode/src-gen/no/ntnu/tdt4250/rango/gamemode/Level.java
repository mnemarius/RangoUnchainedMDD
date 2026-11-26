/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One round of a mode: the arena it is played in, the enemies that enter it, and when it is won or lost.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getArena <em>Arena</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getSpawning <em>Spawning</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getWin <em>Win</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getLose <em>Lose</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getNumber <em>Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getPopsToClear <em>Pops To Clear</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Level#getMaxScore <em>Max Score</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='distinctConditionKinds noSimultaneousOutcome winnable endsSomehow healthDepletedWhenHarmful'"
 * @generated
 */
public interface Level extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the level shown in the game's menu. Without one, the level is called by its number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Level#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Arena</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The playing field of the level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arena</em>' containment reference.
	 * @see #setArena(Arena)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Arena()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arena getArena();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Level#getArena <em>Arena</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arena</em>' containment reference.
	 * @see #getArena()
	 * @generated
	 */
	void setArena(Arena value);

	/**
	 * Returns the value of the '<em><b>Spawning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which enemies enter the arena, where and when.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spawning</em>' containment reference.
	 * @see #setSpawning(SpawnStrategy)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Spawning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SpawnStrategy getSpawning();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Level#getSpawning <em>Spawning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spawning</em>' containment reference.
	 * @see #getSpawning()
	 * @generated
	 */
	void setSpawning(SpawnStrategy value);

	/**
	 * Returns the value of the '<em><b>Win</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.WinCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level is won as soon as any of these holds. A level without win conditions is endless: its rounds only end when they are lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Win</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Win()
	 * @model containment="true"
	 * @generated
	 */
	EList<WinCondition> getWin();

	/**
	 * Returns the value of the '<em><b>Lose</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.LoseCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The level is lost as soon as any of these holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lose</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Lose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<LoseCondition> getLose();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the level in its mode, counting from 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_Number()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Returns the value of the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tongue hits needed to pop every enemy the level spawns, counting all fragments. -1 if the waves loop, since the level then never runs out of enemies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pops To Clear</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_PopsToClear()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPopsToClear();

	/**
	 * Returns the value of the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The points earned by popping everything the level spawns, before any speed bonus. -1 if the waves loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Score</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getLevel_MaxScore()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMaxScore();

} // Level
