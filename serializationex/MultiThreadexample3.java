package serializationex;

import java.util.concurrent.ThreadFactory;

class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My Thread is a Runnig State");
		
	}
	
}

public class MultiThreadexample3 {

	public static void main(String[] args) {
		ThreadFibo t1 = new ThreadFibo();
		Thread t = new Thread(t1);
		t.start();
		int Num = 9; 
        for (int i = 1; i <= 10; i++) {
            System.out.println(Num + " * " + i + " = " + Num * i);
                               

	}

}
}
class ThreadFact implements Runnable {

	@Override
	public void run() {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
		
	}

}

class ThreadFibo extends Thread {
	@Override
	public void run() {
		System.out.println();
		System.out.println("Fibonacci series");
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);

			n1 = n2;
			n2 = n3;

		}

	}

}

class ThreadEven extends Thread {
	@Override
	public void run() {
		System.out.println();
		System.out.println("Even odd numbers ");
		int num = 20;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		System.out.println();

	}

}
