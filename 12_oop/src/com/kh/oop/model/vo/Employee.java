package com.kh.oop.model.vo;

import java.util.Date;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private String job;
	private int foryears;
	private Date enrollDate;

	//default/private ACS�ϰ�� 
	//�ٸ� package���� ����Ʈ�� ��ü ������ ����!
	private Employee() {
		//this : EmployeeŬ���� �ּҰ��� ����
		System.out.println("����Ʈ ������ ȣ��!");
		this.name = "�ٹٹ�";
		this.dept = "�������μ�";
		this.job = "����";
	}

	public Employee(String name, String dept, int sal, String job, int years, Date date) {
		this.name =name;
		this.dept = dept;
		this.salary = sal;
		this.job = job;
		this.foryears = years;
		this.enrollDate = date;
	}
	
	public static Employee getEmployee() {
		return new Employee();
	}
	
	public void printEmployee() {
		System.out.println(name  + dept + salary + 
				job + foryears + enrollDate);
	}
}
