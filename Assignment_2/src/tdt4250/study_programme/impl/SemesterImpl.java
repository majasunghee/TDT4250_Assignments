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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.study_programme.GroupedCourses;
import tdt4250.study_programme.Season;
import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Study_programmePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getGroupedCourses <em>Grouped Courses</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link tdt4250.study_programme.impl.SemesterImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

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
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final Season SEASON_EDEFAULT = Season.HØST;

	/**
	 * The cached value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected Season season = SEASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.SEMESTER__YEAR, oldYear, year));
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
	public Season getSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		Season oldSeason = season;
		season = newSeason == null ? SEASON_EDEFAULT : newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Study_programmePackage.SEMESTER__SEASON, oldSeason, season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		// TODO: implement this method to return the 'Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		return getYear() + ". " + getSeason();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case Study_programmePackage.SEMESTER__YEAR:
				return getYear();
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				return getGroupedCourses();
			case Study_programmePackage.SEMESTER__SEASON:
				return getSeason();
			case Study_programmePackage.SEMESTER__NAME:
				return getName();
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
			case Study_programmePackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				getGroupedCourses().clear();
				getGroupedCourses().addAll((Collection<? extends GroupedCourses>)newValue);
				return;
			case Study_programmePackage.SEMESTER__SEASON:
				setSeason((Season)newValue);
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
			case Study_programmePackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				getGroupedCourses().clear();
				return;
			case Study_programmePackage.SEMESTER__SEASON:
				setSeason(SEASON_EDEFAULT);
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
			case Study_programmePackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case Study_programmePackage.SEMESTER__GROUPED_COURSES:
				return groupedCourses != null && !groupedCourses.isEmpty();
			case Study_programmePackage.SEMESTER__SEASON:
				return season != SEASON_EDEFAULT;
			case Study_programmePackage.SEMESTER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
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
		result.append(" (year: ");
		result.append(year);
		result.append(", season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
