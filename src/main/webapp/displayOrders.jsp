<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <!--  <@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  --> 
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Order Details</title>

<style>
table, th, td {
  border: 1px solid;
}
</style>

</head>
<body>

	<table>
	<c:forEach var="ord" items="${ordDetails}">
	
	<c:set var="orderID" value="${ord.orderID }"/>
	<c:set var="qty" value="${ord.qty }"/>
	<c:set var="total" value="${ord.total }"/>
	<c:set var="status" value="${ord.status }"/>
	<c:set var="partCode" value="${ord.partCode }"/>
	<c:set var="custID" value="${ord.custID }"/>
	
	
	<tr>
		<td>Order ID</td>
		<td>${ord.orderID }</td>
	</tr>
	
	<tr>
		<td>Quantity</td>
		<td>${ord.qty}</td>
	</tr>
	
	<tr>
		<td>Total Amount</td>
		<td>${ord.total}</td>
	</tr>
	
	<tr>
		<td>Order Status</td>
		<td>${ord.status }</td>
	</tr>
	
	<tr>
		<td>Part Number</td>
		<td>${ord.partCode}</td>
	</tr>
	
	<tr>
		<td>Customer ID</td>
		<td>${ord.custID}</td>
	</tr>
		
	
	</c:forEach>
	
	</table>
	
	<c:url value="updateOrder.jsp" var="orderupdate">
		<c:param name="oid" value="${orderID }"/>
		<c:param name="qty" value="${qty }"/>
		<c:param name="tot" value="${total }"/>
		<c:param name="stat" value="${status }"/>
		<c:param name="pid" value="${partCode }"/>
		<c:param name="cid" value="${custID }"/>
	</c:url>
	
	<a href="${ orderupdate }">
		<input type="button" name="update" value="Update Order Status">
	</a>

</body>
</html>