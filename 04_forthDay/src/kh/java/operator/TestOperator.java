package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	public Scanner sc = new Scanner(System.in);

	public void operFunc1() {
		System.out.print("���� �Է�: ");
		int num = sc.nextInt(); sc.nextLine();
		num /= 100;
		num *= 100;
		
		System.out.println("���: " + num);
	}
	
	public void operFunc2() {
		System.out.print("����  ����: ");
		int fruit = sc.nextInt();
		System.out.print("�ٱ��� ���� ��: ");
		int fruitPerBox = sc.nextInt(); sc.nextLine();
		
		int boxNum = fruit/fruitPerBox + 1;
		int lastBoxFruit = fruit % fruitPerBox;
		
		System.out.printf("%d���� ������ �������� %d���� �ʿ��մϴ�.\n"
				+ "������ �ٱ��Ͽ��� %d���� ������ �ֽ��ϴ�.", 
				fruit, boxNum, lastBoxFruit);
	}
	
	public void operFunc3() {
		System.out.print("���� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		int unicode = (char)ch;

		unicode = unicode > 90? unicode -32: unicode +32;
		System.out.println(ch + " -> " + (char)unicode);
	}
}
