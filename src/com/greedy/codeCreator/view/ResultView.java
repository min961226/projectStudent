package com.greedy.codeCreator.view;

import java.util.List;
import java.util.Map;

public class ResultView {

	public void successMessage(String string) {
		switch (string) {
		case "insert":
			System.out.println("학생 정보 등록에 성공하였습니다.");
			break;
		case "update":
			System.out.println("학생 정보 수정에 성공하였습니다.");
			break;
		case "delete":
			System.out.println("학생 정보 삭제에 성공하였습니다.");
			break;
		default:
			break;
		}
		
	}

	public void failedMessage(String string) {
		switch (string) {
		case "insert":
			System.out.println("학생 정보 등록에 실패하였습니다.");
			break;
		case "update":
			System.out.println("학생 정보 수정에 실패하였습니다.");
			break;
		case "delete":
			System.out.println("학생 정보 삭제에 실패하였습니다.");
			break;
		default:
			break;
		}
	}

	public void displayStudentList(List<Map<String, Object>> student) {
		for(Map<String, Object> stList : student) {
			System.out.println(stList);
		}
	}

	public void displayStudent(Map<String, Object> student) {
		System.out.println(student);
	}

	public void displayCantfound() {
		System.out.println("조회 결과가 없습니다.");
	}
	
	

}
