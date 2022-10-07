/**
 */
package tdt4250.study_programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Specialization;
import tdt4250.study_programme.StudyProgramme;
import tdt4250.study_programme.Study_programmePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.impl.StudyProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.StudyProgrammeImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.StudyProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgrammeImpl extends MinimalEObjectImpl.Container implements StudyProgramme {
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
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Study_programmePackage.Literals.STUDY_PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getName() {
		if (name == null) {
			name = new EDataTypeUniqueEList<String>(String.class, this, Study_programmePackage.STUDY_PROGRAMME__NAME);
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, Study_programmePackage.STUDY_PROGRAMME__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case Study_programmePackage.STUDY_PROGRAMME__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
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
			case Study_programmePackage.STUDY_PROGRAMME__NAME:
				return getName();
			case Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS:
				return getSpecializations();
			case Study_programmePackage.STUDY_PROGRAMME__SEMESTERS:
				return getSemesters();
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
			case Study_programmePackage.STUDY_PROGRAMME__NAME:
				getName().clear();
				getName().addAll((Collection<? extends String>)newValue);
				return;
			case Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case Study_programmePackage.STUDY_PROGRAMME__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
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
			case Study_programmePackage.STUDY_PROGRAMME__NAME:
				getName().clear();
				return;
			case Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case Study_programmePackage.STUDY_PROGRAMME__SEMESTERS:
				getSemesters().clear();
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
			case Study_programmePackage.STUDY_PROGRAMME__NAME:
				return name != null && !name.isEmpty();
			case Study_programmePackage.STUDY_PROGRAMME__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case Study_programmePackage.STUDY_PROGRAMME__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
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

} //StudyProgrammeImpl
