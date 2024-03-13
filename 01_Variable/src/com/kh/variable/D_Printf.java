package com.kh.variable;

public class D_Printf {
	
	/*
	 * System.out.println("출력하고자하는값") => 값을 출력 + 줄바꿈
	 * System.out.print ("출력하고자하는값") => 값을 출력
	 * 
	 * System.out.prinf("출력하고자하는 형식", 값,값,값......);
	 * => f는 format(형식)을 의미
	 * => 형식에 맞춰서 값들이 출력
	 * => 문자열안에 출력하고자하는 값들을 다음과 같은 형식으로 미리 위치를 잡아줘야한다. 
	 * 
	 * 
	 * 형식
	 * %d : 정수
	 * %C : 문자
	 * %f : 실수
	 * %s : 문자열
	 * 
	 * 
	 * */

	public void printftest() {
		
		//정수테스트
		int iNum1 = 10;
		int iNum2 = 20;
		
		//iNum1 : xx, iNum2 : xx를 출력
		//1. println문 사용
		System.out.println("iNum1 :" + iNum1 + ", iNum2 : " +iNum2);
		
		//2.printf 문 사용 => 정수값의 형식인 %d를 사용해서 완성, 줄바꾸기능없어 개행문자 추가
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1 , iNum2);
		
		//10+20 = 30을 출력해보기
		//1.println문 사용
		System.out.println(iNum1 + "+" +iNum2+ "=" +(iNum1+iNum2));
		//2.printf문 사용
		System.out.printf("%d + %d = %d\n", iNum1,iNum2, iNum1+iNum2);
		
		System.out.printf("%5d \n", iNum1);//%5d : 5칸의 공간중 오른쪽정렬
		System.out.printf("%-5d \n", iNum1);// %-5ㅇ : 5칸의 공간중 왼쪽정렬
		
		//실수테스트
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n", 10.0);
		//%f : 소숫점 아래 7번째 줄에서 반올림되어 소수점 아래 6번째까지만 출력 (기본값)
		System.out.printf("dNum : %.1f \n", dNum);
		//%.1f : 소수점아래 2번째에서 반올림하여 소수점아래 1번까지만 출력하라
		// . 자릿수로 소수점 제어가 가능하다
		
		
		//printf : 포맷한번으로 가독성좋게 출력이 가능
		//단 지정한 포맷의 개수와 종류 , 뒤에오는 변수의 갯수 종류가 정확하게 일치해야함
		
		
		
		//문자와 문자열테스트
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s \n", ch, str);
		System.out.printf("%C %S %% \n", ch, str);//ctrl+shift + x/y =>대문자 소문자 변환
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
	
}
