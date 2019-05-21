package com.kh.food.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.kh.food.controller.UserController;
import com.kh.food.main.Main;
import com.kh.food.model.vo.User;

interface INIT_MENU {
	int SIGNUP=1, SIGNIN=2, LOGOFF=3, ORDER=4, VIEW_ORDER=5, SHOW_USERS=6, EXIT=0;
}

interface LOGGED{
	boolean OFF=false, ON=true;
}

interface FOOD{
	String BURGER="BURGER", CHICKEN="CHICKEN", COKE="COKE", MILK="MILK";
}

interface FOOD_MENU{
	int BURGER=1, CHICKEN=2, COKE=3, MILK=4, EXIT=0;
}

public class MainMenu {
	public final static Scanner CONSOLE = new Scanner(System.in);
	static UserController controller = Main.getController();
	
	private final static Map<String, Integer> FOOD_PRICE = 
			new HashMap<String, Integer>(){
		{
			put(FOOD.BURGER, 2000);
			put(FOOD.CHICKEN, 9000);
			put(FOOD.COKE, 1000);
			put(FOOD.MILK, 500);
		};
	};

	public static void mainMenu() {
		int choice = -1;
		do {
			System.out.println("=== Ȩ������ ===");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. �α���");
			System.out.println("3. �α׿���");
			System.out.println("4. �ֹ� �ϱ�");
			System.out.println("5. �ֹ� ��ȸ");
			System.out.println("6. �մ���Ȳ ��ȸ");
			System.out.println("0. ���α׷� ����.");
			System.out.print("�޴� �Է�: ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();
			switch(choice) {
				case INIT_MENU.SIGNUP: controller.signUp(); break;
				case INIT_MENU.SIGNIN: controller.signIn(); break;
				case INIT_MENU.LOGOFF: controller.logOff(); break;
				case INIT_MENU.ORDER: controller.order(); break;
				case INIT_MENU.VIEW_ORDER: controller.viewOrder(); break;
				case INIT_MENU.SHOW_USERS: controller.showUsers(); break;
				case INIT_MENU.EXIT:
					controller.logOff();
					controller.storeToFile();
					System.out.println("���α׷��� �����մϴ�.");
					return;
			}
		}while(choice != 0);
	}
	
	public static User signUpView() {
		System.out.println("=== ȸ�� ���� ===");
		System.out.print("ȸ�� �̸� : ");
		String username = CONSOLE.nextLine();
		System.out.print("ȸ�� ��ȭ : ");
		String phone = CONSOLE.nextLine();
		System.out.print("ȸ�� �̸��� : " );
		String email = CONSOLE.nextLine();
		System.out.print("ȸ�� �ּ� : ");
		String address = CONSOLE.nextLine();
		
		User user = new User(username, phone, email, address, LOGGED.OFF,
				new HashMap<String, Integer>());
		return user;
	}

	public static String signInView() {
		System.out.println("=== ȸ�� �α��� ===");
		System.out.print("�ڵ�����ȣ : ");
		String phone = CONSOLE.nextLine();

		return phone;
	}

	public static Map<String,Integer> orderView(){
		Map<String, Integer> orderList =new HashMap<String,Integer>();
		int total = 0;
		int choice = -1;
		int qty = 0;
		do {
			System.out.println("=== ���� �޴� ===");
			System.out.println("  1. �ܹ��� --- 2,000");
			System.out.println("  2. ġŲ --- 9,000");
			System.out.println("=== ���� �޴� ===");
			System.out.println("  3. �ݶ� --- 1,000");
			System.out.println("  4. ���� --- 500");
			System.out.println("  0. �ֹ� ����");
			System.out.print(" ��ȣ�Է�: ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();
			switch(choice) {
				case FOOD_MENU.BURGER:
					System.out.print("\t ����: ");
					qty = CONSOLE.nextInt();
					orderList.put(FOOD.BURGER, qty);
					total += FOOD_PRICE.get(FOOD.BURGER) * qty;
					break;
				case FOOD_MENU.CHICKEN:
					total += FOOD_PRICE.get(FOOD.CHICKEN);
					System.out.print("\t ����: ");
					qty = CONSOLE.nextInt();
					orderList.put(FOOD.CHICKEN, qty);
					total += FOOD_PRICE.get(FOOD.CHICKEN) * qty;
					break;
				case FOOD_MENU.COKE:
					total += FOOD_PRICE.get(FOOD.COKE);
					System.out.print("\t ����: ");
					qty = CONSOLE.nextInt();
					orderList.put(FOOD.COKE, qty);
					total += FOOD_PRICE.get(FOOD.COKE) * qty;
					break;
				case FOOD_MENU.MILK:
					total += FOOD_PRICE.get(FOOD.MILK);
					System.out.print("\t ����: ");
					qty = CONSOLE.nextInt();
					orderList.put(FOOD.MILK, qty);
					total += FOOD_PRICE.get(FOOD.MILK) * qty;
					break;
				case FOOD_MENU.EXIT:
					System.out.println("�ֹ��� �Ϸ��Ͽ����ϴ�.");
					return orderList;
			}
		}while(choice!= 0);
		
		return new HashMap<String,Integer>();
	}

	//getter setter
	public Integer[] getFoodCount() {
		Integer[] arr = FOOD_PRICE.values().toArray(new Integer[0]);
		return arr;
	}
}
