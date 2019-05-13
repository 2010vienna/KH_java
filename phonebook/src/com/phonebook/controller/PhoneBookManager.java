package com.phonebook.controller;

import com.phonebook.model.vo.PhoneInfo;
import com.phonebook.view.MainMenu;

public class PhoneBookManager {
	static final int MAX_CNT = 5;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	
	private static PhoneBookManager inst = null;
	
	public static PhoneBookManager createManagerInst() {
		if(inst == null)
			inst = new PhoneBookManager();
		return inst;
	}
	
	private PhoneBookManager(){}
	
	public void mainMenu() {
		new MainMenu().mainMenu();
	}
	
	public void readData() {
		if(PhoneInfo.getCurCnt() < MAX_CNT) {
			PhoneInfo info = new MainMenu().readInfo();
			if(info!= null) {
				infoStorage[PhoneInfo.getCurCnt()-1] = info;
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			}
		}
		else {
			System.out.println("��ȭ��ȣ�ΰ� �� á���ϴ�...");
		}
	}
	
	public void searchData() {
		if(PhoneInfo.getCurCnt() == 0) {
			System.out.println("��ȭ��ȣ�ΰ� ����ֽ��ϴ�.");
			return;
		}
		System.out.print("ã������ �̸� �Է�: "); readNewLine();
		String name = MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if(idx <0) {
			System.out.println("ã������ �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println("ã�� ������: ");
			infoStorage[idx].showPhoneInfo();
		}
	}
	
	public void deleteData() {
		if(PhoneInfo.getCurCnt() == 0) {
			System.out.println("��ȭ��ȣ�ΰ� ����ֽ��ϴ�.");
			return;
		}
		System.out.print("������� �̸� �Է�: "); readNewLine();
		String name = MainMenu.CONSOLE.nextLine();
		int idx = search(name);
		if(idx <0) {
			System.out.println("�����Ϸ��� �����Ͱ� �����ϴ�.");
		}
		else {
			for(int i =idx; i<PhoneInfo.getCurCnt()-1; i++)
				infoStorage[idx] = infoStorage[idx+1];

			infoStorage[PhoneInfo.getCurCnt() -1] = null;
			PhoneInfo.setCurCnt(PhoneInfo.getCurCnt() - 1);
			System.out.println("�����͸� �����Ͽ����ϴ�.");
		}
		
	}
	
	private int search(String name) {
		PhoneInfo info = null;
		for(int i =0; i<PhoneInfo.getCurCnt(); i++) {
			info = infoStorage[i];
			if(name.compareTo(info.getName()) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	//remove new line character from buffer
	private void readNewLine() {
		if(MainMenu.CONSOLE.hasNextLine())
			MainMenu.CONSOLE.nextLine();
	}

}