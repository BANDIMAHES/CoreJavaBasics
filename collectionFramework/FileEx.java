package collectionFramework;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
	File newFile = new File("D:/ListOfCourses.txt");
	if (newFile.createNewFile()) {
	System.out.println("File created.");
	} else {
	System.out.println("File exists.");
	} 
	}
}