<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Place Order</title>

<style>

 p, h1, h2, h3	{
	font-wieght: bold;

}

</style>


</head>
<body>

<input type = "hidden" id="status" value="<%= request.getParameter("status") %>" >

<form action="place" method="post"><br><br>

Order ID : &nbsp; &nbsp; &nbsp;  &nbsp;  &nbsp; <input type= "number" name= "oid" > <br><br> 

Quantity :  &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp; <input type= "number" name = "qty"> <br><br>

Total Amount :  &nbsp; <input type= "number" name = "tot"> <br><br>

Status : &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <input type= "text" name ="stat" > <br><br>

Part ID : &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;  &nbsp; &nbsp;<input type= "text" name= "pid" > <br><br>

Customer ID : &nbsp; &nbsp;  <input type= "text" name= "cid" > <br><br><br>



<input type = "submit" name = "submit" value = "Place Oreder" > <br>


</form>

</body>
</html>