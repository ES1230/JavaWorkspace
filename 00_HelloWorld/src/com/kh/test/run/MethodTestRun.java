package com.kh.test.run;

import com.kh.test.MethodTest;

public class MethodTestRun {
	
	public static void main(String[] args) {
		//MethodTest 내부에 있는 printMethodA 호출해보기
		//1. 사용하고자 하는 클래스 임포트 및 생성
		MethodTest mt = new MethodTest();
		
		//2. 생성한 클래스 "내부"에 접근하여 printMethodA()함수 호출
		mt.printMethodA();
		
	}
	
}
