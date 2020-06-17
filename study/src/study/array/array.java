package study.array;

import java.util.Scanner;




public class array {
	
	public static void sum(int[] arr) {
		int sum=0;
		for(int i=0; i<5;i++) {
		sum = sum + arr[i];
		}
		System.out.println("ÃÑ ÇÕ : " + sum);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr);
	}
}
