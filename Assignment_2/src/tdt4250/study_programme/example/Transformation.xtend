package tdt4250.study_programme.example

import tdt4250.study_programme.Study_programmePackage
import tdt4250.study_programme.Study_programmeFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import tdt4250.study_programme.University
import tdt4250.study_programme.Course
import tdt4250.study_programme.ExamType
import tdt4250.study_programme.StudyProgramme
import tdt4250.study_programme.Specialization
import tdt4250.study_programme.GroupedCourses

class Transformation {
	extension static Study_programmeFactory factory = Study_programmeFactory.eINSTANCE
	
	def static void main(String[] args) {
		val rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(Study_programmePackage.eNS_URI, Study_programmePackage.eINSTANCE)
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		
		//val srcFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/model/"
		//val dstFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/src/tdt4250/study_programme/transformed/"
		
		val srcFolder = "D:/ProgramDesignRepo/tdt4250-mj_ph/Assignment_2/model/"
		val dstFolder = "D:/ProgramDesignRepo/tdt4250-mj_ph/Assignment_2/src/tdt4250/study_programme/transformed/"
													
		val resNTNU = rs.createResource(URI.createFileURI(srcFolder + "NTNU.xmi"))
		resNTNU.load(null)
		val uniNTNU = resNTNU.contents.get(0) as University
						
		//Transformation 1
		val resource1 = rs.createResource(URI.createFileURI(dstFolder + "NTNU-new-course.xmi"))

		//val project = examType.PROJECT
		val visuellFormidling = createCourse => [
			code = "TPD4114"
			credits = {7.5f}
			name.add("formidling")
			examType = ExamType.PROJECT
		]
		
		val newCourse = uniNTNU.addCourse(visuellFormidling)
		resource1.contents += newCourse
		resource1.save(null)		
		
		//Transformation 2
		val resource2 = rs.createResource(URI.createFileURI(dstFolder + "NTNU-change-course.xmi"))
		resource2.contents += uniNTNU.changeExamtypeInCourse("TDT4250", ExamType.ORAL)
		resource2.save(null)
		
		//Transformation 3
		val resource3 = rs.createResource(URI.createFileURI(dstFolder + "NTNU-show-select-group-course.xmi"))
		resource3.contents += uniNTNU.showAllElectiveCourses("Informatikk-Master", "Interaksjonsdesign")
		resource3.save(null)
		}
		
		def static addCourse(University uni, Course course){
			uni.courses.add(course)
			uni
		}
		
		def static changeExamtypeInCourse(University uni, String courseCode, ExamType type){
			val course = uni.courses.filter[code == courseCode].head as Course
			course.examType = type
			course
		}		
		
		def static showAllElectiveCourses(University uni, String programme, String spec){
			try{
			val list = uni.programmes.filter[
				name.contains(programme)
			].head.specializations.filter[
				name.contains(spec)
			].head.semesters.flatMap[
				groupedCourses
			].filter[type.toString=="Elective"].toList.flatMap[
				courses
			] as Course[]

			
			list
			}catch(IllegalArgumentException e){
				
			}
			
		}
		
		}
