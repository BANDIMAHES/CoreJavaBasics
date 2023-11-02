package oops;
	
public class ConstructorAccessEx {

	public static void main(String[] args) {
		PrivateDemo d = new PrivateDemo(3);
		((PrivateDemo) d).display();
		
		}

}
