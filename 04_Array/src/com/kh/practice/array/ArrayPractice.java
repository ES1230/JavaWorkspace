package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
//		길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
//		역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
//		ex.10 9 8 7 6 5 4 3 2 1
		int [] arr = new int[10];
		
		
		for(int i =0 ; i<arr.length ;i++) {
			arr[i]=10-i;
			System.out.print(arr[i] + " ");
		}
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] =i+1;
			System.out.print(arr[i]+" ");
		}
		
	}
	public void practice3() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		int [] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
	}
	public void practice4() {
//		“월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
//		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		String [] arr = {"월","화","수","목","금","토","일"};
		
		System.out.print("0~6숫자 입력 :  ");
		int num = sc.nextInt();
		
		if(!(num > -1 && num<7)) {
			System.out.println("잘못입력");
			return;
		}
		System.out.println(arr[num]+"요일");
		
		
//		String [] arr = new String[7];
//		
//		System.out.print("0~6숫자 입력 :  ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 0 : System.out.print("월");break;
//		case 1 : System.out.print("화");break;
//		case 2 : System.out.print("수");break;
//		case 3 : System.out.print("목");break;
//		case 4 : System.out.print("금");break;
//		case 5 : System.out.print("토");break;
//		case 6 : System.out.print("일");break;
//		default : System.out.println("잘못입력");break;
//		}
	}
	public void practice5() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2 총 합 : 2
//		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			int a = sc.nextInt();
			arr[i] = a;
				
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		
		System.out.println("\n총합 : "+sum);
		
		
	}
	public void practice6() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
//		ex.
//		문자열 : application
//		문자열에 있는 문자 : a, p, l, i, c, t, o, n
//		문자 개수 : 8
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			boolean check = false;
			for(int j = 0;j<i;j++) {
				if(ch==str.charAt(j)) {
					check = true;
					break;
				}
			}
			if(check) {
				continue;
			}
			System.out.print(ch+(i==(str.length()-1) ? " " : ","));
			count++;
		}
		
		System.out.print("\n문자개수 : "+count);
		
		
		
		
		//		System.out.print("문자열 : ");
//		String str = sc.nextLine();
//				
//		char[]arr = new char[str.length()];
//		
//		
//		int count = 0;
//		boolean check = true;
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = str.charAt(i);
//			check = true;
//			for(int j=0;j<i;j++) {
//				if(arr[i]==arr[j]) {
//					check=false;
//					break;
//				}
//			}
//			if(check==true) {
//				if(i==0) {
//					System.out.print(arr[i]);
//				}else {
//					System.out.print(","+arr[i]);
//				}
//				count++;
//			}
//			
//			
//			}
//
//		System.out.print("\n문자 개수 : " + count);
//		
//			
	}
	public void practice7() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i<str.length();i++) {
			arr[i] = str.charAt(i);
			
		}
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		
//		System.out.println("문자열 : ");
//		String str = sc.nextLine();
//		
//		System.out.println("문자 : ");
//		char ch = sc.nextLine().charAt(0);
//		
//		char [] arr = new char[str.length()];
//			
//		for(int i =0;i<arr.length;i++) {
//			arr[i] = str.charAt(i);
//		
//		}
//		int count = 0;
//		System.out.print("application에 i존재 위치 : ");
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]==ch) {
//				System.out.println(i+" ");
//				count++;
//			}
//		}
//		System.out.println();
//		System.out.println("개수 " +count);
}
	public void practice8() {
//		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
//		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******

		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록번호 (-포함) : ");
		String num = sc.nextLine();
//		
		
		char [] arr = new char[14];
		
		for(int i = 0;i<arr.length;i++) {
			arr[i]=num.charAt(i);
		}
		for(int i=8;i<arr.length;i++) {
			arr[i]='*';
			
		}
		System.out.println(arr);
	}
	
	public void practice9() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int [] arr = new int[10];
		
		for(int i=0;i<10;i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<10;i++) {
			if(arr[i]>=max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
	    System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+ min);
		
	}
	public void practice10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
		
		int [] arr = new int[9];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10+1);
			for(int j = 0;j<i;j++) {
				if(arr[i]==arr[j]){
					i--;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice11() {
	
		Scanner sc = new Scanner(System.in);
		
		
	
		while(true) {
			System.out.print("정수:");
			int num = sc.nextInt();
			
		if(num>=3 && num%2==1) {
			int [] arr = new int[num];
			int count = 1;
			for(int i=0; i<arr.length;i++) {
				arr[i] = count;
				if(i<arr.length/2) {
					count++;
					
				}else {
				
					 count--;
				}
				
			}
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			break;
		}else {	
			System.out.print("다시 입력해주세요\n");

		
		}
	}
		
	}
	public void practice12() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		String [] arr = new String[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextLine();
			
		}
		
		
	}
}
		

	


