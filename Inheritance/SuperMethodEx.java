package Inheritance;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes sound");
	}

}

class Dog extends Animal {
	public void animalSound() {
		super.animalSound();  		//calls the super class method 
		System.out.println("The Dog Barks!!!");
	}
}

public class SuperMethodEx {

	public static void main(String[] args) {
		//Dog myDog = new Dog();
		Animal myDog = new Dog();
		myDog.animalSound();
	}

}
