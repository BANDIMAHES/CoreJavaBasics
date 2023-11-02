package SampleProject2;


class Student{
	void addition(int a,int b) {
		System.out.println(""+(a+b));
	}
}

public class NewMethod {

	public static void main(String[] args) {
		Student so=new Student();
		so.addition(2, 2);

	}

}
