package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.modil.vo.Book;

public class ObjectArrayRun {
	
	public static void main(String[] args) {
		
		//int [] arr = new int [3];
		Book [] arr = new Book[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("제목");
			String title = sc.nextLine();
			System.out.println("저자");
			String author = sc.nextLine();
			System.out.println("가격");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("출판사");
			String publisher= sc.nextLine();
			arr[i]=new Book(title,author,price,publisher);
				
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		//사용자에게 검색할 도서 제목을 입력받아 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을
		//알려주는 메소드
		
		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		for(int i= 0; i<arr.length;i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				System.out.println(arr[i].getPrice());
			}
		}
		//만약 일치하는 도서를 찾지 못한 경우 "검색된 도서가 없습니다." 출력
		
		int count =0;
		for(int i= 0; i<arr.length;i++) {
			if(arr[i].getTitle().equals(searchTitle)) {
				count++;
				System.out.println(arr[i].getPrice());
				break;
			}
			
		}
		if(count == 0) {System.out.println("검색한 도서가 없습니다.");}
		
	
	}}
