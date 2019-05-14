package com.method2.controller;

public class NonStaticSample {
	public NonStaticSample() {}
	
	public void printLottoNumber() {
		int[] lottoResult = new int[6];
		int lottoNum = 0, count = 0;
		boolean duplicate = false;
		do {
			lottoNum = (int)(Math.random()*45+1);
			for(int i =0; i<count; i++) {
				if(lottoNum == lottoResult[i]) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				lottoResult[count++] = lottoNum;
				System.out.print(lottoNum);
				if(count ==6) System.out.println();
				else System.out.print(" ");
			}
		}while(count < 6);
	}
	
	public void outputChar(int num, char ch) {
		for(int i =0; i<num; i++) {
			System.out.print(ch + " ");
			if (i == num -1)
				System.out.println();
		}
	}
	
	//TODO
	public char alphabette() {
		int shift = (int)(Math.random()*26);
		char a = 'a';
//		char A = 'A';

		return (char)(a+shift);
	}
	
	public String mySubstring(String str, int begin, int end) {
		if(begin >= 0 && begin <str.length()
				&& begin <= end && end <str.length()) {
			return str.substring(begin, end);
		}
		else {
			return null;
		}
	}
	
	//TODO
	//int �Ѱ��� ���ް��� �޾Ƽ�, �迭�� �ּҸ� �����ϴ� �޼ҵ�
	//ó���� ���� : ���޹��� ���� ������ŭ�� �迭������ �Ҵ��Ͽ�, 
	//         ������ 1���� 100������ ������ �� ����ϰ� �ּ� ������
	//�޼ҵ� �� : intArrayAllocation
	//�Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
	public int intArrayAllocation(int length) {
		return 0;
	}

	//�޼ҵ� �� : display
	//�Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	//ó���� ���� : �迭�� ���޹޾� ȭ�鿡 �����
	public void display(int[] arr) {
		for (int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
	//�޼ҵ�� : swap
	//�Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	//ó���� ���� : �迭��, �� ������ �ε����� ���޹޾� �� �ε����� ���� ��ȯ��
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//TODO
	//�޼ҵ�� : sortDescending
	//�Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	//ó���� ���� : ������ �ۼ��� swap �޼ҵ带 �̿��Ͽ� �迭�� �� ���� �������� ���� ó����
	public void sortDescending(int[] arr) {
		
	}
	
	//TODO
	//�޼ҵ�� : sortAscending
	//�Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	//ó���� ���� : swap �޼ҵ带 �̿��Ͽ� �迭�� ������ �������� ������
	public void sortAscending(int[] arr) {
		
	}
	
	
	//1. ���ڿ��� ���� �ϳ��� ���޹޾�, ���ڿ��� ���Ե� ������ ������ �����ϴ� �޼ҵ�
	//���Ե� ���ڰ� ������ 0 ������
	//�޼ҵ�� : countChar
	public int countChar(String str, char c) {
		int count = 0;
		for(int i =0; i<str.length(); i++) {
			if (str.charAt(i) == c)
				count++;
		}
		return count;
	}
	
	
	//2. ���� �� ���� ���޹޾�, �� ���� ���� ������ ū �������� �������� �հ踦 ���ؼ�
	//�����ϴ� �޼ҵ�
	//�޼ҵ�� : totalValue
	public int totalValue(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int sum = 0;
		for(int i =min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	//���ڿ��� �ε����� ���޹޾�, �� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
	//�޼Ҹ�� : pCharAt
	public char pCharAt(String str, int i) {
		return str.charAt(i);
	}
	
	//�� ���� ���ڿ��� ���޹޾�, �ϳ��� ���ڿ��� ���ļ� �����ϴ� �޼ҵ�
	//�޼ҵ�� : pConcat
	public String pConcat(String s1, String s2) {
		return s1+s2;
	}
}
