package Basic;

public class ArrayExa {

	public static void main(String[] args) {
		int a[][] = { { 1, 2 }, { 4, 5 } };
		System.out.println("a[0][0]: " + a[0][0]);
		System.out.println("a[0][1]: " + a[0][1]);
		System.out.println("a[1]0]: " + a[1][0]);
		System.out.println("a[1][1]: " + a[1][1]);
		// System.out.println(num.length);
		for (int i = 0; i < 2; i++) { // row
			for (int j = 0; j < 2; j++) { // column
				System.out.println(a[i][j]);
			}

		}

	}

}
