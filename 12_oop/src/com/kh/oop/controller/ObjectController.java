package com.kh.oop.controller;

import com.kh.oop.model.vo.Person;
import com.kh.oop.model.vo.Car;
import com.kh.oop.model.vo.Member;

public class ObjectController {
	public void accessTest() {
		//1. static �������� ��밡���ϰ� ������ �����ϴ°�
		//	��������� heap�� �ƴ� static ������ �����
		//	���α׷� ���۰� ���ÿ� ��������� ������.
		System.out.println(new Person().hashCode());
		new Person().printPerson(); //0x222

		Person p1 = new Person(); //0x123
		p1.printPerson();
		System.out.println(p1.hashCode());

		//���������ں� ������� ����
//		p1.name; //ERROR if private
		//'public' static
		Person.name = "�󰡰���";
		//static������ �ν��Ͻ�����ó�� ���� X
		p1.name = "0�ٹ�";
		Person.setName("1����");
		
		//static method
		Person.getName();

//		System.out.println(p1.gender);
		System.out.println(p1);
		p1.setName("������");
		System.out.println(p1.getName());
	}
	
	public void initialBlock() {
		Person p1 = new Person();
		p1.printPerson();
		Person p2 = new Person();
		p2.printPerson();
		p1.printPerson();
	}
}