package com.method2.model.vo;

import com.method2.main.Main;

public class Member {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String addr;
	private int age;
	private String phone;
	

	public String getClientInfo() {
		System.out.print("���̵� : ");
		id = Main.CONSOLE.nextLine();
		System.out.print("��� : ");
		pwd = Main.CONSOLE.nextLine();
		System.out.print("�̸� : ");
		name = Main.CONSOLE.nextLine();
		System.out.print("�̸��� : ");
		email = Main.CONSOLE.nextLine();
		System.out.print("�ּ� : ");
		addr = Main.CONSOLE.nextLine();
		System.out.print("���� : ");
		age = Main.CONSOLE.nextInt(); Main.CONSOLE.nextLine();
		System.out.print("��ȭ : ");
		phone = Main.CONSOLE.nextLine();
		
		String s = id + "," + pwd+ "," + name +","+email
			+"," +addr + "," + age + "," + phone;
		return s;
	}
	
	public void insertMember() {
		System.out.print("���̵� : ");
		String id = Main.CONSOLE.nextLine();
		System.out.print("��� : ");
		String pwd = Main.CONSOLE.nextLine();
		System.out.print("�̸� : ");
		String name = Main.CONSOLE.nextLine();
		System.out.print("�̸��� : ");
		String email = Main.CONSOLE.nextLine();
		System.out.print("�ּ� : ");
		String addr = Main.CONSOLE.nextLine();
		System.out.print("���� : ");
		int age = Main.CONSOLE.nextInt(); Main.CONSOLE.nextLine();
		System.out.print("��ȭ : ");
		String phone = Main.CONSOLE.nextLine();

		Member member = new Member();
		member.setId(id);
		member.setPwd(pwd);
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setAge(age);
		member.setPhone(phone);
	}
	
	public void printMember() {
		System.out.println(id+ pwd+name+email+addr+age+phone);
	}

	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public String getPwd() { return pwd; }
	public void setPwd(String pwd) { this.pwd = pwd; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getEmail() { return email; } 
	public void setEmail(String email) { this.email = email; }
	public String getAddr() { return addr; }
	public void setAddr(String addr) { this.addr = addr; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
}
