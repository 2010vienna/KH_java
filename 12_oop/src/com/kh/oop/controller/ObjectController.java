package com.kh.oop.controller;

import com.kh.oop.model.vo.Person;
import com.kh.oop.model.vo.Car;

public class ObjectController {

	public void accessTest() {
		new Person().printPerson();
		new Car();
		Person p1=new Person();
		p1.printPerson();
//		���������ں� ������� ����
//		p1.name;//private �϶��� ���ٺҰ�
//		System.out.println(p1.age);

//		public���� ����Ǿ ������ ����
//		System.out.println(p1.age);
		p1.printPerson();
//		p1.gender;//default�� ����Ǽ� �Ұ���
//		default�� ������Ű���������� ������ ����
		p1.setName("�����");
		System.out.println(p1.getName());
		System.out.println(p1.getMemberId());
//		p1.memberId="p002";
	}
}
