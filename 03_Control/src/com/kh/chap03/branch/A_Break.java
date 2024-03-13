package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break; : break문을 만나는 순간 현재속해있는 반복문을 빠져나감 주의할 점 : switch문 안의 break와는 다른개념
	 * switch문안의 break는 해당 switch문만 빠져나감
	 */
	public void method1() {
		// 매번 반복적으로 == 무한반복
		// 발생되는 랜덤값(1~100)을 출력
		// 단, 랜덤값이 3의 배수일경우 반복문을 종료.

		while (true) {// 무한반복

			// 랜덤값 추출
			int random = (int) (Math.random() * 100 + 1);

			// 랜던값 출력
			System.out.println("random : " + random);

			// 랜덤값이 3의 배수인지 검사
			if (random % 3 == 0) {
				break; // 반복문 종료
			}

		}

	}

	public void method2() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			// 매번 사용자에게 문자열을입력 받은후 해당 문자열과 문자열의 길이 출력.
			// 단 , 사용자가 입력한 문자열이 exit인경우는 반복문 종료
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}
			System.out.println(str + "의 길이는 : " + str.length());

		}
	}

	public void method3() {
		// 매번 반복적으로 사용자에게 양수를 입력받아 1부터 사용자가 입력한 수까지 출력
		// 단, 정상적으로 양수를 입력했을시에만 1부터 사용자가 입력한 수까지 출력을 한 후 종료
		// 양수가 아닌 숫자를 입력시 "잘못입력했습니다. 다시 입력해주세요" 출력 후 재입력
		// 무한반복, break이용
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			System.out.println("잘못입력");
		

		}
	}

}
