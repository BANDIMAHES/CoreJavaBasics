package collectionFramework;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("Akash");
	l.add("Mahesh");
	l.add("Mani");
	System.out.println("LinkedList:" +l);
	l.add("Poojitha");
	l.add("Yoga");
	System.out.println("before remove:" +l);
	l.removeFirst();
	System.out.println("After Remove" +l);
	l.removeFirst();
	}

}
