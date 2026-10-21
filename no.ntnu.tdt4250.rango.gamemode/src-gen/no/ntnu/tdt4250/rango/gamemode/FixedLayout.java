/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All enemies are in place when the round starts, as in the campaign levels.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.FixedLayout#getSpawns <em>Spawns</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFixedLayout()
 * @model
 * @generated
 */
public interface FixedLayout extends SpawnStrategy {
	/**
	 * Returns the value of the '<em><b>Spawns</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spawns</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFixedLayout_Spawns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnemySpawn> getSpawns();

} // FixedLayout
