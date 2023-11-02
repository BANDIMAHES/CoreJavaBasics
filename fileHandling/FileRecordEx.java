package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileRecordEx {

	public static void main(String[] args) throws IOException{
		File f= new File("C:\\Users\\ASUS\\eclipse-workspace\\CoreJava\\src\\fileHandling\\mahesh.txt");
		if(f.createNewFile()) {
			System.out.println("Created File");
			
		
		
		}else {
			System.out.println("File Exists");
		}
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canWrite());
		System.out.println(f.canWrite());
		
		
	}
}

