package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;

public class MainMenu {
	private final static Scanner CONSOLE = new Scanner(System.in);
	StudentController controller = new StudentController();
	
	public void mainMenu() {
		System.out.println("1.�л����" );
		System.out.println("2.�л�����" );
		System.out.println("3.�л���ȸ" );
		System.out.println("4.�л������Է�" );
		System.out.println("5.�л�����" );
		System.out.println("0.���α׷� ����");
		int choice = CONSOLE.nextInt(); 
		
		do {
			switch(choice) {
				case 1:
				case 2:
			}
		}while(choice != 0);
	}
	
}
