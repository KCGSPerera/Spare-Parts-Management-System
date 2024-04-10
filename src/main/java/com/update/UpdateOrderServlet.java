package com.update;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateOrderServlet")
public class UpdateOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int orderID = Integer.parseInt(request.getParameter("oid"));
		int qty = Integer.parseInt(request.getParameter("qty"));
		float total = Float.parseFloat(request.getParameter("tot"));
		String status = request.getParameter("stat");
		String partCode = request.getParameter("pid");
		String custID = request.getParameter("cid");
		
		boolean isTrue;
		
		isTrue = UpdateOrderDBUtil.updateOrderStatus(orderID, qty, total, status, partCode, custID);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
	}

}
