package com.kh.day2;

public class DeclareVariable {
	//��������: memory ����Ȯ��
	//������ �ּҰ��� ��ǻ�Ͱ� �˼� ���� -> ������ �̸� ����
	//���� ���� & ������ �� assign�� ������ literal�� default �ڷ��� ����
	//''	char
	//""	String
	//123	int
	//3.14	double
	public void addValue() {
		//����
		boolean flag;
		flag = true;
		System.out.println(flag);
		flag = false;
//		flag = 1000; ERROR assigning int to boolean!
		System.out.println(flag);

		//������(����, ���ڿ�)
		//���Ϲ���
		char gender;
		gender = 'M';
		gender = '��';
//		gender = "M"; ERROR
//		gender = 'AB'; ERROR
//		gender = ��; ERROR it looks for �� variable
		System.out.println(gender);
		
		//���ڿ� ""
		String name = "�ٹ�";
		String msg = "�ȳ��ϼ��� ����" + name + " �Դϴ�.";
		System.out.println(msg);
		
		//������(����, �Ǽ�)
		byte bnum = 100; // int -> byte
//		bnum = 128;  ERROR; ����(-128~127) ���
		//90000 short�� ǥ���Ҽ� �ִ� ������ ����� literal���̱�
		//������, �ڵ�����ȯ �Ͼ�� ����.
		short snum = 10000; //int->short �ڵ�����ȯ
		int intNum = 90000;
		long longNum = 900000; // int->long �ڵ�����ȯ
//		longNum = 900000000000; //ERROR int �����ʰ�
		longNum = 900000000000L;

		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(intNum);
		System.out.println(longNum);
		
		//�Ǽ� (float, double)
		float fnum;
		double dnum;
		fnum = 180.5f; //ERROR if 180.5
		// double-> float �ڵ�����ȯ �Ұ�
		dnum = 65.5;
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(65.5); // �ڵ� double �� �޸𸮰����� ����
		
		long num = 9000000;
		System.out.println(num*10);
		System.out.println(num*20);
		System.out.println(num*30);
		
		//����� ���� �� ����
		final int AGE;
		AGE = 19;
		System.out.println(AGE);
//		AGE = 20;// ERROR
		
		//���� + ���� = > ����
		//����+���� + ���� = > ������ + ����
		String msg2 = "�ȳ�! ���� ...";
		System.out.println(msg2);
		msg2 = new String("�ȳ� �� �ƾƤ�");
		System.out.println(msg2);
		
		//���ڿ����� +��ȣ�� ���Ῥ������ ���
		msg2 += "����� " + 19 + 1+ " �� �Դϴ�."; //191
		msg2 += "����� " + (19 + 1)+ " �� �Դϴ�."; //20
		msg2+= 19+1 + "�� �Դϴ�."; //20
		System.out.println(msg2);

		String nameOfStudent = "������";
		int age = 19;
		String address = "����� ���Ǳ�";

		String msg3 = "���� " + nameOfStudent + " �̴�."
					+ ",\n���� " + age+ " ���̴�.\n"
					+ address + "�� ����ִ�.";
		System.out.println(msg3);

		String memberName = name;
		System.out.println(memberName);
		int plusAge = age+ 2;
		System.out.println(plusAge);
		
		//byte data overflow Test: -128~127 
		byte bnum1 = 127;
		for(int i=0 ;i <300; i++) {
			System.out.println(bnum1++);
		}
	}
}
