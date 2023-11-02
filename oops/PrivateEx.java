package oops;
		import java.lang.reflect.*;
		class Test {

		  private String name;
		  private void display() {
		    System.out.println("The name is " + name);
	  }

		}
		class Main {
		  public static void main(String[] args) {
		    try {
		      
		      Test test = new Test();

		     
		      Class obj = test.getClass();

		      Field field = obj.getDeclaredField("name");
		      
		      field.setAccessible(true);
		     
		      field.set(test, "Programiz");

		      String value = (String)field.get(test);
		      System.out.println("Name: " + value);

		   
		      Method[] methods = obj.getDeclaredMethods();
		      System.out.println("Method Name: " + methods[0].getName());
		      int modifier = methods[0].getModifiers();
		      System.out.println("Access Modifier: " + Modifier.toString(modifier));

		    }
		    catch(Exception e) {
		      e.printStackTrace();
		    }
		  }
		}

		class Person {
			private String name;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void displayPerson() {
				System.out.println("Data of the Person class: ");
				System.out.println("Name: " + this.name);
			}
		}
		public class PrivateEx extends Person {
			public void displayStudent() {
				System.out.println("Data of the Student class: ");
			}

			public static void main(String[] args) {
				PrivateEx std = new PrivateEx();
			
				std.setName("Pooja");
				System.out.println(std.getName());
				std.displayPerson();
				std.displayStudent();
			}
		
	

}


