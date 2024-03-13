package com.kh.chap04_field.model.vo;

public class Circle {

	private double PI = 3.14;
	private int radius= 1;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		System.out.println(2*PI*radius);
	}
	public void getSizeOfCircle() {
		System.out.println(PI*radius*radius);
		
	}
	
			
}
