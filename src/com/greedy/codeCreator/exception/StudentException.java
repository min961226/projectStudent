package com.greedy.codeCreator.exception;

public class StudentException {

	public void checkGender(String gender) 
			throws GenderException {
		
		if(gender.equals("남자")) {
			System.out.print("남학생");
		}else {
			throw new GenderException("남고이므로 남학생으로 등록하여야합니다.");
		}
		
		System.out.println("으로 등록되었습니다.");
	}
}
