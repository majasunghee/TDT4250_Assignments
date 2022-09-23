/**
 */
package tdt4250.study_programme.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.study_programme.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.study_programme.Study_programmePackage
 * @generated
 */
public class Study_programmeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Study_programmeValidator INSTANCE = new Study_programmeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.study_programme";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Study_programmeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Study_programmePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Study_programmePackage.NTNU:
				return validateNTNU((NTNU)value, diagnostics, context);
			case Study_programmePackage.STUDY_PROGRAMME:
				return validateStudyProgramme((StudyProgramme)value, diagnostics, context);
			case Study_programmePackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case Study_programmePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case Study_programmePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case Study_programmePackage.GROUPED_COURSES:
				return validateGroupedCourses((GroupedCourses)value, diagnostics, context);
			case Study_programmePackage.COURSE_TYPE:
				return validatecourseType((courseType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNTNU(NTNU ntnu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ntnu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyProgramme(StudyProgramme studyProgramme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyProgramme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_needsCredits(semester, diagnostics, context);
		return result;
	}

	
	/**
	 * Validates the needsCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_needsCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		float totalCredits = 0.0f;
		for(Course course : semester.getCourses()) {
			totalCredits += course.getCredits();
		}
		if (totalCredits < 30.0f) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "needsCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupedCourses(GroupedCourses groupedCourses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(groupedCourses, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(groupedCourses, diagnostics, context);
		if (result || diagnostics != null) result &= validateGroupedCourses_mustContainACourse(groupedCourses, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mustContainACourse constraint of '<em>Grouped Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GROUPED_COURSES__MUST_CONTAIN_ACOURSE__EEXPRESSION = "self.courses -> size() > 0";

	/**
	 * Validates the mustContainACourse constraint of '<em>Grouped Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupedCourses_mustContainACourse(GroupedCourses groupedCourses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Study_programmePackage.Literals.GROUPED_COURSES,
				 groupedCourses,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "mustContainACourse",
				 GROUPED_COURSES__MUST_CONTAIN_ACOURSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatecourseType(courseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Study_programmeValidator
