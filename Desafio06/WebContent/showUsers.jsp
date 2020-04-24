<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/bootstrap.min.css">
		<title>Desafio 06 - Lista Usuários</title>
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			  <a class="navbar-brand" href="#">D06</a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			    <div class="navbar-nav">
			      <a class="nav-item nav-link active" href="./home.jsp">Home <span class="sr-only">(current)</span></a>
			      <a class="nav-item nav-link" href="./registerUser.jsp">Cadastrar Usuário</a>
			      <a class="nav-item nav-link" href="./showUsers.jsp">Listar Usuários</a>
			      <a class="nav-item nav-link" href="./registerCar.jsp">Cadastrar Carro</a>
			      <a class="nav-item nav-link" href="./showCars.jsp">Listar Carros</a>
			      
			      	<form class="form-inline my-2 my-lg-0" method="POST" action="FindCarServlet">
			      		<input class="form-control mr-sm-2" type="search" name="txtModelCar" placeholder="Modelo do carro" aria-label="Search">
			      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Procurar</button>
			    	</form>
			    </div>
			  </div>
		</nav>
		
		<div class="container">
			<h1>Lista de Usuários</h1>
		</div>
	</body>
</html>