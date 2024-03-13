package com.kh.practice.chap02_abstractNinterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

	public V40() {
		super.setMaker("LG");
	}
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
		
	}
	public String takeCall() {
		return "수신버튼을 누름";
	}
	public String picture() {
		return "1200만 듀얼 카메라";
		
	}
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	public String touch() {
		return "정전식";
	}
	public boolean bluetoothPen() {
		return false;
	}
	public String printInformation() {
		String result = "V40은"+ super.getMaker() +"에서 만들어 졌고 재원은 다음과 같다.\n";
		result += makeCall()+"\n";
		result += takeCall()+"\n";
		result += picture()+"\n";
		result += charge()+"\n";
		result += touch()+"\n";
		result += "블루투스펜 탑재여부 : "+bluetoothPen();;
				
		return result;
	}
}
