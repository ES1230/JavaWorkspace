package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class Run {

	
	public static void main(String[] args) {
		
		Book bk = new Book("수학의 정석", "김길동", 15000);
		
		System.out.println(bk);
		
		/*
		 * 출력문 안에 참조형변수(레퍼런스 변수)를 제시해서 출력하고자 할때, 내부적으로
		 * jvm이 자동으로 toString()메소드를 호출한다.
		 * 
		 * 부모클래스인 Object클래스에 있는 toString()
		 * 해당 참조형 풀클래스명 + @+해당객체의 주소값을 출력
		 * 
		 * 자식클래스인 Book클래스에서 toString()메소드를 재정의 할때
		 * 해당 객체의 모든 필드값을 하나의 문자열로 합쳐서 돌려줄 수 있다.
		 *
		 *모든 클래스는 Object클래스의 후손이다. 즉 항상 최상위 클래스는 Object
		 *=>즉 , Object에 잇는 모든 메소드들을 다 가져다 쓸 수가 있따.
		 *  마음에 들지 않으면 재정의가 가능.
		 *  
		 */
		
		
		//메소드 오버라이딩 전 : 
		//com.kh.chap03_override.model.vo.Book@16진수 주소값
		//메소드 오버라이딩 후 :
		//책 제목 : 수학의 정석책 저자 : 김길동책 가격 : 15000

	}

}
