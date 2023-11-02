package Inheritance;

public class EncapsulationEx2 {
	private String car;
	private int year;
	private double  price;
	

	public String getCar() {
		return car;
	}


	public void setCar(String car) {
		this.car = car;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "EncapsulationEx2 [car=" + car + ", year=" + year + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		EncapsulationEx2 sb =new EncapsulationEx2();
		sb.setCar("BMW");
		sb.setPrice(200000);
		sb.setYear(2023);
		
		System.out.println("My car is "+sb.getCar());
		System.out.println("My price is" +sb.getPrice());
		System.out.println("Purchasing year is " +sb.getYear());
		

	}

}
