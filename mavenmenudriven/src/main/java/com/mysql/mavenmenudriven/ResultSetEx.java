package com.mysql.mavenmenudriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class ResultSetEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Statement stmt=null;
		String url="jdbc:mysql://localhost:3306/db1";
		Connection con=DriverManager.getConnection(url,"root","6244");
		System.out.println("Database dbemp connection successfully establish");
		Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=statement.executeQuery("select * from employee");
		/*while(rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		}
		rs.first();
		System.out.println("First row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.last();
		System.out.println("Last row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.absolute(3);
		System.out.println("Third row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.previous();
		System.out.println(" row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.relative(-1);
		System.out.println(" row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));*/
		while(rs.next()) {
			//if(rs.getInt(1)==1) {
				//rs.updateString(2, "BMS");
				//rs.deleteRow();
			  //rs.setInt(1,40);
				rs.insertRow();
				//rs.updateRow();
				System.out.println("record deleted");
			}
			
			//System.out.println(rs.getInt(1));
			//System.out.println(rs.getString(2));
		}
		/*rs.first();
		System.out.println("First row:");
		System.out.println(rs.getInt(1)+": "+rs.getString(2));
		rs.last();
		System.out.println("Second row:");
		System.out.println(rs.getInt(1)+" :"+rs.getString(2));
		rs.absolute(3);
		System.out.println("Third row:");
		System.out.println(rs.getInt(1)+" :"+rs.getString(2));*/
		
	
		


	}
	

	

	


