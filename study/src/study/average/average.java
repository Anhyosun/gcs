package study.average;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		int[] classroom = new int[10];
		int sum=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("���� : ");
			classroom[i]=input.nextInt();
			sum = sum + classroom[i];
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum/10);
	}
}
