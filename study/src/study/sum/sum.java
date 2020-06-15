package study.sum;

public class sum {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("1부터 100까지 더하기");
		for(int i=1; i<=100; i++) {
			sum = i + sum;
		}
		System.out.println("총 합은 " + sum + "입니다.");
	}
}
