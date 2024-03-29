package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {

	//이차원 배열 : 일차원배열 여러개를 하나로 묶은것.
	
	public void method1() {
		//일차원배열
		int[] arr1;
		int arr2[];
		
		//이차원 배열 선언
		int[][] arr3;
		int arr4[][];
		int[] arr5[];
		
		//이차원 배열 선언과 동시에 할당
		int[][]arr = new int[3][5];
		
		System.out.println(arr);//16진수 주소값
		System.out.println(arr[0]);//16진수 주소값 =앞의 [] 일차원의 주소값
		System.out.println(arr[0][0]);
		
		System.out.println("행의 길이 : "+ arr.length);//길이 3
		System.out.println("0번 행의 열의 길이 : "+arr[0].length);
		System.out.println("1번 행의 열의 길이 : "+arr[1].length);
		System.out.println("2번 행의 열의 길이 : "+arr[2].length);
		
		
		/*
		 * 출력(arr[0][0]) -> 1행1열
		 * 출력(arr[1][1]) -> 1행 2열
		 * ...
		 * 출력(arr[0][4] -> 1행 5열
		 * 출력 (arr[1][0]-> 2행 1열
		 * ...
		 * 출력(arr[2][4] -> 3행열
		 * 
		 */
		//바깥쪽 반복문 - 행을 지정
		for(int i =0;i<arr.length;i++) {
			
			//내부 반복문 열에대해지정
			for(int j= 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		//순서대로 1,2,3,4,5,6....15.까지 값을 대입하기
		int[][] arr = new int [3][5];//arr[0][0] ->1,arr[0][1]->2...,arr[2][4] - >15
		
		int count = 1;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j <arr[i].length;j++) {
				arr[i][j] = count++; 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void method3() {
		//일차원 배열 선언 및 할당과 동시에 초기화
		int[] arr = {1,2,3,4,5};
		
		//이차원배열 선언 및 할당과 동시에 초기화
		int [][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};//[3][5]
		
		for(int i = 0;i<arr.length;i++) {
			for(int j= 0; j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");//\t==tab
			}
			System.out.println();
		}
	}
	public void method4() {
		/*
		 * 가변 배열
		 * 행의크기는 변경이 불가능 하나, 행별로 열의 갯수를 내 마음대로 지정할 수 있따
		 * 이차원 배열 == 일차원배열 여러개를 묶은 형태
		 * 묶여있는 일차원 배열의 길이가 다 같을 필요는 없기 때문
		 * 
		 * 따라서 2차원 배열을 선언할때 행의 크기를 지정 후 , 열의크기는 생략이 가능하다.
		 * 즉 각 행의 열의 길이를 변경할 수 있다.
		 * 
		 */
		int[][]arr = new int[3][];//가변 배열 행의크기는 3 열의 크기는 미정
		System.out.println(arr);//[[i@16진수주소값
		System.out.println(arr[0]);//null
		System.out.println(arr.length);//3
		System.out.println(arr[0][0]);//에러
		//각 행별로 열의 크기가 지정되지 않았으므로 각 행에는 null값이 대입된 상태
		//특정 인덱스로 접근하려했기 때문에 NulllPointerException 에러발생
		
	}
	
	public void method5() {
		//char[][]가변배열생성
		char[][]arr = new char[3][];
		
		char [][] arr1 = {{'a','b','c'},{'d','e'},{'f','g','h','i','j','k'}};
		/*
		 * a b c
		 * d e
		 * f g h i j k
		 */
		for(int i = 0;i<arr.length;i++) {
			for(int j= 0; j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void method6() {
		
		/*
		 * int형 2차원 배열을 만들어
		 * 0번 행에는 국어점수를 3개 입력받고
		 * 1번행에는 영어점수를 3개 입력받은 후
		 * 각각 반복문을 활용해서 출력
		 * 
		 * 입력예시 : xx점수를 입력하세요 : 
		 * 출력예시 : xx점수 : xx xx xx 
		 */
		Scanner sc = new Scanner(System.in);
		
		int [][] arr = new int[2][3];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%s 점수를 입력하세요 : ",i==0 ? "국어":"영어");
				arr[i][j]=sc.nextInt();//입력부분
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%s 점수 : ",i==0 ? "국어":"영어");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

				
		
		}
	}
	



