/**
 * 
 */
package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void test1() {
	
	
	Scanner sc = new Scanner(System.in);
	

	System.out.print("이름을 입력하세요");
	String name = sc.next();
	
	sc.nextLine();

	
	System.out.print("성별을 입력하세요");
	char gender = sc.nextLine().charAt(0);
	
	System.out.print("나이을 입력하세요");
	int age = sc.nextInt();
	
	System.out.print("키을 입력하세요");
	double height = sc.nextDouble();
	
	//180.5cm 인 20살 남자 아무개님 반갑습니다.
	System.out.print("키"+height+ "인" +age+"살"+gender+"자" +name+"님 반갑습니다.");
	

}
}
