package com.kh.practice;

import java.util.Scanner;

public class PracticeFunc {
	public Scanner sc = new Scanner(System.in);

	public void prac() {
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt(); sc.nextLine();
		System.out.print("������ �Է��ϼ���(��/��): ");
		String gender = sc.nextLine();
//		char gender = sc.nextLine().charAt(0);
//		gender == '��'? //char

		String msg = age > 19? 
				gender.equals("��")? "�������� ������.\n" :"���������� ������.\n"
						: "19�����ϸ� �̼����� �Դϴ�.\n";
		
		System.out.print(msg);

	}
	
	public void incentive() {
		System.out.print("\nA�� ������ �Է��ϼ���: ");
		int salA = sc.nextInt(); sc.nextLine();

		System.out.print("B�� ������ �Է��ϼ���: ");
		int salB = sc.nextInt(); sc.nextLine();

		System.out.print("C�� ������ �Է��ϼ���: ");
		int salC = sc.nextInt(); sc.nextLine();

		int raisedA = (int)(salA * 1.05);
		int raisedB = salB;
		int raisedC = (int)(salC * 1.01);

		int sum = salA + salB + salC;
		System.out.println("ȸ�� ������ ������: " + sum + "����");
		System.out.println("ȸ�� ������ �����: " + (double)sum/3 + "����");

		String msgA = raisedA >= 3000? "���ν�" : "�������";
		String msgB = raisedB >= 3000? "���ν�" : "�������";
		String msgC = raisedC >= 3000? "���ν�" : "�������";

		System.out.println("A�� �μ�Ƽ�������� �޿���: " + raisedA + "����\t" + msgA);
		System.out.println("B�� �μ�Ƽ�������� �޿���: " + raisedB + "����\t" + msgB);
		System.out.println("C�� �μ�Ƽ�������� �޿���: " + raisedC + "����\t" + msgC);
	}
}
