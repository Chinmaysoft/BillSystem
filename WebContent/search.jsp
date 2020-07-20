<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>Search Customer</title>
</head>
<body>
<%@include file="normal_navbar.jsp" %>

<div class="container  h-100 d-flex justify-content-center align-items-center">
	<form action="SearchServlet" method="get">
		<h1 align="center" class="mt-4">Please Search All Information</h1>
		
<div class="row">
  <div class="form-group">
  <input type="radio" name="search"  value="cno" checked> Cno
  <input type="radio" name="search"  value="subscription"> Subscription 
  </div>
  </div>
	
	<div class="row mt-3">
  <div class="form-group col-xs-3">
    <label for="price">Search Value</label>
    <input type="text" name="searchval" class="form-control" id="val" placeholder="Search Value">
  </div>
  </div>

	<button type="submit" class="btn btn-primary col-xs-3">Submit</button>

	</form>
</div>

<!-- java script and jquery -->
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="bootstrap.min.js"></script>
</body>
</html>