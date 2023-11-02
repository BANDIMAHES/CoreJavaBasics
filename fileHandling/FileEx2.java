package fileHandling;
import java.io.File;
import java.io.IOException;

public class FileEx2 {

	public static void main(String[] args) throws IOException {
		File f = new File("List Of Course");
		if (f.createNewFile()) {
			System.out.println("File is created");
		}else {
			System.out.println("File Already Exists");
		}
		

	}

}
