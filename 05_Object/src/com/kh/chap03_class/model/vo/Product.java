package com.kh.chap03_class.model.vo;

public class Product {//클래스 선언부
	//클래스 선언 구문에 사용가능한 접근제한자: public,default
	//public으로 선언을 해야 다른 패키지에서 접근이 가능
	//default로 설정한 경우 같은 패키지에서만 접근 가능
	
	//필드부
	// 상품명,상품가경,브랜드
	
	//생성자부
	
	//메서드부 (set/get)+information
	
	private String pName;
	private int price;
	private String brand;
	
	//생성자부
	public Product(){
		
	}
	//메서드부
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	//모든 필드값을 출력해주는 information메서드
	public void information() {
		System.out.println("상품명 : "+pName+", 가격 : "+price+",브랜드 : "+brand);
	}
	
	
	
}
