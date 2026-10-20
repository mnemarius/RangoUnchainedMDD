/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Positioned</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Something placed in the arena. Positions are percentages of the arena's width (x, from the left wall) and height (y, from the floor), so a mode does not depend on the screen size of the device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPositioned()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='insideArena'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG insideArena='x &gt;= 0 and x &lt;= 100 and y &gt;= 0 and y &lt;= 100'"
 * @generated
 */
public interface Positioned extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Horizontal position, in percent of the arena width.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPositioned_X()
	 * @model required="true"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vertical position, in percent of the arena height.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getPositioned_Y()
	 * @model required="true"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Positioned#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

} // Positioned
