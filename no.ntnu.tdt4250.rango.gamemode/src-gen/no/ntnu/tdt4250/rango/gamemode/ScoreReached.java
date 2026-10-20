/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Score Reached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The player's score has reached a number of points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.ScoreReached#getPoints <em>Points</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getScoreReached()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positivePoints'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG positivePoints='points &gt; 0'"
 * @generated
 */
public interface ScoreReached extends EndCondition {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getScoreReached_Points()
	 * @model required="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.ScoreReached#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

} // ScoreReached
