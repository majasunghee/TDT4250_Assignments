/**
 */
package tdt4250.study_programme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.study_programme.Study_programmePackage
 * @generated
 */
public interface Study_programmeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Study_programmeFactory eINSTANCE = tdt4250.study_programme.impl.Study_programmeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NTNU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NTNU</em>'.
	 * @generated
	 */
	NTNU createNTNU();

	/**
	 * Returns a new object of class '<em>Study Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Programme</em>'.
	 * @generated
	 */
	StudyProgramme createStudyProgramme();

	/**
	 * Returns a new object of class '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization</em>'.
	 * @generated
	 */
	Specialization createSpecialization();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Grouped Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grouped Courses</em>'.
	 * @generated
	 */
	GroupedCourses createGroupedCourses();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Study_programmePackage getStudy_programmePackage();

} //Study_programmeFactory
