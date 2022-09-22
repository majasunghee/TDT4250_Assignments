/**
 */
package tdt4250.study_programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.study_programme.Course;
import tdt4250.study_programme.GroupedCourses;
import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Specialization;
import tdt4250.study_programme.Study_programmePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getGroupedCourses <em>Grouped Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
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
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected Specialization specializations;

	/**
	 * The cached value of the '{@link #getGroupedCourses() <em>Grouped Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<GroupedCourses> groupedCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programmePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeUniqueEList<String>(String.class, this, Study_programmePackage.SEMESTER__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, Study_programmePackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getSpecializations() {
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializations(Specialization newSpecializations, NotificationChain msgs) {
		Specialization oldSpecializations = specializations;
		specializations = newSpecializations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Study_programmePackage.SEMESTER__SPECIALIZATIONS, oldSpecializations, newSpecializations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializations(Specialization newSpecializations) {
		if (newSpecializations != specializations) {
			NotificationChain msgs = null;
			if (specializations != null)
				msgs = ((InternalEObject)specializations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Study_programmePackage.SEMESTER__SPECIALIZATIONS, null, msgs);
			if (newSpecializations != null)
				msgs = ((InternalEObject)newSpecializations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Study_programmePackage.SEMESTER__SPECIALIZATIONS, null, msgs);
			msgs = basicSetSpecializations(newSpecializations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.SEMESTER__SPECIALIZATIONS, newSpecializations, newSpecializations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupedCourses> getGroupedCourses() {
		if (groupedCourses == null) {
			groupedCourses = new EObjectContainmentEList<GroupedCourses>(GroupedCourses.class, this, Study_programmePackage.SEMESTER__GROUPED_COURSES);
		}
		return groupedCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Study_programmePackage.SEMESTER__SPECIALIZATIONS:
				return basicSetSpecializations(null, msgs);
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				return ((InternalEList<?>)getGroupedCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Study_programmePackage.SEMESTER__NAME:
				return getName();
			case Study_programmePackage.SEMESTER__COURSES:
				return getCourses();
			case Study_programmePackage.SEMESTER__SPECIALIZATIONS:
				return getSpecializations();
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				return getGroupedCourses();
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
			case Study_programmePackage.SEMESTER__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Study_programmePackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case Study_programmePackage.SEMESTER__SPECIALIZATIONS:
				setSpecializations((Specialization)newValue);
				return;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				getGroupedCourses().clear();
				getGroupedCourses().addAll((Collection<? extends GroupedCourses>)newValue);
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
			case Study_programmePackage.SEMESTER__NAME:
				getName().clear();
				return;
			case Study_programmePackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case Study_programmePackage.SEMESTER__SPECIALIZATIONS:
				setSpecializations((Specialization)null);
				return;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				getGroupedCourses().clear();
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
			case Study_programmePackage.SEMESTER__NAME:
				return name != null && !name.isEmpty();
			case Study_programmePackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case Study_programmePackage.SEMESTER__SPECIALIZATIONS:
				return specializations != null;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				return groupedCourses != null && !groupedCourses.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
