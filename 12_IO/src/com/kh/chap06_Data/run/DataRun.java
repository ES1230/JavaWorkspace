package com.kh.chap06_Data.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataRun {

	public static void main(String[] args) {
		DataRun dr = new DataRun();
		//dr.test1();
		test2();
	
	
	}
	public void test1() {
		//DataOutputStream : 기본자료형 + 문자열 값을 출력할 수 있도록 도와주는 보조스트림
 		//FileOutputStream : 
		
		File f = new File("sample.dat");
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f))){
			
			//자바의 기본자료형별로 작성기능 지원
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeDouble(3.14);
			dos.writeChar('안');
			dos.writeChar('녕');
			dos.writeUTF("자바자바자바");//---------중요
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("작업죵료");
	}
	public static void test2() {
		
		File f = new File("sample.dat");
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			
			//쓰여진 자료형 순서대로 정확하게 읽어올 것
			
			System.out.println(dis.readBoolean());//--순서대로 일치하는 자료값넣어줘야함
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
