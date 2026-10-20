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
 * One product of the line. It declares the building blocks it ships (ball types, power-ups, materials, player profiles) and the game modes made from them. The generator turns one edition into the game modes of one build of the game.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getTitle <em>Title</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getBallTypes <em>Ball Types</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPowerUps <em>Power Ups</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getMaterials <em>Materials</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Edition#getModes <em>Modes</em>}</li>
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
	 * Returns the value of the '<em><b>Ball Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.BallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kinds of balls (enemies) that exist in this edition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ball Types</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_BallTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BallType> getBallTypes();

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
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.Material}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The surface materials that floors, walls and blocks can be made of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEdition_Materials()
	 * @model containment="true"
	 * @generated
	 */
	EList<Material> getMaterials();

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

} // Edition
