package Inheritance;

class student1 {
	String name = "mahesh";

	void display() {
		System.out.println(name);
	}
}

//Subclass
class Developer1 extends student1 {
	String role = "Full Stack Developer";

	void displayRole() {
		System.out.println(role);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Developer1 d2 = new Developer1();
		d2.display();
		d2.displayRole();

	}


}
