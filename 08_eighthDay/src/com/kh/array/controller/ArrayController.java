package com.kh.array.controller;

import java.util.Scanner;

public class ArrayController {
	public static final Scanner CONSOLE= new Scanner(System.in);

	public void arrayTest() {
		//intArr(reference Ÿ�� ����): stack�� �ּҰ� ����
		//������ �ʱ�ȭ ��(�迭)�� heap�� ����
		//array�� ��ü
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
	}

	/*�ǽ�1*/
	public void changeArraySize() {
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
			if(i==arr2.length-1) System.out.println();
		}
	}
	
	/*�ǽ�2*/
	public void findFruit() {
		String [] fruitArr = {"����", "�ٳ���", "������", "Ű��", "���"};
		for(int i =0 ;i <fruitArr.length; i++) {
			if(fruitArr[i].equals("������")) {
				System.out.println(fruitArr[i] 
						+ " has index " + i);
			}
		}
	}

	/*�ǽ�3*/
	public void printArrElement() {
		char [] c = new char[5];
		for(int i =0; i<5; i++) {
			System.out.print((i+1) + "��° �Է�: ");
			c[i] = CONSOLE.nextLine().charAt(0);
		}
		System.out.println(c);
		System.out.println("ù��°: " + c[0]);
		System.out.println("������: " + c[c.length - 1]);
	}
	
	/*shallow copy*/
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
	
	/*�ǽ�4*/
	public void countLetter() {
		System.out.print("���ڿ� �Է�: ");
		String str = CONSOLE.nextLine();
		System.out.print("���� �Է�: ");
		char ch = CONSOLE.nextLine().charAt(0);

		char[] charArr = str.toCharArray();

		int count = 0;
		for(int i =0 ; i<charArr.length; i++) {
			if (charArr[i] == ch)
				count++;
		}
		System.out.println("�Է��Ͻ� ���ڿ� " + str +"����\n"
				+ "ã���ô� ���� \'" + ch + "\'�� " + count + "�� �Դϴ�.");
	}
	
	public void hideID() {
		System.out.print("�ֹε�� ��ȣ �Է� : ");
		String id = CONSOLE.nextLine();

		char[] charArr = id.toCharArray();
		char[] copyArr = new char[id.length()];

		System.arraycopy(charArr, 0, copyArr, 0, charArr.length);
//		copyArr = charArr.clone();

		for(int i =0 ; i<copyArr.length; i++) {
			if (i>=7) copyArr[i] = '*';
			System.out.print(copyArr[i]);
		}
	}
	
	public void makeOddArray() {
		System.out.print("Ȧ���� �Է��ϼ��� (0���� ū): ");
		int length = CONSOLE.nextInt();
		int[] oddArray = new int[length];
		int count = 0;
		
		for(int i =0; i<length; i++) {
			if(i <=length/2)
				oddArray[i] = ++count;
			else
				oddArray[i] = --count;
			System.out.print(oddArray[i] + " ");
		}
	}
	
	public void lottoGenerator() {
		int[] lottoNums = new int[7];
		int random = 0;

		//�ζ� ��ȣ ����
		for(int i =0; i<lottoNums.length; i++) {
			random = (int)(Math.random()*45 + 1);

			lottoNums[i] = random;

			for (int j= 0; j<i; j++) {
				if (lottoNums[j] == random) {
					i--;
					break;
				}
			}
		}
		
		//�ζ� ��ȣ �������� ����
		int temp = 0;
		for(int i = 0; i<lottoNums.length; i++) {
			for(int j = i ; j < lottoNums.length; j++) {
				if (lottoNums[j] < lottoNums[i]) {
					temp = lottoNums[i];
					lottoNums[i] = lottoNums[j];
					lottoNums[j] = temp;
				}
			}
		}

		System.out.println("�ζ� ��ȣ ��÷��� : ");
		for(int i =0; i<lottoNums.length; i++)
			System.out.print(lottoNums[i] + " ");
	}
}
