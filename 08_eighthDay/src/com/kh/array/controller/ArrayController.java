package com.kh.array.controller;

import java.util.Scanner;

public class ArrayController {
	public static final Scanner CONSOLE= new Scanner(System.in);

	public void arrayTest() {
		//intArr(reference Ÿ�� ����): stack�� �ּҰ� ����
		//������ �ʱ�ȭ ��(�迭)�� heap�� ����
		int[] intArr = new int[5]; //heap �޸𸮿� ����

		//0 if not initialized
		for(int i =0; i<intArr.length; i++) 
			System.out.print(intArr[i] + " ");

		//�ּҰ� ���
		System.out.println("\n" + intArr);

		//�迭�� ����� �� ����
		intArr[0] = 111;
		intArr[1] = 123;
		intArr[2] = 155;
		System.out.println(intArr);

		for(int i =0; i<intArr.length; i++) 
			System.out.println(++intArr[i]);

		for(int i =0; i<intArr.length; i++) 
			intArr[i] = (i+1)*10;
		
		//����� ���ÿ� �ʱ�ȭ
		char[] ch =  {'��', '��', '��', '��', '��', '��'};
		
		for(int i =0; i< ch.length; i++) 
			if(ch[i] == '��') ch[i] = '��';

		System.out.println(ch);
		
		//�Է°����� �迭 �ʱ�ȭ
		for(int i =0; i<intArr.length; i++) {
			System.out.print("�迭�� ������ ���� �Է�:  ");
			intArr[i] = CONSOLE.nextInt(); CONSOLE.nextLine();
		}
		
		/* �迭 ũ�� ���� */
		int[] arr2 = new int[10];
		for(int i =0; i<10; i++)
			arr2[i] = i+1;
		
		arr2 = new int[100];
		for(int i =0; i< arr2.length; i++) {
			arr2[i] = i +1 ;
		}
		for(int i =0; i <arr2.length; i++) {
			System.out.print(arr2[i] + " ");
			if(i==arr2.length-1)
				System.out.println();
		}
	
		String [] strArr = {"����", "�ٳ���", "������", "Ű��", "���"};
		for(int i =0 ;i <strArr.length; i++) {
			if(strArr[i].equals("������")) {
				System.out.println(strArr[i] 
						+ " has index " + i);
			}
		}

		char [] c = new char[5];
		for(int i =0; i<5; i++) {
			System.out.print((i+1) + "��° �Է�: ");
			c[i] = CONSOLE.nextLine().charAt(0);
		}

		System.out.println(c);
		System.out.println("ù��°: " + c[0]);
		System.out.println("������: " + c[c.length - 1]);
		
		
		int [] intArr2 = new int[5];
		for(int i =0; i<5; i++) {
			System.out.print("���� 5 �迭�� �� ���� �Է�: " );
			intArr2[i] = CONSOLE.nextInt();
		}
		
		int sum = 0;
		for(int i =0; i<intArr2.length; i++) {
			System.out.print(intArr2[i]+ " ");
			sum += intArr2[i];

			if(i == intArr2.length - 1) System.out.println();
		}
		System.out.println("�հ�: " + sum);
	}
	
	public void shallowCopy() {
		int[] intArr = {1, 2, 3, 4};
		int[] intCopy = intArr;
		
		System.out.println(intArr);
		System.out.println(intCopy);
		
		for(int i = 0; i<intArr.length; i++) 
			System.out.print(intArr[i] + " ");

		intArr[2] = 2323;

		for(int i = 0; i<intArr.length; i++)
			System.out.print(intCopy[i] + " ");

		System.out.println();
	}
}
