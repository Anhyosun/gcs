package study.temperature;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		System.out.println("���� �µ� ȭ�� �µ� ��ȭ��");
		System.out.println("���� �µ��� �Է��Ͻÿ�.");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		double temperature = (number*1.8) + 32;
		System.out.println("ȭ�� �µ���" + temperature + "�Դϴ�.");
	}
}
