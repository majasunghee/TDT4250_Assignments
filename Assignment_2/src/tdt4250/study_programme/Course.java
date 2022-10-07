/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.study_programme.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.study_programme.Course#getExamType <em>Exam Type</em>}</li>
 *   <li>{@link tdt4250.study_programme.Course#getCourseID <em>Course ID</em>}</li>
 * </ul>
 *
 * @see tdt4250.study_programme.Study_programmePackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute list.
	 * @see tdt4250.study_programme.Study_programmePackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getName();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.study_programme.Study_programmePackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.study_programme.Study_programmePackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.study_programme.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Exam Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam Type</em>' attribute list.
	 * @see tdt4250.study_programme.Study_programmePackage#getCourse_ExamType()
	 * @model
	 * @generated
	 */
	EList<String> getExamType();

	/**
	 * Returns the value of the '<em><b>Course ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course ID</em>' attribute.
	 * @see tdt4250.study_programme.Study_programmePackage#getCourse_CourseID()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCourseID();

} // Course
