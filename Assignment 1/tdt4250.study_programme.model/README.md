# TDT4250-Assignment 1

## Description
TBD

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
&nbsp; :page_facing_up:  <br/>


The files that have been changed to implement our model are the following:
- NTNU.xmi is a model instance of the web page that shows the [Informatics Master study plan at NTNU](https://www.ntnu.no/studier/studieplan#programmeCode=MSIT&year=2022&dir=MSIT-DBS-22).
- Example.java has test code to check the generated model.
- ManualCodeExample.java contains test code.
- CourseImpl.java contains java code for derivating course name from name and code.
- Study_programmeValidator has manually written constraints that a semester needs to contain at least 30 credits.


## Domain
We have chosen to model the web page of the Informatics Master study plan at NTNU.


## Ecore model and instances

### NTNU model

### Specialization model

### Semester model

## Authors
Maja Sung Hee Jenssen and Phajsi Halvorsen

