package fileHandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/file2.txt");
		String s = "Hello Everyone...Java Full Stack...Java provides I/O stram to read an ";
	    byte b[] = s.getBytes();
		fos.write(b);
		System.out.println("Content Written sucessfully.");

}
}