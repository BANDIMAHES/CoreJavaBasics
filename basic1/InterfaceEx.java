package basic1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InterfaceEx {

	private static final String ArrayList = null;

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Mahesh");
		al.add(1,"Akash");
		al.add("Prudhvi");
		al.add(" ");
		al.set(3, "Mahesh");
		
		System.out.println("Element in my ArrayList:" +al);
		al.sort(Comparator.reverseOrder());
		System.out.println("Sorting arrayList:" +al);
		System.out.println("Size in my ArrayList:" +al.size());
		System.out.println("GetElement in my ArrayList:" +al.get(2));
		al.remove(3);
		System.out.println("Element in my ArrayList:" +al);
		al.remove("Mahesh");
		System.out.println("Element in my ArrayList:" +al);
		ArrayList<Integer> a3=new ArrayList<>();
		a3.add(10);
		a3.add(210);
		a3.add(0);
		a3.add(15);
		a3.add(10);
		System.out.println("Element in my ArrayList A3:"+ a3);
		List<Integer>List = new ArrayList<>(); 
		Collections.addAll(List, 11, 2, 34, 14, 5);
		System.out.println("List" +List);
		Collections.sort(List);
		System.out.println("sorting List:" +List);
		ArrayList<String>Arraylist = new ArrayList<>(Arrays.asList("Elan", "Raghu", "Mahesh"));
		System.out.println("ArrayList:" +ArrayList);
		System.out.println("size in my ArrayList:" +al.size());
	}

}
