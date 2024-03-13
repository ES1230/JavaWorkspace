package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void test4() {
		
		Scanner sc = new Scanner(System.in);		
				
		System.out.print("문자열을 입력하세요 : ");
		String a = sc.nextLine();

		
		//System.out.print("첫번째 문자 : ");
		//char na = a.charAt(0);
		//System.out.println(na);
		
		//System.out.print("두번째 문자 : ");
		//char na1 = a.charAt(1);
		//System.out.println(na1);
		
		//System.out.print("세번째 문자 : ");
		//char na2 = a.charAt(2);
		//System.out.println(na2);
		
		System.out.println("첫번째문자 : "+ a.charAt(0));
		System.out.println("드번째문자 : "+ a.charAt(1));
		System.out.println("세번째문자 : "+ a.charAt(2));
	}

}
