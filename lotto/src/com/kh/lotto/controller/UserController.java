package com.kh.lotto.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.lotto.model.vo.User;
import com.kh.lotto.view.MainMenu;

public class UserController {
//	private final static int MAX_CNT = 25;
//	private User[] users = new User[MAX_CNT];
	private HashSet<User> users = new HashSet<User>();

	public void mainMenu() {
		MainMenu.mainMenu();
	}
	
	public void input() {
		User user = MainMenu.inputView();
		users.add(user);
	}

	public void modify() {
		if(users.size() == 0) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		//������ ���� ���̵�
		String username = MainMenu.modifyView();

		/*NOT ALLOWED TO MODIFY
			//username
			//grade
			//date
			//userPoint
			//userMoney
			//gambleRecord
		*/

		//������ ������
		User user = search(username);

		if(user == null) {
			System.out.println("�������� �ʴ� �����Դϴ�.");
		}
		else {
			//password
			System.out.print("��й�ȣ : ");
			String password = MainMenu.CONSOLE.nextLine();
			//accountNumber
			System.out.print("���¹�ȣ : ");
			String accountNumber = MainMenu.CONSOLE.nextLine();
			
			user.setPassword(password);
			user.setAccountNumber(accountNumber);
		}
	}

	public void delete() {
		if(users.size() == 0) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		String username = MainMenu.deleteView();

		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			if(username.equals(user.getUsername())) {
				itr.remove();
				System.out.println("�����͸� �����Ͽ����ϴ�.");
				return;
			}
		}
		System.out.println("�����Ϸ��� �����Ͱ� �����ϴ�.");
	}


	public void search() {
		if(users.size() == 0) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		String username = MainMenu.searchView();
		User user = search(username);
		if(user == null) {
			System.out.println("������ �����ϴ�.");
		}
		else {
			user.showUserInfo();
		}
	}

	public void searchAll() {
		if(users.size() == 0) {
			System.out.println("������ �����ϴ�.");
			return;
		}
		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			user.showUserInfo();
		}
	}

	private User search(String username) {
		Iterator<User> itr = users.iterator();
		User user = null;
		while(itr.hasNext()) {
			user = itr.next();
			if(username.equals(user.getUsername()))
				return user;
		}
		return null;
	}

	public HashSet<User> getUsers() { return users; }
}
