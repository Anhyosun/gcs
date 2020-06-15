package study.classroom;

import java.util.Scanner;

public class classroom {
	public static void main(String[] args) {
		
		int[][] classroom = {{90,80,80},{85,85,95},{95,70,75},{80,80,90},{90,75,80}};
		for(int i=0;i<5;i++) {
			int sum=0, average = 0;
			for(int j=0;j<3;j++) {
				sum = sum + classroom[i][j];
				average = sum/3;
			}
			System.out.println("ID : " + i + " : \t ÇÕ°è = " + sum + " \t Æò±Õ = " + average);
		}
		System.out.println();	
		
		
	}
}
