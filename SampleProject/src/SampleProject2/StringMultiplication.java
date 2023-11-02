package SampleProject2;

import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiplication {
		public static String multiplyStrings(String num1, String num2) {
			// Convert the strings to BigIntegers for accurate multiplication
			BigInteger bigNum1 = new BigInteger (num1);
			BigInteger bigNum2 = new BigInteger(num2);

			// Multiply the BigIntegers
			BigInteger result = bigNum1.multiply(bigNum2);

			// Convert the result back to a string
			return result.toString();
		}
		 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input Format
		// The first line is the first string.
		// The second line is the second string.
		String num1 = scanner.nextLine().trim();
		String num2 = scanner.nextLine().trim();

		// Call the multiplyStrings function
		String result = multiplyStrings(num1, num2);

		// Output the result
		System.out.println(result);

	}
		
	}


