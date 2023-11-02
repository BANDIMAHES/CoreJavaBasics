package JavaCore1;

public class StringBufferEx {

	public static void main(String[] args) {
		String S = "welcome";
		StringBuilder sb=new StringBuilder();
		sb.append(S);
		sb.reverse();
		System.out.println("Reverse string:"+sb);
		

	}

}
