package phonebook;

import java.util.Scanner;
/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * Version 0.1
 */

class PhoneInfo{

	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth = birth;
	}
	
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}
	
	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
		if(birth != null)
			System.out.println("birth : " + birth);
		
		System.out.println();
	}
}

class PhoneBookManger {
	static final int MAX_CNT = 100;
	PhoneInfo[] infoStorage = 
			new PhoneInfo[MAX_CNT];
	int curCnt = 0;
	
	public void putData() {
		System.out.println("������ �Է��� �����մϴ�. ");
		if(PhoneBookVer01.CONSOLE.hasNextLine()) PhoneBookVer01.CONSOLE.nextLine();

		System.out.print("�̸� : ");
		String name = PhoneBookVer01.CONSOLE.nextLine();
		System.out.print("��ȭ : ");
		String phone = PhoneBookVer01.CONSOLE.nextLine();
		System.out.print("���� : ");
		String birth = PhoneBookVer01.CONSOLE.nextLine();

		if(curCnt >= MAX_CNT) {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�...");
		}
		infoStorage[curCnt++] = new PhoneInfo(name, phone, birth);
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void searchData() {
		System.out.print("ã������ �̸� �Է�: ");
		String name = PhoneBookVer01.CONSOLE.nextLine();
		int idx = search(name);
		if(idx <0) {
			System.out.println("ã������ �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println("ã�� ������: ");
		}
	}
	
	public void deleteData() {
		System.out.print("������� �̸� �Է�: ");
		String name = PhoneBookVer01.CONSOLE.nextLine();
		int idx = search(name);
		if(idx <0) {
			System.out.println("�����Ϸ��� �����Ͱ� �����ϴ�.");
		}
		else {
			for(int i =idx; i<curCnt-1; i++)
				infoStorage[idx] = infoStorage[idx+1];

			curCnt--;
			System.out.println("�����͸� �����Ͽ����ϴ�.");
		}
		
	}
	
	private int search(String name) {
		PhoneInfo info = null;
		for(int i =0; i<curCnt; i++) {
			info = infoStorage[i];
			if(name.compareTo(info.name) == 0) {
				return i;
			}
		}
		return -1;
	}

}
public class PhoneBookVer01 {
	static final Scanner CONSOLE = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ���α׷� ����");
		System.out.print("����: ");
	}
	
	public static void readData() {

	}

	public static void main(String[] args) {
		int choice = 0;
		while(true) {
			showMenu();
			choice = CONSOLE.nextInt();
			switch(choice) {
			case 1: readData(); break;
			case 2: 
				System.out.println("���α׷��� �����մϴ�...");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�...");
				break;
			}
		}
	}
}
