package com.more.model.vo;

public class Cat extends Animal{
	public Cat(String category, String name) {
		super(category, name);
	}
	
	@Override
	public void bark() {
		System.out.println("�߿�!");
	}

	public void clean() {
		System.out.println("�չ� ��������.");
	}
}