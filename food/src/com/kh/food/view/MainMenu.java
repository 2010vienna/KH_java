package com.kh.food.view;

import java.util.Scanner;

import com.kh.food.model.vo.User;

interface INIT_MENU {
	int SIGNUP=1, SIGNIN=2, EXIT=0;
}

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);


	public static void mainMenu() {
		System.out.println("=== �޴� ���� ===");
		System.out.println("1. ȸ�� ����");
		System.out.println("2. �α���");
		System.out.println("0. �޴� ����.");
		int choice = -1;
		do {
			switch(choice) {
				case INIT_MENU.SIGNUP:
					break;
				case INIT_MENU.SIGNIN:
					break;
				case INIT_MENU.EXIT:
					return;
			}
		}while(choice != 0);
	}
	
	public static User signUpView() {
		System.out.println("ȸ�� �̸� : ");
		String username = CONSOLE.nextLine();
		System.out.println("ȸ�� ��ȭ : ");
		String phone = CONSOLE.nextLine();
		System.out.print("ȸ�� �̸��� : " );
		String email = CONSOLE.nextLine();
		System.out.print("ȸ�� �ּ� : ");
		String address = CONSOLE.nextLine();
		
		User user = new User(username, phone, email, address);
		return user;
	}

	public static String signInView() {
		System.out.print("�ڵ��� ��ȣ : ");
		String phone = CONSOLE.nextLine();

		return phone;
	}
}
