package com.kh.exeption.run;

import com.kh.exeption.controller.A_UncheckedException;
import com.kh.exeption.controller.B_CheckedExeption;
import com.kh.exeption.controller.C_CustomException;

public class Run {

	public static void main(String[] args) {
		/*
		 *
		 * 에러(오류) 종류
		 * - 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러 => 소스코드로 해결이 불가능(심각한 에러)
		 * - 컴파일 에러 : 소스코드상의 문법적인 문제로 발생하는 에러 => 소스코드의 수정으로 해결가능(빨간밑줄로 알려줌)
		 * - 런타임 에러 : 소스코드상으로는 문제가 없는데, 프로그램을 실행 중 발생하는 에러 =>
		 * 				 사용자의 잘못일수도 있고, 개발자가 예측가능한 경우를 제대로 처리해 놓지 않은 걸수도 있따.
		 * - 논 리 에 러 : 소스코드상의 문법적인 문제 없고, 실행했을 때도 에러가 발생하지 않는다. 단, 프로그램의 의도상의 기능과 맞지 않는 경우.
		 * 
		 *  시스템 에러를 제외한 컴파일에러, 런타임에러,논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업할 예정
		 *  
		 *  이러한 에러들을 "예외"라고 정의함.(Exception)
		 *  
		 *  예외처리를 해야하는 이유 : 예외 발생시 프로그램이 비 정상적으로 종료되는것을 막고자 하기 위함
		 *  
		 *  예외처리 방법
		 *  1.try~ catch문을 이용
		 *  2.throws를 이용 (떠넘기기)
		 *  
		 */
		A_UncheckedException aue = new A_UncheckedException();;
		//aue.method1();
		B_CheckedExeption bce = new B_CheckedExeption();
		//bce.method1();
		//throw : throw 뒤의 예외를 강제로 발생시키는 구문
		if(true)
		   throw new C_CustomException("이상한 에러가 발생했습니다.");
		
	}

}
