package com.student.controller;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {
	public static final int MAX_CNT = 5;
	Student[] students = new Student[MAX_CNT];
	
	public void mainMenu() {
		new MainMenu().mainMenu();
	}

	public void enroll() {
		Student s = new MainMenu().enrollView();
		if(Student.getCount() < MAX_CNT) {
			students[Student.getCount()-1] = s;
		}
		else {
			System.out.println("���̻� ����� �� �����ϴ�.");
		}
	}

	public void update() {
		int idx = -1;
		if (Student.getCount() >0) {
			removeNewLine();

			System.out.print("������ �л� �̸�: ");
			String name = MainMenu.CONSOLE.nextLine();
			idx = search(name);

			if(idx > -1) {
				students[idx].printStudent();
				System.out.println("===== �л����� ���� ȭ�� =====");
				System.out.print("����: ");
				char grade = MainMenu.CONSOLE.next().charAt(0);
				System.out.print("��ȣ: ");
				int no = MainMenu.CONSOLE.nextInt();
				System.out.print("����: ");
				double sungjuk = MainMenu.CONSOLE.nextDouble();
				System.out.print("�г�: ");
				int year = MainMenu.CONSOLE.nextInt();
				
				students[idx] = new Student(name, grade, no, sungjuk, year);
			}
		}
		System.out.println("��ϵ� �л��� �����ϴ�.");
	}

	public void search() {
		int idx = -1;
		if (Student.getCount() >0) {
			removeNewLine();

			System.out.print("ã������ �л� �̸�: ");
			String name = MainMenu.CONSOLE.nextLine();
			idx = search(name);
			if(idx != -1) {
				System.out.println("ã�ҽ��ϴ�!");
				students[idx].printStudent();
				return;
			}
		}
		System.out.println("��ϵ� �л��� �����ϴ�.");
	}
	
	public void inputSungjuk() {
		int idx = -1;
		double sungjuk = 0;
		if (Student.getCount() >0) {
			removeNewLine();

			System.out.print("���� �Է��� �л� �̸�: ");
			String name = MainMenu.CONSOLE.nextLine();
			idx = search(name);
			if(idx!= -1) {
				System.out.print("����: ");
				sungjuk = MainMenu.CONSOLE.nextDouble();
				students[idx].setSungjuk(sungjuk);
				return;
			}
		}
		System.out.println("��ϵ� �л��� �����ϴ�.");
	}

	public void delete() {
		if (Student.getCount() >0) {
			int idx = -1;
			removeNewLine();

			System.out.print("ã������ �л� �̸�: ");
			String name = MainMenu.CONSOLE.nextLine();
			idx = search(name);
			if(idx != -1) {
				students[idx] = null;
				for(int i =idx; i<Student.getCount()-1; i++)
					students[i] = students[i+1];
				Student.minusCount();
				System.out.println("���� �Ϸ��Ͽ����ϴ�. "
						+ "�����л���: " + Student.getCount());
				return;
			}
		}
		System.out.println("��ϵ� �л��� �����ϴ�.");
	}
		
	private int search(String name) {
		if (Student.getCount() >0) {
			for(int i =0; i<Student.getCount(); i++) {
				if(students[i].getName().equals(name)) {
					return i;
				}
			}
		}
		return -1;
	}

	private void removeNewLine() {
		if(MainMenu.CONSOLE.hasNextLine())
			MainMenu.CONSOLE.nextLine();
	}
}
