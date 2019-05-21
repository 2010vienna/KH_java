package com.kh.food.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.food.model.vo.User;
import com.kh.food.view.MainMenu;

public class UserController {
	HashSet<User> users = new HashSet<User>();
	
	public void mainMenu() {
		MainMenu.mainMenu();
	}

	public void signUp() {
		User user = MainMenu.signUpView();
		boolean isAdded = users.add(user);
		if(isAdded)
			System.out.println("ȸ�������� ���������� ó���Ǿ����ϴ�.");
		else
			System.out.println("ȸ�����Կ� �����Ͽ����Ѵ�.");
	}

	public void signIn() {
		String phone = MainMenu.signInView();
		Iterator<User> itr = users.iterator();
		while(itr.hasNext()) {
			if(itr.next().getPhone().equals(phone)) {
				System.out.println("�α��� �ƽ��ϴ�.");
			}
		}
		
		System.out.println("�α��ο� ���� �Ͽ����ϴ�.");

	}
	public void search() {
	}
}
