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

footer {
	background-color: black;
	position: absolute;
	left: 0px;
	bottom: 0px;
	height: 120px;
	width: 100%;
}

.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 30%;
	height: 150px; left:111px; bottom:111px; margin: auto;
}
</style>
<title>Userhome</title>
</head>
<body>
	<header>
		<div class=" text-center">
			<H1
				style="color: blue; font-family: monotype corsiva; font-size: 50px">
				welcome to <img src="F:\solutions\pics\1.jpg" /H1>
				<H2
					style="color: black; font-family: monotype corsiva; font-size: 30px">solution
					to the problem</H2>
		</div>
	</header>

	<nav>
		<UL>
			<LI><A href="/HOME/">HOME</A></LI>
			<LI><A href="/Insitute/">Insitute</A></LI>
			<LI><A href="/Products/">Products</A></LI>
			<LI><A href="/About/">About</A></LI>
			<LI><A href="/Contact/">Contact</A></LI>
			<LI><A></A></LI>
				<LI style="float: right"><A href="logout">Logout</A></LI>
			
		</UL>
	</nav>

	<div class="container">


		<br>

		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- indicators -->
			<ol class="carousel-indicators">
				<li data-target="#mycarousel" data-slide-to="0" class="active"></li>
				<li data-target="#mycarousel" data-slide-to="1"></li>
				<li data-target="#mycarousel" data-slide-to="2"></li>
				<li data-target="#mycarousel" data-slide-to="3"></li>
				<li data-target="#mycarousel" data-slide-to="4"></li>
				<li data-target="#mycarousel" data-slide-to="5"></li>
			</ol>

			<!-- Wrapper for slides-->
			<div class="carousel-inner" role="listbox">

				<div class="item active">
					<img src="F:\solutions\pics\nu.jpg" alt="niit " width="350"
						height="200">
				</div>

				<div class="item">
					<img src="F:\solutions\pics\time.jpg" alt="time" width="350"
						height="200">
				</div>

				<div class="item">
					<img src="F:\solutions\pics\takshila.jpg" alt="takshila"
						width="350" height="200">
				</div>


				<div class="item">
					<img src="F:\solutions\pics\fiitjee.jpg" alt="fiitjee" width="350"
						height="200">
				</div>


				<div class="item">
					<img src="F:\solutions\pics\Takshila.jpg" alt="Takshila"
						width="350" height="200">
				</div>


				<div class="item">
					<img src="F:\solutions\pics\narayna.jpg" alt="narayna" width="350"
						height="200">
				</div>
			</div>
		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#mycarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span></a> <a
			class="right carousel-control" href="#mycarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span></a>
	</div>
	</div>



	<p></p>

	<footer>
		<p imgsrc:"f.png"></p>
		<p
			style="color: white; text-align: left; font-family: monotype corsiva; font-size: 20px">Posted
			by: NIIT STUDENT</p>
		<p
			style="color: white; text-align: left; font-family: monotype corsiva; font-size: 20px">Copyright
			(c) 508</p>
		<p
			style="color: white; text-align: right; font-family: monotype corsiva; font-size: 20px">
			Contact information: <a href="agraj.customer@solution.com">customer@soltuion.com</a>
		</p>
	</footer>

</body>
</html>