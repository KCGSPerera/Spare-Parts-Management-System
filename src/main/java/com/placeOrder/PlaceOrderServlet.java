package com.placeOrder;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PlaceOrderServlet")
public class PlaceOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 
		    int orderID = Integer.parseInt(request.getParameter("oid"));
			int qty = Integer.parseInt(request.getParameter("qty"));
			float total = Float.parseFloat(request.getParameter("tot"));
			String status = request.getParameter("stat");
			String partCode = request.getParameter("pid");
			String custID = request.getParameter("cid");
	
	 
		 
		
		/*
		
		int orderID = Integer.parseInt(request.getAttribute("oid"));
		int qty = Integer.parseInt(request.getAttribute("qty"));
		double total = Float.parseFloat(request.getAttribute("tot"));
		String partCode = request.getParameter("pid");
		String custID = request.getParameter("cid");
		
		*/
		
		
		boolean isTrue;
		
		isTrue = PlaceOrderDBUtil.insertOrder(orderID, qty, total, status, partCode, custID);  // passing the above initialized values into the PlaceOrderDBUtil class.  
		
		if(isTrue == true ) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");  // RequetDispatcher is used to navigate from Servlet class to jsp class.
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}



		
