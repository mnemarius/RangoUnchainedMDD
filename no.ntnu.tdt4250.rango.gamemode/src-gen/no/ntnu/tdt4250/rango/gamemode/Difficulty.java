/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difficulty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * What one difficulty tier changes in every game mode of the edition: it multiplies some of the modelled values by a factor. A value without a modifier stays as modelled.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Difficulty#getTier <em>Tier</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Difficulty#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDifficulty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='distinctTargets onePerTier'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG distinctTargets='modifiers-&gt;isUnique(target)'"
 * @generated
 */
public interface Difficulty extends EObject {
	/**
	 * Returns the value of the '<em><b>Tier</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.rango.gamemode.DifficultyTier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tier this difficulty defines.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tier</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.DifficultyTier
	 * @see #setTier(DifficultyTier)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDifficulty_Tier()
	 * @model required="true"
	 * @generated
	 */
	DifficultyTier getTier();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Difficulty#getTier <em>Tier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tier</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.DifficultyTier
	 * @see #getTier()
	 * @generated
	 */
	void setTier(DifficultyTier value);

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.Modifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The values the level changes, at most one modifier per value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getDifficulty_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

} // Difficulty
