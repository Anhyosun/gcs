package study.calculator;

import java.util.Scanner;

public class calculator {
	public static int plus(int number, int number2) {
		int plus;
		plus = number+number2;
		return plus;
	}
	
	public static int mius(int number, int number2) {
		int mius;
		mius = number-number2;
		return mius;
	}
	public static int mul(int number, int number2) {
		int mul;
		mul=number*number2;
		return mul;
	}
	public static int div(int number, int number2) {
		int div;
		div=number/number2;
		return div;
	}
	public static void main(String[] args) {
		int number, number2;
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		number2 = sc.nextInt();
		
		System.out.println(plus(number,number2));
		System.out.println(mius(number,number2));
		System.out.println(mul(number,number2));
		System.out.println(div(number,number2));
		
	}
}
