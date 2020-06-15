package study.star;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("별을 몇줄 생성하실건지 입력하시오.");
		number = input.nextInt();
		
		for(int i=0; i<number;i++) {
			for(int j=0; j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}	
	}
}
