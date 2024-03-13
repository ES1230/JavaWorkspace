package com.kh.variable;

public class C_Cast {
	
	/*
	 * 형변환 : 값의 자료형을 바꾸는 개념
	 *컴퓨터상에서 값 처리 규칙
	 *1. 대입연산자(=)기준으로 왼쪽과 오른쪽은 같은 자료형이어야함. 즉, 같은 자료형에 해당하는 값만 대입 가능
	 *   만약, 다른 자료형의 값을 대입하고자한다면 "형변환" 이라는 과정이 필수
	 *   
	 *   [표현법]
	 *   자료형 변수명 = (바꿀 자료형) 값;
	 *   
	 * 2. 같은 자료형끼리만 연산이 가능 => 즉, 다른자료형끼리 연산을 수행하고 싶으면 한 구문은 "형변환"을 해야함
	 * [표현법]
	 * 값 + (바꿀자료형) 값
	 * 
	 * 형변환의 종류
	 * 1) (암시적)자동형변화=> 자동으로 형변환이 진행되는 케이스로 내가 직접 형변환할 필요 없음
	 * 						작은 바이트의 자료형-> 큰바이트의 자료형으로 변환시발생
	 * 2)(묵시적) 강제형변환=> 자동 형변환이 되지 않아 내가 직접 강제로 형변환을 해야하는 케이스.
	 * 						큰바이트의 자료형-> 작은바이트의 자료형 바꿀때 발생
	 * (바꿀 자료형)== 형변환 연산자 ==cast 연산자라고 불림
	 * 
	 * **boolean은 형변환불가	
	 * 
	 * */
	
	//자동형변환 : 작은바이트의 자료형이 큰바이트의 자료형으로 형변환되는케이스
	public void autoCasting() {
		
		//1.int(4byte) -> double(8byte)
		int i1 = 10;
		double d1 = i1; // 자동형변환됨ㄴ
		
		System.out.println("d1 : " +d1);
		
		int i2 =12;
		double d2 = 3.3;
		
		double result = /*(double)*/  i2+d2;// 12.0 + 3.3 => 15.3
		
		System.out.println("result:" + result);
		
		//2. int (4byte) -> long (8byte(
		int i3 = 1000;
		long l3= /*long*/ i3;
		
		long l4 = 2000L; // L을 붙이지 않아도 되는 이유는 자동형변환이 되기때문 . 관례상 붙인다.
		
		
		// 3. 특이케이스long(8byte) -> float(4byte)
		
		/*정수가 실수로 담길때에는 큰사이즈의 정수여도 작은사이즈의 실수변수에 대입가능.
		 * 4byte의 float자료형이 long 자료형보다 표현할 수 있는 값의 범위가 더 크다
		 *  
		 * */
		
	    long l5 = 100000000L;
	    float f5 = /*(float)*/ l5;
	    
	    System.out.println("f5 : "+f5);
		
	    //4.특이케이스 char(2byte)<-> int(4byte) : 양방향 형변화 가능
	    
	    char ch = 65;
	    System.out.println("ch : "+ch);
	    
	    int num = 'A';
	    System.out.println("num : " +num);
	    
	    /*
     * char의 범위 0~65xxx : 각 문자마다 고유의 10진수값(정수값)이 정해져있다.
     * 						따라서 정해진 표를통해 양방향 변환이 가능하다.(단, 음수값 지시시 오류)
     * 참고 아스키코드표 (0~127,영문자 대소문자, 숫자,특수문자.)
     * 		유니코드표 (0~65xxx, 영어숫자,특수문자,한자,등등)
     * 
     * */
		
	   System.out.println((int)'상');
	   
	   char sum = 'A' + 10; // 65+10
	   System.out.println(sum);
	   
	   //5. 특이케이스 : byte와 short간의 연산(강제형변환)
	   byte b1 = 1;
	   byte b2 = 10;
	   
	   //byte로 연산시 연산결과의 정수값은 무조건 int로 취급한다.
	   byte b3 = (byte)(b1+b2);
	   
	   	   				
	}
	
	
	//강제(명시적)형변환 : 큰크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우.
	public void forceCasting() {
		
		 //1. double(8byte) -> float(4byte)
		float f1 = 4.0f; //반드시 f붙여줘야함
	
	    double d2 = 8.0;
	    float f2 = (float) d2;
	    
	    //2. double(8byte) -> int (4byte)
	    double d3 = 10.89;
	    int i3 = (int) d3;// 10.89 -> 10(소수점제거ㅜ)
	    System.out.println("i3:"+i3);
	    
	    int iNum = 10;
	    double dNum = 5389;
	    
	    //1. 연산결과를 int형으로 맞춰서 강제변환시키기
	    int iSum = (int)( iNum + dNum); // 10.0 + 5.89 => 15.89 -> 15
	    
	    int iSum2 = iNum + (int) dNum; // 10+5 => 15
	    
	    // 실수값을 정수형으로 강제형변환 할때는 데이터손실이 무조건 발생한다.
	    
	    
	    /*데이터 손실 테스트*/
	    int iNum2 = 290;
	    byte bNum2 = (byte) iNum2;
	    
	    System.out.println("bNum2 : "+bNum2);
	    
	     
	  	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
