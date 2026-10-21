/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * What popping one ball type can drop. Each pop drops at most one power-up: with the table's chance, one of its entries, picked by weight.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getChance <em>Chance</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getEntries <em>Entries</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getTotalWeight <em>Total Weight</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getBallType <em>Ball Type</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDropTable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='chanceIsPercentage distinctPowerUps oneTablePerBall'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG chanceIsPercentage='chance &gt; 0 and chance &lt;= 100' distinctPowerUps='entries-&gt;isUnique(powerUp)'"
 * @generated
 */
public interface DropTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Chance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chance, in percent, that a pop drops something.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chance</em>' attribute.
	 * @see #setChance(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDropTable_Chance()
	 * @model required="true"
	 * @generated
	 */
	float getChance();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getChance <em>Chance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chance</em>' attribute.
	 * @see #getChance()
	 * @generated
	 */
	void setChance(float value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.Drop}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDropTable_Entries()
	 * @see no.ntnu.tdt4250.rango.gamemode.Drop#getTable
	 * @model opposite="table" containment="true" required="true"
	 * @generated
	 */
	EList<Drop> getEntries();

	/**
	 * Returns the value of the '<em><b>Total Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The sum of the weights of the entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Weight</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDropTable_TotalWeight()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalWeight();

	/**
	 * Returns the value of the '<em><b>Ball Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ball type whose pops roll on this table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ball Type</em>' reference.
	 * @see #setBallType(BallType)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDropTable_BallType()
	 * @model required="true"
	 * @generated
	 */
	BallType getBallType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getBallType <em>Ball Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ball Type</em>' reference.
	 * @see #getBallType()
	 * @generated
	 */
	void setBallType(BallType value);

} // DropTable
