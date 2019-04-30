package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public void switchTest() {
		System.out.println("����� ��̴�? ");

		System.out.print("��̸� ������"
				+ "(1.�ڵ� 2.���� 3.���� 4.��Ʃ��): ");
		int choice = CONSOLE.nextInt();

		switch(choice) {
		case 1: System.out.println("wow"); break;
		case 2: System.out.println("�α⼭�� ����..."); break;
		case 3: System.out.println("�α���� ����..."); break;
		case 4: System.out.println("�α⵿����..."); break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. 1~4���׸��� �������ּ���...");
			break;
		}

		System.out.print("��̸� ������"
				+ "(��.�ڵ� ��.���� ��.���� ��.��Ʃ��): ");
		char ch = CONSOLE.next().charAt(0); CONSOLE.nextLine();

		switch(ch) {
		case '��': System.out.println("wow"); break;
		case '��': System.out.println("�α⼭�� ����..."); break;
		case '��': System.out.println("�α���� ����..."); break;
		case '��': System.out.println("�α⵿����..."); break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. 1~4���׸��� �������ּ���...");
			break;
		}
		
		System.out.print("��̸� ������"
				+ "(�ڵ�, ����, ����, ��Ʃ��): ");
		String str = CONSOLE.nextLine();

		switch(str) {
		case "�ڵ�": printMsg(); break;
		case "����": System.out.println("�α⼭�� ����..."); break;
		case "����": System.out.println("�α���� ����..."); break;
		case "��Ʃ��": System.out.println("�α⵿����..."); break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�. 1~4���׸��� �������ּ���...");
			return;
		}
	}

	public void printMsg() {
		if(1<0) System.out.println("wow");
		else System.out.println("ȭ����");
	}
	
	public void fruitPrice() {
		System.out.print("������ �ñ��� �����̸��� �Է��ϼ���\n"
				+ "(���, �ٳ���, ������, Ű��): ");
		String fruit = CONSOLE.nextLine();
		
		switch(fruit) {
		case "���":
			System.out.println(fruit + "�� ������ 1000�� �Դϴ�.");
			break;
		case "�ٳ���":
			System.out.println(fruit + "�� ������ 3000�� �Դϴ�.");
			break;
		case "������":
			System.out.println(fruit + "�� ������ 2000�� �Դϴ�.");
			break;
		case "Ű��":
			System.out.println(fruit + "�� ������ 5000�� �Դϴ�.");
			break;
		default:
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}
	
	public void chooseProgramMenu() {
		System.out.println("*******�ʱ� �޴�********");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴���ȣ �Է� : ");

		int choice = CONSOLE.nextInt(); CONSOLE.nextLine();

		switch(choice) {
		case 1: System.out.println("�Է¸޴� ����"); break;
		case 2: System.out.println("�����޴� ����"); break;
		case 3: System.out.println("��ȸ�޴� ����"); break;
		case 4: System.out.println("�����޴� ����"); break;
		case 7: System.out.println("���α׷��� �����մϴ�."); break;
		default: System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.\r\n" + 
					"���α׷� �����մϴ�.");
			break;
		}
	}

	public void chooseBunsik() {
		System.out.println("*******�� ��********");
		System.out.println("������ ----------------1000");
		System.out.println("��� ------------------ 2000");
		System.out.println("���� ------------------ 1000");
		System.out.println("���� ------------------ 2000");
		System.out.println("Ƣ�� ------------------ 3000");
		System.out.println("��Ƣ�� ---------------- 8000");
		System.out.print("�޴���ȣ �Է� : ");

		String food = CONSOLE.nextLine();
		
		switch(food) {
		case "������": System.out.println(food + "�� 1000�� �Դϴ�."); break;
		case "���": System.out.println(food + "�� 2000�� �Դϴ�."); break;
		case "����": System.out.println(food + "�� 1000�� �Դϴ�."); break;
		case "����": System.out.println(food + "�� 2000�� �Դϴ�."); break;
		case "Ƣ��": System.out.println(food + "�� 3000�� �Դϴ�."); break;
		case "��Ƣ��": System.out.println(food + "�� 8000�� �Դϴ�."); break;
		default: System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. \n"
					+ "���α׷��� �����մϴ�.");
			break;
		}
	}
	
	public void chooseMcFood() {
		System.out.println("*******�� ��********");
		System.out.println("a. �ܹ��� ----------------3000");
		System.out.println("b. ����Ƣ�� ------------- 2000");
		System.out.println("c. ġŲ ------------------ 5000");
		System.out.println("d. ���̴� ---------------- 1000");
		System.out.println("e. �ݶ� ------------------ 1000");
		System.out.print("�޴���ȣ �Է� : ");

		char choice = CONSOLE.nextLine().charAt(0);
		
		switch(choice) {
		case 'a': System.out.println("�ܹ��Ŵ� 300���Դϴ�.");
			break;
		case 'b': System.out.println("�ܹ��Ŵ� 3000���Դϴ�.");
			break;
		case 'c': System.out.println("����Ƣ���� 2000���Դϴ�.");
			break;
//		c ���ý� ��ġŲ�� 5000���Դϴ�.�� ���
//		d ���ý� �����̴ٴ� 1000���Դϴ�.�� ���
//		e ���ý� ���ݶ��� 1000���Դϴ�.�� ���
//		�ٸ����� �Է½� ����ȣ�� �߸� �ԷµǾ����ϴ�. ���α׷�
//		�����մϴ�.��
		}
	}
	
	public void computeGrade() {
		System.out.print("������ �Է��ϼ���: ");
		int score = CONSOLE.nextInt(); 

		char grade = '\u0000';
		System.out.println(grade);

		switch(score/10) {
			case 10:
			case 9:
				grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			case 5: case 4: case 3: case 2: case 1: case 0:
				grade = 'F'; break;
			default:
				System.out.println("������ �߸��Է� �ϼ̽��ϴ�. \n"
						+ "1~100������ ������ �����մϴ�.");
		}

		System.out.println(score + "�� " + grade + "�Դϴ�.");
	}
	
	public void computeSal() {
		System.out.print("�� �޿� �Է� : ");
		int sal = CONSOLE.nextInt(); CONSOLE.nextLine();

		System.out.print("�� ���� �Է� : ");
		int profit = CONSOLE.nextInt(); CONSOLE.nextLine();
		int profitBonus = 0;
		double bonusRate = 0.0;

		if(profit >= 5000) {
			bonusRate = .05;
			profitBonus = (int)(profit*bonusRate);
		}
		else if (profit >= 3000) {
			bonusRate = .03;
			profitBonus = (int)(profit*bonusRate);
		}
		else if (profit >= 1000) {
			bonusRate = .01;
			profitBonus = (int)(profit*bonusRate);
		}

		sal += profitBonus;
		System.out.println("============");
		System.out.println("����� : " + profit);

		System.out.println("���ʽ��� : " + bonusRate);
		System.out.println("���ʽ��ݾ� : " + profitBonus);
		System.out.println("============");
		System.out.println("�� �޿� : " + sal);
	}
}
