package corejava8;

public class NoofWords {
	public static void main(String[] args) {
		String s="Mani Karthi";
		int count=0;
		for(int i=0;i<=s.length()-1;i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
