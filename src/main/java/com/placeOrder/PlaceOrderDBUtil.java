package com.placeOrder;

import java.sql.Connection;
import java.sql.DriverManager;
//import com.mysql.jdbc.Statement;  // done a change 
import java.sql.Statement;

public class PlaceOrderDBUtil {
	
		
		// new place order 
		public static boolean insertOrder(int orderID, int qty, float total, String status, String partCode, String custID ) {
			
			boolean isSuccess = false;
			

			// create database connection
			String url = "jdbc:mysql://localhost:3306/online_vehicle_spare-parts_management_system?useSSL=false";
			String user = "root";
			String pass = "Gavithra@2000";
			
			
						
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url, user, pass);
				Statement stmt = (Statement) con.createStatement();       
				
				String sql = "insert into order(orderID, qty, total, status, partCode, custID ) values (0, '"+qty+"', '"+total+"', '"+status+"', "+partCode+"', '"+custID+"' )";
				int rs = stmt.executeUpdate(sql);
				
				if(rs > 0) {  // if return value = 1, then success; if return value =  0, then fail. 
					
					isSuccess = true;
					
				}else {
					isSuccess = false;
					
				}
				
			}catch(Exception e){  // catch exceptions
				System.out.println("Error in place order DBUtil");
				e.printStackTrace();
			}
			
			return isSuccess;
		}
	}



