/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouped Courses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.GroupedCourses#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.study_programme.GroupedCourses#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustContainACourse'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 mustContainACourse='self.courses -&gt; size() &gt; 0'"
 * @generated
 */
public interface GroupedCourses extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.study_programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses_Courses()
	 * @model required="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_programme.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tdt4250.study_programme.CourseType
	 * @see #setType(CourseType)
	 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses_Type()
	 * @model required="true"
	 * @generated
	 */
	CourseType getType();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.GroupedCourses#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tdt4250.study_programme.CourseType
	 * @see #getType()
	 * @generated
	 */
	void setType(CourseType value);

} // GroupedCourses
