<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="carBO" class="br.com.bo.CarBO"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="./css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link href="./css/style.css" rel="stylesheet" id="style-css">
		<title>Alucar | Busca de Veiculos</title>
	</head>
	<body>
		${ model }
		<%@ include file="navbar.jsp" %>
		<main role="main">
		  <div class="container">
			    <h1 class="mt-5">Resultado da busca Veiculos</h1>
			    <table class="table table-bordered">
			    	<thead>
			    		<tr>
			    			<th scope="col">Marca</th>
			    			<th scope="col">Modelo</th>
			    			<th scope="col">Ano</th>
			    			<th scope="col">Chassi</th>
			    			<th scope="col">Placa</th>
			    			<th scope="col">Ações</th>
			    		</tr>
			    	</thead>
			    	<tbody>
			    		<c:forEach var="car" items="${ cars }">
			    			<tr>
			    				<td>${ car.getBrand() }</td>
			    				<td>${ car.getModel() }</td>
			    				<td>${ car.getModelYear() }</td>
			    				<td>${ car.getChassi() }</td>
			    				<td>${ car.getPlateLicense() }</td>
			    				<td>
				    				<div class="btn-group" role="group">
				    					<button class="btn btn-success" onClick="editCar(${ car.getId() })">Editar</button>
				    					<button class="btn btn-danger" onClick="remCar(${ car.getId() })">Remover</button>
				    				</div>
			    				</td>
			    			</tr>
			    		</c:forEach>
			    	</tbody>
			    </table>
		    </div>
		</main>
		
		<%@ include file="footer.jsp" %>
	<!-- Javascript imports -->
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	<script src="./js/custom.js"></script>
	</body>
</html>