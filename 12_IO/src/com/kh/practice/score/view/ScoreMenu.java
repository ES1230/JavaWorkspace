package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
	while(true) {
		System.out.println("1.성적저장");
		System.out.println("2.성적출력");
		System.out.println("9.끝내기");
		System.out.print("메뉴 번호 : ");
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1 : saveScore();break;
		case 2 : readScore();break;
		case 9 : System.out.println("프로그램 종료");return;
		default : System.out.println("잘못입력 다시 입력");
		}
	System.out.println();
	}
	
	}
	public void saveScore() {
	
		int num = 0;
		
		while(true) {
		System.out.print((++num)+"번째 학생정보 기록");
		
		System.out.print("이름 : ");
		String name =  sc.nextLine();
		
		System.out.print("국어점수");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.print("영어점수");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.print("수학점수");
		int math = Integer.parseInt(sc.nextLine());
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		
	
		
		scr.saveScore(name, kor, eng, math, sum, avg);
		
		System.out.print("그만입력하시려면 N또는n 입력, 계속하시려면 아무키나 입력하세요");
		char ch= sc.nextLine().toLowerCase().charAt(0);
		
		if(ch == 'n') {
			break;
		}
		
		}
		
	}
	public void readScore() {
		int count =0;
		int sumAll=0;
		double avgAll = 0.0;
		
		try {
			DataInputStream dos = scr.readScore();
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
			while(true) {
			String name =	dos.readUTF();
			int kor =dos.readInt();
			int eng =	dos.readInt();
			int math = 	dos.readInt();
			int sum = 	dos.readInt();
			double avg = dos.readDouble();
			count++;
			sumAll+=sum;
			avgAll += avg;
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",name,kor,eng,math,sum,avg);
				
			}
			
			
		}catch(EOFException e) {
			System.out.println("읽은회수 전체합계 전체평균 ");
			System.out.println("  "+count+"     " + sumAll+"      "+ avgAll/count );
		}catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
}
