package com.kh.food.model.vo;

import java.io.Serializable;
import java.util.Map;

import com.kh.food.view.MainMenu;

@SuppressWarnings("serial")
public class User implements Serializable {
	private String username;
	private String phone;
	private String email;
	private String address;
	private boolean logged; //�α��� ���� ����
	private Map<String, Integer> orderList;
	
	public void mainMenu() {
		MainMenu.mainMenu();
	}

	public User(String username, String phone, String email, String address,
			boolean logged, Map<String, Integer> orderList) {
		super();
		this.username = username;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.logged = logged;
		this.orderList = orderList;
	}

	public void showUserInfo() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\n",
							username, phone, email, address,
							(logged? "�α�ON":"�α�OFF"));
		for(Map.Entry<String, Integer> entry : orderList.entrySet())
			System.out.println("\t[" + entry.getKey() + ", " +entry.getValue() + "��]");
//		System.out.println(username);
//		System.out.println("��ȭ: " + phone);
//		System.out.println("�̸��� : "  + email);
//		System.out.println("�ּ� : " + address);
//		System.out.println("�α��λ���: " + (logged? "�α�ON":"�α�OFF"));
	}
	
	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		if(phone.equals(user.getPhone()))
			return true;
		else
			return false;
	}
	
	//getter setter
	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }
	public boolean isLogged() { return logged; } 
	public void setLogged(boolean logged) { this.logged = logged; }
	public Map<String, Integer> getOrderList() { return orderList; }
	public void setOrderList(Map<String, Integer> orderList) { this.orderList = orderList; }
}
