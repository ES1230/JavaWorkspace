package com.kh.practice.chap02_abstractNinterface.controller;

import com.kh.practice.chap02_abstractNinterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNinterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNinterface.model.vo.V40;

public class PhoneController {

	private String []  result = new String[2];
	
	public String[] method() {
		
		Phone [] ph = new Phone[2];
		
		ph[0] = new GalaxyNote9();
		ph[1] = new V40();
		
		for(int i = 0;i<ph.length;i++) {
			//result[i] = ((GalaxyNote9)(ph[i])).printInformation();
			//result[i] = ((V40)(ph[i])).printInformation();
			if(ph[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)(ph[i])).printInformation();
				
			}else {
				result[i] = ((V40)(ph[i])).printInformation();
			}
		}
		return result;
	}
}
