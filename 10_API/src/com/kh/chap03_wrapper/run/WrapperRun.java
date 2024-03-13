package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
	
		/*
		 * Wrapper클래스
		 * => 기본자료형을 "객체"로 포장해주는 클래스들을 래퍼클래서(Wrapper class)라고 함
		 * 
		 * 기본자료형 <----->Wrapper클래스
		 * boolean         Boolean
		 * char            Character
		 * byte			   Byte
		 * short           Short
		 * int             Integer
		 * long            Long
		 * float           Float
		 * double          Double
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		// 기본자료형 => Wrapper자료형 변환 ( 자동형변환)/Boxing
		Integer i1 = num1;// Integer = int
		Integer i2 = num2;
		
		//System.out.println(num1.equals(num2)); 못 쓴다.
		//기본자료형에서 객체의 메서드를 활용하고 싶을 때 사용.
		System.out.println((i1.equals(i2)));
		System.out.println(i1.hashCode());
		
		System.out.println(i1.compareTo(i2));
		//a.compareTo(b) : a와b를 비교해서 a가 b보다 크면 1을 반환,작으면 -1,같으면 0 반환
		
		//Wrapper 자료형 변수 =>  기본자료형(UnBoxing)
		int num3 = i1;
		int num4 = i2;
		
		//System.out.println(num3.compareTo(num4));못씀
		
		//기본자료형 < ---> String
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1+str2);
	
		//1. String --->기본자료형--->파싱한다.많이쓴다.
		//  바꿀자료형의 Wrapper클래스.parseXXX(변환할 문자열)
		
		int i = Integer.parseInt(str1);//"10" -> 10
		double d = Double.parseDouble(str2);
		System.out.println(i);
		System.out.println(d);
	
		//2. 기본자료형 -----> String
		//		10			"10"
		//		15.3		"15.3"
		
		String strI = i + "";
		String strI2 = String.valueOf(i);
		String strI3 = Integer.valueOf(i).toString();//i1.toString();
		
		String strD = String.valueOf(d);
		
		System.out.println(strI);
		System.out.println(strI2);
		System.out.println(strI3);
		System.out.println(strD);
	}

}
