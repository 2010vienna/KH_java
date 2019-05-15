package com.oop.view;

import java.util.Scanner;

import com.oop.model.dto.Employee.Employee;

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);

	public static void mainMenu(){
		int choice = 0;
		
		do {
			System.out.println("******* ��� ���� ���� ���α׷� ************");
			System.out.println("1. �� ��� ���� �Է�");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ������� ���");
			System.out.println("9. ������");
			choice = CONSOLE.nextInt();
			
			switch(choice) {
				case 1: Employee.empInput(); break;
				case 2: Employee.modify(); break;
				case 3: Employee.delete(); break;
				case 4: Employee.empOutput(); break;
				case 9: System.out.println("���α׷��� �����մϴ�."); return;
				default: System.out.println("�޴���ȣ�� �߸� �Է� �ϼ̽��ϴ�.");
			}
	//		1.�Է�  => empInput() �޼ҵ� ����
	//		2. ��� ���� ���� => �θ޴� ��Ÿ��
	//		3. ��� ���� ����
	//		4. ������� ��� =>  empOutput() �޼ҵ� ����
	//		9. ������
		} while(choice!= 9);
	}


	public static Employee modifyMenu(Employee e){
		System.out.println("**** ��� ���� ���� �޴� *****");
		System.out.println("1. �̸� ���� => setEmpName()");
		System.out.println("2. �޿� ���� => setSalary()");
		System.out.println("3. �μ� ���� => setDept()");
		System.out.println("4. ���� ���� => setJob()");
		System.out.println("5. ���� �޴��� �̵� ");
		int choice = CONSOLE.nextInt(); CONSOLE.nextLine();
		switch(choice) {
			case 1: System.out.print("�̸�: ");
				e.setEmpName(CONSOLE.nextLine()); break;
			case 2: System.out.print("�޿�: ");
				e.setSalary(CONSOLE.nextInt()); CONSOLE.nextLine(); break;
			case 3: System.out.print("�μ�: ");
				e.setDept(CONSOLE.nextLine()); break;
			case 4: System.out.print("����: ");
				e.setJob(CONSOLE.nextLine()); break;
			case 5: System.out.print("���� �޴��� �̵� ");
				e.setEmpName(CONSOLE.nextLine()); break;
			default:
				System.out.println("�߸��� �޴��Է� �Դϴ�.");
				break;
		}
		return e;
	}
	
}
