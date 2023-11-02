package serializationex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	private String id;
	private String name;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("SerilizationEx.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		DeserializationExample s=null;
		DeserializationExample s1=null;
		DeserializationExample s2=null;
		s=(DeserializationExample) ois.readObject();
		s1=(DeserializationExample) ois.readObject();
		s2=(DeserializationExample) ois.readObject();
		System.out.println(s.id+ " "+s.name);
		s1.display();
		s2.display();
		fis.close();
		ois.close();
	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

	
		
	}

	




