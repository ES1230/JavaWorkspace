package com.kh.practice.numRange.view;

import java.nio.charset.CharacterCodingException;
import java.util.Scanner;

import com.kh.practice.charCheck.exception.CharCheckException;
import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		NumberController nc = new NumberController();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수2 : ");
		int num2 = sc.nextInt();
		nc.checkDouble(num1,num2);
		try {
		System.out.printf("%d는 %d의 배수인가? %b",num1,num2,nc.checkDouble(num1,num2));
		}catch(NumRangeException e) {
			
		}
		
	}
	
}
