package tdt4250.study_programme.example;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import tdt4250.study_programme.Course;
import tdt4250.study_programme.GroupedCourses;
import tdt4250.study_programme.Season;
import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Study_programmeFactory;

public class ManualCodeExample {
	public static void main(String[] args) {
		//Create course instance
		Course course = Study_programmeFactory.eINSTANCE.createCourse();
		course.getName().add("Informatikk prosjektarbeid 1");
		course.getName().add("Informatics project 1");
		course.setCode("IT1901");
		course.setCredits(7.5f);
		
		//Create course instance
		Course course2 = Study_programmeFactory.eINSTANCE.createCourse();
		course2.getName().add("ITGK");
		course2.setCode("IT1900");
		course2.setCredits(7.5f);
		
		System.out.println(course.getFullCourseName().toString());
		

		//Create semester instance
		GroupedCourses groupedCourses = Study_programmeFactory.eINSTANCE.createGroupedCourses();
		for (Course el : groupedCourses.getCourses()) {
			System.out.println(el.toString());
		}
		
		groupedCourses.getCourses().add(course);
		groupedCourses.getCourses().add(course2);
		
		//System.out.println(groupedCourses.toString());
		for (Course el : groupedCourses.getCourses()) {
			System.out.println(el.toString());
		}
		
		Semester sem = Study_programmeFactory.eINSTANCE.createSemester();
		
		//Season season = Study_programmeFactory.eINSTANCE.createSeason();
		
		sem.getGroupedCourses().add(groupedCourses);
		sem.setYear(1);
		sem.setSeason(Season.VÅR);
		System.out.println(sem.getName());
		
		//Testing code for validator
		float totalCredits = 0.0f;
		float test = 0.0f;
		for(GroupedCourses groupCourse : sem.getGroupedCourses()) {
			for (Course cour : groupCourse.getCourses()) {
				totalCredits += cour.getCredits();
			}
			//totalCredits += groupCourse.getCredits();
			test += totalCredits;
		}
		
		System.out.println(test);
	}
}
