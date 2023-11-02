package Inheritance;

public class EncapsulationConstructorEx {
	private String car;
	private int year;
	private double  price;
	
	EncapsulationConstructorEx(String car, int year, double price) {
		
		this.car = car;
		this.year = year;
		this.price = price;
		
	}

	public String getCar() {
		return car;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {
	EncapsulationConstructorEx ob = new EncapsulationConstructorEx("BWM", 2024, 200000);
	System.out.println(ob.getCar());
	System.out.println(ob.getPrice());
	System.out.println(ob.getYear());	
	}

}
