package com.kh.practice.chap02_abstractNinterface.model.vo;

public  class GalaxyNote9 extends SmartPhone implements NotePen{

	
	public GalaxyNote9() {
		super.setMaker("삼성");
	}
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속충전, 고속 무선 충전";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름";
		
	}

	@Override
	public String takeCall() {
		return "수신버튼을 누름";
		
	}

	@Override
	public String picture() {
		return "1200만 듀얼 카메라";
		
	}

	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
		
	}
	public boolean bluetoothPen() {
		return true;
	}
	public String printInformation() {
		
		String result = "갤럭시 노트 9은"+ super.getMaker() +"에서 만들어 졌고 재원은 다음과 같다.\n";
		result += makeCall()+"\n";
		result += takeCall()+"\n";
		result += picture()+"\n";
		result += charge()+"\n";
		result += touch()+"\n";
		result += "블루투스펜 탑재여부 : "+bluetoothPen();;
				
		return result;

	
	}
	
	
}
