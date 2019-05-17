package com.oop.view;

import java.util.Scanner;

import com.oop.controller.EmployeeController;
import com.oop.model.dto.Employee.Employee;
import com.oop.run.EmpTest;

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);
	static EmployeeController controller = EmpTest.getController();

	public static void mainMenu() {
		int choice = 0;
		do {
			System.out.println("1.��� �Է�");
			System.out.println("2.��� ����");
			System.out.println("3.��� ����");
			System.out.println("4.��� ���");
			System.out.println("9.���α׷� ����");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();
			switch(choice) {
				case 1: 
				case 2:
				case 3:
				case 4:
				case 9: System.out.println("���α׷��� �����մϴ�."); return;
			}
		} while(choice != 9);
	}
	
	public static Employee inputView() {
		return null;
	}
}
