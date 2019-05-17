package com.inheritance.main;

import com.inheritance.vo.model.Employee;
import com.inheritance.vo.model.Person;
import com.inheritance.vo.model.Student;
import com.inheritance.vo.model.Teacher;
import com.more.contoller.MoreController;

public class Main {
	public static void main(String[] args) {
		Person[] persons = new Person[4];

		persons[0] = new Employee("ȫ�浿", 22, 'M', "����", "������", 500);
		persons[1] = new Student("�ٹ�", 11, 'M', "�λ�", 2, 'B');
		persons[2] = new Teacher("������", 10, 'F', "��õ", "����", 7);
		persons[3] = new Person("���", 13, 'F', "����");

		System.out.println(persons[0]);
		

		new MoreController().createChara();
	}
}
