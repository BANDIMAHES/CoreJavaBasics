package basic1;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreesetEx1 {

	public static void main(String[] args) {
		TreeSet<String> c = new TreeSet<>();
		c.add("Sangli");
		c.add("Mumbai");
		c.add("Satara");
		c.add("Kolhapur");
        //System.out.println(c);
		c.remove("Mumbai");
		c.add("Pune");
		System.out.println(c);
		System.out.println("Retrive data using treeset");
		Iterator iterator = (Iterator) c.descendingIterator();
		while (((java.util.Iterator<String>) iterator).hasNext()) {
			String nameOfCity = (String) iteratornext();
			System.out.println(nameOfCity);
		}
	}

	private static String iteratornext() {
		// TODO Auto-generated method stub
		return null;
	}
}

	
