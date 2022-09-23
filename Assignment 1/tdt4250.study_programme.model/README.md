# TDT4250-Assignment 1

## Description of task and domain
The goal of assignment 1 is to get familiar with important aspects of Ecore-modelling and built-in code generation. This encompasses use of classes, datatypes attributes, references, containment references, opposites, manually written constraints, constraints made with OCL, and derived features.

To showcase these aspects we have chosen to model the web page of the Informatics Master study plan at NTNU. On the web page of the study plan the user can choose "kull", which corresponds to the year the student started on their master's degree. This has not been included in the model for assignment 1 as choice of year does not affect the model or logic in any major way. The main difference is that there may be variations in elective subjects between kull. Next, the user must choose their specialization. If specialization has not been chosen (for instance when you first load the web page), no courses will be shown. After choosing a specialization, all mandatory and elective subjects the user can take will be shown for each semester of the master. Mandatory and elective subjects are shown in to different ways: 
- Each semester has a group of courses that are mandatory and a group of courses that are elective.
- Each course has a status code indicating whether or not that course is mandatory or elective (O, M1A, M1B, VA, VB)

For simplicity we have modelled the former.

Although we have modelled a specific instance of the Informatics Master study plan in this assignment, the project can also be used to model instances of 5-year study programmes such as the 5-year Computer Science programme. Simply create new semesters to represent the first 2-3 years on your study programme, and then proceed to create a new specialization to represent the last years of your degree.


## Repo Structure
This is a Ecore-Java project with a structure similar to the course exemples. 

The general overview of the repo consists of:

:file_folder: tdt4250.study_programme.model  <br/>
&nbsp; :file_folder: model  <br/>
&nbsp; &nbsp;  :page_facing_up: NTNU.xmi <br/>
&nbsp; &nbsp;  :page_facing_up: study_programme.ecore  <br/>
&nbsp; &nbsp;  :page_facing_up: study_programme.genmodel  <br/>
&nbsp; :file_folder: src  <br/>
&nbsp; &nbsp; :file_folder: example  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: Example.java  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: ManualCodeExample.java  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: NTNU.xmi  <br/>
&nbsp; &nbsp; :file_folder: impl  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: CourseImpl.java  <br/>
&nbsp; &nbsp; :file_folder: util  <br/>
&nbsp; &nbsp; &nbsp;  :page_facing_up: Study_programmeValidator.java  <br/>


The files that have been changed to implement our model are the following:
- NTNU.xmi is a model instance of the web page that shows the [Informatics Master study plan at NTNU](https://www.ntnu.no/studier/studieplan#programmeCode=MSIT&year=2022&dir=MSIT-DBS-22).
- Example.java has test code to check the generated model.
- ManualCodeExample.java contains test code.
- CourseImpl.java contains java code for derivating course name from name and code.
- Study_programmeValidator has manually written constraints that a semester needs to contain at least 30 credits.


## Ecore model and instances

### NTNU model
This is an instance of a model that represents the study plan for the specialization Databases and Search in the Informatics master. The model contains all the generated courses, specializations, semesters, and grouped courses.



### Specialization model
This model is from the same instance as the NTNU model. It provides a better view of how a specialization is set up.

### Semester model
This model is from the same instance as the NTNU model. It provides a better view of how a semester is set up.

## Authors
Maja Sung Hee Jenssen and Phajsi Halvorsen

