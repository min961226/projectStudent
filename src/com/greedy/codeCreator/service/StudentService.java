package com.greedy.codeCreator.service;

import java.util.List;
import java.util.Map;

import com.greedy.codeCreator.dao.StudentDAO;

public class StudentService {

	public boolean insertNewStudent(Map<String, Object> stInfo) {
		
		StudentDAO studentDAO = new StudentDAO();
		int result = studentDAO.insertStudent(stInfo);
		
		return result > 0 ? true : false;
	}

	public List<Map<String, Object>> selectAllStudent() {

		List<Map<String, Object>> studentList = new StudentDAO().selectAllStudent();
		return studentList;
	}

	public Map<String, Object> searchStudentBy(int studentID) {
		return new StudentDAO().searchStudentBy(studentID);
	}

	public boolean updateStudentInfo(int stID, Map<String, Object> stInfo) {
		
		int result = new StudentDAO().updateStudentInfo(stID,stInfo);
		
		return result > 0 ? true : false;
	}

	public boolean deleteStudent(int stID) {
		int result = new StudentDAO().deleteStudent(stID);
		return result > 0 ? true : false;
	}

	
}
