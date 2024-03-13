package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	double PI = 3.141592653589793;
	Circle c = new Circle();
	
	public String calcArea(int x,int y, int radius) {
	
		return "면적 : " + x + y + radius + "/" + PI*radius*radius;
	}
	public String calcCircum(int x,int y, int radius) {
		c = new Circle(x,y,radius);
		return "둘레"+c.toString() +"/"+ PI*radius*2;
	}
}
