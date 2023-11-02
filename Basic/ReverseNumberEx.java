package Basic;

public class ReverseNumberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int num1=num;
		int sum=0;
		while(num!=0) {
			int rem = num%10;
			 sum = sum*10+rem;
			num = num/10;
			
			
		}
		System.out.println(sum);
		System.out.println(num);
		if(num1==sum) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("not a palindrome");
		}

	}

}
