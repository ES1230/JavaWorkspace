package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run {
public static void main(String[] args) {
	Product p = new Product();
	p.setpName("갤럭시");
	p.setPrice(60000);
	p.setBrand("삼성");
	
	Product p2 = new Product();
	p2.setpName("갤럭시2");
	p2.setPrice(70000);
	p2.setBrand("삼성");
	
	p.information();
	p2.information();
}
}
