package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	public static final Scanner CONSOLE = new Scanner(System.in);
	StudentController controller = new StudentController();

	public void mainMenu() {
		int choice = 0;
		do {
			System.out.println("===�л����� ���α׷�===");
			System.out.println("1. �л����");
			System.out.println("2. �л�����");
			System.out.println("3. �л� ��ȸ");
			System.out.println("4. �л� �����Է�");
			System.out.println("5. �л� ����");
			System.out.println("6. ���α׷� ����");
			System.out.print("�Է�: ");
			choice = CONSOLE.nextInt();

			switch(choice) {
				case 1: controller.enroll(); break;
				case 2: controller.update(); break;
				case 3: controller.search(); break;
				case 4: controller.inputSungjuk(); break;
				case 5: controller.delete(); break;
				case 6: System.out.println("���α׷��� �����մϴ�...");
					System.exit(0);
				default: System.out.println("�߸��� �޴� ��ȣ �Դϴ�...");
			}
		}while(choice!= 6);
	}
	
	public Student enrollView() {
		if(CONSOLE.hasNextLine())
			CONSOLE.nextLine();

		System.out.println("===== �л���� ȭ�� =====");
		System.out.print("�̸�: ");
		String name = CONSOLE.nextLine();
		System.out.print("����: ");
		char grade = CONSOLE.next().charAt(0);
		System.out.print("��ȣ: ");
		int no = CONSOLE.nextInt();
		System.out.print("����: ");
		double sungjuk = CONSOLE.nextDouble();
		System.out.print("�г�: ");
		int year = CONSOLE.nextInt();
		
		Student s = new Student(name, grade, no, sungjuk, year);

		return s;
	}
	

}
