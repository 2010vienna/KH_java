package com.kh.oop.controller;

import java.util.Date;

import com.kh.oop.model.vo.Employee;
import com.kh.oop.model.vo.Person;

public class ObjectController {
	public void accessTest() {
		//1. static �������� ��밡���ϰ� ������ �����ϴ°�
		//	���α׷� ���۰� ���ÿ� static������ �����
		new Person().printPerson(); //0x222
		System.out.println(new Person().hashCode());

		Person p1 = new Person(); //0x123
		p1.printPerson();
		System.out.println(p1.hashCode());

		//���������ں� ������� ����
//		p1.name; //ERROR if private
		//'public' static
		Person.name = "����";
		//static������ �ν��Ͻ�����ó�� ���� X
		//p1.name = "0�ٹ�";
		
		//static method
		Person.getName();

//		System.out.println(p1.gender);
		System.out.println(p1);
		Person.name = "������";
		System.out.println(Person.getName());
	}
	
	public void initialBlock() {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.printPerson();
		p2.printPerson();
	}

	public void constructorTest() {
		Employee e = Employee.getEmployee(); //when private Employee()
		Employee e1 = new Employee("ȫ�浿", "�����", 100, "������", 1, new Date());
		
		e.printEmployee();
		e1.printEmployee();
	}
}