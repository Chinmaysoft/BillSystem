<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>Pay Now</title>
</head>
<body>
<%@include file="normal_navbar.jsp" %>
<!-- end nav bar -->
<div class="container h-100 d-flex justify-content-center align-items-center">
<form action="Monthlypay" method="post">
	<h1 align="center" class="mt-4">Please Fill All Information</h1>
	
	<div class="row">
  <div class="form-group col-xs-3">
    <label for="billname">Bill Name</label>
    <input type="text" name="bill" class="form-control" id="billname" aria-describedby="emailHelp" placeholder="Bill (water bill,DTH Bill).">
    <small id="billdetails" class="form-text text-muted">Its store bill information.</small>
  </div>
  </div>

<div class="row">
  <div class="form-group col-xs-3">
    <label for="Customerno">Customer Number</label>
    <input type="text" name="cno" class="form-control" id="Customerno" placeholder="Customer NO">
  </div>
	</div>

	<div class="row">
  <div class="form-group col-xs-3">
    <label for="Customername">Customer Name</label>
    <input type="text" name="cname" class="form-control" id="Customername" placeholder="Customer Name">
  </div>
	</div>


	<div class="row">
  <div class="form-group col-xs-3">
    <label for="mobilenumber">Mobile No</label>
    <input type="text" name="mno" class="form-control" id="mobilenumber" placeholder="Mobile No">
  </div>
	</div>	

	<div class="row">
  <div class="form-group col-xs-3">
    <label for="price">Amount</label>
    <input type="text" name="amt" class="form-control" id="price" placeholder="Amount">
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