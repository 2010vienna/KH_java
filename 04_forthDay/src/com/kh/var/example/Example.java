package com.kh.var.example;

import java.util.Scanner;

public class Example {
	public Scanner sc = new Scanner(System.in);

	public void example1() {
		System.out.print("ù��° ����: ");
		int n1 = sc.nextInt();
		System.out.print("�ι�° ����: ");
		int n2 = sc.nextInt(); sc.nextLine();

		int add = n1 +n2;
		int minus = n1 - n2;
		int multi = n1 * n2;
		int div = n1 / n2;
		int mod = n1 % n2;

		System.out.println("���ϱ� ���: " + add);
		System.out.println("���� ���: " + minus);
		System.out.println("���ϱ� ���: " + multi);
		System.out.println("�������� ��: " + div);
		System.out.println("�������� ������: " + mod);
	}
	
	public void example2() {
		System.out.print("����: ");
		double width = sc.nextDouble();
		System.out.print("����: ");
		double height = sc.nextDouble(); sc.nextLine();
		
		System.out.println("����: " + width*height);
		System.out.println("�ѷ�: " + 2*(width+height));
	}
	
	public void example3() {
		System.out.print("���ڿ��� �Է��Ͻÿ�(����3�� �̻� �ܾ�): ");
		String str = sc.nextLine();
		System.out.println("ù��° ����: " + str.charAt(0));
		System.out.println("�ι�° ����: " + str.charAt(1));
		System.out.println("����° ����: " + str.charAt(2));
	}
}
