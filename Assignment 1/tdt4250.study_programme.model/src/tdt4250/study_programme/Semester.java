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
 *   <li>{@link tdt4250.study_programme.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getGroupedCourses <em>Grouped Courses</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link tdt4250.study_programme.Semester#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Name()
	 * @model id="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Grouped Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.study_programme.GroupedCourses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Courses</em>' containment reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_GroupedCourses()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<GroupedCourses> getGroupedCourses();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_programme.Season}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_programme.Season
	 * @see #setSeason(Season)
	 * @see tdt4250.study_programme.Study_programmePackage#getSemester_Season()
	 * @model required="true"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.Semester#getSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see tdt4250.study_programme.Season
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

} // Semester
