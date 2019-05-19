package com.kh.lotto.view;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;

import com.kh.lotto.controller.UserController;
import com.kh.lotto.main.Main;
import com.kh.lotto.model.vo.User;

interface INPUT_SELECT{
	int INPUT=1, MODIFY=2, DELETE=3, SEARCH=4, SEARCHALL=5, EXIT=0;
}

interface USER_GRADE{
	char A='A', B='B', C='C', D='D', F='F';
}

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);
	static UserController controller = Main.getController();

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
			System.out.print("�޴����� : ");

			choice = CONSOLE.nextInt(); CONSOLE.nextLine();

			switch(choice) {
				case INPUT_SELECT.INPUT: controller.input(); break;
				case INPUT_SELECT.MODIFY: controller.modify(); break;
				case INPUT_SELECT.DELETE: controller.delete(); break;
				case INPUT_SELECT.SEARCH: controller.search(); break;
				case INPUT_SELECT.SEARCHALL: controller.searchAll(); break;
				case INPUT_SELECT.EXIT:
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}while(choice !=9);
	}
	
	public static User inputView() {
		System.out.println("===== ȸ�� ���� =====");

		//username
		System.out.print("���̵� : ");
		String username = CONSOLE.nextLine();

		//password
		System.out.print("��й�ȣ : ");
		String password = CONSOLE.nextLine();

		//grade
		char grade = USER_GRADE.F;

		//date
		LocalDateTime createdDate = LocalDateTime.now();

		//accountNumber
		System.out.print("���¹�ȣ : ");
		String accountNumber = CONSOLE.nextLine();
		
		//userPoint userMoney
		int userPoint = 0;
		int userMoney = 0;

		//gambleRecord
		HashSet<String> gambleRecord = new HashSet<String>();
		
		User user = new User(username, password, grade, createdDate, accountNumber, userPoint, userMoney, gambleRecord);
		return user;
	}
	
	public static String searchView() {
		//username
		System.out.println("===== ȸ�� ��ȸ =====");
		System.out.print("��ȸ�� ����� ���̵� : ");
		String username = CONSOLE.nextLine();
		return username;
	}

	public static String deleteView() {
		//username
		System.out.println("===== ȸ�� ���� =====");
		System.out.print("������ ����� ���̵� : ");
		String username = CONSOLE.nextLine();
		return username;
	}
	
	public static String modifyView() {
		//username
		System.out.println("===== ȸ�� ���� =====");
		System.out.print("������ ����� ���̵� : ");
		String username = CONSOLE.nextLine();
		
		return username;
	}
}
