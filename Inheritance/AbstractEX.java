package Inheritance;

import oops.VehicleEx;

public class AbstractEX {

	public static void main(String[] args) {
		abstract class mobile{
			public mobile() {
				// TODO Auto-generated constructor stub
				System.out.println("mobile Constructor");
			}
			abstract void show();
			void mobileBrand() {    //This is my non Abstract method 
				System.out.println("Non abstract method");
			}
			public  static void display() {
				System.out.println("Static display method");
			}
			
			
			
		}
		class iphone extends VehicleEx{

			void show() {
				// TODO Auto-generated method stub
				System.out.println("iphone");
			}
			
		}
		class redmi extends mobile{

			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("redmi");
			}
			
		}
		class AbstractClassEx {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		       //mobile v=new phone();
		       // v.show();
		        phone c=new phone();
		        c.show();
		        c.mobileBrand();
		        redmi.display();
		        redmi.display();
		        mobile.display();
			}

		}

	}

}
