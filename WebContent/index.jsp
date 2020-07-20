<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<title>Welcome to Pay</title>
</head>
<body>
<%@include file="normal_navbar.jsp" %>
<div class="container">
      <div class="jumbotron mt-3">
        <h1>Pay Bill in Few seconds</h1>
        <p class="lead">Bill is recored for future process.</p>
        <a class="btn btn-lg btn-primary" href="Paynow.jsp?source=add"  role="button">PayNow &raquo;</a>
      </div>
    </div>
<% System.out.println("Button click"); %>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="bootstrap.min.js"></script>
</body>
</html>