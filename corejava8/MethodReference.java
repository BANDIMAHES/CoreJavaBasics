package corejava8;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intSeq1 = (List<Integer>) Arrays.asList(1,2,3);
		// intSeq1.forEach(x -> System.out.println(x + var));
		 intSeq1.forEach(x -> System.out.println(x));
		 System.out.println("++++++++++++");
		 intSeq1.forEach(System.out::println);
		// replace lambda expression with method reference(::) to improve readability

	}

}
