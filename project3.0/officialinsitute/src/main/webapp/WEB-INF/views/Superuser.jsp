<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Super User</title>
</head>
<body>
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
			<LI><A href="manageuser">User</A></LI>
			<LI><A href="manageproducts">Products</A></LI>
			<LI><A href="manageinstitute">Institute</A></LI>
			<LI><A href="managepackages">Packages</A></LI>
			<LI style="float: right"><A href="logout">Logout</A></LI>
			</UL>



</body>
</html>