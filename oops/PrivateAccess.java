package oops;

public class PrivateAccess {
	private int a;
	public static void main(String[] args) {
		PrivateAccess p = new PrivateAccess();
		p.a=10;
		System.out.println(p.a);
		

	}

}
