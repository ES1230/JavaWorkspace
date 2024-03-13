package com.kh.chap01_beforeVsAfter.befor.model.vo;

public class SmartPhone {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgenct;
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgenct) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgenct = mobileAgenct;
	}
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
	public String getMobileAgenct() {
		return mobileAgenct;
	}
	public void setMobileAgenct(String mobileAgenct) {
		this.mobileAgenct = mobileAgenct;
	}
	public String information() {
		return brand+ pCode+pName+price+mobileAgenct;
	}
	
}
