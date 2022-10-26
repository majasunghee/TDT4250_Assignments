/**
 */
package tdt4250.study_programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import tdt4250.study_programme.Course;
import tdt4250.study_programme.ExamType;
import tdt4250.study_programme.Study_programmePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.CourseImpl#getExamType <em>Exam Type</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.CourseImpl#getFullCourseName <em>Full Course Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> name;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getExamType() <em>Exam Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamType()
	 * @generated
	 * @ordered
	 */
	protected static final ExamType EXAM_TYPE_EDEFAULT = ExamType.WRITTEN;

	/**
	 * The cached value of the '{@link #getExamType() <em>Exam Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamType()
	 * @generated
	 * @ordered
	 */
	protected ExamType examType = EXAM_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programmePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeUniqueEList<String>(String.class, this, Study_programmePackage.COURSE__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExamType getExamType() {
		return examType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExamType(ExamType newExamType) {
		ExamType oldExamType = examType;
		examType = newExamType == null ? EXAM_TYPE_EDEFAULT : newExamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.COURSE__EXAM_TYPE, oldExamType, examType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getFullCourseName() {
		// TODO: implement this method to return the 'Full Course Name' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		//throw new UnsupportedOperationException();
		EList<String> fullCourseName = new BasicEList<String>();
		for (String name : getName()) {
			fullCourseName.add(getCode()+ ' '+ name);
		}
		return fullCourseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Study_programmePackage.COURSE__NAME:
				return getName();
			case Study_programmePackage.COURSE__CODE:
				return getCode();
			case Study_programmePackage.COURSE__CREDITS:
				return getCredits();
			case Study_programmePackage.COURSE__EXAM_TYPE:
				return getExamType();
			case Study_programmePackage.COURSE__FULL_COURSE_NAME:
				return getFullCourseName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Study_programmePackage.COURSE__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Study_programmePackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case Study_programmePackage.COURSE__CREDITS:
				setCredits((Float)newValue);
				return;
			case Study_programmePackage.COURSE__EXAM_TYPE:
				setExamType((ExamType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Study_programmePackage.COURSE__NAME:
				getName().clear();
				return;
			case Study_programmePackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case Study_programmePackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case Study_programmePackage.COURSE__EXAM_TYPE:
				setExamType(EXAM_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Study_programmePackage.COURSE__NAME:
				return name != null && !name.isEmpty();
			case Study_programmePackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case Study_programmePackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case Study_programmePackage.COURSE__EXAM_TYPE:
				return examType != EXAM_TYPE_EDEFAULT;
			case Study_programmePackage.COURSE__FULL_COURSE_NAME:
				return !getFullCourseName().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", code: ");
		result.append(code);
		result.append(", credits: ");
		result.append(credits);
		result.append(", examType: ");
		result.append(examType);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
