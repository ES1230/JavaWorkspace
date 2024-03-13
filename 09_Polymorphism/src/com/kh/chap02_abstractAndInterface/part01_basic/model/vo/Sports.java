package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {

	private int people;
	
	public Sports(){
		
	}
	public Sports(int people) {
		this.people = people;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "people : " + people;
	}
	/*
	 *몸통부가 존재하지 않는 미완성 메소드 == 추상메소드
	 *몸통부가 없는 미완성메소드를 정의하고자 하면 abstract예약어 사용해야 한다.
	 *
	 *미완성 메소드가 하나라도 현재 클래스에 포함되는 순간, 해당 클래스 또한 미완성 클래스가 되어버린다.
	 *따라서, 클래스명 앞에도 abstract예약어를 적어줘야한다.
	 * 
	 */
	public abstract void rule();

}
