package com.method.controller;

import java.util.Scanner;

import com.method.model.vo.Member;

public class MemberController {
	public final static Scanner CONSOLE = new Scanner(System.in);

	public Member enrollMember() {
		Member m = new Member();
		m.setName("�ٹ�");
		m.setEmail("aaa@a.com");
		m.setAddress("����");
		m.setAge(99);
		m.setHeight(999.99);
		m.setWeight(1.113);
		return m;
	}
	
	public void updateMember(Member m) {
		System.out.println("===== ��� ���� ���� =====");
		System.out.print("�̸� : " );
		String name = CONSOLE.nextLine();
		System.out.print("�̸��� : ");
		String email = CONSOLE.nextLine();
		System.out.print("�ּ� : ");
		String address = CONSOLE.nextLine();
		System.out.print("���� : ");
		int age = CONSOLE.nextInt();
		System.out.print("Ű : ");
		double height = CONSOLE.nextDouble();
		System.out.print("������ : ");
		double weight = CONSOLE.nextDouble();
		
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
		m.setAge(age);
		m.setHeight(height);
		m.setWeight(weight);
	}
	
	//overloading
	public void updateMember(int n) {

	}
}
