package tdt4250.study_programme.example;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import tdt4250.study_programme.Course;
import tdt4250.study_programme.Study_programmeFactory;
import tdt4250.study_programme.Study_programmePackage;
import tdt4250.study_programme.University;
import tdt4250.study_programme.examType;

@SuppressWarnings("all")
public class Transformation {
  @Extension
  private static Study_programmeFactory factory = Study_programmeFactory.eINSTANCE;

  public static void main(final String[] args) {
    try {
      final ResourceSetImpl rs = new ResourceSetImpl();
      rs.getPackageRegistry().put(Study_programmePackage.eNS_URI, Study_programmePackage.eINSTANCE);
      Map<String, Object> _extensionToFactoryMap = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
      final String srcFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/model/";
      final String dstFolder = "/Users/phajs/Documents/repos/tdt4250-mj_ph/Assignment_2/src/tdt4250/study_programme/transformed/";
      final Resource resNTNU = rs.createResource(URI.createFileURI((srcFolder + "NTNU.xmi")));
      resNTNU.load(null);
      EObject _get = resNTNU.getContents().get(0);
      final University uniNTNU = ((University) _get);
      final Resource resource1 = rs.createResource(URI.createFileURI((dstFolder + "NTNU-new-course.xmi")));
      final examType project = examType.PROJECT;
      Course _createCourse = Transformation.factory.createCourse();
      final Procedure1<Course> _function = new Procedure1<Course>() {
        public void apply(final Course it) {
          it.setCode("TPD4114");
          it.setCredits(7.5f);
          it.getName().add("formidling");
          it.getExamType().add(project);
        }
      };
      final Course visuellFormidling = ObjectExtensions.<Course>operator_doubleArrow(_createCourse, _function);
      final University newCourse = Transformation.addCourse(uniNTNU, visuellFormidling);
      EList<EObject> _contents = resource1.getContents();
      _contents.add(newCourse);
      resource1.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static University addCourse(final University uni, final Course course) {
    University _xblockexpression = null;
    {
      InputOutput.<String>println("running");
      uni.getCourses().add(course);
      _xblockexpression = uni;
    }
    return _xblockexpression;
  }
}
