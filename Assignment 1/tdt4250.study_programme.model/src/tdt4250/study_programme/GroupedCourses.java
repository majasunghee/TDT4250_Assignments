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
 *   <li>{@link tdt4250.study_programme.GroupedCourses#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.GroupedCourses#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustContainACourse'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL mustContainACourse='self.courses&gt;1'"
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
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses_Name()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.study_programme.courseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tdt4250.study_programme.courseType
	 * @see #setType(courseType)
	 * @see tdt4250.study_programme.Study_programmePackage#getGroupedCourses_Type()
	 * @model required="true"
	 * @generated
	 */
	courseType getType();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.GroupedCourses#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tdt4250.study_programme.courseType
	 * @see #getType()
	 * @generated
	 */
	void setType(courseType value);

} // GroupedCourses
