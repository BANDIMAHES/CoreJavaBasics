package serializationex;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student1 {

	 int id;

	public static void main(String[] args) throws IOException {
		Student1 s = new Student1();
		s.id = 1;
		FileOutputStream fos = new FileOutputStream("Mahesh.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.close();
		fos.close();
		System.out.println("Save data in file");
	}

}
