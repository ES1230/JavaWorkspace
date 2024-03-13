package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	  public void castingtest() {
		 
		  Scanner sc= new Scanner(System.in);
		  
		  System.out.printf("국어 :");
		  float g = sc.nextFloat();
		
		  
		  System.out.printf("영어 :");
		  float e = sc.nextFloat();
		  
		  
		  System.out.printf("수학 :");
		  float m = sc.nextFloat();
		  
		 System.out.println("총점 : " + (int)(g+e+m));
		 System.out.println("평균 : " + (int)(g+e+m)/3);
		 
		  
		 
		  
	  }
}
