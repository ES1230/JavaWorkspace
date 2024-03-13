package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DAO(Data Access Object) : 데이터가 보관되어있는 공간과 직접 접근해서 데이터를 입,출력할 수 있는 클래스
public class FileByteDao {
	
	//현재 프로그램 -> 외부매체(파일)
	//출력 : 프로그램 내의 데이터를 파일로 내보내기(즉,파일에 저장)
	public void fileSave() {
		
		//FileOutputStream : "파일"로 데이터를 1byte단위로 출력하는 스트림.
		
		FileOutputStream fos = null;
		
		//시험문제 -- 이어쓰기 덮어쓰기 구분해서 찾기
		try {

			//1.FileOutputStream객체 생성=>매개변수로 지정한 파일과 직접적으로 연결되는 통로만듬
			//해당 파일이 존재하지 않으면 해당 파일이 생성되면서 통로가 연결됨.
			//이미 존재하는 파일이라면 즉시 통로가 연결됨.
			//두번째 매개변수로 true추가시 -> 기존에 해당파일이 있을 경우 '이어쓰기 ' 기능
			//두번째 매개변수로 미작성시 -> 기존에 해당파일이 있더라도 "덮어씌우기"
			
			
			//fos = new FileOutputStream("a_byte.txt");	//덮어쓰기/>예외처리 "a_byte.txt파일이 없을수도 있기때문에
			fos = new FileOutputStream("a_byte.txt",true);//이어쓰기
			
			//2. 연결통로로 데이터를 내보내기(출력) : write()메소드 이용
			//1byte의 범위 : -128~127까지의 범위
			fos.write(97);//예외처리 2번째 97==a(파일에 기록이 될때 해당 숫자의 고유한 문자가 기록됨)
			fos.write('b');
			//fos.write('민');//아스키코드상에 없는 문자 기록 안됨 깨져서 나옴 보조스트림 섞이면 문자 넣을 수 있음
			
			byte[] arr = {99,100,101};
			fos.write(arr);
			
			fos.write(arr,1,2);//1번 인덱스에서부터 2개만 기록해라. 100,101
			
			//3.스트림을 사용했으면 반드시 자원 반납하기(반드시!!!!!!)
			//fos.close();위 코드에서 에러가 발생하는 경우 실행이 안될 수 있다.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//마지막에 finally 만들고 써야함 중간에 예외가 발생하면 안되기 때문에
		}
		
		
		
	}
	//외부매체(파일) --->프로그램
	//입력 : 파일로부터 데이터를 읽어들이겟다
	public void fileRead() {
	
		//FileInputStream : 파일로부터 데이터를 1바이트씩 입력받는 스트림.
		FileInputStream fis = null;
		
		try {
			//1.FileInputStream 객체로 입력 스트림 생성
			fis = new FileInputStream("a_byte.txt");//존재하는 파일의 경로제시.
			
			//2.통로로 데이터를 입력받기
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//			System.out.println((char)fis.read());//1byte단위로 하나씩 데이터를 읽어들이는 함수.
//
//			System.out.println(fis.read());//파일에서 더이상 읽어올 데이터가 없는 경우 -1을 반환

			//반복문을 활용하여 파일내부의 모든 데이터 읽어들이기
//			while(true) {//abcdede
//				int value = 0;
//				value = fis.read();
//				if(value == -1)break;
//				System.out.print((char)fis.read());
//			}
		    //방법 2)
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//3.다쓴자원반납
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		}

	
	
	
	
	
}
