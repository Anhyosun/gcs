package study.grade;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		int number;
		System.out.println("학점 변환 계산기");
		Scanner input = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		number = input.nextInt();
		System.out.print("학점 : ");
		if(number>90) {
			System.out.print("A");
		}
		else if(number>80) {
			System.out.print("B");
		}
		else if(number>70) {
			System.out.print("C");
		}
		else if(number>60) {
			System.out.print("D");
			
		}
		else {
			System.out.print("F");
			
		}
	}
}
