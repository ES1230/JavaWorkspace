package com.kh.chap01_beforeVsAfter.after.model.vo;

public class Product {
	
	//세 클래스 모두 공통적으로 기술되어 있었던 요소들만 추출해서 정의해둔 클래스
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		
	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	//세 클래스에 공통적으로 들어감

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		return brand+ pCode+pName+price;
	}
}
