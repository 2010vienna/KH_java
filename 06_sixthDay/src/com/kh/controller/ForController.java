package com.kh.controller;

import java.util.Scanner;

public class ForController {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public void forTest() {

		/* 100~1���*/
		for(int i = 1; i <= 100; i++) 
			System.out.print(101-i + " ");

		/* 1~100 �հ� ���*/
		int sum = 0;
		for(int i = 1; i <= 100; i++)
			sum += i;
		System.out.println("\n1~100������ ��: " + sum);

		/* 1~100�� ¦�� �� ���*/
		int evenSum = 0;
		for(int i = 1; i <= 100; i++) {
			if (i%2 == 0)
				evenSum += i;
		}
		System.out.println("1~100���� ¦���� ��: " + evenSum);
		
		/* 1~100 Ȧ�� �� ���*/
		int oddSum = 0;
		for(int i=1 ; i<= 100; i++) {
			if(i%2== 1)
				oddSum += i;
		}
		System.out.println("Ȧ�� ��: " + oddSum);
		
		/* �Է� ���� ���̸�ŭ "����" ���*/
		System.out.print("������ �ݺ��� ���� �Է�: ");
		int n = CONSOLE.nextInt();

		String subak = "";
		for(int i =0; i<n; i++) {
			if(i%2 ==0)
				subak += "��";
			else
				subak += "��";
		}
		System.out.println(subak);
		
		/*9x9 ��*/ 
		System.out.print("������ ����� ���� �Է�(1~9): ");
		int level = CONSOLE.nextInt(); 
		for(int i =1; i<10; i++) {
			System.out.println(level + " X " + i + " = " +(level*i));
		}

		// for(i =0 ;i < CONSOLE.nextInt(); i++) 
		// ������ for�� �������� �Է� �ؾ���... i < ������ �Ź� �ٲ�.
	}
}
