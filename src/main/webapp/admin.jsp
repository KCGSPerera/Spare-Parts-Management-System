
<%
	if(session.getAttribute("name")== null){
		response.sendRedirect("login.jsp");
		 
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link href="css/admin.css" rel="stylesheet" type="text/css">
<link rel="stylesheet"
	href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Rajdhani:wght@300;400;500;600&display=swap">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">

<script src="js/script.js" type="text/javascript"></script>
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
				<li><a href="#" class="active"><span class="las la-igloo"></span>
						<span>Dashboard</span> </a></li>
				<li><a href="employee.jsp"><span class="lab la-servicestack"></span> <span>Employees</span>
				</a></li>
				<li><a href="orders.jsp"><span class="lab la-opencart"></span> <span>Orders</span>
				</a></li>
				<li><a href="suppliers.jsp"><span class="las la-box-open"></span> <span>Suppliers</span>
				</a></li>
				<li><a href="customers.jsp" class="signup-image-link"><span class="las la-users"></span> <span>Customers</span>
				</a></li>
				<li><a href="inventory.jsp"><span class="la la-truck-loading"></span> <span>Products</span>
				</a></li>
				<li><a href="analytics.jsp"><span class="las la-chart-bar"></span> <span>Analytics</span>
				</a></li>
				<li><a href="payments.jsp"><span class="las la-credit-card"></span> <span>Payments</span>
				</a></li>
				<li><a href="settings.jsp"><span class="las la-cog"></span> <span>Settings</span>
			</ul>
		</div>
	</div>
	  
	<div class="main-content">
		<header>
			<h2 class="heading" id="dashboard">Dashboard</h2>
			<div><a href="logout">
				<button class="button" style="vertical-align:middle" ><span>Logout </span></button></a>
			</div>
		</header>
		<main class="main">

			<div class="cards">
				<div class="card-single-web">
					<div>
						<h1 id="web"></h1>
						<span>Web Traffic</span>
					</div>
				</div>
				<div class="card-single-stock">
					<div>
						<h1 id="stock"></h1>
						<span>Stock Report</span>
					</div>
				</div>
				<div class="card-single-sales">
					<div>
						<h1 id="sales"></h1>
						<span>Successful Sales</span>
					</div>
				</div>
			</div>
			<div class="cards">
				<div class="card-single-sales">
					<div>
						<h1 id="sales"></h1>
						<span>Successful Payments</span>
					</div>
				</div>
				<div class="card-single-web">
					<div>
						<h1 id="web"></h1>
						<span>Monthly Income</span>
					</div>
				</div>
				<div class="card-single-stock">
					<div>
						<h1 id="stock"></h1>
						<span>Emplyee Salaries</span>
					</div>
				</div>

			</div>
		</main>
		<footer id="footer">
			<p>Copyright ©2023 All rights reserved | 4BUSTERS</p>
		</footer>
	</div>
</body>
</html>
