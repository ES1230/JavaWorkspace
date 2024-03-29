package com.kh.chap03.branch;

public class B_continue {

	/*
	 * continue; : 반복문 안에서 사용하는 구문 continue를 만나게 되면 그다음에 어떤코드가 있던간에 실행하지 않고 가장 가까은
	 * 반복문으로 올라감.
	 */

	public void method1() {

		/*
		 * 1부터 10까지 홀수만을 출력 1 3 5 7 9
		 * 
		 */
		// 방법 1
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		// 분기문 활용
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {//짝수일 경우
				continue;//아래 내용의 코드는 무시하고 반복문으로 돌아감
				
			}
			
			System.out.print(i + " ");
		}

	}
	public void method2() {
		//1부터 100까지의 총 합계
		//단 , 6의 배수값은 빼고 더하기
		//반복문 내부에 continue문을 활용해서 코드를 작성하기
		//출력예시 : 총합계 : xx
		
		int sum = 0;
		for(int i = 1; i <=100; i++) {
				
			if(i%6 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("총합계는 : " + sum);
	}
	public void method3() {
		//2단 ~ 9단  모든 구구단 출력하되, 4의 배수단 제외하고 출력
		//continue 문 사용
	
		for(int i = 2; i <=9;i++) {
			if (i%4==0) {
				continue;
			}
			 for (int j = 2; j <= 9; j++) {
				 System.out.printf("%d x %d = %d " , i ,j , i*j );
			}
			 System.out.println();
		}
		
	}
	}


