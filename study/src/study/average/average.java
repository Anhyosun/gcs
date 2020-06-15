package study.average;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		int[] classroom = new int[10];
		int sum=0;
		Scanner input = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.print("점수 : ");
			classroom[i]=input.nextInt();
			sum = sum + classroom[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/10);
	}
}
