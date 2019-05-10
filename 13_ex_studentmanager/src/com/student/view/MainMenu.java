package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainMenu {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public void mainMenu() {
		int choice = 0;
		StudentController controller = new StudentController();
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
			case 2: controller.enroll(); break;
			case 3: controller.enroll(); break;
			case 4: controller.enroll(); break;
			case 5: controller.enroll(); break;
			case 6: System.out.println("���α׷��� �����մϴ�..."); return;
			default:
				System.out.println("�߸��� �޴� ��ȣ �Դϴ�...");
				break;
			}
		}while(choice!= 6);
	}
	
	public Student enrollView() {
		if(CONSOLE.hasNextLine())
			CONSOLE.nextLine();

		System.out.println("===== �л���� ȭ�� =====");
		System.out.print("��ȣ: ");
		int number = CONSOLE.nextInt(); CONSOLE.nextLine();

		System.out.print("�̸�: ");
		String name = CONSOLE.nextLine();

		System.out.print("�г�: ");
		int year = CONSOLE.nextInt();

		System.out.print("����: ");
		char grade = CONSOLE.next().charAt(0);

		System.out.print("��: ");
		int classRoom = CONSOLE.nextInt();

		System.out.print("����: ");
		double score = CONSOLE.nextDouble();
		
		return new Student(number, name, year, grade, classRoom, score);
	}
	
	public void delete() {
		if(Student.getCount() > 0) {
			
		}
		
	}
	
	public void search() {
		
	}
	
	public void update() {
		
	}
	
	public void inputScore() {
		
	}
}
