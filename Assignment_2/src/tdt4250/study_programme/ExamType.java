/**
 */
package tdt4250.study_programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exam Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tdt4250.study_programme.Study_programmePackage#getExamType()
 * @model
 * @generated
 */
public enum ExamType implements Enumerator {
	/**
	 * The '<em><b>Written</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_VALUE
	 * @generated
	 * @ordered
	 */
	WRITTEN(0, "Written", "Written"),

	/**
	 * The '<em><b>Project</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PROJECT(1, "Project", "Project"),

	/**
	 * The '<em><b>Oral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORAL(2, "Oral", "Oral");

	/**
	 * The '<em><b>Written</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN
	 * @model name="Written"
	 * @generated
	 * @ordered
	 */
	public static final int WRITTEN_VALUE = 0;

	/**
	 * The '<em><b>Project</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROJECT
	 * @model name="Project"
	 * @generated
	 * @ordered
	 */
	public static final int PROJECT_VALUE = 1;

	/**
	 * The '<em><b>Oral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL
	 * @model name="Oral"
	 * @generated
	 * @ordered
	 */
	public static final int ORAL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Exam Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExamType[] VALUES_ARRAY =
		new ExamType[] {
			WRITTEN,
			PROJECT,
			ORAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Exam Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExamType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exam Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExamType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExamType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exam Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExamType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExamType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exam Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ExamType get(int value) {
		switch (value) {
			case WRITTEN_VALUE: return WRITTEN;
			case PROJECT_VALUE: return PROJECT;
			case ORAL_VALUE: return ORAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ExamType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ExamType
