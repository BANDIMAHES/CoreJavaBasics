package Inheritance;
abstract class Bird {
abstract void makeSound();
}
class hen extends Bird {
public void makeSound() {
System.out.println("The sound that a hen makes : kukkara kooo");
}
}
class crow extends Bird {
public void makeSound() {
System.out.println("The sound that an crow makes: kaow kaow");
}
}
public class AbstractClassEx1 {
public static void main(String[]
args) { hen d = new
hen ();
d.makeSound();
crow c = new crow();
c.makeSound();
}
}
