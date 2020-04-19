<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Veículo</title>
	</head>
	<body>
		<form method="POST" action="CarroServlet">
			<input type="text" name="txtModeloVeiculo" />
			<input type="text" name="txtFabricanteVeiculo" />
			
			<button type="submit">Cadastrar</button>
		</form>
	</body>
</html>