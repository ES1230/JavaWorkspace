package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * 메소드
	 * [표현법]
	 * 접근제한자 [예약어] 반환할 값의 자료형 메소드명([매개변수]){
	 * 		수행할코드
	 * 
	 * 		return 반환할 값; (반환형이 void일 경우 생략 가능)
	 * }
	 * 
	 * 한번 정의하면 내가 원하는만큼 호출해서 재사용할 수 있따.
	 * 
	 */
	
	//1. 매개변수가 없고 반환값도 없는 메소드.
	public void method1(){
		System.out.println("매개변수와 반환값이 둘다 없는 메소드");
		//return; // jvm 이 자동으로 생성해줌
		
	}
	//2. 매개변수가 없고, 반환값은 있는 메소드
	public int method2() {
		System.out.println("매개변수가 없고 반환값은 있는 메서드");
		
		return 1;
	}
	//3. 매개변수가 있고, 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고 반환값은 없는 메서드");
		//num1과 num2값을 비교하여 결과을 출력하는 메서드
		//더 큰값 :xx
		//더 작은값 : xx
		
		int min = num1;
		int max = num2;
		if (num1>num2) {
			min = num2;
			max = num1;
		}
		System.out.println("큰 값 : "+max);
		System.out.println("작은 값 : "+min);
	}
	//4.매개변수가 있고 , 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("매개변수가 있고 반환값도 있는 메소드");
		return a*b;
	}
}
