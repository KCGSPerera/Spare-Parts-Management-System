package Testing1;

import java.sql.*;
import java.sql.DriverManager;

public class MyDbConnection {
	
	public static void main(String [] args) {
	
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_vehicle_spare-parts_management_system?useSSL=false", "root", "Gavithra@2000");
		System.out.println("Successfully connected to the database");
		
		PreparedStatement preparedStatement = con.prepareStatement("insert into 'orders' values(?,?,?,?,?,?)");
		preparedStatement.setInt(1,0);
		preparedStatement.setInt(2,3);
		preparedStatement.setFloat(3,12500);
		preparedStatement.setString(4,"pending");
		preparedStatement.setString(5,"p0005");
		preparedStatement.setString(6,"c0005");
		
		preparedStatement.executeUpdate();
		
		System.out.println("Data Inserted successfully");
	}catch(Exception e){
		System.out.println("error with connection to DB");
		e.printStackTrace();
	}
	
	}

}
