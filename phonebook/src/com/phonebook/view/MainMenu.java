package com.phonebook.view;

import java.util.Scanner;

import com.phonebook.controller.PhoneBookManager;
import com.phonebook.model.vo.PhoneInfo;

public class MainMenu {
	public static final Scanner CONSOLE = new Scanner(System.in);
	PhoneBookManager mgr = new PhoneBookManager();

	public void mainMenu() {
		int choice = -1;
		do {
			System.out.println("�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ����");
			System.out.println("4. ���α׷� ����");
			System.out.print("����: ");
			choice = CONSOLE.nextInt();
			switch(choice) {
				case 1: mgr.readData(); break;
				case 2: mgr.searchData(); break;
				case 3: mgr.deleteData(); break;
				case 4: 
					System.out.println("���α׷��� �����մϴ�...");
					return;
				default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�...");
					break;
			}
		}while(choice != 4);
	}
	
	public PhoneInfo readDataView() {
		if(CONSOLE.hasNextLine())
			CONSOLE.nextLine();
		System.out.println("===== ������ �Է� =====");
		System.out.print("  �̸� : ");
		String name = MainMenu.CONSOLE.nextLine();
		System.out.print("  ��ȭ : ");
		String phone = MainMenu.CONSOLE.nextLine();
		System.out.print("  ���� : ");
		String birth = MainMenu.CONSOLE.nextLine();
		
		PhoneInfo info = new PhoneInfo(name, phone, birth);
		return info;
	}
}
