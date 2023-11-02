package collectionFramework;

import java.util.Scanner;

public class PrimeNumbersEx{ 
public static void main(String[] args) {
	int num, c=0;
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter number");
     num = scanner.nextInt();
     
     //1 2 3 4 5 6 7 8 ...12;
     //
	for(int i=1;i<=num;i++) {
		if(num%i == 0) {
			//System.out.println(i);
			c++;
		}
	}
	if(c==2) {
		System.out.println(num+" is prime");
	}else {
		System.out.println(num+" is not a prime");
	}
}

}