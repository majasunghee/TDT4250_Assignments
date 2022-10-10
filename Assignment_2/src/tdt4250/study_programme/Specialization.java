/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSpecialization_Name()
	 * @model required="true" upper="2"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_programme.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSpecialization_Semesters()
	 * @model containment="true" lower="4" upper="6"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialization
