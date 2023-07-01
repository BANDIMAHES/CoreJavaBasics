package Basic;

public class thirdProgram {

	public static void main(String[] args) {
				int num1=10;
				int num2=25;
				int num3=15;
			    int  min;
			    int max;
			    
			    
		max=(num1>num2)? num1:num2;		
			System.out.println("the max number is "+max);	
			
			
max=(num1>num2) ?((num1 > num3) ? num1:num3):((num2>num3)? num2:num3);			
 System.out.println(max);
			min	=(num1<num2)? ((num1<num3)? num1:num3) :((num2<num3) ? num2:num3);	
				
			System.out.println(""+min);
			}

		


	}


