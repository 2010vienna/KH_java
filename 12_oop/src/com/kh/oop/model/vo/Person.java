package com.kh.oop.model.vo;

public class Person {
	private static int pNum = 0;
	public static String name;
	private final static int AGE = 19;

	private int num;
	private String memberId="p001";
	private char gender = '��';
	private double height;
	private String[] hobby;
	
	public Person() {}
	
	public Person(String name, String memberId) {
		Person.name = name;
		this.memberId = memberId;
	}
	
	//static �ʱ�ȭ���static
	static {
		//num = 10; //ERROR
		pNum = 10;
		if(pNum == 11) name= "����";
		else name = "ȫ�浿";
	}
	//�ʱ�ȭ���
	{
		num = pNum++;
		memberId = "000" + pNum;
		gender ='��';
		switch(pNum%2) {
			case 0: gender ='��'; break;
			case 1: gender ='F'; break;
		}
	}

	//setter, getter�޼ҵ�!
	public static String getName() { return Person.name; }
	public void setMemberId(String id) { this.memberId = id; }
	public String getMemberId() { return memberId; }
	public static int getAge() { return Person.AGE; }
	
	public void printPerson() {
		System.out.println(Person.pNum + num+ Person.name + Person.AGE
				+gender+hobby+height);
	}
}
