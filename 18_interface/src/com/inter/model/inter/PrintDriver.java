package com.inter.model.inter;

public interface PrintDriver {
	//���� ����� ����
	//final static�� ����Ʈ�̸�, ���� ����
	public final static int TEST = 19;
	public final static String MSG ="��������";

	//public abstract�� ����Ʈ�̸�, ���� ����
	public abstract String printDriver();

	void printInfo();
}
