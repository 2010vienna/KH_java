package inherit.polymorphism.controller;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.IShape;

public class TestShape {
	public static void main(String[] args) {
		IShape s;

		s = new Circle(15.5);
		System.out.println("������ : " + s.area());
		System.out.println("���ѷ� : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("�簢������ : " + s.area());
		System.out.println("�簢���ѷ� : " + s.perimeter());
	}
}
