<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/styles.css">
		<title>Desafio 05</title>
	</head>
	<body>
		<form method="POST" action="Login">
			<label for="name">Username:</label>
			<input type="text" id="name" name="txtName" required />
			<label for="password">Password:</label>
			<input type="password" id="password" name="txtPassword" required />
			
			<button type="submit">Logon</button>
		</form>
	</body>
</html>