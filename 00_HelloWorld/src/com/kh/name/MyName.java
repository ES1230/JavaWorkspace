package com.kh.name; //패키지 선언부
//패키지명 작성시 2단계까지는 도메인의 역순으로 작성을 하고, 
//3단계부터는 프로젝트의 이름이 들어간다.

public class MyName {
	
	/*
	 * 여러줄 주석 
	 * 메인메소드
	 * 자바 애플리케이션, 자바프로그램이 시작되는 시작점 (entry point)
	 * 따라서 하나의 Java애플리케이션에는 1개 이상의 main메소드가 포함된 
	 * 클래스가 반드시 존재해야한다.
	 * */
	
	//public static void main(String[] args) { //메인메서드
	public void callMyName() { // 일반메서드

		// 한줄 주석
		// 콘솔창에 문자열 출력
		System.out.println("안녕하세요. 제 이름은 김종훈입니다.");
	}
}
