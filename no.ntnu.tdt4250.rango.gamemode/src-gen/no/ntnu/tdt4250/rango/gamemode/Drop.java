/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A power-up that a drop table can drop.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Drop#getTable <em>Table</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Drop#getPowerUp <em>Power Up</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Drop#getWeight <em>Weight</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Drop#getProbability <em>Probability</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Drop#getShare <em>Share</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveWeight'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positiveWeight='weight &gt; 0'"
 * @generated
 */
public interface Drop extends EObject {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.rango.gamemode.DropTable#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop_Table()
	 * @see no.ntnu.tdt4250.rango.gamemode.DropTable#getEntries
	 * @model opposite="entries" required="true" changeable="false"
	 * @generated
	 */
	DropTable getTable();

	/**
	 * Returns the value of the '<em><b>Power Up</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Up</em>' reference.
	 * @see #setPowerUp(PowerUp)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop_PowerUp()
	 * @model required="true"
	 * @generated
	 */
	PowerUp getPowerUp();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getPowerUp <em>Power Up</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Up</em>' reference.
	 * @see #getPowerUp()
	 * @generated
	 */
	void setPowerUp(PowerUp value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How likely this entry is, relative to the other entries of the table.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop_Weight()
	 * @model default="1"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Drop#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chance, in percent, that a single pop of the table's ball type drops this power-up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop_Probability()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getProbability();

	/**
	 * Returns the value of the '<em><b>Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The chance, in percent, that a pop which drops something drops this power-up.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Share</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDrop_Share()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getShare();

} // Drop
