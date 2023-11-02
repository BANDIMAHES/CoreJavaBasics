package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PersonEntity {
	public static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
		String url = "jdbc:mysql://localhost:3306/dbemp";
		Connection con = DriverManager.getConnection(url, "root", "6244");//
		String query = "INSERT INTO empl(id, name) VALUES( ?, ?)";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		for (PersonEntity personEntity : personEntities) {
			preparedStatement.setInt(1, personEntity.getId());
}
	}

	private int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
