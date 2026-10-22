/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arena</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The walled playing field of a level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Arena#getBackground <em>Background</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Arena#getPlayerStart <em>Player Start</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Arena#getObstacles <em>Obstacles</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getArena()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='playerStartInside'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG playerStartInside='playerStart &gt;= 0 and playerStart &lt;= 100'"
 * @generated
 */
public interface Arena extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The backdrop, as the name of an image in the game's Background assets folder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getArena_Background()
	 * @model required="true"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Player Start</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the player starts on the floor, in percent of the arena width.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Player Start</em>' attribute.
	 * @see #setPlayerStart(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getArena_PlayerStart()
	 * @model default="10.0"
	 * @generated
	 */
	float getPlayerStart();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Arena#getPlayerStart <em>Player Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Start</em>' attribute.
	 * @see #getPlayerStart()
	 * @generated
	 */
	void setPlayerStart(float value);

	/**
	 * Returns the value of the '<em><b>Obstacles</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.Obstacle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What stands in the arena besides the floor, walls and roof.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obstacles</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getArena_Obstacles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Obstacle> getObstacles();

} // Arena
