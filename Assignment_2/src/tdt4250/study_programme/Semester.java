/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.Semester#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getGroupedCourses <em>Grouped Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Name()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference.
	 * @see #setSpecializations(Specialization)
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Specializations()
	 * @model containment="true"
	 * @generated
	 */
	Specialization getSpecializations();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.Semester#getSpecializations <em>Specializations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializations</em>' containment reference.
	 * @see #getSpecializations()
	 * @generated
	 */
	void setSpecializations(Specialization value);

	/**
	 * Returns the value of the '<em><b>Grouped Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_programme.GroupedCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Courses</em>' containment reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_GroupedCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroupedCourses> getGroupedCourses();

} // Semester
