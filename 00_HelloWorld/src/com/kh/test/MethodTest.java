package com.kh.test;

public class MethodTest {
	
	
	public void printMethodA() {
		
		System.out.println("프린트 메서트 A 출력중");
		
		printMethodB();
	}
	
	public void printMethodB() {
		
		System.out.println("프린트 메서트 B 출력중");
		
		printMethodC();
	}
	
	public void printMethodC() {
		
		System.out.println("프린트 메서트 C 출력중");
		
		printMethodA();
	}
	
}
