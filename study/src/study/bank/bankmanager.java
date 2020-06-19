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
			
			System.out.println("계좌 관리 시스템");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 모든 계좌 보기");
			System.out.println("5. 종료");
			input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("계좌 번호의 번호를 입력하세요.");
				number = sc.next();
				System.out.println("예금주 이름을 입력하세요.");
				name = sc.next();
				System.out.println("최초 입금액을 입력하시오.");
				money = sc.nextInt();
				creatbank[count] = new creatbank(number,name,money);
				count++;
				break;
			case 2:
				for(int i=0;i<count;i++) {
				creatbank[i].show();
				}
				System.out.println("입금할 계좌를 선택해주세요.");
				sel = sc.nextInt();
				System.out.println("입금할 금액을 입력해주세요.");
				money = sc.nextInt();
				creatbank[sel-1].addacount(money);
				break;
			case 3:
				for(int i=0;i<count;i++) {
					creatbank[i].show();
				}
				System.out.println("출금할 계좌의 번호를 선택해주세요.");
				sel = sc.nextInt();
				System.out.println("출금할 금액을 입력해주세요.");
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
