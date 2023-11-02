package serializationex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import JavaCore1.StudentEx;

public class DeserializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Mahesh.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentEx s=  null;
		s = (StudentEx) ois.readObject();
		System.out.println(s.id+" " +s.degree);
		s.display();
		ois.close();
		fis.close();
		

	}

}
