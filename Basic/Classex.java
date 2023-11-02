package Basic;

class operation {
	void addition(int a, int b, int c) {
		System.out.println("addition of 3 number: " + (a + b + c));
	}

	int divide(int a, int b) {
		return a / b;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

}

public class Classex {

	public static void main(String[] args) {
		operation o = new operation();
		o.addition(1, 3, 50);
		System.out.println("division: " + o.divide(12, 3));
		int d = o.divide(15, 3);
		System.out.println("division: " + d);
		int result = operation.add(5, 10);
	}
}
