package com.kh.practice.chap02_abstractNinterface.run;

import com.kh.practice.chap02_abstractNinterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		pc.method();
		
		String [] s = pc.method();
		
		for (int i =0; i<s.length;i++) {
			System.out.println(s[i]);
			System.out.println();
		}
		
	}

}
