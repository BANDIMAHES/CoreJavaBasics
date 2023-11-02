package exceptions;
	import java.util.Scanner;

	public class SampleProject {

		void printPattern(int n) {
			int rcount = 1;
			for (int i = n; i > 0; i--) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");

				}
				for (int j = 1; j <= rcount; j++) {
					System.out.print(rcount + " ");

				}
				System.out.println();
				rcount++;
				
			}
		}

		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			int a =sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			SampleProject s = new SampleProject();
			
			s.printPattern(a);
			s.printPattern(b);
			s.printPattern(c);

		}

	}

