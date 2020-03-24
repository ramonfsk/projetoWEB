<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./css/style.css">
		<title>Desafio 03</title>
	</head>
	<body>
		<form method="POST" action="imc" class="formIMC">
			<fieldset>
				<legend>IMC</legend>
				<label for="txtWeight">Informe o peso:</label>
				<input type="text" id="txtWeight" name="txtWeight" required/>
				<label for="txtHeight">Agora, a altura:</label>
				<input type="text" id="txtHeight" name="txtHeight" required/>
				<input type="submit" value="Calcular"/>
			</fieldset>
		</form>
	</body>
</html>