package fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileBufferEx {

public static void main(String[] args) throws IOException
{
FileReader fReader = new FileReader("D:/Accurate Content");
BufferedReader bReader = new BufferedReader(fReader);
int records;
while((records = bReader.read()) != -1) {
System.out.print((char)records);
}
bReader.close();
fReader.close();
} 
}