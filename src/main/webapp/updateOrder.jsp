<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update order status</title>
</head>
<body>


<%
	String orderID = request.getParameter("orderID");
	String qty = request.getParameter("qty");
	String total = request.getParameter("total");
	String status = request.getParameter("status");
	String partCode = request.getParameter("partCode");
	String custID = request.getParameter("custID");
%>

<form action="update" method="post"><br><br>

Order ID : &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp; <input type= "number" name= "oid" value="<%=orderID%>" readonly> <br><br> 

Quantity :  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type= "number" name = "qty" value="<%=qty%>" readonly> <br><br>

Total Amount :  &nbsp; <input type= "number" name = "tot" value="<%=total%>" readonly> <br><br>

Status : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="text" name = "stat" value="<%=status%>" ><br><br>

Part ID : &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp; &nbsp;<input type= "text" name= "pid" value="<%=partCode%>" readonly> <br><br>

Customer ID : &nbsp; &nbsp;  <input type= "text" name= "cid" value="<%=custID%>" readonly> <br><br><br>



<input type = "submit" name = "submit" value = "Update Order Status" > <br>


</form>


</body>
</html>