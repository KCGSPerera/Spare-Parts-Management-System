package com.order;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewOrderServlet")
public class ViewOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String custID = request.getParameter("cid");
		
		
		try {
			List<Order> ordDetails = OrderDBUtil.validate(custID);
			request.setAttribute("ordDetails", ordDetails);  // first parameter can be any name
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("displayOrders.jsp");  // passing the details into the display j
		dis.forward(request, response);
		
	}

}
