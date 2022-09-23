package tdt4250.study_programme.example;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import tdt4250.study_programme.Course;
import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Study_programmeFactory;

public class ManualCodeExample {
	public static void main(String[] args) {
		//Create course instance
		Course course = Study_programmeFactory.eINSTANCE.createCourse();
		course.getName().add("Informatikk prosjektarbeid 1");
		course.setCode("IT1901");
		course.setCredits(7.5f);
		
		//Create course instance
		Course course2 = Study_programmeFactory.eINSTANCE.createCourse();
		course2.getName().add("ITGK");
		course2.setCode("IT1900");
		course2.setCredits(7.5f);
		
		//Create semester instance
		Semester sem = Study_programmeFactory.eINSTANCE.createSemester();
		sem.getCourses().add(course);
		sem.getCourses().add(course2);
		
		//Testing code for validator
		float totalCredits = 0.0f;
		for(Course cour : sem.getCourses()) {
			System.out.println(cour);
			totalCredits += cour.getCredits();
		}
		System.out.println(totalCredits);
		
		
	}
}
