package com.order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.Statement;  // done a change 

// here we are doing the validation part 





public class OrderDBUtil{
	
	public static List<Order> validate(String custID){ 

		ArrayList<Order> ord = new ArrayList<>();
		
		// create database connection
		String url = "jdbc:mysql://localhost:3306/online_vehicle_spare-parts_management_system";
		String user = "root";
		String pass = "Gavithra@2000";
		Connection con=null;  
		PreparedStatement stmt=null;
		ResultSet rs = null;
		
		
		// validate 		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
			
			System.out.println("connected successfully");
			//PreparedStatement stmt=con.prepareStatement("select * from order where custID='"+custID+"' ");
//			stmt.setString(1, custID);
			//Statement stmt  = (Statement) con.createStatement();  // done a change
			
			String sql = "select * from 'order' where custID = ?";
			// '"+custID+"'
			stmt= con.prepareStatement(sql);
			stmt.setString(1, custID);
			
			rs = stmt.executeQuery();

//			rs = stmt.executeQuery(sql);  // check whether the passed parameters are in the database
			
			// if the data is there , fetch the data
			// Then assign them to variables
		/*	if(rs.next()) {
				
				int orderID =  rs.getInt(1); 
				int qty = rs.getInt(2);
				double total = rs.getDouble(3);
				String status = rs.getString(4);
				String partCode = rs.getString(5);
				String custID1 = rs.getString(6);
				
				
				Order o = new Order(orderID, qty, total, status, partCode, custID1);
				ord.add(o);
				
			}
			*/
			
			if (rs.next()) {
                int orderID = rs.getInt("orderID");
                int qty = rs.getInt("qty");
                float total = rs.getFloat("total");
                String status = rs.getString("status");
                String partCode = rs.getString("partCode");
                String custID1 = rs.getString("custID");
   
                Order o = new Order(orderID, qty, total, status, partCode, custID1);
              ord.add(o);
            }
			//con.close();
			
				
		}catch(Exception e){
			System.out.println("something went wrong");
			e.printStackTrace();
			
		}finally {
		
            // close the database connection in the finally block
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		
		
		return ord;
		
		
	}
}
