# Comments for assignment 1

- The class NTNU should be named University or something like that. NTNU is an instance of that concept.
- There is some confusion with containments:
    - Is the Semester contained in the StudyProgramme or in the Specialization? 
    - The Specialization contains Semesters and the Semester in turn contains Specializations, and so on. With the current model you can have an infinite nesting of these two concepts, which is probably not what you meant.
- Check the multiplicity of attributes and relations. For example, why do the name of StudyProgramme and GroupedCourses have multiplicity 1..*?
- What is the difference between the code and courseID properties of a Course?
- You should represent the information at conceptual level, and not its visual representation. Typically, String should be avoided when possible. For example:
     - examType should not be represented as a String, but rather as an enum
     - a semester does not have a name, but rather a number and possibly an enum that specifies if it is summer or autumn. The name can then be a derived property.
- You should properly set the multiplicity of attributes. For example, if the GroupedCourses must contain a course, then the multiplicity of the course relation should be 1..*