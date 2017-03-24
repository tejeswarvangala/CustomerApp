<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Customer App Home</title>
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
				<li class="active"><a href="#">Home</a></li>
				<li><a href="/CustomerApp/customerInsert">Customer</a></li>
				<li><a href="#">Invoice</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="row">
			<div class="col-md-4">

				<h2>Category Counts</h2>
				<h4><b>Total Number of Customers: <c:out value="${countMap['Total']}" /></b><br></h4>
				<table class="table table-striped table-bordered table-condensed">
					<thead>
						<tr>
							<th>Category</th>
							<th>Count</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${countMap}" var="entry">
							<c:if test="${entry.key!='Total'}">
   							<tr>
								<td>${entry.key}</td>
								<td>${entry.value}</td>
							</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>	
			</div>
			<div class="col-md-4">
				<h2>Invoice Details</h2>
				<h4><b>Total amount: <c:out value="${invoice['Total']}" /></b><br></h4>
				<table class="table table-striped table-bordered table-condensed">
					<thead>
						<tr>
							<th>payment status</th>
							<th>Total</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${invoice}" var="entry">
							<c:if test="${entry.key!='Total'}">
   							<tr>
								<td>${entry.key}</td>
								<td>${entry.value}</td>
							</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>	
			</div>
		</div>
	</div>
</body>
</html>
