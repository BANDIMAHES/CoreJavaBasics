package corejava8;

interface int1 {
	
	void abstractmethod();
	default void display() {
		System.out.println("interfac 1...abstractmethod().");
	}
	static void display1() {
		System.out.println("static method....");
	}
}

public class DefaultMethodEx implements int1 {

	public static void main(String[] args) {
		DefaultMethodEx dfc = new DefaultMethodEx();
		int1 dm;
		dfc.display();
		dfc.abstractmethod();
		int1 Int1;
		int1.display1();
		

	}

	@Override
	public void abstractmethod() {
		// TODO Auto-generated method stub
		
	}

}
