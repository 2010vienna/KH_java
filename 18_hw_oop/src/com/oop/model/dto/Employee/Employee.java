package com.oop.model.dto.Employee;

import com.oop.view.MainMenu;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

//	1. Ű�����Է¿� �޼ҵ� : empInput()
	public static void empInput() {
	}
	public static void empOutput() {
	}
//	2. ��¿� �޼ҵ� : empOutput()
//	3. �� ����� �޼ҵ� : setName(String newName) //�̸� �����
//	  => �� �ʵ� �� ����� �޼ҵ� �ۼ�
//	* ����� Ŭ���� : com.oop.run.EmpTest
//	�޴��ۼ� : �޼ҵ� �ۼ�
	
	public static void modify() {
	}

	
	public static void delete() {
	}

	public int getEmpNo() { return empNo; }
	public void setEmpNo(int empNo) { this.empNo = empNo; }
	public String getEmpName() { return empName; }
	public void setEmpName(String empName) { this.empName = empName; }
	public String getDept() { return dept; }
	public void setDept(String dept) { this.dept = dept; }
	public String getJob() { return job; }
	public void setJob(String job) { this.job = job; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public char getGender() { return gender; }
	public void setGender(char gender) { this.gender = gender; }
	public int getSalary() { return salary; }
	public void setSalary(int salary) { this.salary = salary; }
	public double getBonusPoint() { return bonusPoint; }
	public void setBonusPoint(double bonusPoint) { this.bonusPoint = bonusPoint; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
}
