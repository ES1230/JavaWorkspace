package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	 public void practice1() {
		 
		 Scanner sc = new Scanner(System.in);
				 
		 System.out.print("메뉴번호를 입력하세요");
		 int num = sc.nextInt();
		 
		 switch(num) {
		 case 1 : System.out.print("입력");break;
		 case 2 : System.out.print("수정");break;
		 case 3 : System.out.print("조회");break;
		 case 4 : System.out.print("삭제");break;
		 case 7 : System.out.print("종료");break;
		 }
		 
		 System.out.println("메뉴입니다.");
	 }
	 public void practice2() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자 한개를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if (num >0 && num%2 ==0) {
			 System.out.print("짝수다");
		 }else if(num > 0 && num%2==1) {
			 System.out.print("홀수다");
 
		 }else {
			 System.out.println("양수만 입력해 주세요");
		 }
		 
		 
		 
	 }
	 	public void practice3() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("국어점수 : ");
		 int num = sc.nextInt();
		 System.out.print("수학점수 : ");
		 int num1 = sc.nextInt();
		 System.out.print("영어점수 : ");
		 int num2 = sc.nextInt();
		 
		 int sum = num + num1 + num2 ;
		 double avg = (num+num1+num2)/3;
		 				 
		 
		 if(num > 40 && num1 > 40 && num2 > 40) {
			 System.out.println("국어 : "+ num);
			 System.out.println("수학 : "+ num1);
			 System.out.println("영어 : "+ num2);
			 System.out.println("합계 : "+ sum);
			 System.out.println("평균 : "+ avg);
		 }else {
			 System.out.println("불합격입니다.");
		 }

}
	 	public void practice4() {
//		 pdf파일 (11page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세
//			 ex 1.
//			 1~12 사이의 정수 입력 : 8
//			 8월은 여름입니다.
//			 ex 2.
//			 1~12 사이의 정수 입력 : 99
//			 99월은 잘못 입력된 달입니다
//			 
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.printf("1~12월 사이의 정수 입력 : ");
			 int num = sc.nextInt();
			 
			 switch(num) {
			 case 12 :
			 case 1 :
			 case 2 : System.out.println(num+"월은 겨울입니다.");break;
			 case 3 :
			 case 4 :
			 case 5 :System.out.println(num+"월은 봄입니다.");break;
			 case 6 :
			 case 7 :
			 case 8 :System.out.println(num+"월은 여름입니다.");break;
			 case 9 :
			 case 10 :
			 case 11 :System.out.println(num+"월은 가을입니다.");break;
			 default : System.out.println(num+"월은 잘 못 입력했음");
			 			 
			 }
			 			 
			 
	 	}
	 	public void practice5() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print("아이디 : ");
	 		String id = sc.nextLine();
	 		
	 		System.out.print("비밀번호 : ");
	 		String pw = sc.nextLine();
	 		
	 		String ido = "minmin";
	 		String pwo = "Min1234";
	 		
	 		if (id.equals("minmin")&& pw.equals("Min1234")) {
	 			 System.out.print("로그인 성공");
	 		}else if(id.equals("minmin")){
	 			System.out.print("비밀번호 틀림");
	 		}else if(pw.equals("Min1234")){
	 			System.out.print("아이디 틀림");
	 		}else {
	 			System.out.println("모두 다시 입력해주세요");
	 		}
	 		
	 	}
	 	public void practice6() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print("권한을 확인하고자 하는 회원 등급");
	 		String mem = sc.nextLine();
	 		
	 	 		
	 		switch(mem) {
	 		case "관리자" : System.out.print("회원관리, 게시글관리, ");
	 		case "회원" :   System.out.print("게시글 작성, 댓글 작성,");
	 		case "비회원" : System.out.print("게시글 조회");
	 		
	 	}
	 	}
	 	public void practice7() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.printf("키(m)을 입력해 주세요 : ");
			 double t = sc.nextDouble();
			 System.out.printf("몸무게(kg)을 입력해 주세요 : ");
			 double w = sc.nextDouble();
			 
			 double bmi = w/ (t*t);
			 System.out.println("BMI지수 : "+ bmi);
			 
			 if (bmi < 18.5) {
				 System.out.print("저체중");
			 }else if(18.5 <= bmi && bmi < 23) {
				 System.out.print("정상체중");
			 }else if (23 <= bmi && bmi < 25) {
				 System.out.print("과체중");
			 }else if (25 <= bmi && bmi < 30) {
				 System.out.print("비만");
			 }else {
				 System.out.print("고도비만");
			 }
	 		
	 		
	 		
	 	}
	 	public void practice8() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		System.out.print("피연산자1 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("피연산자2 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자(+,-,*,/,%) 입력 : ");
			char s = sc.next().charAt(0);
			
		/*int result = 0;
		 * 
		 * switch(s) {
		 * case '+' :	result = num1 + num2; break;
		 * case '-' :	result = num1 - num2; break;
		 * case '*' :	result = num1 * num2; break;
		 * case '/' :	
		 * 			System.out.printf(%d %c %d = %f", num1, op, num2, num1 / (double)??????
		 *default : 
		 *}
		 *System.out printf (" %d %c %d = %d", num1,s,num2,result
		 */
			
			if (num1 >= 0 && num2 > 0 ){
				if(s =='+') {
					System.out.print(num1 +"+" + num2 +"="+(num1+num2));
					}else if(s=='-') {
					System.out.print(num1 +"-"+ num2 +"="+(num1-num2));	
					}else if(s=='*') {
						System.out.print(num1 + "*" + num2 +"="+(num1*num2));	
						}else if(s=='/') {
							System.out.print(num1 +"/" + num2 +"="+(num1/num2));	
						}else {
							System.out.println("잘못입력했음");
						}
			}
	 		
	 	}
	 	public void practice9() {
	 	
	 		Scanner sc = new Scanner(System.in);
	 		System.out.print("중간고사 점수 :");
	 		int a = sc.nextInt();
	 		System.out.print("기말고사 점수 : ");
	 		int b = sc.nextInt();
	 		System.out.print("과제 점수 : ");
	 		int c = sc.nextInt();
	 		System.out.print("출석 회수 : ");
	 		int d = sc.nextInt();
	 			 		
	 	/*	
	 	 * double a1 = a*0.2;
	 		double b1 = b*0.3;
	 		double c1 = c*0.3;
	 		double d1 = d*5*0.2;
	 	 * 
	 	 * 	boolean result = a*0.2 + b*0.3 + c * 0.3 + c > 70 && d >= 17? true : false;
	 	*	
	 	*
	 	* 	System.out println("=============결과============")
	 	* 	if(result) { 
	 	*	}else {
	 	*		System.out.print("fail");
	 	*	 
	 	* 		if (d <=14){
	 	* 			
	 	* */
	 		
	 		double a1 = a*0.2;
	 		double b1 = b*0.3;
	 		double c1 = c*0.3;
	 		double d1 = d*5*0.2;
	 		
	 		double sum = a1 + b1 + c1 + d1;
	 		
	 		System.out.println("============결과==============");
	 		
	 		if(d > 20*0.7  ) {
	 			System.out.println("중간고사 점수(20) : " + a1);
	 			System.out.println("기말고사 점수(30) : " + b1);
	 			System.out.println("과제 점수(30) : " + c1);
	 			System.out.println("출석 점수(20) : " + d1);
	 			System.out.println("총점 : " + sum);
	 			
	 		 if (sum < 70 || d1 < 7 ){
	 			
	 			System.out.println("fail 총점 미달  " + sum +"/70" );
	 		
	 		 }else if( sum >=70) {
	 			System.out.println("Pass");
	 			
	 			
	 		}
	 		}else {
	 			System.out.println("fail [출석횟수 부족 (" + (int)d +"/20] " );
	 		}
	 		}
	 	
	 	
	 	public void practice10() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.println("실행할 기능을 선택하세요");
	 		System.out.println("1. 메뉴 출력");
	 		System.out.println("2.짝수 / 홀수");
	 		System.out.println("3.합격 불합격");
	 		System.out.println("4.계절");
	 		System.out.println("5.로그인");
	 		System.out.println("6.권한 확인");
	 		System.out.println("7.BMI");
	 		System.out.println("8.계산기");
	 		System.out.println("9.P/F");
	 		System.out.print("선택 : ");
	 		int num = sc.nextInt();
	 		
	 		switch (num) {
	 		case 1 : practice1();break;
	 		case 2 : practice2();break;
	 		case 3 : practice3();break;
	 		case 4 : practice4();break;
	 		case 5 : practice5();break;
	 		case 6 : practice6();break;
	 		case 7 : practice7();break;
	 		case 8 : practice8();break;
	 		case 9 : practice9();break;
	 		}
	 		
	 		
	 		
	 		
	 	}
	 	
	 	///중요
	 	public void practice11() {
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print("비밀번호(1000~9999) 입력 : ");
	 		int pwd = sc.nextInt();
	 		
	 		//4자리 정수값이 맞는지
	 		if(pwd >999 && pwd < 10000) {
	 			//자릿수 구하기
	 			int first = pwd % 10; //일의자리수
	 			int second = (pwd/10) % 10; //십의자리수
	 			int third = (pwd/100) % 10; //백의자리수
	 			int forth = (pwd/1000) % 10; //천의자리수
	 			
	 			//중복값이 있는지 확인
	 			if (first != second && first !=third && first != forth
	 				&& second != third && second != forth
	 				&& third != forth) {
	 				System.out.println("생성 성공");
	 			}else {
	 				System.out.println("중복값 있음");
	 			}
	 		}else { 
	 			System.out.println("자릿수가 맞지 않습니다.");
	 		
	 		
	 		}
	 		
	 	}
	 	
	 		
	 	
}
