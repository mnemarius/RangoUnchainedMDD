/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemy Spawn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One or more enemies of the same type and size that enter the arena at a position. Several enemies are spread out sideways.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getSize <em>Size</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getCount <em>Count</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getDirection <em>Direction</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getPopsToClear <em>Pops To Clear</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sizeInRange positiveCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG sizeInRange='size &gt;= 1 and size &lt;= 3' positiveCount='count &gt;= 1'"
 * @generated
 */
public interface EnemySpawn extends Positioned {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the enemies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EnemyType)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn_Type()
	 * @model required="true"
	 * @generated
	 */
	EnemyType getType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EnemyType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The size class of the enemies, from 1 (small) to 3 (large).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn_Size()
	 * @model default="3"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many enemies are spawned.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn_Count()
	 * @model default="1"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"right"</code>.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.rango.gamemode.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which way the enemies start moving.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Direction
	 * @see #setDirection(Direction)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn_Direction()
	 * @model default="right"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemySpawn#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Pops To Clear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tongue hits needed to pop these enemies and everything they break into.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pops To Clear</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemySpawn_PopsToClear()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getPopsToClear();

} // EnemySpawn
