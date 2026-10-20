/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A situation that ends the round. Whether it wins or loses the round depends on the list of the mode it is in.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.EndCondition#isWin <em>Win</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEndCondition()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='fitsRole'"
 * @generated
 */
public interface EndCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True for a win condition, false for a lose condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Win</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getEndCondition_Win()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isWin();

} // EndCondition
