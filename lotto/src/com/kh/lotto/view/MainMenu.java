package com.kh.lotto.view;

import com.kh.lotto.model.vo.User;

public class MainMenu {
	
	public static void mainMenu() {
		System.out.println("********** ȸ�� �������� ���α׷�  **********");
		System.out.println("1. ȸ�� ���� �Է�  => clientInput() �޼ҵ� ���� - �θ޴� �ۼ�");
		System.out.println("2. ȸ�� ���� ���� => clientEdit() �޼ҵ� ���� - �θ޴� �ۼ�");
		System.out.println("3. ȸ�� ���� ���� => clientDelete");
		System.out.println("4. ȸ������ ��� =>  clientOutput() �޼ҵ� ����");
		System.out.println("0. ������");

	}
	
	public static User inputView() {
		System.out.println("********** ȸ�� �߰� ���α׷� **********");
		System.out.println("1.���̵� : ");
		System.out.println("2.��й�ȣ : ");
		System.out.println("3.���¹�ȣ : ");
		System.out.println("4.�̸��� : ");
		return null;
	}
}
