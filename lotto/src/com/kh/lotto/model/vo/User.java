package com.kh.lotto.model.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Iterator;

public class User {
    private String username;
    private String password;
    private char grade; //ȸ�����
    private LocalDateTime createdDate;
	private String accountNumber;
    private int userPoint;
    private int userMoney;
    private HashSet<String> gambleRecord;
    
    public User() {}
    
    public User(String username, String password, char grade, LocalDateTime createdDate, String accountNumber,
			int userPoint, int userMoney, HashSet<String> gambleRecord) {
		super();
		this.username = username;
		this.password = password;
		this.grade = grade;
		this.createdDate = createdDate;
		this.accountNumber = accountNumber;
		this.userPoint = userPoint;
		this.userMoney = userMoney;
		this.gambleRecord = gambleRecord;
	}

	public User(String username, String password, String accountNumber) {
		super();
		this.username = username;
		this.password = password;
		this.grade = 'F';
		this.createdDate = LocalDateTime.now();
		this.accountNumber = accountNumber;
	}

	public String getUsername() { return username; }
	public void setUsername(String username) { this.username = username; }
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	public char getGrade() { return grade; }
	public void setGrade(char grade) { this.grade = grade; }
	public LocalDateTime getCreatedDate() { return createdDate; }
	public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
	public String getAccountNumber() { return accountNumber; }
	public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
	public int getUserPoint() { return userPoint; }
	public void setUserPoint(int userPoint) { this.userPoint = userPoint; }
	public int getUserMoney() { return userMoney; }
	public void setUserMoney(int userMoney) { this.userMoney = userMoney; }
	public HashSet<String> getGambleRecord() { return gambleRecord; }
	public void setGambleRecord(HashSet<String> gambleRecord) { this.gambleRecord = gambleRecord; }
	
	public void showUserInfo() {
		System.out.println("���̵� : " + username);
		System.out.println("ȸ����� : " + grade);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("�������� : " + createdDate.format(formatter));

		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("����Ʈ : " + userPoint);
		System.out.println("�ܾ�ĳ�� : " + userMoney);
		System.out.println("�÷����� ���� : ");

		Iterator<String> itr = gambleRecord.iterator();
		String record = null;
		while(itr.hasNext()) {
			record = itr.next();
			System.out.println(record);
		}
	}
}
