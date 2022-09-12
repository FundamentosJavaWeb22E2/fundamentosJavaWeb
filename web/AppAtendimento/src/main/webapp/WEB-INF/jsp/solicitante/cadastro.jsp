<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<meta charset="ISO-8859-1">
	<title>App - Cadastro</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/solicitante/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Elberth L C Moraes" name="nome" class="form-control">
			</div>

			<div class="form-group">
				<label>CPF:</label>		
				<input type="text" value="09876543211" name="nome" class="form-control">
			</div>

			<div class="form-group">			
				<label>Email:</label>			
				<input type="email" value="elberth@moraes.com" name="email" class="form-control">
			</div>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>