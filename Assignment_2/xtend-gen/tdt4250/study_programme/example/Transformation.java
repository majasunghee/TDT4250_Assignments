package tdt4250.study_programme.example;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import tdt4250.study_programme.Course;
import tdt4250.study_programme.ExamType;
import tdt4250.study_programme.GroupedCourses;
import tdt4250.study_programme.Semester;
import tdt4250.study_programme.Specialization;
import tdt4250.study_programme.StudyProgramme;
import tdt4250.study_programme.Study_programmeFactory;
import tdt4250.study_programme.Study_programmePackage;
import tdt4250.study_programme.University;

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
      Course _createCourse = Transformation.factory.createCourse();
      final Procedure1<Course> _function = new Procedure1<Course>() {
        public void apply(final Course it) {
          it.setCode("TPD4114");
          it.setCredits(7.5f);
          it.getName().add("formidling");
          it.setExamType(ExamType.PROJECT);
        }
      };
      final Course visuellFormidling = ObjectExtensions.<Course>operator_doubleArrow(_createCourse, _function);
      final University newCourse = Transformation.addCourse(uniNTNU, visuellFormidling);
      EList<EObject> _contents = resource1.getContents();
      _contents.add(newCourse);
      resource1.save(null);
      final Resource resource2 = rs.createResource(URI.createFileURI((dstFolder + "NTNU-change-course.xmi")));
      EList<EObject> _contents_1 = resource2.getContents();
      Course _changeExamtypeInCourse = Transformation.changeExamtypeInCourse(uniNTNU, "TDT4250", ExamType.PROJECT);
      _contents_1.add(_changeExamtypeInCourse);
      resource2.save(null);
      final Resource resource3 = rs.createResource(URI.createFileURI((dstFolder + "NTNU-show-select-group-course.xmi")));
      final University filterModel = Transformation.showAllElectiveCourses(uniNTNU, "Informatikk-Master", "Databaser og Sok");
      boolean _notEquals = (!Objects.equal(filterModel, null));
      if (_notEquals) {
        EList<EObject> _contents_2 = resource3.getContents();
        _contents_2.add(filterModel);
      }
      resource3.save(null);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public static University addCourse(final University uni, final Course course) {
    University _xblockexpression = null;
    {
      uni.getCourses().add(course);
      InputOutput.<String>println("run");
      _xblockexpression = uni;
    }
    return _xblockexpression;
  }

  public static Course changeExamtypeInCourse(final University uni, final String courseCode, final ExamType type) {
    Course _xblockexpression = null;
    {
      final Function1<Course, Boolean> _function = new Function1<Course, Boolean>() {
        public Boolean apply(final Course it) {
          String _code = it.getCode();
          return Boolean.valueOf(Objects.equal(_code, courseCode));
        }
      };
      Course _head = IterableExtensions.<Course>head(IterableExtensions.<Course>filter(uni.getCourses(), _function));
      final Course course = ((Course) _head);
      course.setExamType(type);
      InputOutput.<String>println("run2");
      _xblockexpression = course;
    }
    return _xblockexpression;
  }

  public static University showAllElectiveCourses(final University uni, final String programme, final String spec) {
    University _xblockexpression = null;
    {
      final Function1<StudyProgramme, Boolean> _function = new Function1<StudyProgramme, Boolean>() {
        public Boolean apply(final StudyProgramme it) {
          return Boolean.valueOf(it.getName().contains(programme));
        }
      };
      final Function1<Specialization, Boolean> _function_1 = new Function1<Specialization, Boolean>() {
        public Boolean apply(final Specialization it) {
          return Boolean.valueOf(it.getName().contains(spec));
        }
      };
      final Function1<Semester, EList<GroupedCourses>> _function_2 = new Function1<Semester, EList<GroupedCourses>>() {
        public EList<GroupedCourses> apply(final Semester it) {
          return it.getGroupedCourses();
        }
      };
      final Function1<GroupedCourses, Boolean> _function_3 = new Function1<GroupedCourses, Boolean>() {
        public Boolean apply(final GroupedCourses it) {
          String _string = it.getType().toString();
          return Boolean.valueOf(Objects.equal(_string, "Elective"));
        }
      };
      IterableExtensions.<GroupedCourses>toList(IterableExtensions.<GroupedCourses>filter(IterableExtensions.<Semester, GroupedCourses>flatMap(IterableExtensions.<Specialization>head(IterableExtensions.<Specialization>filter(IterableExtensions.<StudyProgramme>head(IterableExtensions.<StudyProgramme>filter(uni.getProgrammes(), _function)).getSpecializations(), _function_1)).getSemesters(), _function_2), _function_3));
      InputOutput.<String>println("run3");
      _xblockexpression = uni;
    }
    return _xblockexpression;
  }
}
