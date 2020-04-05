<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/styles.css">
		<title>Desafio 05</title>
	</head>
	<body>
		<h1>Welcome ${ name }!</h1>
		<form method="POST" action="ListCars">
			<button type="submit">List cars</button>
		</form>
	</body>
</html>