package com.kh.lotto.view;

import java.util.Scanner;

import com.kh.lotto.controller.UserController;
import com.kh.lotto.model.vo.User;

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);
	static UserController controller = new UserController();
	
	public static void mainMenu() {
		int choice = 0;
		do {
			System.out.println("===== ȸ�� �������� ���α׷� =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ����");
			System.out.println("3. ȸ�� Ż��");
			System.out.println("4. ȸ�� ��ȸ");
			System.out.println("5. ȸ�� ��ü��ȸ");
			System.out.println("0. ���α׷� ����");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();
			switch(choice) {
				case 1: controller.input(); break;
				case 2: controller.update(); break;
				case 3: controller.delete(); break;
				case 4: controller.search(); break;
				case 5: controller.searchAll(); break;
				case 0: System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}while(choice !=9);
	}
	
	public static User inputView() {
		System.out.println("===== ȸ�� �߰� ���α׷� =====");
		System.out.print("���̵� : ");
		String username = CONSOLE.nextLine();
		System.out.print("��й�ȣ : ");
		String password = CONSOLE.nextLine();
		System.out.print("���¹�ȣ : ");
		String accountNumber = CONSOLE.nextLine();
		
		User user = new User(username, password, accountNumber);
		return user;
	}
	
	
}
