package Inheritance;

class Learner11 {
	public void lname() {
		System.out.println("My name is Sharly Raj");
	}

	void courseName() {
		System.out.println("Java full Stack");
	}

	void courseDuration() {
		System.out.println("4 months");
	}
}

class Lcourse extends Learner11 {
	protected void courseName()// Cannot reduce the visibility of inherited method in child class
	{
		super.courseName();
		System.out.println("data analytics");
	}

	@Override
	void courseDuration1() {
		System.out.println("2 months");
	}

	void analytics() {
		System.out.println("Analytics");
	}

	public void courseDuration() {
		// TODO Auto-generated method stub
		
	}

	public void courseDuration1() {
		// TODO Auto-generated method stub
		
	}

}

public class OverrideEx {

	// public class MethodOverridingClass {

	public static void main(String[] args) {
		Lcourse l = new Lcourse();
		l.courseName();
		l.lname();
		l.courseName();
		l.courseDuration();
		// Learner le=new Learner();
		// le.courseName();
		// le.lname();
	}

}
