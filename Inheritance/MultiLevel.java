package Inheritance;

//super class
class laptop {
	String name = "HP";

	laptop(String name) {
		this.name = name;
		System.out.println(this.name);
	}
}

//subclass
class HP extends laptop {

	String model;
	String name;

	HP(String name, String model) {
		super(name);
		this.model = model;

		System.out.println("model " + this.model);
	}

}

class Version extends HP {
	String brand;
	String model;
	String name;

	Version(String name, String brand, String model) {
	super(name,model);
	
	this.brand = brand;
	System.out.println(" brand :" +this.brand);
	}

}

public class MultiLevel {

	public static void main(String[] args) {
		Version v = new Version("laptop", "hp", "model");
		

	}

}
