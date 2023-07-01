package Basic;

public class AllOperator {

	public static void main(String[] args) {

		// relation operator
		int a = 20;
		int b = 10;
		String s = "Hello";
		String s1 = "Hello";
		System.out.println("== :" + (s == s1));
		System.out.println("!= :" + (a != b));
		System.out.println("== :" + (a == b));
		System.out.println("Equals :" + (s.equals(s1)));

		// bitwise operator
		int c = 5;
		int d = 7;
		System.out.println("& :" + (c & d));
		System.out.println("| :" + (c | d));
		System.out.println("~ :" + (~d));
		System.out.println("^ :" + (c ^ d));

		// shift operators
		int a1 = 8;
		// X>>1, X>>>1, X << 1, X>>>1
		System.out.println("Signed Right shift operator >> for 0010:" + (a1 >> 2));
		System.out.println("Unsigned Right shift operator >>> for 0010 :" + (a1 >>> 2));
		System.out.println("Left shift operator << for 0010 :" + (a1 << 2));
		// System.out.println(" Unsigned Left shift operator <<< for 0010 x:"+(a1<<<1));

		// Ternary operator
		int e = 5;
		int f = 13;
		int g = 100;
		// String result = (e%2==0)? "even":"odd";
		// String result = e>f? "e is max" :"f is max";
		// String result = e>f>g? "e is max" :"f is max":"g is max";
		// String result = (e>f)?(e>c?e:g)?(f>g)? "e is max" :"f is max": "g is max":
		// e>f?a:b

		int max = (e > f) ? (e > g ? e : g) : (f > g ? f : g);
		int min = (e < f) ? (e < g ? e : g) : (f < g ? f : g);
		System.out.println("the max number is  " + e + ", " + f + " and " + g + " is " + max);
		System.out.println("The largest number is :" + max);
		System.out.println("the max number is  " + e + ", " + f + " and " + g + " is " + min);
		System.out.println("The largest number is :" + min);

	
	
	}

}
