package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	
	private Scanner sc = new Scanner(System.in);
	private	BookController bc = new BookController();
	private Book[] bArr;
	
	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
		
	}
	public void mainMenu() {
		while(true) {
		System.out.println("1.도서 추가 저장");
		System.out.println("2.저장 도서 출력");
		System.out.println("9.프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : fileSave();break;
		case 2 : fileRead();break;
		case 9 : System.out.println("프로그램 종료");return;
		default : System.out.println("잘못 입력 다시 입력");
		
		}
		}
		
	}
	public void fileSave() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("출판날짜 (yyyy-mm-dd) : ");
		String  date = sc.nextLine();
		
		sc.nextLine();
		System.out.print("할인율 : ");
		double discount = sc.nextDouble();
		
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		String[] calendar = date.split("-");
			
		Calendar cal = Calendar.getInstance();
//		cal.set (Calendar.YEAR,Integer.parseInt(calendar[0]));
//		cal.set (Calendar.MONTH,Integer.parseInt(calendar[1])-1);
//		cal.set (Calendar.DATE,Integer.parseInt(calendar[2]));
		cal.set(Integer.parseInt(calendar[0]),Integer.parseInt(calendar[1]) ,Integer.parseInt(calendar[2]));
		
		for(int i=0; i<bArr.length;i++) {
			if(bArr[i] == null)
			bArr[i] =new Book(title, author, price, cal, discount);
			break;
		}
		bc.fileSave(bArr);
	
	}
	public void fileRead() {

		Book[] bk = bc.fileRead();
		for(Book book : bk) {
			if(book !=null)
			System.out.println(book);
		}
	}
}
