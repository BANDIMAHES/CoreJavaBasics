package Basic;

public class PetersonNumberEx {
	public PetersonNumberEx(int num) {
		// TODO Auto-generated constructor stub
	
		
		int rem = 0,sum=0;
		int temp= num;
		while(num>0) {
			int fact = 1;
		rem=num%10;
		for(int i=1;i<=rem;i++) {
			fact=fact*i;
			}
		sum=sum+fact;
		num=num/10;
		

		}
		if(temp==sum) {
			System.out.println("it is a peterson number");
		}else {
			System.out.println("not a peterson number");
		
	}
	}

	public static void main(String[] args) {
		int num= 145;
		PetersonNumberEx obj = new PetersonNumberEx(num);
		
	
		
			
		

	}

}
