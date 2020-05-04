<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="./css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link href="./css/style.css" rel="stylesheet" id="style-css">
		<title>Carluga | Home</title>
	</head>
	<body>
	${ msg }
		<%@ include file="navbar.jsp" %>
		<main role="main">
		  <div class="container">
		    <h1 class="mt-5">Seja bem vindo!</h1>
		    <img src="./imgs/models.jpeg" class="img-fluid" alt="Tesla Model S">
		  </div>
		</main>
		
		<%@ include file="footer.jsp" %>
	<!-- Javascript imports -->
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	<script src="./js/custom.js"></script>
	</body>
</html>