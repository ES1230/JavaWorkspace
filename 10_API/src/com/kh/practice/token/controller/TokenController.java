package com.kh.practice.token.controller;

public class TokenController {

	
	
	public TokenController() {
		
	}
	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환

		java.util.StringTokenizer st = new java.util.StringTokenizer(str," ") ;
		
		String result = ""; 
		while(st.hasMoreTokens())
		result += st.nextToken();
	//========================================	
//		String [] arr = str.split(" ");
//		
//		for(int i =0; i<arr.length; i++) {
//		  result +=arr[i];
//		}
		return result;
	}
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
//		String result="";
//		//1)반복문 활용
//		StringBuilder sb = new StringBuilder();
////		for(int i=0;i<input.length();i++) {
//			char ch = (char)(input.charAt(i)-(i==0 ? 32 : 0));//j,a,v,a,->java
//			//result += ch;
//			 sb.append(ch);
//		}
		//2)메서드 활용
		//첫번째글자만 대문자로 변환 후 나머지 글자와 이어주기해서 출력
		return input.toUpperCase().charAt(0) + input.substring(1);
		//return sb.toString();
		
	}
	public int findChar(String input, char one) {
		int count = 0;
		//반복문을 돌려서 one과 일치하는 문자가 input내에 몇개 있는지 확인
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==one) {
				count++;
			}
		}
		return count;
	}
}
