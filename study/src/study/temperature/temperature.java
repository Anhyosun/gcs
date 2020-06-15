package study.temperature;

import java.util.Scanner;

public class temperature {
	public static void main(String[] args) {
		System.out.println("¼·¾¾ ¿Âµµ È­¾¾ ¿Âµµ º¯È­±â");
		System.out.println("¼·¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À.");
		Scanner input = new Scanner(System.in);
		double number = input.nextDouble();
		double temperature = (number*1.8) + 32;
		System.out.println("È­¾¾ ¿Âµµ´Â" + temperature + "ÀÔ´Ï´Ù.");
	}
}
