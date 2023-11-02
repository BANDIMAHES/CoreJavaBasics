package SampleProject2;
class Student1{
	void multiply(int a,int b) { 
	System.out.println(a*b);
}
	void addition(int a,int b) {
		System.out.println(a+b);
	}
	void div (int a,int b) {
	System.out.println(a/b);	
	}
	void sub (int a,int b) {
		System.out.println(a-b);
	}
}
public class NewProject {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Student1 so=new Student1();
    so.multiply(3, 4);
    so.addition(5, 06);
    so.div(4, 30);
    so.sub(4, 5);
	}
	

}
