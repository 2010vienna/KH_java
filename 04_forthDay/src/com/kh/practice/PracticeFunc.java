package com.kh.practice;

import java.util.Scanner;

public class PracticeFunc {
	public static Scanner sc = new Scanner(System.in);

	public void prac() {
		System.out.print("���̸� �Է��ϼ���: ");
		int age = sc.nextInt(); sc.nextLine();
		System.out.print("������ �Է��ϼ���: ");
		char gender = sc.nextLine().charAt(0);

		String msg = age > 19? 
				gender == '��'? "�������ΰ�����." :"���������ΰ�����."
						: "�̼����ڴ� ������ �� �����ϴ�.";
		
		System.out.print(msg);

	}
	
	public void incentive() {
		System.out.print("A�� ������ �Է��ϼ���: ");
		int salA = sc.nextInt(); sc.nextLine();

		System.out.print("B�� ������ �Է��ϼ���: ");
		int salB = sc.nextInt(); sc.nextLine();

		System.out.print("C�� ������ �Է��ϼ���: ");
		int salC = sc.nextInt(); sc.nextLine();

		int sum = salA + salB + salC;
		System.out.print("ȸ�� ������ ������: " + sum + "����");
//
//		String msgA = salA*1.04 >= 3000? "���ν�" : "�������";
//		String msgB = salB >= 3000? "���ν�" : "�������";
//		String msgC = salC >= 3000? "���ν�" : "�������";
//
//		System.out.println("A�� �μ�Ƽ�������� �޿���: " +  + "����\t" + );
////		5 0 1%

		//����
		//����
		//���
		//�μ� + ��/����
	}
}
