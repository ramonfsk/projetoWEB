<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="./css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
		<link href="./css/style.css" rel="stylesheet" id="style-css">
		<title>Carluga | Login</title>
	</head>
	<body>
		<div class="sidenav">
         <div class="login-main-text">
            <h2><strong>Carluga</strong><br>Página de Login</h2>
            <p>Faça logon ou se registre para acessar.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form method="POST" action="UserServlet">
                  <div class="form-group">
                     <label for="username">Username</label>
                     <input id="username" type="text" class="form-control" name="txtUsername" placeholder="username" required>
                  </div>
                  <div class="form-group">
                     <label for="password">Senha</label>
                     <input id="password" type="password" class="form-control" name="txtPassword" placeholder="****" required>
                  </div>
                  <button type="submit" class="btn btn-black" name="btnSubmit" value="login">Login</button>
                  <a href="./registerUser.jsp" class="btn btn-success">Registrar</a>
               </form>
            </div>
         </div>
      </div>
    <!-- Javascript imports -->
    <script src="./js/bootstrap.min.js"></script>
	<script src="./js/jquery-3.5.0.min.js"></script>
	</body>
</html>