package com.mysql.mavenmenudriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckConnection {

	private static Connection connection;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Statement stmt=null;
		String url="jdbc:mysql://localhost:3306/db1";
		Connection con=DriverManager.getConnection(url,"root","6244");
		System.out.println("Database dbemp connection successfully establish");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1. add data");
			System.out.println("2. display data");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("enter values to insert");
			System.out.println("enter student id");
			int id = sc.nextInt();
			System.out.println("enter course cid");
			int cid = sc.nextInt();
			System.out.println("enter course name");
			String cname = sc.next();
			PreparedStatement p = con.prepareStatement("insert into course values(?,?,?)");
			p.setInt(1, id);
			p.setInt(2, cid);
			p.setString(3, cname);
			p.executeUpdate();
			System.out.println("Data successfully inserted");
			break;
			case 2:
				
				break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("invalid choice");
					break;
			}
		}
	
	}
}





