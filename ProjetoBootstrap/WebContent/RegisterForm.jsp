<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<title>Utilizando Bootstrap</title>
	</head>
	<body>
		<div class="container">
			<h1>Cadastro de Usuário</h1>
			<div class="card">
				<div class="card-body">
					<form method="POST" action="">
						<div class="form-group row">
							<label class="col-sm-2">Nome</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="txtName" placeholder="Digite seu nome" />
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2">Telefone</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="txtTelefone" placeholder="Digite seu nome" />
							</div>
						</div>
						<div class="form-group row">
							<label class="col-sm-2">Senha</label>
							<div class="col-sm-7">
								<input type="text" class="form-control" name="txtSenha" placeholder="Digite seu nome" />
							</div>
						</div>
						
						<button type="submit" class="btn btn-primary">Salvar</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>