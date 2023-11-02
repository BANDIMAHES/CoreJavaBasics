package Basic;
class student {
	
    public static int fee = 123;
    public static String name = "mahesh";
}
public class Staticex {
	public static void main(String[]args) {
		student.fee=100;
		System.out.println("Fee "+student.fee);
		student.name= "mahesh";
		System.out.println("name "+student.name);
		
	}

}
