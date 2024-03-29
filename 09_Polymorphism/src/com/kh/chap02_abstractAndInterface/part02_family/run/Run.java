package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		//인터페이스 적용 전
		//Person p = new Person();
	
//		Person p1 = new Mother("우니", 50 , 50 , "출산");
//		Person p2 = new Baby("박상준", 3.5, 60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat();
//		p1.sleep();
//		
//		p2.eat();
//		p2.sleep();
//		
//		System.out.println("====다음날 ===");
//		System.out.println(p1);
//		System.out.println(p2);
		
		//인터페이스 적용 후
		//Basic b1 = new Basic();객체 생성 안됨
		Basic b1 = new Mother("dd" , 44 , 44 , "출산");
		Basic b2 = new Baby("바가",33,55);
		
			System.out.println(b1);
			System.out.println(b2);
		/*
		 *
		 * 클래스에서 클래스를 상속 받을때 : extends클래스(단일 상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스를 구현할때 : implements 인터페이스,인터페이스 (다중 구현가능) : 화살표 점선
		 * 인터페이스에서 인터페이스를 상속 : extends 인터페이스,인터페이스(다중상속가능) : 화살표 실선
		 * 
		 *			| 		추상클래스 			| 		인터페이스
		 *==============================================================
		 *	상속개수	|		단일상속			|  		다중상속
		 *--------------------------------------------------------------
		 *	키워드	|		extends			|		implements
		 *--------------------------------------------------------------
		 *	추상메소드	|	추상메소드0개이상			|		모든메소드가 추상메소드
		 * 표현법/개수	|	명시적abstract기술		|		묵시적으로 abstract기술
		 * -------------------------------------------------------------
		 *  일반메소드	| 		O				|			X
		 *  ------------------------------------------------------------
		 *  필	드	|	일반필드 가질수 있음		|	상수필드만 가질 수 있음(묵시적 static final)
		 *  =============================================================
		 *
		 * 배운 순서
		 * 
		 * extends 일반클래스 -> extends 추상글래스 -> implements 인터페이스
		 * ------------------------------------------------------->
		 * 				뒤로 갈수록 기능구현의 강제성이 더 있음
		 *
		 *
		 *
		 *
		 */
		
	}

}
