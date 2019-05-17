package com.practice2.model.entity;

public class Book {
	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}

	// Object Ŭ������ toString() �޼ҵ� �������̵���
//		=> ��ü�� ��� �ʵ尪 ���ڿ� ��ġ���ؼ� ������
//	// Object Ŭ������ equals() �޼ҵ� �������̵���
//		=> �� ��ü�� ��� �ʵ尪�� ��ġ�ϴ����� ���
//			��� ��ġ�ϸ� true, 
//		   	�ϳ��� �ٸ��� false�� ������
//	// Object Ŭ������  clone() �޼ҵ� �������̵���
//		=> ���������ڴ� public ���� ������
//		=> ����ó���� ������
//		=> this �� ���޵� ��ġ�� ��ü�� ���� ���� ������ �� ��ü �����ϰ�
//		    �ּ� ������
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
