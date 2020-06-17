package study.caesar;

import java.util.Scanner;

public class caesar {
	public static void main(String[] args) {
		char[] arr;
		String input;
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextLine();
		arr = input.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==32) {
				continue;
			}
			else {
			arr[i] = (char)(arr[i]+3);
			}
		}
		
		System.out.println(arr);
	}
}
