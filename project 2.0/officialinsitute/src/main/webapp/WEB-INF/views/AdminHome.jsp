<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<style>
* {
	padding: 0;
	margin: 0;
}

nav {
	background-color: black;
	height: 50px;
}

nav ul {
	border: 1px solid red;
	height: 50px;
	width: 1366px;
	margin: 0 auto;
}

nav ul li {
	list-style-type: none;
	width: 150px;
	float: left;
	border-right: 1px solid #ccc;
	text-align: center;
}

li a {
	text-decoratio: none;
	color: white;
	line-height: 50px;
	display: block;
}

li a:hover {
	background-color: orange;
	color: white;
}
</style>
<title>AdminHome</title>
</head>
<body>
<UL>
			<LI><A href="manage user">User</A></LI>
			<LI><A href="manage products">Products</A></LI>
			<LI><A href="manage institute">Institute</A></LI>
			<LI><A href="manage packages">Packages</A></LI>
			</UL>



</body>
</html>