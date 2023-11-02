package exceptions;

public class UserDefinedMovieEx {
	//static void validateAge (int age) {
		 void validateAge (int age) throws Exception {
		if (age>18) {
			System.out.println("welcome to movie");
			
		}
		else {
			throw new Exception("invalid Age for movie");
			
		}
	}
	public static void main(String[] args) throws Exception {
	UserDefinedMovieEx u = new UserDefinedMovieEx();
	u.validateAge(23);
	
}
}
