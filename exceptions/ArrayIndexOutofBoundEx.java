package exceptions;

public class ArrayIndexOutofBoundEx {

	public static void main(String[] args) {
		try {
			int [] a= { 1, 2, 3, 5 };
			System.out.println(a[1]);
			int c = 10/0;
			
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Some error in code." + a);
		} catch (ArithmeticException a) {
			System.out.println("Number cannot be divided by zero" +a);
		}
		finally {
			System.out.println("Number cannot be divided by zero");
			
		}

	}

}
