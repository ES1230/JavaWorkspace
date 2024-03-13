package com.kh.variable;

public class A_Variable {
	
	// 시급과 근무시간과 근무일수를 곱해서 월급을 알아보는 메서드
	public void printVariable() {
		
		// sysout + ctrl + spacebar
		System.out.println("변수 사용전");
		
		System.out.println("시급 : 11000");
		System.out.println("근무시간 : 8");
		System.out.println("근무일 : 5");
		
		//월급 = 시급 * 근무시간 * 근무일
		//ㅇㅇㅇ : 00000원입니다.
		
		System.out.println("ㅇㅇㅇ : " + ( 11000 * 4 * 5) + "원입니다");
		System.out.println("ㄴㅇㄹ : " + ( 11000 * 8 * 20) + "원입니다");
		System.out.println("ㅈㄷㄱ : " + ( 11000 * 6 * 20) + "원입니다");
		
/*---------------------------------------------------------------------------*/
		
		System.out.println("변수 사용 후");
		
		int pay = 11000; //자바에서 =은 대입을 나타내는 연산자다 (비교문은 '==')
		int time = 8;
		int day = 20;
		
		System.out.println("시급 : " + pay);
		System.out.println("근무시간 : " + time);
		System.out.println("근무일 : " + day);

		System.out.println("ㅇㅇㅇ : " + ( pay * (time - 4) * (day - 15)) + "원입니다");
		System.out.println("ㄴㅇㄹ : " + ( pay * time * day) + "원입니다");
		System.out.println("ㅈㄷㄱ : " + ( pay * (time - 2) * day) + "원입니다");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용(가독성이 좋음)
		 * 2. 단 한번 값을 기록해두고 필요할때마다 꺼내서 계속 사용할 목적으로 사용한다(재사용이 좋다)
		 * 3. 유지보수를 쉽게 할 수 있다.
		 */
		
	}
	
	public void declareVariable() {
		/*
		 * 변수의 선언(값을 기록하기 위한 변수를 메모리 공간에 확보해두겠다.)
		 * [표현볍]
		 *  자료형 변수명;
		 *  
		 *  자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아낼지에 따라서 변수의 크기 및 모양을
		 *  		지정하는 부분
		 *  변수명 : 변수의 이름을 정하는 부분.
		 *  
		 *  주의점
		 *  1. 변수명을 소문자로 시작하는게 관례(단, 낙타등표기법 지키기)
		 *  	ex) String userName;(o)
		 *  		String username;(x)
		 *  		String user_name;(언더스코어표기법)
		 *  2. 같은 영역({})안에서는 동일한 변수명으로 선언 불가
		 *  3. 해당 영역에 선언된 변수는 해당 영역안에서만 사용 가능(다른 메소드에서는 불가)
		 * */
		
		//1. 논리형 (논리값 true / false)
		boolean isTrue; // 1byte
		
		//2. 숫자형 
		//2-1. 정수형
		byte bNum;// 1byte(-128 ~ 127)
		short sNum;// 2byte
		int iNum;// 4byte (-21억~21억) => 대표 정수 자료형
		long lNum;// 8byte
		
		//2-2. 실수형
		float fNum;// 4byte => 소수점 아래 7자리까지 표현 가능
		double dNum;// 8byte => 소수점 아래 15자리까지 표현 가능 
		//실수형중 대표 자료형(보다 정확한 실수값을 담을 수 있기 때문에)
		
		//3. 문자형
		char ch;// 2byte
		
		//4. 문자열(참조형) => 나중에 좀 더 자세히 다룰 예정
		String str;
		
		
		/*
		 * 변수에 값 대입 
		 * [표현법]
		 * 변수명 = 값(리터럴);
		 * 
		 * */
		
		isTrue = true;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; //long자료형에 값을 대입하고 있음을 알려주기 위해 대문자 L을 표기함
		
		fNum = 4.0f;// 대입하고자 하는 값이 float자료형임을 알려주기위해 f를 추가해야함
		dNum = 8.0;
		
		ch = '김';//반드시 ''(작은따음표)안에 넣어줘야함
		str = "김종훈";//반드시 ""(큰따음표)안에 넣어줘야함
		
		System.out.println(isTrue); // alt + ctrl 누르고 아래방향키(복사)
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);

	}
	
	//변수 초기화
	public void initVariable() {
		/*
		 * 변수 선언과 동시에 초기화(값 대입)
		 * [표현법] 자료형 변수명 = 값(리터럴)
		 * */
		// 기본자료형(Primitive type)
		// 1. 논리형
		boolean isTrue = false; //1byte
		
		// 2_1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 2_2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. 문자형
		char ch = '김';
		
		// 4. 문자열(참조 자료형) - Reference type
		String str = "자바 공부중...";
		
		System.out.println(isTrue); // alt + ctrl 누르고 아래방향키(복사)
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		
		System.out.println(ch);
		System.out.println(str);
		
		int longInt = 999_999_999;
		System.out.println(longInt);
		
		int age = 20;
		System.out.println("변경전 age : "+ age);
		age = 21;
		System.out.println("변경후 age : "+ age);
		
		//상수선언시 'final' 사용.
		final int AGE = 20;
		System.out.println("변경전 AGE : "+ AGE);
		
		//AGE = 21;
	}
	
}
