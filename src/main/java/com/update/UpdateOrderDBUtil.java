package com.update;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class UpdateOrderDBUtil {
	
		public static boolean isSuccess = false;
		private static Statement stmt = null;
		private static Connection con  = null;
		
		
		public static boolean updateOrderStatus(int orderID, int name, float total, String status, String partCode, String custID){
			
			
		
		
		// create database connection
		String url = "jdbc:mysql://localhost:3306/online_vehicle_spare-parts_management_system";
		String user = "root";
		String pass = "Gavithra@2000";
		
		
       // validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			stmt  = (Statement) con.createStatement();  			
			String sql = "update order set status= '"+status+"' " + "where custID='"+custID+"'";
			int rs = stmt.executeUpdate(sql);
			
			
			// if the data is there , fetch the data
			// Then assign them to variables
			if(rs > 0) {
				isSuccess = true;				
			}
			
			else {
				isSuccess = false;			
			}
				
				
		}catch(Exception e){
			System.out.println("Database error in update");
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
		
		
	}

}
