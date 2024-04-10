
<%
	if(session.getAttribute("name")== null){
		response.sendRedirect("admin.jsp");
		 
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Employee Management</title>

<link href="css/employee.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Rajdhani:wght@300;400;500;600&display=swap">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<script src="js/employee.js" type="text/javascript"></script>
</head>
<body>


	<input type="checkbox" id="nav-toggle">

	<div class="sidebar">
		<div class="sidebar-brand">
			<h2>
				<span class="lab la-accusoft"></span><span id="kleenpulse">4BUSTERS</span>
			</h2>
		</div>

		<div class="user-wrapper">

			<ul style="text-align: center;">
				<li><img style="height: 80px; width: 80px;"
					src="images/man.png" alt="profile-picture"></li>
				<br>
				<li>
					<div>
						<h4><%=session.getAttribute("name") %></h4>
						<small>Admin</small>
					</div>
				</li>
			</ul>


		</div>

		<div class="sidebar-menu">
			<ul>
				<li><a href="admin.jsp"><span class="las la-igloo"></span><span>Dashboard</span> 
                </a></li>
				<li><a href="employee.jsp" class="active"><span class="lab la-servicestack"></span> <span>Employee</span>
				</a></li>
				<li><a href="orders.jsp"><span class="lab la-opencart"></span> <span>Orders</span>
				</a></li>
				<li><a href="suppliers.jsp"><span class="las la-box-open"></span> <span>Suppliers</span>
				</a></li>
				<li><a href="customers.jsp" class="signup-image-link"><span class="las la-users"></span> <span>Customers</span>
				</a></li>
				<li><a href="inventory.jsp"><span class="la la-truck-loading"></span> <span>Inventory</span>
				</a></li>
				<li><a href="analytics.jsp"><span class="las la-chart-bar"></span> <span>Analytics</span>
				</a></li>
				<li><a href="payments.jsp"><span class="las la-credit-card"></span> <span>Payments</span>
				</a></li>
				<li><a href="settings.jsp"><span class="las la-cog"></span> <span>Settings</span>
				</a></li>
			</ul>
		</div>
	</div>
	  
	<div class="main-content">
		<header>
			<h2 class="heading" id="dashboard">Employee</h2>
			<div><a href="logout">
				<button class="button" style="vertical-align:middle" ><span>Logout </span></button></a>
			</div>
		</header>
		<main class="main">

			
		</main>
		<footer id="footer">
			<p>Copyright ©2023 All rights reserved | 4BUSTERS</p>
		</footer>
	</div>
</body>
</html>
