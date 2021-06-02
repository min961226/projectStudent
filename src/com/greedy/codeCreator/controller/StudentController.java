package com.greedy.codeCreator.controller;

import java.util.List;
import java.util.Map;

import com.greedy.codeCreator.service.StudentService;
import com.greedy.codeCreator.view.ResultView;

public class StudentController {
	ResultView rv = new ResultView();
	public void insertNewStudent(Map<String, Object> stInfo) {
		
		StudentService studentService = new StudentService();
		boolean isSuccess = studentService.insertNewStudent(stInfo);
		
		
		if(isSuccess) {
			rv.successMessage("insert");
		}else {
			rv.failedMessage("insert");
		}
		
	}

	public void selectAllStudent() {
		List<Map<String,Object>> studentList = new StudentService().selectAllStudent();
		
		rv.displayStudentList(studentList);
		
	}

	public void searchStudent(int studentID) {
		Map<String,Object> student = new StudentService().searchStudentBy(studentID);
		
		if(student != null) {
			rv.displayStudent(student);
		}else {
			rv.displayCantfound();
		}
	}

	public void upDateStudent(int stID, Map<String, Object> stInfo) {
		
		boolean isSuccess = new StudentService().updateStudentInfo(stID,stInfo);
		
		if(isSuccess) {
			rv.successMessage("update");
		}else {
			rv.failedMessage("update");
		}
	}

	public void deleteStudent(int stID) {

		boolean isSuccess = new StudentService().deleteStudent(stID);
		
		
		if(isSuccess) {
			rv.successMessage("delete");
		}else {
			rv.failedMessage("delete");
		}
		
		
	}

}
