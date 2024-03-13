package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	
	private Member mem = null;	
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}

	
	public void insertMember(Member mem) {
//		전달받은 mem 주소값을 통해
//		LibraryController의 mem에 대입
		this.mem = mem;
	}
	
	public Member myInfo() {
		//회원 레퍼런스(mem) 주소값 리턴
		return mem;
	}
	
	public Book[] selectAll() {
		// 도서 목록 레퍼런스(bList) 주소 값 리턴
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] bList = new Book[5];
		//null null null null null
		//객체  null 객체  객체  null
		int count = 0;
		for(int i =0; i < bList.length; i++) {
			if(this.bList[i].getTitle().contains(keyword)) {
				bList[count++] = this.bList[i];
			}
		}
		return bList;
		// 2)
		// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
		// keyword.equals("a") / contains() 포함 "문자열".contains("비교문자열")
		// 문자열 내부에서 비교문자열과 비교를 했을때 비교문자열이 포함되어있다면 true / false 반환
		// 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
		// 검색결과의 도서목록에 담기 → HINT : count 이용
		// 해당 검색결과의 도서목록 주소 값 리턴
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book bk = bList[index];
		if(bk instanceof AniBook) {
			int memberAge = mem.getAge();
			
			int accessAge = ((AniBook) bk).getAccessAge();
			
			if(memberAge < accessAge) {
				result = 1;
			}
		}else if(bk instanceof CookBook){
			
			boolean coupon = ((CookBook) bk).isCoupon();
			if(coupon) {
				mem.setCouponCount( mem.getCouponCount() + 1  );
				result = 2;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
