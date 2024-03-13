package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.Circle;
import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		FieldTest1 ft = new FieldTest1();//->global전역변수가 할당
		
		//ft.test(100);//test 메소드 호출시 매개변수로 100값을 전달함(지역변수 num,local생성)
					 // 메소드 종료시 num,local 소멸
		FieldTest2 ft2=new FieldTest2();
		
		//public -> 어디서든 가능
		System.out.println(ft2.pub);
		
		//protected -> 같은 패키지 에서만 접근가능
		//System.out.println(ft2.pro); ----------------안됨
		
		//default = 같은 패키지 안에서만 접근 가능
		//System.out.println(ft2.df); ------------안됨
		
		System.out.println((FieldTest3.num));
		//System.out.println((FieldTest3.test());
		
		FieldTest3.test();
		
		Circle cc = new Circle();
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
		cc.incrementRadius();
		cc.getAreaOfCircle();
		cc.getSizeOfCircle();
	
		
	
	
	
	
	}
}
