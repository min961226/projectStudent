package com.greedy.codeCreator.view;

import java.awt.Label;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.greedy.codeCreator.controller.StudentController;
import com.greedy.codeCreator.exception.StudentException;
import com.greedy.codeCreator.exception1.StudentException1;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	public void displayMainMenu() {
		StudentController studentController = new StudentController();

		do {
			System.out.println("============= 학생 관리 프로그램 =============");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학번으로 조회");
			System.out.println("4. 학생 정보 수정");
			System.out.println("5. 학생 정보 삭제");
			System.out.println("9. 프로그램 종료");
			System.out.print(">> 번호 입력:");

			int num = sc.nextInt();
			switch (num) {
			case 1:
				studentController.insertNewStudent(inputStudentInfo());
				break;
			case 2:
				studentController.selectAllStudent();
				break;
			case 3:
				studentController.searchStudent(inputStudentID("search"));
				break;
			case 4:
				studentController.upDateStudent(inputStudentID("update"), inputStudentInfo());
				break;
			case 5:
				studentController.deleteStudent(inputStudentID("delete"));
				break;
			case 9:
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				break;
			}

		} while (true);
	}

	private int inputStudentID(String str) {

		switch (str) {
		case "search":
			System.out.print("조회를 위한 학번을 입력하여 주세요 : ");
			break;
		case "update":
			System.out.println("수정을 위한 학번을 입력하여 주세요 : ");
			break;
		case "delete":
			System.out.println("삭제를 위한 학번을 입력하여 주세요 : ");
			break;

		default:
			break;
		}
		int num = sc.nextInt();

		return num;
	}

	private Map<String, Object> inputStudentInfo() {

		StudentException se = new StudentException();
		System.out.print("학번을 입력하여 주세요 :");
		int stId = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력하여 주세요 :");
		String stName = sc.nextLine();
		
		System.out.print("성별을 입력하여 주세요 :");
		String stGender = sc.nextLine();
		try {
				se.checkGender(stGender);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);    										//센세 said
				
			}
		System.out.print("전화번호를 입력하여 주세요 : ");
		String stPhone = sc.nextLine();

		Map<String, Object> student = new HashMap<>();
		student.put("id", stId);
		student.put("name", stName);
		student.put("gender", stGender);
		student.put("phone", stPhone);

		return student;
	}

}
