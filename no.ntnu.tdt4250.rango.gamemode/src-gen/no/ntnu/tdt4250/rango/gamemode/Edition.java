/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One product of the line. It declares the building blocks it ships (enemy types, power-ups, player profiles) and the game modes made from them. The generator turns one edition into the game modes of one build of the game.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getEnemyTypes <em>Enemy Types</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPowerUps <em>Power Ups</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getModes <em>Modes</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getDrops <em>Drops</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition()
 * @model
 * @generated
 */
public interface Edition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The product name shown to players, in the window title and the main menu. Defaults to the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Edition#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Enemy Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EnemyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kinds of enemies that exist in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enemy Types</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_EnemyTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnemyType> getEnemyTypes();

	/**
	 * Returns the value of the '<em><b>Power Ups</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.PowerUp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The power-ups that exist in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Power Ups</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_PowerUps()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerUp> getPowerUps();

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.PlayerProfile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The player profiles that modes can let the player play with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_Players()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PlayerProfile> getPlayers();

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.GameMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The game modes of the edition, in menu order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modes</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_Modes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GameMode> getModes();

	/**
	 * Returns the value of the '<em><b>Drops</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.DropTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What popping each enemy type can drop, one table per enemy type, in every mode that has no drop tables of its own.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drops</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_Drops()
	 * @model containment="true"
	 * @generated
	 */
	EList<DropTable> getDrops();

} // Edition
