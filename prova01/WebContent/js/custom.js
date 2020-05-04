function rentCar(id) {
	$.ajax({
		url: `http://localhost:8080/Prova01/CarServlet?id=${id}`,
		type: 'GET',
		succes: function(message) {
			console.log(message);
		},
		error: function(message) {
			console.log(message);
		}
	}).done(function() {
		window.location.reload();
	});
}