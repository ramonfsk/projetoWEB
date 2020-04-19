<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Desafio 04</title>
	</head>
	<body>
		<form method="POST" action="CalculateServlet">
			<label for="num1">Num1:</label>
			<input type="number" id="num1" name="num1" required /><br>
			<label for="num2">Num2:</label>
			<input type="number" id="num2" name="num2" required /><br>
			
			<input type="radio" id="add" value="+" name="operator" required />
			<label for="add">+</label>
			<input type="radio" id="sub" value="-" name="operator" required />
			<label for="sub">-</label>
			<input type="radio" id="mult" value="x" name="operator" required />
			<label for="mult">x</label>
			<input type="radio" id="div" value="/" name="operator" required />
			<label for="div">/</label><br><br>
			
			<button type="submit">Calcular!</button>
		</form>
	</body>
</html>