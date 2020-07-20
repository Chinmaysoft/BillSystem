package com.util;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBconnection {

	public static Connection GetConnection() {
		 Connection con=null;
		try {
			
			if (con==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billsystem","root","root");
				System.out.println("Connection Establshed....");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	
}
