package collectionFramework;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<>();
		h.put("India", 2);
		h.put("South Africa", 8);
		h.put("Australia", 10);
		System.out.println(h);
		h.put("India", 1);
		System.out.println("Update HashMap" +h);
		h.remove("India");
		System.out.println("Update Hash Map " +h);
	}

}
