package Inheritance;

public class Examples {
	int a, b, c;
	Examples (int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
  public void setdata (int a, int b, int c) {
 }
 public void displaydata() {
	 System.out.println("value of a : "+a);
	 System.out.println("value of a : "+b);
	 System.out.println("value of a : "+c);
	 
 }
public static void main (String[] args) {
	Examples e = new Examples(1,2,4);
	//e.setdata(10, 10, 20);
	e.displaydata();
}
}