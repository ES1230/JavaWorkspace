package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		File f = new File(file);
		return f.isFile();//해당 file의 파일인지 아닌지 , 생성되었던건지 처음 생성되는건지 true/false값 알려줌
	}
	public void fileSave(String file,String s) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			fw.write(s);
			fw.flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		FileReader fr = null;
		try {
			fr= new FileReader(file);
			
			int value = 0;
			while((value = fr.read()) != -1){
				sb.append((char)value);	
			
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		return sb;
		
		
	}
	public void fileEdit(String file,String s) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file,true);
			fw.write(s);
			fw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}
