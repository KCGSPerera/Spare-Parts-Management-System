package com.oop.registration;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/employeeReg")
public class employeeReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empName = request.getParameter("name");
		String empEmail = request.getParameter("email");
		String empPassword = request.getParameter("pass");
		String empPhone = request.getParameter("contact");
		String empRole = request.getParameter("role");
		
		RequestDispatcher dispatcher = null;
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop?useSSL=false", "root", "password");
			PreparedStatement pst = con.prepareStatement("insert into employees(empName, empPassword, empEmail, empPhone, empRole) values(?,?,?,?,?)");
			
			pst.setString(1, empName);
			pst.setString(2, empPassword);
			pst.setString(3, empEmail);
			pst.setString(4, empPhone);
			pst.setString(5, empRole);
			
			int rowCount = pst.executeUpdate();
			dispatcher = request.getRequestDispatcher("employeeReg.jsp");
			
			if (rowCount > 0) {
				request.setAttribute("status", "success");
			}else {
				request.setAttribute("status", "faild");
			}
			
			dispatcher.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
	
				e.printStackTrace();
			}
		}
	}

}
