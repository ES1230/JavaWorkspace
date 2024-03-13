package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		//User user = new User("alsrudals","1234","박상준");
		//User user = new User();
		User user = new User("asdf","12345","dksk",35,'m');
		System.out.println(user.information());
	}

}
