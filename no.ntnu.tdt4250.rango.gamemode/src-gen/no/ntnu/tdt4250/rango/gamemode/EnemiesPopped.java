/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemies Popped</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The player has popped a number of enemies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EnemiesPopped#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemiesPopped()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveCount='count &gt; 0'"
 * @generated
 */
public interface EnemiesPopped extends EndCondition {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEnemiesPopped_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.EnemiesPopped#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // EnemiesPopped
