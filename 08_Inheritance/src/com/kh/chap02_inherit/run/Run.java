package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;

public class Run {

	public static void main(String[] args) {
	 Car c = new Car("테슬라",12.5,"전기차",4);
	 
	 System.out.println(c.information());
	 
	 c.howToMove();
	 
	 Airplane air = new Airplane("비행기",12.5,"전기차",4,2);
	 
	 System.out.println(air.information());
	 
	 air.howToMove();
	}

}
