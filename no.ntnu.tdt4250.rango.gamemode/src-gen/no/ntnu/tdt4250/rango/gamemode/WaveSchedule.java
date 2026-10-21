/**
 */
package no.ntnu.tdt4250.rango.gamemode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wave Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Enemies arrive in waves. A wave starts once the previous one has been cleared and its delay has passed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#isLoop <em>Loop</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getEscalation <em>Escalation</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getWaves <em>Waves</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWaveSchedule()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nonNegativeEscalation escalationNeedsLoop'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/LPG nonNegativeEscalation='escalation &gt;= 0' escalationNeedsLoop='escalation &gt; 0 implies loop'"
 * @generated
 */
public interface WaveSchedule extends SpawnStrategy {
	/**
	 * Returns the value of the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the waves start over from the first once the last has been cleared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loop</em>' attribute.
	 * @see #setLoop(boolean)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWaveSchedule_Loop()
	 * @model
	 * @generated
	 */
	boolean isLoop();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#isLoop <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' attribute.
	 * @see #isLoop()
	 * @generated
	 */
	void setLoop(boolean value);

	/**
	 * Returns the value of the '<em><b>Escalation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra enemies added to every spawn of a wave each time the waves start over.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Escalation</em>' attribute.
	 * @see #setEscalation(int)
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWaveSchedule_Escalation()
	 * @model
	 * @generated
	 */
	int getEscalation();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.rango.gamemode.WaveSchedule#getEscalation <em>Escalation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escalation</em>' attribute.
	 * @see #getEscalation()
	 * @generated
	 */
	void setEscalation(int value);

	/**
	 * Returns the value of the '<em><b>Waves</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.rango.gamemode.Wave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waves</em>' containment reference list.
	 * @see no.ntnu.tdt4250.rango.gamemode.GamemodePackage#getWaveSchedule_Waves()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Wave> getWaves();

} // WaveSchedule
