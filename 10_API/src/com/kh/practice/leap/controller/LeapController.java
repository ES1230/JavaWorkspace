package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		
		if((year%4==0 && year%100 !=0 )|| year%400==0) {
			return true;
		}else {
			return false;
		}
	}
	public long leapDate(Calendar c) {
		
		
		long num1 = c.getTimeInMillis();
		
		Calendar cal = Calendar.getInstance();
		cal.set(1,0,1,0,0,0);
		
		long num2 = cal.getTimeInMillis();
		
		return (num1+(num2*-1))/1000/60/60/24;
		
				
	}
}
















