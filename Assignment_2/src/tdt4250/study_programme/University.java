/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.University#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link tdt4250.study_programme.University#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_programme.StudyProgramme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getUniversity_Programmes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StudyProgramme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getUniversity_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // University
