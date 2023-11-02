package serializationex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int age;
	String name;
	public int id;
	public Student(int age, String name) { //parameterized constructor
		super();
		this.age = age;
		this.name = name;
	}
	
}

public class SerializationExample3 { 

	public static void main(String[] args) throws IOException {

       //writing data in to a file
		Student ob=new Student(22, "mahesh");
		
		try {
			FileOutputStream fos=new FileOutputStream("Mahesh.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(ob);
			fos.close();
			oos.close();
			
			System.out.println("Seriazation is done");
			
		} catch (FileNotFoundException e) {


			e.printStackTrace();
		}
		
		
	}

}
