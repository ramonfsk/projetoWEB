<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="./css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link href="./css/style.css" rel="stylesheet" id="style-css">
		<title>Alucar | Cadastrar Veiculo</title>
	</head>
	<body>
		<%@ include file="navbar.jsp" %>
		
		<main role="main">
		<div class="container">
				<h1 class="mt-5">Cadastro Veiculo</h1>
				<form method="POST" action="CarServlet">
					<div class="form-group">
	                     <label for="brand">Marca</label>
	                     <input id="brand" type="text" class="form-control" name="txtBrand" placeholder="Tesla" required>
	                  </div>
	                  <div class="form-group">
	                     <label for="model">Modelo</label>
	                     <input id="model" type="text" class="form-control" name="txtModel" placeholder="S" required>
	                  </div>
	                  <div class="form-group">
	                     <label for="model_year">Ano</label>
	                     <input id="model_year" type="text" class="form-control" name="txtModelYear" placeholder="2020" required>
	                  </div>
	                  <div class="form-group">
	                     <label for="chassi">Chassi</label>
	                     <input id="chassi" type="text" class="form-control" name="txtChassi" placeholder="ASHGD727229" required>
	                  </div>
	                  <div class="form-group">
	                     <label for="plate_license">Placa</label>
	                     <input id="plate_license" type="text" class="form-control" name="txtPlateLicense" placeholder="ABCD-12309" required>
	                  </div>
	                  <div class="d-block my-2">
	                  	<div class="custom-control custom-radio">
	                  		<input id="available" class="custom-control-input" name="boolAvailability" type="radio" value="true" checked required>
	                  		<label class="custom-control-label" for="available">Disponivel</label>
	                  	</div>
	                  	<div class="custom-control custom-radio">
	                  		<input id="unavailable" class="custom-control-input" name="boolAvailability" type="radio" value="false" required>
	                  		<label class="custom-control-label" for="unavailable">Indisponivel</label>
	                  	</div>
	                  </div>
	                  <button type="submit" class="btn btn-success" name="btnSubmit" value="add">Salvar</button>
				</form>
			</div>
		</main>
		
		<%@ include file="footer.jsp" %>
	<!-- Javascript imports -->
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	<script src="./js/custom.js"></script>
	</body>
</html>