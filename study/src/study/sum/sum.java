package study.sum;

public class sum {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("1���� 100���� ���ϱ�");
		for(int i=1; i<=100; i++) {
			sum = i + sum;
		}
		System.out.println("�� ���� " + sum + "�Դϴ�.");
	}
}
