package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];// 클래스명@16진수주소값 null null
	private Employee[] e = new Employee[10];
	// null null null null null null null null..
	
	public int[] personCount() {
		int[] arr = new int[2];
		int count = 0;
		for(int i =0; i<s.length; i++) {
			if(s[i] != null) { //true일시 null이 아닌 주소값을 보관 ==> 즉, 객체가 생성된 상태
				//숫자를 카운팅
				count++;
			}
		}
		arr[0] = count;
		
		count = 0;
		for(int i =0; i<e.length; i++) {
			if(e[i] != null) {
				count++;
			}
		}
		arr[1] = count;
		
		return arr;
	}
	
	public void insertStudent(String name, int age, double height, double weigth, int grade,
			String major) {
			Student student = new Student(name, age, height, weigth, grade, major);
			// 매개변수로 받온 데이터를 / 학생객체배열중 "빈 곳" == null 에 저장하는 메소드
			for(int i = 0 ; i<s.length; i++) { // null null null
				if(s[i] == null) {
					s[i] = student;
					break;
				}
			}	
	}
	
	public Student[] printStudent() {
		// 학생 객체 배열의 주소를 반환하는
		// 메소드
		return s;
	}
	
	public void insertEmployee(String name, int age, double height , double weigth , int salary, 
			String dept) {
		
	}
	
	public Employee[] printEmployee() {
		
	}
	
	
	

}
