package practice.run;

import java.util.Scanner;

public class Run {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public void selectMenu() {
		System.out.println("*** �޴��� �����ϼ��� ***");
		System.out.println("�ܹ��� ***************");
		System.out.println("1. �Ұ�����	3500��");
		System.out.println("2. ġŲ����	3200��");
		System.out.println("�߰� ****************");
		System.out.println("3. ����Ƣ��	1000��");
		System.out.println("4. ġ�ƽ	400��");
		System.out.println("5. ������		2000��");
		System.out.println("����� ***************");
		System.out.println("6. �ݶ�		700��");
		System.out.println("7. ���̵�		1200��");
		System.out.println("8. Ŀ��		1000��");
		System.out.println("********************");
		int choice = CONSOLE.nextInt(); CONSOLE.nextLine();
		
		switch(choice) {
		case 1:
			System.out.println("�Ұ����Ÿ� �����ϼ̽��ϴ�.");
			break;
		case 2:
			System.out.println("");
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		default:
			break;
				
		}
	}
	
	
	public static void printStar1() {
		System.out.print("���������� �Է�: ");
		int num = CONSOLE.nextInt(); CONSOLE.nextLine();

		String str = "";
		
		for(int i =0 ;i<num; i++) {
			str = String.format("%" + (i+1) + "s", String.valueOf(i+1)).replace(' ', '*');
			System.out.println(str);
		}
	}
	
	public void printStar2() {
//		System.out.println("������ �Է�: ");
//		int num = CONSOLE.nextInt();
//		CONSOLE.nextLine();

	}
}
