package study.bank;

public class creatbank {
	private String bankID;
	private String name;
	private int acount;
	
	public creatbank(String bankID, String name, int money) {
		this.bankID = bankID;
		this.name = name;
		this.acount = money;
	}
	
	public String getbankID() {
		return  bankID;
	}
	
	public void setbankID(String bankID) {
		this.bankID = bankID;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public int getacount() {
		return acount;
	}
	
	public void setacount(int acount) {
		this.acount = acount;
	}
	
	public int addacount(int money) {
		this.acount = this.acount+money;
		return acount;
	}
	
	public void minacount(int money) {
		if(this.acount<money) {
			System.out.println("���� �ܾ׺��� ����� �ܾ��� Ů�ϴ�.");
		}
		else {
		this.acount = this.acount-money;
		}
	}
	
	public void showacount() {
		System.out.println("���� �ܾ��� : " + getacount());
	}
	
	public void show() {
		int count = 1;
		System.out.println("------------------------------------------------");
		System.out.println("����\t���¹�ȣ\t\t\t�̸�\t�ܾ�");
		System.out.print(count + "\t");
		System.out.print(getbankID() + "\t");
		System.out.print(getname() + "\t");
		System.out.println(getacount() + "\t");
		System.out.println("-------------------------------------------------");
	}
	
}
