package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		
		
		while(true) {
		System.out.println("***** My Note *****");
		
		System.out.println("1.노트새로만들기 ");
		System.out.println("2.노트열기 ");
		System.out.println("3.노트 열어서 수정 ");
		System.out.println("9.끝내기 ");
		System.out.println("메뉴번호 :  ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		case 1 : fileSave();break;
		case 2 : fileOpen();break;
		case 3 : fileEdit();break;
		case 9 : System.out.println("프로그램 종료 "); return;
		default : System.out.println("잘못 입력 다시 입력");
		}
		
		}
	}
	public void fileSave() {
		StringBuilder sb = new StringBuilder();//while 내부로 가면 값이 변함 외부에 있어야함
		
		while(true) {
		System.out.println("파일에 저장할 내용을 입력하세요");
		System.out.println("ex끝it 이라고 입력하면 종료 됩니다.");
		System.out.print("내용 : ");
		String s = sc.nextLine();
		
		if(s.equals("ex끝it")) {
			break;
		}
		sb.append(s+"\n");//exit뒤에 있어야 실행 안되고 끝남
		
			
		}
		while(true) {
		System.out.println("저장할 파일병 입력해주세요(ex.myFile.txt) :");
		String fileName = sc.nextLine();
		
		if(fc.checkName(fileName)) {
			System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까 y/n");
			char ch =  sc.nextLine().toLowerCase().charAt(0);
			
			if(ch == 'y') {
				fc.fileSave(fileName, sb);
				break;
			}
			
		}else {
			fc.fileSave(fileName, sb);
			break;
		}
		}
		
		
		
	}
	public void fileOpen() {
		
		System.out.println("열 파일 명 : ");
		String fn = sc.nextLine();
		
		if(fc.checkName(fn)){
			System.out.println(fc.fileOpen(fn));
		}else { 
			System.out.println("없는 파일");
		}
		
	}
	public void fileEdit() {
		
		
		
		System.out.println("수정할 파일명 : ");
		String fn = sc.nextLine();
		
		
		
		
		
		if(fc.checkName(fn)) {
			StringBuilder sb = new StringBuilder();
			while(true) {
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 이라고 입력하면 종료 됩니다.");
				System.out.print("내용 : ");
				String s = sc.nextLine();
				
				if(s.equals("ex끝it")) {
					break;
				}
				sb.append(s+"\n");
		
			
		}
			fc.fileEdit(fn, sb);
		}else { 
			System.out.println("없는파일입니다.");
		}
		
		
	}
	}


