package cast.practice;

import java.util.Scanner;

public class CastingSample {
	public Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		System.out.print("���� �Է�: ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch + " is unicode: " + (int)ch);
	}
	
	public void calculatorScore() {
		System.out.print("����: ");
		double kor = sc.nextDouble(); 
		System.out.print("����: ");
		double eng = sc.nextDouble();
		System.out.print("����: ");
		double math = sc.nextDouble(); sc.nextLine();
		
		int total = (int)(kor+eng+math);
		int avg = total/3;
		System.out.println("����: " + total);
		System.out.println("���: " + avg);
	}
	
	public void printBitCount() {
		System.out.print("���� �Է�: ");
		int num = sc.nextInt(); sc.nextLine();
		

		System.out.printf("%d�� 2������ ���Ե� 1�� ����: %d", 
				num, Integer.bitCount(num));
	}
}
