package collectionFramework;
import java.util.*;

public class HashSetex {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("abc");
		h.add("def");
		h.add("ghi");
		System.out.println(h);
		int size=h.size();
		System.out.println(h.size());
		h.remove("def");
		System.out.println("Updated one HashSet:" +h);
		//h.add("def");
		//System.out.println("updated Hashset:" +h);
		

	}

}
