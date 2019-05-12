package com.student.controller;

import com.student.model.vo.Student;
import com.student.view.MainMenu;

public class StudentController {
	private static final int MAX_CNT = 5;
	private Student[] students = new Student[MAX_CNT];
	
	public void mainMenu() {
		new MainMenu().mainMenu();
	}
	
	public void enroll() {
		if(Student.getCount() < MAX_CNT) {
			Student s = new MainMenu().enrollView();
			students[Student.getCount()-1] = s;
		}
		else {
			System.out.println("  ���̻�  ��� �� �� �����ϴ�.");
		}
	}

	public void update() {
		if(Student.getCount() == 0) {
			System.out.println("  ��ϵ� �л��� �����ϴ�.");
			return;
		}
		System.out.print("  ������ �л��̸� : "); readNewLine();
		String name=MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if (idx != -1) {
			System.out.println("====�л����� ȭ��====");
			System.out.print("  �г�(1~3): ");
			int year=MainMenu.CONSOLE.nextInt();
			System.out.print("  ��ȣ : ");
			int number=MainMenu.CONSOLE.nextInt();
			System.out.print("  ����(���) : ");
			double score =MainMenu.CONSOLE.nextDouble();

			Student s = new Student(number, name, year, score);
			students[idx] = s;
		}
		else {
			System.out.println("  �������� �ʴ� �л��Դϴ�.");
		}
	}
	
	public void search() {
		if(Student.getCount() == 0) {
			System.out.println("  ��ϵ� �л��� �����ϴ�.");
			return;
		}
		System.out.print("  ��ȸ�� �л��̸� : "); readNewLine();
		String name=MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if(idx != -1) {
			System.out.println("  " + name + "�л��� " + (idx+1) + " ��° �ڸ����� ã�ҽ��ϴ�.");
			students[idx].printStudent();
		}
		else {
			System.out.println("  �������� �ʴ� �л��Դϴ�.");
		}
	}

	public void updateScore() {
		if(Student.getCount() == 0) {
			System.out.println("  ��ϵ� �л��� �����ϴ�.");
			return;
		}
		System.out.print("  ���� ���� �� �л��̸� : "); readNewLine();
		String name=MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if (idx != -1) {
			students[idx].printStudent();
			System.out.print("  ���� �Է�(0~100): ");
			double score = MainMenu.CONSOLE.nextDouble();
			students[idx].setScore(score);
			System.out.println("  " + students[idx].getGrade() + " �Դϴ�.");
		}
		else {
			System.out.println("  �������� �ʴ� �л��Դϴ�.");
		}
	}

	public void delete() {
		if(Student.getCount() == 0) {
			System.out.println("  ��ϵ� �л��� �����ϴ�.");
			return;
		}
		System.out.print("  ������ �л��̸� : "); readNewLine();
		String name=MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if (idx != -1) {
			students[idx] = null;
			students[Student.getCount() -1] = null;
			for(int i=idx; i<Student.getCount()-1; i++) {
				students[i] = students[i+1];
			}
			Student.setCount(Student.getCount() - 1);
		}
		else {
			System.out.println("  �������� �ʴ� �л��Դϴ�.");
		}
	}
	
	private int search(String name) {
		for(int i =0; i<Student.getCount(); i++) {
			if(students[i].getName().equals(name))
				return i;
		}
		return -1;
	}
	
	//remove new line character from buffer
	private void readNewLine() {
		if(MainMenu.CONSOLE.hasNextLine())
			MainMenu.CONSOLE.nextLine();
	}
}