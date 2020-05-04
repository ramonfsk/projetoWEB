<header>
	<nav class="navbar navbar-expand-md navbar-dark fixed-top navbar-custom">
		  <a class="navbar-brand" href="#">Carluga</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		    <div class="navbar-nav mr-auto">
		      <a class="nav-item nav-link active" href="./home.jsp">Home <span class="sr-only">(current)</span></a>
		      <a class="nav-item nav-link" href="./registerCar.jsp">Cadastrar Veículo</a>
		      <a class="nav-item nav-link" href="./listCars.jsp">Listar Veiculos</a>
		      <a class="nav-item nav-link" href="./rentCar.jsp">Alugar Veiculo</a>
		    </div>
		    <form class="form-inline mt-2 mt-md-0" method="POST" action="CarServlet">
	      		<input class="form-control mr-sm-2" type="search" name="txtModelCar" placeholder="Modelo do carro" aria-label="Search">
	      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="btnSubmit" value="find">Procurar</button>
	    	</form>
		  </div>
	</nav>
</header>