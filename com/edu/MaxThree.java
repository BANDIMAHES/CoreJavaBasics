package com.edu;

public class MaxThree {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 35;
		int max;
		
		//max = (a > b)? a : b; (a > c)? a : c; (b > c)? b : c; (b > a)? b : a;
		      //(c > a)? C : a; (c > b)? c : b;
		      //System.out.println("the max number is "+ max);
max=(a>b) ? ((a>c)? a:c) :((b>c)? b:c);
System.out.println(max);
	}

}
