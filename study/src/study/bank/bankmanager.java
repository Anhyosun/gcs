package study.bank;

import java.util.Scanner;

public class bankmanager {
	public static void main(String[] args) {
		creatbank[] creatbank = new creatbank[10];
		int input, money, sel, count=0;
		String number, name;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			
			System.out.println("���� ���� �ý���");
			System.out.println("1. ���� ����");
			System.out.println("2. �Ա�");
			System.out.println("3. ���");
			System.out.println("4. ��� ���� ����");
			System.out.println("5. ����");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("���� ��ȣ�� ��ȣ�� �Է��ϼ���.");
				number = sc.next();
				System.out.println("������ �̸��� �Է��ϼ���.");
				name = sc.next();
				System.out.println("���� �Աݾ��� �Է��Ͻÿ�.");
				money = sc.nextInt();
				creatbank[count] = new creatbank(number,name,money);
				count++;
				break;
			case 2:
				for(int i=0;i<count;i++) {
				creatbank[i].show();
				}
				System.out.println("�Ա��� ���¸� �������ּ���.");
				sel = sc.nextInt();
				System.out.println("�Ա��� �ݾ��� �Է����ּ���.");
				money = sc.nextInt();
				creatbank[sel-1].addacount(money);
				break;
			case 3:
				for(int i=0;i<count;i++) {
					creatbank[i].show();
				}
				System.out.println("����� ������ ��ȣ�� �������ּ���.");
				sel = sc.nextInt();
				System.out.println("����� �ݾ��� �Է����ּ���.");
				money = sc.nextInt();
				creatbank[sel-1].minacount(money);
				break;
			case 4:
				for(int i=0;i<count;i++) {
					creatbank[i].show();
					}
				break;
			case 5:
				run = false;
				break;
			}
				
				
			}
	}
}
