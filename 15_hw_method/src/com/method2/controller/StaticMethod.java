package com.method2.controller;

public class StaticMethod {
	private static String value;
	//TODO
	//Constructor  : �ʵ尡 ��� static �� ���� ������ �ʿ����
	public StaticMethod(){}

	public StaticMethod(String value){
		this.value = value;
	}

	//value �ʵ� �� ����� : �ʵ尡 static�̸� setter �� static �̾�� ��
	//value �ʵ� �� ��ȸ�� : �ʵ尡 static �̸� getter �� static �̾�� ��

	//�ʵ尡 ��� static �� ���� �޼ҵ嵵 ���� static �̾�� ��
	//static method
	//1. ��ȯ�� ���� �Ű����� ���� �޼ҵ�
	//value �ʵ� ���� ��� �빮�ڷ� �ٲٴ� static �޼ҵ�
	//�޼ҵ�� : toUpper
	
	public void toUpper() {
		value = value.toUpperCase();
	}


	//2. ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	//�ε����� ���ڸ� ���޹޾�
	//value �ʵ忡�� ���޹��� �ε��� ��ġ�� ���� ���޹��� ���ڷ� �����ϴ� static �޼ҵ�
	//�޼ҵ�� : setChar

	//3. ��ȯ�� �ְ� �Ű����� ���� static �޼ҵ�
	//value �ʵ忡 ��ϵ� ���ڰ��� ���� ó��
	//�޼ҵ�� : valueLength

	//4. ��ȯ�� �ְ� �Ű����� �ִ� static �޼ҵ�
	//���ڿ����� ���޹޾�, value �ʵ尪�� �ϳ��� ���ļ� ���� ó��
	//�޼ҵ�� : valueConcat
}