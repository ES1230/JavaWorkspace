package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	LeapController lc = new LeapController();
	public LeapView() {
		 Calendar c = Calendar.getInstance();
		if(lc.isLeapYear(c.get(Calendar.YEAR))==true) {	
		 System.out.println(c.get(Calendar.YEAR)+"윤년.");
	}else { 
		System.out.println(c.get(Calendar.YEAR)+" 평년");
	}
		
		System.out.println("총 날짜  : " + lc.leapDate(c));
}
}

