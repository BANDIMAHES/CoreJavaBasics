package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StringBufferEx {

	public static void main(String[] args)throws Exception  {
	try {
		FileInputStream fis = new FileInputStream("mahesh.txt");
		
		int data;
		while( (data=fis.read())!=-1) {
			System.out.print((char)data);
		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}	
	
	}

}
