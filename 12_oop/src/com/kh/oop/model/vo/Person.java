package com.kh.oop.model.vo;

public class Person {
	private static int pNum = 0;
	private int num;
	private String memberId="p001";
	public static String name;
	private final static int AGE = 19;
	private char gender = '��';
	private String[] hobby;
	private double height;
	private static final double PI = 3.1415;
	
	//default Constructor
	public Person() {}
	
	//constructor
	public Person(String name, String memberId) {
		Person.name = name;
		this.memberId = memberId;
	}
	
	//�ʱ�ȭ���(static/default)
	static {
//		num = 10; //ERROR
		pNum = 10;
		if(pNum == 11) name= "����";
		else name = "ȫ�浿";
	}
	{
		num = pNum++;
		memberId = "000" + pNum;
		gender ='��';
		switch(pNum%2) {
		case 0: gender ='��'; break;
		case 1: gender ='��'; break;
		}
	}

	//setter�޼ҵ�!
	public static void setName(String name) {
		Person.name=name;
	}
	//getter�޼ҵ�!
	public static String getName() {
		return Person.name;
	}
	public void setMemberId(String id) {
		this.memberId = id;
	}
	public String getMemberId() {
		return memberId;
	}
	
	public int getAge() {
		return Person.AGE;
	}
	
	public void printPerson() {
		System.out.println(pNum + " " + num+ Person.name 
				+ Person.AGE+gender+hobby+height);
	}
}
