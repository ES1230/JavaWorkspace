package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		// FileDAO(fd)의 checkName() 매개변수로 file을 넘겨주고
		// 그리고 그 반환 값을 그대로 받아 또 반환해줌	
		return fd.checkName(file);
	
	}
	public void fileSave(String file,StringBuilder sb) {
		String s =sb.toString();//매개변수로 넘어온 sb를 String으로 바꾸는 법
		fd.fileSave(file,s);
	}
	public StringBuilder fileOpen(String file) {
		
		return fd.fileOpen(file);
	}
	public void fileEdit(String file,StringBuilder sb) {
		
		String s = sb.toString();
		fd.fileEdit(file, s);
	}
}
