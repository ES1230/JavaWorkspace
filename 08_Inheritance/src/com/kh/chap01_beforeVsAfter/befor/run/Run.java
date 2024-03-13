package com.kh.chap01_beforeVsAfter.befor.run;

import com.kh.chap01_beforeVsAfter.befor.model.vo.Desktop;
import com.kh.chap01_beforeVsAfter.befor.model.vo.SmartPhone;
import com.kh.chap01_beforeVsAfter.befor.model.vo.Tv;


public class Run {

	public static void main(String[] args) {
	//데스크탑 객체
		Desktop d = new Desktop("삼성","d-01","삼성데스크탑",1_500_000,true);
		//스마트폰 객체
		SmartPhone sm = new SmartPhone("삼성","s","z플랩",1_400_000,"LG");
		//Tv객체
		Tv t = new Tv("d","d","d",1_400_000,27);
		
		System.out.println(d.information());
		System.out.println(sm.information());
		System.out.println(t.information());
		/*
		 * 매 클래스 마다 중복된 코드들을 일일이 기술해두게되면 수정,추가 ,삭제시 매번 찾아가야함
		 * 수정할때 번거로움
		 *ex)필드명 수정, 새로운 필드가 추가시
		 *
		 * 상속이라는 개념을 적용시켜서 매 클래스마다 "중복된"필드, 메소드들을
		 * 단 한번 또 하나의 클래스(부모클래스)에 정의해둔 뒤,
		 * 해당 클래스를 상속 받아서 부모클래스의 필드와 메소드를 가져다 쓰는 방식으로
		 * 코드의 중복을 피해야한다.
		 *
		 */
}
}
