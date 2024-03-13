package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
	
		System.out.println("================학생 =============");
	    Student[] sArr = ssm.printStudent();
		for(int i= 0;i<sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		
		System.out.println("================성적 =============");
		double [] dArr = ssm.avgScore();
		System.out.println("합계"+(int)dArr[0]);
		System.out.println("평균 : "+dArr[1]);
		System.out.println("================성적 결과=============");
		for(int i =0; i<sArr.length;i++) {
			System.out.printf("%s학생은 %s입니다.\n",sArr[i].getName(),
					sArr[i].getScore()<StudentController.CUT_LINE ? "재시험대상":"통과");
	
			
		}
	}

}
