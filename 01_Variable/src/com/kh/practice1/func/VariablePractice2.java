package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
 
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 :");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 정수: ");
		int n2 = sc.nextInt();
		
		System.out.print("더하기 결과 : ");
		int hap = (n1+n2);
		System.out.println(hap);
		
		System.out.print("빼기 결과 : ");
		int bb = (n1-n2);
		System.out.println(bb);
		
		System.out.print("곱하기 결과 : ");
		int gop = (n1*n2);
		System.out.println(gop);
		
		System.out.print("나누기 결과 : ");
		int na = (n1/n2);
		System.out.println(na);
		
		
	}
}
