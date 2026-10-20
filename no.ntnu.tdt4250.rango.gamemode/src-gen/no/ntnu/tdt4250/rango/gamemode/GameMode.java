/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A way to play the game: the rules of one round, from what spawns to when the round ends.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDescription <em>Description</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPlayer <em>Player</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getBallTypes <em>Ball Types</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getGravity <em>Gravity</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getScoring <em>Scoring</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getArena <em>Arena</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getSpawning <em>Spawning</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDrops <em>Drops</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getWinConditions <em>Win Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getLoseConditions <em>Lose Conditions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPowerUps <em>Power Ups</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPopsToClear <em>Pops To Clear</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getMaxScore <em>Max Score</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveGravity fragmentTypesAvailable noSimultaneousOutcome winnable endsSomehow healthDepletedWhenHarmful'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveGravity='gravity &gt; 0'"
 * @generated
 */
public interface GameMode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the mode shown in the game's menu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Title()
	 * @model required="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A one-line explanation of the mode for the menu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile the player plays with in this mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Player</em>' reference.
	 * @see #setPlayer(PlayerProfile)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Player()
	 * @model required="true"
	 * @generated
	 */
	PlayerProfile getPlayer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getPlayer <em>Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(PlayerProfile value);

	/**
	 * Returns the value of the '<em><b>Ball Types</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.BallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ball types available in this mode. Only these can be spawned or produced by popping.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ball Types</em>' reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_BallTypes()
	 * @model required="true"
	 * @generated
	 */
	EList<BallType> getBallTypes();

	/**
	 * Returns the value of the '<em><b>Gravity</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Downward acceleration in the arena, in metres per second squared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gravity</em>' attribute.
	 * @see #setGravity(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Gravity()
	 * @model default="10.0"
	 * @generated
	 */
	float getGravity();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getGravity <em>Gravity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity</em>' attribute.
	 * @see #getGravity()
	 * @generated
	 */
	void setGravity(float value);

	/**
	 * Returns the value of the '<em><b>Scoring</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.rango.gamemode.Scoring}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scoring</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Scoring
	 * @see #setScoring(Scoring)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Scoring()
	 * @model
	 * @generated
	 */
	Scoring getScoring();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getScoring <em>Scoring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoring</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Scoring
	 * @see #getScoring()
	 * @generated
	 */
	void setScoring(Scoring value);

	/**
	 * Returns the value of the '<em><b>Arena</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The playing field of the mode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arena</em>' containment reference.
	 * @see #setArena(Arena)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Arena()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Arena getArena();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getArena <em>Arena</em>}' containment reference.
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
	 * Which balls enter the arena, where and when.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spawning</em>' containment reference.
	 * @see #setSpawning(SpawnStrategy)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Spawning()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SpawnStrategy getSpawning();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getSpawning <em>Spawning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spawning</em>' containment reference.
	 * @see #getSpawning()
	 * @generated
	 */
	void setSpawning(SpawnStrategy value);

	/**
	 * Returns the value of the '<em><b>Drops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What popped balls can drop. Without a drop table, nothing drops.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drops</em>' containment reference.
	 * @see #setDrops(DropTable)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_Drops()
	 * @model containment="true"
	 * @generated
	 */
	DropTable getDrops();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.GameMode#getDrops <em>Drops</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drops</em>' containment reference.
	 * @see #getDrops()
	 * @generated
	 */
	void setDrops(DropTable value);

	/**
	 * Returns the value of the '<em><b>Win Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EndCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The round is won as soon as any of these holds. A mode without win conditions is endless.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Win Conditions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_WinConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<EndCondition> getWinConditions();

	/**
	 * Returns the value of the '<em><b>Lose Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EndCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The round is lost as soon as any of these holds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lose Conditions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_LoseConditions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EndCondition> getLoseConditions();

	/**
	 * Returns the value of the '<em><b>Power Ups</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.PowerUp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The power-ups that can appear in this mode, that is, those of its drop table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Ups</em>' reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_PowerUps()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<PowerUp> getPowerUps();

	/**
	 * Returns the value of the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tongue hits needed to pop every ball the mode spawns, counting all fragments. -1 if the waves loop, since the mode then never runs out of balls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pops To Clear</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_PopsToClear()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPopsToClear();

	/**
	 * Returns the value of the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The points earned by popping everything the mode spawns, with points scoring. -1 if the waves loop.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Score</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getGameMode_MaxScore()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMaxScore();

} // GameMode
