/**
 */
package no.ntnu.tdt4250.rango.gamemode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fragmenting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ball breaks into fragments one size smaller. A ball of the smallest size disappears instead.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragments <em>Fragments</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragmentType <em>Fragment Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getLaunchSpeed <em>Launch Speed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFragmenting()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='atLeastOneFragment positiveLaunchSpeed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG atLeastOneFragment='fragments &gt;= 1' positiveLaunchSpeed='launchSpeed &gt; 0'"
 * @generated
 */
public interface Fragmenting extends SplitRule {
	/**
	 * Returns the value of the '<em><b>Fragments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many fragments the ball breaks into. One fragment means the ball shrinks.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragments</em>' attribute.
	 * @see #setFragments(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFragmenting_Fragments()
	 * @model required="true"
	 * @generated
	 */
	int getFragments();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragments <em>Fragments</em>}' attribute.
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
	 * The type of the fragments. When it is not set, the fragments are of the same type as the popped ball.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fragment Type</em>' reference.
	 * @see #setFragmentType(BallType)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFragmenting_FragmentType()
	 * @model
	 * @generated
	 */
	BallType getFragmentType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getFragmentType <em>Fragment Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fragment Type</em>' reference.
	 * @see #getFragmentType()
	 * @generated
	 */
	void setFragmentType(BallType value);

	/**
	 * Returns the value of the '<em><b>Launch Speed</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The speed the fragments are launched with, in metres per second.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Launch Speed</em>' attribute.
	 * @see #setLaunchSpeed(float)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFragmenting_LaunchSpeed()
	 * @model default="5.0"
	 * @generated
	 */
	float getLaunchSpeed();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.Fragmenting#getLaunchSpeed <em>Launch Speed</em>}' attribute.
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
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getFragmenting_ResultType()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	BallType getResultType();

} // Fragmenting
