package com.kh.practice2.func;

public class CastingPractice2 {
	
	public void castingtest2() {
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A' ;
		
		System.out.println((int)dNum);//2
		System.out.println((int)(fNum * iNum2 - iNum1));//2
		
		System.out.println((double)iNum1); //10
		System.out.println((double)(dNum * iNum2));//10
		
		System.out.println((double)iNum1/iNum2);//2.5
		System.out.println(dNum);//2.5
		
		System.out.println((int)fNum);//3
		System.out.println((int)(iNum1/fNum));//3
		
		System.out.println((float)(iNum1/fNum));//3.3333333;
		System.out.println((double)iNum1/fNum);//3.333333335
	
		System.out.println(ch);//A
		System.out.println((int)ch);//65
		System.out.println(iNum1+(int)ch);//75
		System.out.println((char)(ch+iNum1));//k
		
	}
	

}
