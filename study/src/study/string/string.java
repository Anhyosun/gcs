package study.string;

import java.util.Scanner;

public class string {
	public static void main(String[] args) {
		String st;
		Scanner sc = new Scanner(System.in);
		
		st = sc.nextLine();
		char[] output;
		output = st.toCharArray();
		
		for(int i=0;i<output.length;i++) {
			if(65<=output[i]&&output[i]<=90) {
				output[i]=(char)(output[i]+32);
				continue;
			}
			if(97<=output[i]&&output[i]<=122) {
				output[i]=(char)(output[i]-32);
				continue;
			}
		}
		
		System.out.println(output);
	}
}
