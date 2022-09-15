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

		<form action="/comida/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Churrasco do Bill" name="nome" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor:</label>		
				<input type="text" value="999" name="valor" class="form-control">
			</div>

			<div class="form-group">
				<label>Código:</label>		
				<input type="text" value="765" name="codigo" class="form-control">
			</div>

			<div class="form-group">				
				<label>Vegano:</label>				
				<input type="radio" name="vegano" value="true" checked> Sim
				<input type="radio" name="vegano" value="false"> Não
			</div>

			<div class="form-group">
				<label>Peso:</label>		
				<input type="text" value="50" name="peso" class="form-control">
			</div>

			<div class="form-group">
				<label>Ingredientes:</label>		
				<input type="text" value="Carne fresca" name="ingredientes" class="form-control">
			</div>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>