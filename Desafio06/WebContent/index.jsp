<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="./css/bootstrap.min.css">
		<title>Desafio 06 - Index</title>
	</head>
	<body>
		<div class="container">
			<h1>Login</h1>
			<div class="card">
				<div class="card-body">
					<form method="POST" action="LoginServlet">
						<div class="form-group row">
							<label class="col-sm-2">E-mail</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="txtEmail" placeholder="user@mail.com" />
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2">Senha</label>
							<div class="col-sm-7">
								<input type="password" class="form-control" name="txtPassword" placeholder="****" />
							</div>
						</div>
						
						<button type="submit" class="btn btn-primary">Login</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>