package login.controller;

import java.util.Scanner;

public class Function {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public void calculator() {
		System.out.print("ù��° ����: ");
		int n1 = CONSOLE.nextInt(); 
		System.out.print("�ι�° ����: ");
		int n2 = CONSOLE.nextInt(); CONSOLE.nextLine();
		System.out.print("���깮��: ");
		char operator= CONSOLE.nextLine().charAt(0); 
		
		int result = 0;

		switch(operator) {
		case '+': result = n1 + n2;
			break;
		case '-': result = n1 - n2;
			break;
		case '*': result = n1 * n2;
			break;
		case '/': 
			if (n2==0) {
				System.out.println("0���� ���� �� �����ϴ�");
				result = 0;
			}
			else 
				result = n1 /n2;
			break;
		default:
			System.out.println("�����ڸ� �߸��Է��ϼ̽��ϴ�.");
			break;
		}

		System.out.println(n1 + " " + operator + " " + n2 + " = " + result);
	}

	public void totalCalculator() {
		System.out.print("����1 �Է�: ");
		int n1 = CONSOLE.nextInt();
		System.out.print("����2 �Է�: ");
		int n2 = CONSOLE.nextInt();
		
		int small = n1<n2? n1:n2;
		int big = n1>n2? n1:n2;

		int sum = 0;
		for(int i =small; i<= big; i++) 
			sum += i;
		
		System.out.println(small + "���� " + big 
				+" ������ �հ�: " + sum);
	}
	
	public void profile() {
		System.out.print("�̸�: ");
		String name = CONSOLE.nextLine();
		System.out.print("����");
		int age = CONSOLE.nextInt(); CONSOLE.nextLine();
		System.out.print("����: ");
		char gender = CONSOLE.nextLine().charAt(0);
		gender = gender =='M'? '��': gender=='F'? '��' :'\u0000';
		System.out.print("����: ");
		String personality = CONSOLE.nextLine();

		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("����: " + gender + "��");
		System.out.println("����: " + personality );
	}

	public void sungjuk() {
		System.out.print("�̸�: ");
		String name = CONSOLE.nextLine();
		System.out.print("�г�: ");
		int year = CONSOLE.nextInt();
		System.out.print("��: ");
		int classRoom = CONSOLE.nextInt();
		System.out.print("��ȣ: ");
		int number = CONSOLE.nextInt(); CONSOLE.nextLine();
		System.out.print("����(M/F): ");
		char gender = CONSOLE.nextLine().charAt(0);
		gender = gender =='M'? '��': gender=='F'? '��' :'?';
		System.out.print("����: ");
		double grade = CONSOLE.nextDouble(); CONSOLE.nextLine();
		
		char letterGrade = '\u0000';
		if(grade >= 90)
			letterGrade = 'A';
		else if(grade>=80)
			letterGrade = 'B';
		else if(grade >= 70)
			letterGrade = 'C';
		else if (grade >=60)
			letterGrade = 'D';
		else
			letterGrade ='F';

		System.out.printf("%d�г� %d�� %d�� %c�л� %s�� ������ %.2f�̰�, %c�����Դϴ�.\n",
				year, classRoom, number, gender, name, grade, letterGrade);
	}
	
	public void printStarNumber() {

	}
	
	public void sumRandomNumber() {
		
	}

	public void continueGugudan() {
		
	}
	
	public void shutNumber() {
		
	}
}
