package Inheritance;

public class EncapsulationPractice {
	int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		EncapsulationPractice ob = new EncapsulationPractice();
		ob.setBalance(9877);
		System.out.println("value of get balance  :" +ob.getBalance());
	}

}
