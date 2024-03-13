package com.kh.chap02_String.controller;

public class A_stringPoolTest {

	public void method1() {
	String str1="Hello"; // String str1=new String("Hello");
	String str2="Hello"; // String str1=new String("world"); => "Hello"는 사라지지 않음
	
	System.out.println(str1==str2); //False 주소값이 다름
	System.out.println(str1);
	System.out.println(str1.toString());
	// String클래스의 toString() 메서드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
	
	System.out.println(str1.equals(str2));
	// String클래스의 equals()메소드의 경우 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되었있음
	
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode()); // 같은 값이 나옴
	// String 클래스의 hashCode()메소드의 경우 주소값 기반이 아닌 실체 담긴 문자열 기반으로 해시코드
	// 값을 반환하도록 오버라이딩 되어있음
	
	// 정말 주소값을 알고 싶을떄 사용하는 메서드 : system.identityHashCode(참조변수);
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
}

// 2.문자열을 리터럴로 생성
	public void method2() {
		
		String str = new String("Hello");
		
		//리터럴 값은 상수풀 (String pool)에 올라감
		String str1 = "hello";
		String str2 = "hello";
		
		//String pool : 동일한 문자열 존재 불가.
		System.out.println(str1 == str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
}
// 불변 클래스
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye"; // 새로운 저장공간
		System.out.println(System.identityHashCode(str));
		
		str += "abc"; // goodbyeabc // goodbyeabc라는 완전 새로운 저장공간
		System.out.println(System.identityHashCode(str));
		
		String str2 = "hello";
		System.out.println(System.identityHashCode(str2));
	}
	/*
	 * 기존의 상수풀의 연결이 끊긴 문자열들은 가비지 콜렉터가 알아서 정리해줌
	 * 불변이라고해서 수정이 아예안되는게 아니라
	 * 기존의 저장공간(원래있던 주소값)에서 수정되는 개념이 아니라 매번
	 * 새로운 주소값을 참조하게 됨
	 * 
	 */


}







