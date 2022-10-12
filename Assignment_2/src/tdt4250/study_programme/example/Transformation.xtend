package tdt4250.study_programme.example

import tdt4250.study_programme.Study_programmePackage
import tdt4250.study_programme.Study_programmeFactory
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import tdt4250.study_programme.University
import tdt4250.study_programme.Course
import tdt4250.study_programme.examType


class Transformation {
	extension static Study_programmeFactory factory = Study_programmeFactory.eINSTANCE
	
	def static void main(String[] args) {
		val rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(Study_programmePackage.eNS_URI, Study_programmePackage.eINSTANCE)
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())
		
		val srcFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/model/"
		val dstFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/src/tdt4250/study_programme/transformed/"
															
		
		val resNTNU = rs.createResource(URI.createFileURI(srcFolder + "NTNU.xmi"))
		resNTNU.load(null)
		val uniNTNU = resNTNU.contents.get(0) as University
						
		val resource1 = rs.createResource(URI.createFileURI(dstFolder + "NTNU-new-course.xmi"))

		val project = examType.PROJECT

		val visuellFormidling = createCourse => [
			code = "TPD4114"
			credits = {7.5f}
			name.add("formidling")
			examType.add(project)
		]
		
		val newCourse = uniNTNU.addCourse(visuellFormidling)
		resource1.contents += newCourse
		resource1.save(null)		
		}
		
		def static addCourse(University uni, Course course){
			println("running")
			uni.courses.add(course)
			uni
		}
		
		}
//		val generateCopy = uniNTNU.copyUni
//		resource1.contents += generateCopy
//		resource1.save(null)
//		}
//	
//		def static copyUni(University uni) {
//			
//			val uniCopy = EcoreUtil.copy(uni)		
//			println("running")			
//			//println(src)
//			uniCopy;
//		}