<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculadora</title>
	</head>
	<body>
		<form method="GET" action="calculo">
			<input type="number" name="num1"/>
			<input type="number" name="num2"/>
			<select name="operator">
				<option value="+">+</option>
				<option value="-">-</option>
				<option value="x">x</option>
				<option value="/">/</option>
			</select>
			<input type="submit" value="Enviar dados">
		</form>
	</body>
</html>