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
	<c:set var="botao" value=""/>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<form action="/pedido/incluir" method="post">
		
			<div class="form-group">
				<label>Descrição:</label>		
				<input type="text" value="Meu primeiro pedido" name="descricao" class="form-control">
			</div>

			<div class="form-group">
				<label>Data:</label>		
				<input type="datetime-local" name="dtPedido" class="form-control">
			</div>

			<div class="form-group">
				
				<c:if test="${not empty solicitantes}">
					<label>Solicitante:</label>		
					<select class="form-control" name="solicitante">
						<c:forEach var="s" items="${solicitantes}">
					    	<option value="${s.id}">${s.nome}</option>
					    </c:forEach>
					</select>
				</c:if>
				
				<c:if test="${empty solicitantes}">
					<label>Não existem solicitantes cadastrados!</label>
					<c:set var="botao" value="disabled"/>
				</c:if>
			</div>

			<div class="form-group">				
				<c:if test="${not empty produtos}">				
					<label>Produtos:</label>
					<c:forEach var="p" items="${produtos}">		
						<div class="checkbox">
						  <label><input type="checkbox" name="produtos" value="${p.id}"> ${p.nome}</label>
						</div>
					</c:forEach>
				</c:if>

				<c:if test="${empty produtos}">
					<label>Não existem produtos cadastrados!</label>
					<c:set var="botao" value="disabled"/>
				</c:if>
			</div>

			<button ${botao} type="submit" class="btn btn-gray">Cadastrar</button>
		</form>
	</div>
</body>
</html>