package logic.view;

import login.controller.Function;

import java.util.Scanner;

public class Menu {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public static void displayMenu() {
		int choice = 0;

		do {
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū������ �հ豸�ϱ� ");
			System.out.println("3. �Ż����� Ȯ���ϱ�");
			System.out.println("4. �л����� ���� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ� ");
			System.out.println("6. ���������� �հ� ���ϱ� ");
			System.out.println("7. ������ ");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ���� ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է�: ");

			choice = CONSOLE.nextInt();
			switch(choice) {
			case 1: 
				new Function().calculator();
				break;
			case 2:
				new Function().totalCalculator();
				break;
			case 3:
				new Function().profile();
				break;
			case 4:
				new Function().sungjuk();
				break;
			case 5:
				new Function().printStarNumber();
				break;
			case 6:
				new Function().sumRandomNumber();
				break;
			case 7:
				 new Function().continueGugudan();
				 break;
			case 8:
				new Function().shutNumber();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}while(choice != 9);
	}
}
