package mysqlEx;
import java.sql.*;

public class CheckConnection {

	private static Statement stmt3;

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement stmt=null;
		String url="jdbc:mysql://localhost:3306/capgemini";
		Connection con=DriverManager.getConnection(url,"root","6244");
		System.out.println("Database dbemp connection successfully establish");
		//Class.forName("com.mysql.cj.jdbc.Driver"); 
		//Statement stmt;
		//String url1="jdbc:mysql://localhost:3306/capgemini";
		//Connection con1=DriverManager.getConnection(url1,"root","6244");
		//System.out.println(con1);
		//System.out.println("Database dbemp connection suceesfully establish");
		
		Object db = null;
		ResultSet rs = ResultSet(db);
		rs = stmt.executeQuery("select * from employees");

		System.out.println("No of Records:");
		while (rs.next()) {
			// Display values
			System.out.print("EID: " + rs.getInt("eid"));
			System.out.print(", Email Id: " + rs.getString("email_address"));
			System.out.println(", first Name: " + rs.getString("first_name"));
			System.out.println(", last Name: " + rs.getString("last_name"));
			

		}
	

	}

	private static ResultSet ResultSet(Object db) {
		// TODO Auto-generated method stub
		return null;
	}

}
