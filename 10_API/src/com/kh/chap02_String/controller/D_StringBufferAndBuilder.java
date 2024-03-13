package com.kh.chap02_String.controller;


/*
 * String은 불변클래스
 * StringBuffer와 StringBuilder? 가변클래스
 * 
 * 문자열 연산이 빈번하게 일어나는 프로세스 / 알고리즘에서 발생하는 메모리 이슈를 해결하기 위해 나온 클래스
 * 
 * 기본적으로 두개의 클래스는 동일한 메소드를 지니며, 차이점은 동기화 여부.
 * 
 * StringBuffer는 멀티스레드환경에서 유용하며
 * StringBuilder는 싱글스레드환경에서 유용하다.
 * 
 * 
 */
public class D_StringBufferAndBuilder {

	public void method() {
		String str = "hello";//저장공간 그대로 차지하고 있음
		str += "world";//hello world
	
		StringBuffer sb = new StringBuffer("hello");
		sb.append("wolrd,");
		
		StringBuilder sb2 = new StringBuilder("hello");
		sb2.append("world");
		System.out.println(sb);
		System.out.println(sb2);
		System.out.println("sb의 길이는? "+sb.length());
		System.out.println("o의 위치는 ? " + sb.indexOf("o") );
		System.out.println("o의 마지막위치는 ? " + sb.lastIndexOf("o") );
		
		// 인덱스위치의 문자를 없애는 메소드
		// 마지막위치의 문자를 없애고싶다?
		//마지막위치 = > 문자열의 길이-1
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		//내가 원하는 위치의 인덱스부터 내가 정한 마지막 인덱스까지 삭제
		//시작인덱스 < = 인덱스 범위 <  종료인덱스
		System.out.println(sb.delete(3, sb.length()));
		System.out.println("sb : " + sb);
	}
}
