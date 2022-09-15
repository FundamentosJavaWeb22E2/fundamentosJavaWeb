<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
		<h2>Cadastramento de comidas</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>
		
		<form action="/comida" method="get">
			<button type="submit" class="btn btn-gray">Novo</button>
		</form>

		<p>Listagem de comidas cadastradas: ${listagem.size()}</p>
		            
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>Valor</th>
		      <th>Código</th>
		      <th>Vegano</th>
		      <th>Peso</th>
		      <th>Ingredientes</th>
		      <th></th>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="c" items="${listagem}">
			   <tr>
			     <td>${c.id}</td>
			     <td>${c.nome}</td>
			     <td>${c.valor}</td>
			     <td>${c.codigo}</td>
			     <td>${c.vegano}</td>
			     <td>${c.peso}</td>
			     <td>${c.ingredientes}</td>
			     <td><a href="/comida/${c.id}/excluir">Excluir</a></td>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>