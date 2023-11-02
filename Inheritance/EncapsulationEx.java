package Inheritance;

public class EncapsulationEx {
	int balance;
	

	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public static void main(String[] args) {
		EncapsulationEx ob = new EncapsulationEx();
		ob.setBalance (28899);
		System.out.println("balance value"  +ob.getBalance());

	}

}
