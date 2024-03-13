package com.kh.practice.charCheck.controller;

import com.kh.exeption.controller.C_CustomException;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {
		
	}
	public int countAlpha(String s) throws CharCheckException { 
		
		
		
		int count = 0;
		for(int i =0; i<s.length();i++) {
			if(('A'<=s.charAt(i) && s.charAt(i)<='Z')||('a'<=s.charAt(i) && s.charAt(i)<='z')) {
				count++;
			
			}
			if(s.charAt(i) == ' ') {
				 throw new CharCheckException("이상한 에러가 발생했습니다.");
			}
			
		}
		return count;
		
		
		
		
	}
	
	
}
