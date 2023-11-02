package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
File f= new File("Mahesh.txt");

if(f.createNewFile()) {
	System.out.println("file is created");
}else {
	System.out.println("file already exists");
}
	}

}
