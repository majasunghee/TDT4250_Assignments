package tdt4250.study_programme.example;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import tdt4250.study_programme.Course;
import tdt4250.study_programme.Study_programmeFactory;

public class ManualCodeExample {
	public static void main(String[] args) {
		Course course = Study_programmeFactory.eINSTANCE.createCourse();
		EList<String> name = new BasicEList<String>();
		name.add("Informatikk prosjektarbeid 1");
		name.add("Parallel Computing");
		System.out.println(name);
		
		course.setCode("IT1901");
		System.out.println(course.getCourseID() + course.getName());
	}
}
