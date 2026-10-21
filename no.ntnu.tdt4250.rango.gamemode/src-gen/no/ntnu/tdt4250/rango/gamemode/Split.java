/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The enemy breaks into fragments one size smaller, launched in evenly spaced directions centred on straight up. The number of fragments decides the pattern: one fragment means the enemy shrinks and carries on in its direction of travel, two fan out to the left and the right and hop upwards as in the original game, and eight or more fly off all around the popped enemy like an exploding bomb. A enemy of the smallest size disappears instead.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragments <em>Fragments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragmentType <em>Fragment Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Split#getLaunchSpeed <em>Launch Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Split#getResultType <em>Result Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Split#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneFragment atMostSixteenFragments positiveLaunchSpeed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG atLeastOneFragment='fragments &gt;= 1' atMostSixteenFragments='fragments &lt;= 16' positiveLaunchSpeed='launchSpeed &gt; 0'"
 * @generated
 */
public interface Split extends SplitRule {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many fragments the enemy breaks into. One fragment means the enemy shrinks; more fragments spread wider, closing into a full ring at eight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragments</em>' attribute.
	 * @see #setFragments(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit_Fragments()
	 * @model required="true"
	 * @generated
	 */
	int getFragments();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragments <em>Fragments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragments</em>' attribute.
	 * @see #getFragments()
	 * @generated
	 */
	void setFragments(int value);

	/**
	 * Returns the value of the '<em><b>Fragment Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the fragments. When it is not set, the fragments are of the same type as the popped enemy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment Type</em>' reference.
	 * @see #setFragmentType(EnemyType)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit_FragmentType()
	 * @model
	 * @generated
	 */
	EnemyType getFragmentType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Split#getFragmentType <em>Fragment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Type</em>' reference.
	 * @see #getFragmentType()
	 * @generated
	 */
	void setFragmentType(EnemyType value);

	/**
	 * Returns the value of the '<em><b>Launch Speed</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed each fragment is launched with, in metres per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch Speed</em>' attribute.
	 * @see #setLaunchSpeed(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit_LaunchSpeed()
	 * @model default="5.0"
	 * @generated
	 */
	float getLaunchSpeed();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Split#getLaunchSpeed <em>Launch Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Speed</em>' attribute.
	 * @see #getLaunchSpeed()
	 * @generated
	 */
	void setLaunchSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type the fragments actually get: the fragment type if set, otherwise the type that owns this rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit_ResultType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EnemyType getResultType();

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The angle between the directions of neighbouring fragments, in degrees: 45, or 360 divided by the number of fragments when more than eight are needed to go all the way round.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getSplit_Spacing()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	float getSpacing();

} // Split
