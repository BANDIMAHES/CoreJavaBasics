package basic1;

import java.util.*;
import java.util.Iterator;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();
		//TreesetEx<String> name = new TreesetEx<String>();
		s.add("Mahesh");
		s.add("Gopal");
		s.add("Sai");
		s.add("Anil");
		s.add("Kalyan");
		System.out.println(s);
		System.out.println("Retrive data using iterator");
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String s1 = itr.next();
			System.out.println(s1);
		}

	}

}
