package com.more.model.vo;

public class Dog extends Animal{

	public Dog(String category, String name) {
		super(category, name);
	}

	@Override
	public void bark() {
		System.out.println("�۸� ��");
	}

	public void action() {
		System.out.println("�������� ������");
	}
}
