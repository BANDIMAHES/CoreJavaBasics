package fileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("D:/WritableFile");

			String s = "This can be used with FileReader or InputStreamReader or other readers classes to read the byte of inputs \r\n"
					+ "from file or stream and return serialized and deserialized data.\r\n"
					+ "Here is the syntax to declare BufferedReader by specifying size: \r\n"
					+ "BufferedReader bReader = new BufferedReader(readerObject)\r\n"
					+ "Syntax to declare BufferedReader by specifying size:\r\n"
					+ "BufferedReader bReader = new BufferedReader(readerObject, int size";
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("Content writen...");
			FileInputStream fis = new FileInputStream("D:/WritableFile");
			System.out.println("File content is");
			int i = fis.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fis.read();
				
			}
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		finally{
			System.out.println("File Ended");
		}
		// fis.close();

	}



}
