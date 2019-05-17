package com.person.Controller;

import com.person.model.vo.Student;
import com.person.model.vo.Teacher;
import com.person.model.vo.Employee;
import com.person.model.vo.Person;

public class PersonController {
	public void personEnroll() {
		Person[] persons = new Person[3];
		persons[0] = new Student("�ٹ�", 2, 'M', "��⵵", 3, 3);
		persons[1] = new Employee("�˸�", 2, 'M', "����", "������", 100);
		persons[2] = new Teacher("������", 22, 'M', "����", "����", 5);
		
		for(int i =0; i<persons.length; i++) {
			String msg = persons[i].getName();
			if(persons[i] instanceof Student) {
				Student s = (Student)persons[i];
				msg += s.getGrade() + s.getSungjuk();
				System.out.println(msg);
			}
			else if(persons[i] instanceof Employee){
				Employee e= (Employee)persons[i];
				System.out.println(e.getName());
			}
			else if(persons[i] instanceof Teacher) {
				Teacher t = (Teacher)persons[i];
				System.out.println(t.getName());
			}
		}
		
		//�������ε����� ���
		for(Person p : persons) {
			System.out.println(p);
			System.out.println(p.getName());
			if(p.getAge() > 23) {
				System.out.println("���̰� �����ϴ�.");
			}
		}
	}
}
