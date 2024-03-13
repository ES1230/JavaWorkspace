package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		Book b1 = new Book("이거","adsf","asdf");
		Book b2 = new Book("이거","adsf","asdf",300,2.3);
		b.inform();
		b1.inform();
		b2.inform();
		
	}

}
