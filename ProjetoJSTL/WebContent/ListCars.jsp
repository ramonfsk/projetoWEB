<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Projeto JSTL</title>
	</head>
	<body>
		<form method="POST" action="CarServlet">
			<button type="submit">Listar Carros</button>
		</form>
		
		<c:forEach items="${ list }" var="name">
			<p>${ name }</p>
		</c:forEach>
	</body>
</html>