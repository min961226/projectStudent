package com.greedy.codeCreator.dao;

import java.util.List;
import java.util.Map;

public class StudentDAO {

	public int insertStudent(Map<String, Object> stInfo) {
		
		int StudentListSize = StudentDataBase.studentList.size();
		StudentDataBase.studentList.add(stInfo);
		
		return StudentDataBase.studentList.size() - StudentListSize;
	}

	public List<Map<String, Object>> selectAllStudent() {
		return StudentDataBase.studentList;
	}
	
	public Map<String, Object> searchStudentBy(int studentID) {
		List<Map<String, Object>> studentList = StudentDataBase.studentList;
		
		Map<String, Object> selectedID = null;							
		for(int i = 0; i<studentList.size();i++) {
			if((Integer)(studentList.get(i).get("id")) == studentID) {
				selectedID = studentList.get(i);
			}
		}
		return selectedID;
	}

	public int updateStudentInfo(int stID, Map<String, Object> stInfo) {
		List<Map<String,Object>> studentList = StudentDataBase.studentList;
		
		int result = 0;
		for(int i = 0 ; i < studentList.size(); i++) {
			if(((Integer)studentList.get(i).get("id")) == stID) {
				studentList.set(i, stInfo);
				result++;
			}
		}
		return result;
	}

	public int deleteStudent(int stID) {
		
		List<Map<String,Object>> studentList = StudentDataBase.studentList;
		
		int result = 0;
		for(int i = 0 ; i < studentList.size(); i++) {
			if(((Integer)studentList.get(i).get("id")) == stID) {
				studentList.remove(i);
				result++;
			}
		}
		
		return result;
	}

}
