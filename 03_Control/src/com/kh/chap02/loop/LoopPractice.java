package com.kh.chap02.loop;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();

		if (num > 1) {

			for (int j = 1; j <= num; j++) {

				System.out.print(j + " ");

			}
			System.out.println();

		} else {
			System.out.print("1 이상의 숫자를 입력하세요");

		}

	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요");
		int num = sc.nextInt();

		if (num > 1) {

			for (int j = num; j >= 1; j--) {

				System.out.print(j + " ");

			}
			System.out.println();

		} else {
			System.out.print("1 이상의 숫자를 입력하세요");
			practice2();
			return;
		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
//		for (int j = 1; j <= num; j++) {
//
//			sum += num;
//
//			if (j == num) {
//				System.out.print(j + " = " + sum);
//			} else {
//				System.out.print(j + " + ");
//			}
//
//		}
//		System.out.println();

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 1 && num2 > 1) {

			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				for (int j = num2; j <= num1; j++) {
					System.out.print(j + " ");
				}
			}

		} else {
			System.out.println("1이상의 숫자 입력");
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 9) {
			
			for (; dan <= 9; dan++) {

				System.out.println("====" + dan + "단" + "====");

				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d X %d = %d \n", dan, i, dan * i);

				}
			}

		} else {
			System.out.println("9 이하의 숫자를 입력해주세요");
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.println("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println(("공차 :"));
		int num2 = sc.nextInt();

		// num1+num2 +num2 +num2
		for (int i = 1; i <= 10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;

		}
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String command = sc.nextLine();
			if (command.equals("exit")) {
				System.out.print("프로그램 종료");
				break;
			}

			System.out.print("연산자(+-*/) : ");
			char a = sc.nextLine().charAt(0);

			System.out.print("정수 1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수 2 : ");
			int num2 = sc.nextInt();

			sc.nextLine();

			String name = "exit";

			int result = 0;

			switch (a) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없음, 다시 입력");
					practice7();
					return;
				}
				result = num1 / num2;
				break;
			case '%':
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없음, 다시 입력해주세요");
					practice7();
					return;
				}
				result = num1 % num2;
				break;
			default:
				System.out.println("없는 연산자 다시 입력");
				practice7();
				return;
			}
			System.out.printf("%d %c %d = %d \n", num1, a, num2, result);
		}

	}

	public void practice8() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice13() {
		Scanner sc = new Scanner(System.in);

//	사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.

		/*
		 * System.out.print("숫자 : ";)
		 */

		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num < 2) {
			System.out.println("잘못입력");

//		if(num<2) {
//			System.out.println("잘못 입력");
//	
//		}
//		  
//		boolean result = true;
//		for(int i=2; i<=num;i++) {
//			if(num%i==0) {
//				result = false;
//				break;
//			}
//			
//		System.out.printf(result ? "소수" : "소수아님");
//		
//		
		}

	}

	public void practice14() {
		Scanner sc = new Scanner(System.in);
//		2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
//		단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		System.out.print("숫자 입력 ");
		int num = sc.nextInt();

		if (num == 2) {
			System.out.println("잘못입력");
			return;
		}
		int count = 0;
		for (iint i = 2; i <= num; i++) {
			boolean isPrime = true;
			// 각 i의 값이 소수인지 아닌지 검사
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// i의 값이 소수인경우 출려후 count값 1증가
			if (isPrime) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.printf("\n 2부터 %d 까지의 소수의 개수는 %d개 입니다.", num, count);

	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
//		1부터 사용자에게 입력 받은 수까지 중에서
//		1) 2와 3의 배수를 모두 출력하고
//		2) 2와 3의 공배수의 개수를 출력하세요.
//		
		System.out.print("자연수 하나 입력 : ");
		int num = sc.nextInt();
//		
//		int result = 0;
//		
//		for(int i=0; i<num; i++) {
//			if((i+1)%2 ==0||(i+1)%3==0) {
//				System.out.print(i+1+"");
//				if((i+1)%(2*3)==0) 
//					result++;
//			}
//		}
//		System.out.println("\ncount : : "+result);
		int count = 0;
		for(int i=2;i<=num;i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i+" " );
			}
			if((i%2==0 && i%3==0){
				count++;
			}
		}
		System.out.println("\ncount : "+count);
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
//		ex.
//		정수 입력 : 3
//		*
//		**
//		***
//		**
//		*

		System.out.print("정수 입력");
		int num = sc.nextInt();

//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < i + 1; j++)
//				System.out.print("*");
//			System.out.println();
//		}
//		
//		for (int i = 0; i < num - 1; i++) {
//			for (int j = num - 1; j > i; j--)
//				System.out.print("*");
//			System.out.println();
//	}

//		//*\n
//		for(int j  = 0;j<1;j++) {
//			System.out.print("*");
//		}System.out.println();
//			//**\n
//		for(int j=0; j<2;j++) {
//			System.out.print("*");
//		}System.out.println();
//		//***\n
//		for(int j=0; j<3;j++) {
//			System.out.print("*");
//		}System.out.println();
//		//**\n
//		for(int j=0; j<2;j++) {
//			System.out.print("*");
//		}System.out.println();
//		//*\n
//	    for(int j = 0;j<1;j++) {
//				System.out.print("*");
//		}System.out.println();
//			
//		}	
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice17() {
		Scanner sc = new Scanner(System.in);
//		*****
//		*   *
//		*   *
//		*   *
//		*****

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

//		for (int row = 0; row < num; row++) {
//			for (int col = 0; col < num; col++) {
//				if (row == 0 || row == num - 1 || col == 0 || col == num - 1)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		// *****\n
//		for(int i=0; i<5;i++) {
//			System.out.print("*");
//		}System.out.println();
//		//*    *\n
//		for(int i=0;i<5;i++) {
//			if(i==0||i==4) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
		for (int i = 0; i < num; i++) {
			if (i == 0 || i == num - 1) {
				// *****\n
				for (int j = 0; j < 5; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				// * *\n
				for (int j = 0; j < 5; j++) {
					if (j == 0 || j == 4) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		// 정사각형은 for문 조건식에 j값을 num으로 변환해줌
	}

	public void practice18() {
		Scanner sc = new Scanner(System.in);
//		정수 입력 : 4
//		   *
//		  ***
//		 *****
//		*******
//		 *****
//		  ***
//		   *
		System.out.print("정수입력 : ");
		int num = sc.nextInt();

		for(int i=0;i<num;i++) {
			for (int j = 0; j < num + i; j++) {
				if (j>=(num-(1+i))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		for(int i=num-2;i>=0;i--) {//2 1 0
			for (int j = 0; j < num + i; j++) {// 6 5 4
				if (j>=(num-(1+i))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		

//		// ***
//		for (int i = 0; i < 5; i++) {
//			if (i > 1) {// 2 3 4
//				System.out.print("*");
//			} else {// 0 1
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//
//				// *****
//		for (int i = 0; i < 6; i++) {// 0 1 2 3 4 5
//			if (i > 0) {// 1 2 3 4 5
//				System.out.print("*");
//			} else {// 0
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//		
//		//*******
//		for(int i =0; i<7;i++) {
//			if(i>-1) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}System.out.println();
	}
	public void practice19() {
		
		Scanner sc = new Scanner(System.in);
//		정수 입력 : 4
//		 *
//		* *
//	   *   *
//	  *     *
//	   *   *
//		* *
//		 *
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		for(int i = 0; i < num;i++) {
			for(int j=0; j < num+i;j++) {//0 1 2 3
			    if( j == (num-(1+i))||j==(num-1+i)) {//앞 조건은 ...3 2 1 0 || 3 4 5 6...
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
		 } System.out.println();
		}
		for(int i = num-2; i >-1;i--) {
			for(int j=0; j < num+i;j++) {
			    if( j == num-i-1 || j==num+i-1) {//앞 조건은 ...1 2 3 || 5 4 3 ...
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
		 } System.out.println();
		}
		
		
		
//		
//		//   *
//		for(int i=0; i<4;i++) {//0 1 2 3
//		    if( i == 3||i==3) {
//				System.out.print("*");
//			}else {
//				System.out.println(" ");
//			}
//		}
//		//  * *
//		for(int i =0; i<5;i++) {//0 1 2 3 4
//			if(i == 2 || i == 4) {
//				System.out.println("*");
//			}else {
//				System.out.println(" ");
//			}
//		}
//     	// *   *
//		for(int i =0; i<6;i++) {//0 1 2 3 4 5
//			if(i == 1 || i == 5) {
//				System.out.println("*");
//			}else {
//				System.out.println(" ");
//			}
//		}
//		//*     *
//		for(int i =0; i<7;i++) {//0 1 2 3 4 5 6
//			if(i == 0 || i == 6) {
//				System.out.println("*");
//			}else {
//				System.out.println(" ");
//			}
//		}	
		
		
		
		
		
		
		
		
		
	}

}
