package Inheritance;

public class Learner {
		public void lname() {
			System.out.println("My name is Sharly Raj");
		}
		
		void courseName()
		{
			System.out.println("Java full Stack");
			}
		}
	class Lcourse extends Learner{
		void courseName()
		{
			super.courseName();
			System.out.println("data analytics");
			}
	}

	public class LearnerEx {

		public static void main(String[] args) {
	Lcourse l=new Lcourse();
	l.courseName();
	l.lname();
	//Learner le=new Learner();
	//le.courseName();
	//le.lname();
	}

	}

	