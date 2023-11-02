package serializationex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Person implements Serializable {
	String name; 
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class SerilizationExample {

	public static void main(String[] args) throws IOException  {
		Person ob=new Person("Mahesh", 22);
	try {
		FileOutputStream fos = new FileOutputStream("Mahesh.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		fos.close();
		oos.close();
		System.out.println("Serialization Successful");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Deserialization
	FileInputStream fis = new FileInputStream("Mahesh.txt");
	ObjectInputStream ois = new ObjectInputStream(fis);
	try {
		Person ob1 = (Person) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("Deserialization successful");
		System.out.println(ob1.getAge());
		System.out.println(ob1.getName());
		
	} catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
	