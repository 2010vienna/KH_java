package logic.home.view;

import java.util.Scanner;

import logic.home.model.VariableSample;
import logic.home.model.PrimitiveTypeSample;
import logic.home.model.IfSample;
import logic.home.model.SwitchSample;
import logic.home.model.ForSample;
import logic.home.model.WhileSample;
import logic.home.model.DoWhileSample;
import logic.home.model.BreakSample;
import logic.home.model.ContinueSample;
import logic.home.model.StaticMethodSample;
import logic.home.model.NonStaticMethodSample;


public class Menu {
	public static final Scanner CONSOLE = new Scanner(System.in);

	public static void mainMenu(){
		int choice = 0;
		char answer = '\u0000';
		
		do {
			System.out.println("***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****");
			System.out.println("1. ���� �׽�Ʈ");
			System.out.println("2. �⺻ �ڷ��� �׽�Ʈ");
			System.out.println("3. if�� �׽�Ʈ");
			System.out.println("4. switch�� �׽�Ʈ");
			System.out.println("5. for�� �׽�Ʈ");
			System.out.println("6. while�� �׽�Ʈ");
			System.out.println("7. do~while�� �׽�Ʈ");
			System.out.println("8. break�� �׽�Ʈ");
			System.out.println("9. continue�� �׽�Ʈ");
			System.out.println("10. static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("11. non-static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("12. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();
			
			switch(choice)
			{
			case 1: subVarMenu(); break;
			case 2: subPTypeMenu(); break;
			case 3: subIfMenu(); break;
			case 4: subSwitchMenu(); break;
			case 5: subForMenu(); break;
			case 6: subWhileMenu(); break;
			case 7: subDoWhileMenu(); break;
			case 8: subBreakMenu(); break;
			case 9: subContinueMenu(); break;
			case 10: subStaticMethodMenu(); break;
			case 11: subNonStaticMethodMenu(); break;
			case 12:
				System.out.println("���α׷��� �����մϴ�...");
				break;
			}
			
			System.out.print("������ �����Ͻðڽ��ϱ�? (��:y/�ƴϿ�:n) : ");
			answer = CONSOLE.nextLine().charAt(0);
		}while(Character.toUpperCase(answer) != 'Y');
	}
	
	public static void subVarMenu(){
		int choice = 0;
		VariableSample vs = new VariableSample();
		do {
			System.out.println("*** ���� �׽�Ʈ �θ޴� ***");
			System.out.println("1. �� �Ż����� ������ ��� ����ϱ�");
			System.out.println("2. ��������� Ű����� �Է¹޾� ����ϱ�");
			System.out.println("3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();

			switch(choice) {
			case 1: vs.myProfile(); break;
			case 2: vs.empInformation(); break;
			case 3: vs.defaultValue(); break;
			case 4: System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸��� �޴���ȣ �Դϴ�. �ٽ� �Է��ϼ���.");
				break;
			}
		}while(choice != 4);
	}

	public static void subPTypeMenu(){
		int choice = 0;
		PrimitiveTypeSample pts = new PrimitiveTypeSample();
		do {
			System.out.println("*** �⺻�ڷ��� �׽�Ʈ �θ޴� ***");
			System.out.println("1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�");
			System.out.println("2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�");
			System.out.println("3. �⺻�ڷ��� ��Ʈ���� Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();

			switch(choice)
			{
			case 1:	pts.typeSize(); break;
			case 2:	pts.minMaxValue(); break;
			case 3:	pts.bitSize(); break;
			case 4:	System.out.println("���� �޴��� ���ư��ϴ�.");
				return;	//���� �޴��� �ǵ��ư�.
			default:
				System.out.println("�߸��� �޴���ȣ �Դϴ�. �ٽ��Է��ϼ���.");
				break;
			}
		}while(choice != 4);
	}

	public static void subIfMenu(){
		int choice = 0;
		IfSample is = new IfSample();
		do {
			System.out.println("*** if�� �׽�Ʈ �θ޴� ***");
			System.out.println("1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�");
			System.out.println("2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�");
			System.out.println("3. �� ���� ������ �Է¹޾�, �� ���� ���� ū���� ���� ������ ����ϱ�");
			System.out.println("4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�");
			System.out.println("5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�");
			System.out.println("6. ������ �Է¹޾�, ���� Ȯ���ϱ�");
			System.out.println("7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�");
			System.out.println("8. ���� �ϳ��� �Է¹޾�, ����빮������ �ҹ������� ���ڹ������� "
					+ "��Ÿ�������� Ȯ���ϱ�");
			System.out.println("9. ���� �޴��� ����");
			System.out.println("�޴� ���� : ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();

			switch(choice)
			{
			case 1:	is.maxNumber(); break;
			case 2:	is.minNumber(); break;
			case 3:	is.threeMaxMin(); break;
			case 4:	is.checkEven(); break;
			case 5:	is.isPassFail(); break;
			case 6:	is.scoreGrade(); break;
			case 7:	is.checkPlusMinusZero(); break;
			case 8:	is.whatCaracter(); break;
			case 9:	System.out.println("���� �޴��� ���ư��ϴ�.");
				return;	//���� �޴��� �ǵ��ư�.
			default:
				System.out.println("�߸��� �޴���ȣ �Դϴ�. �ٽ��Է��ϼ���.");
				break;
			}
		}while(choice != 9);
	}

	public static void subSwitchMenu(){
		int choice = 0;
		SwitchSample ss = new SwitchSample();
		do {
			System.out.println("*** switch�� �׽�Ʈ �θ޴� ***");
			System.out.println("1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�");
			System.out.println("2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�");
			System.out.println("3. ���� �޴��� ����");
			System.out.print("�޴� ���� : ");
			choice = CONSOLE.nextInt(); CONSOLE.nextLine();

			switch(choice)
			{
			case 1:	ss.calculator(); break;
			case 2:	ss.fruitPrice(); break;
			case 3:	System.out.println("���� �޴��� ���ư��ϴ�.");
				return;	//���� �޴��� �ǵ��ư�.
			default:
				System.out.println("�߸��� �޴���ȣ �Դϴ�. �ٽ��Է��ϼ���.");
				break;
			}
		}while(choice != 3);
	}

	public static void subForMenu(){
		
	}

	public static void subWhileMenu(){}
	public static void subDoWhileMenu(){}
	public static void subBreakMenu(){}
	public static void subContinueMenu(){}
	public static void subStaticMethodMenu(){}
	public static void subNonStaticMethodMenu(){}
}
