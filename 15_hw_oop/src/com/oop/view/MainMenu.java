package com.oop.view;

import java.util.Scanner;

import com.oop.model.dto.Employee;

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
				case 1: break;
				case 2: break;
				case 3:
					break;
				case 4:
					break;
				case 9:
					break;
				default:
					System.out.println("�޴���ȣ�� �߸� �Է� �ϼ̽��ϴ�.");
					break;
			}
	//		1.�Է�  => empInput() �޼ҵ� ����
	//		2. ��� ���� ���� => �θ޴� ��Ÿ��
	//		3. ��� ���� ����
	//		4. ������� ��� =>  empOutput() �޼ҵ� ����
	//		9. ������
		} while(choice!= 9);
	}


	public static void modifyMenu(Employee e){
//			Employee emp = new Employee();
		//setter �̿��ؼ� Ű����� �Է¹��� �� ��ü �ʵ忡 ���
//			return emp;
	}

//	**** ��� ���� ���� �޴� *****
//		1. �̸� ���� => setEmpName()
//		2. �޿� ���� => setSalary()
//		3. �μ� ���� => setDept()
//		4. ���� ���� => setJob()
//		5. ���� �޴��� �̵� => return ó���� ��
}
