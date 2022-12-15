/*
 * Program:- Create an application to retrieve information (author ID, name, and city) about the authors
 *           who are living in the city where the city name begins with the letter “S”.
 * 
 * @Author:- SAKSHI PRIYA
 * @Date: 15-Dec-2022
 */


//declaring package name
package com.question2;


//Importing sql packages
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLNonTransientConnectionException;


//declaring class name
public class RetrieveInformation {
 
	
	//main method
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, SQLNonTransientConnectionException {

		
		//declaring variables
		String url = "jdbc:mysql://localhost:3307/anudip";
		String un = "root";
		String p = "sinhasakshi14";

		
		//connection class for make connection with our database
		Connection con = DriverManager.getConnection(url, un, p);
		Statement st = con.createStatement();

		//SQL query for finding city name
		String sql = "select * from AuthorDetails where city like '%S'";

		//ResultSet Class used for retrieve data from database
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			
		}
		con.close();

	}
	//end of main method
	
	
}
//end of class