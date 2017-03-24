<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>New Customer</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>
<body>
	<nav role="navigation" class="navbar navbar-default">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a href="#" class="navbar-brand">CustomerApp</a>
		</div>
		<!-- Collection of nav links and other content for toggling -->
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="/CustomerApp/custHome">Home</a></li>
				<li class="active"><a href="#">Customer</a></li>
				<li><a href="#">Invoice</a></li>
			</ul>
		</div>
	</nav>
	<h3>Welcome, Enter The Employee Details</h3>

	<div class="container">
		<div class="row">
			<div class="col-lg-5">
				<form:form method="POST" class="form-horizontal"
					action="/CustomerApp/saveCustomer" modelAttribute="cust">
					<div class="form-group">
						<form:label for="custFName" path="customerFname">First Name:</form:label>
						<div class="col-xs-5">
							<form:input id="custFName" class="form-control input-sm" path="customerFname" />
						</div>
					</div>
					<div class="form-group">
						<form:label path="customerLname">Last Name:</form:label>
						<div class="col-xs-5">
							<form:input class="form-control input-sm" path="customerLname" />
						</div>
					</div>
					<div class="form-group">
						<form:label path="dob">DOB:</form:label>
						<div class="col-xs-5">
							<form:input class="form-control input-sm"
								placeholder="mm/dd/yyyy" path="dob" />
						</div>
					</div>
					<div class="form-group">
						<form:label path="doj">DOJ:</form:label>
						<div class="col-xs-5">
							<form:input class="form-control input-sm"
								placeholder="mm/dd/yyyy" path="doj" />
						</div>
					</div>
					<div class="form-group">
						<form:label path="category">Category Name:</form:label>
						<div class="col-xs-5">
							<form:input class="form-control input-sm" path="category" />
						</div>
					</div>

					<input type="submit" class="btn btn-default btn-sm" value="Submit" />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>