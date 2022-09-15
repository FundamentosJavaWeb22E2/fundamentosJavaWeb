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

		<form action="/sobremesa/incluir" method="post">
		
			<div class="form-group">
				<label>Nome:</label>		
				<input type="text" value="Doce de leite" name="nome" class="form-control">
			</div>

			<div class="form-group">
				<label>Valor:</label>		
				<input type="text" value="666" name="valor" class="form-control">
			</div>

			<div class="form-group">
				<label>Código:</label>		
				<input type="text" value="123" name="codigo" class="form-control">
			</div>

			<div class="form-group">				
				<label>Doce:</label>				
				<input type="radio" name="doce" value="true" checked> Sim
				<input type="radio" name="doce" value="false"> Não
			</div>

			<div class="form-group">
				<label>Quantidade:</label>		
				<input type="text" value="5" name="quantidade" class="form-control">
			</div>

			<div class="form-group">
				<label>Informação:</label>		
				<input type="text" value="Muito doce" name="informacao" class="form-control">
			</div>

			<button type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>