package basic1;

import java.util.Scanner;

@FunctionalInterface
interface validate {
	boolean login (String uname, String password);
}

public class ValidateUser {
		boolean login (String uname, String password) {
			validate v = (u,p)->{
				return (uname.equals("Mahesh")&&password.equals("72342")?true:false);
	
	};
	return v.login(uname, password);
	
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username and password");
			String uname = sc.next();
			String password = sc.next();
			
			ValidateUser v=new ValidateUser();
			System.out.println(v.login(uname, password));
	}

}
