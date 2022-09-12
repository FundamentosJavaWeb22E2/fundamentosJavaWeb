<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Arrays"%>
<%@page import="br.edu.infnet.elberthapp.model.domain.Solicitante"%>
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
		<h2>Cadastramento de solicitantes</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>
		
		<form action="/solicitante" method="get">
			<button type="submit" class="btn btn-gray">Novo</button>
		</form>

		<p>Listagem de solicitantes cadastrados: ${listagem.size()}</p>
		            
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>Cpf</th>
		      <th>E-mail</th>
		      <th>Usuário</th>
		      <th></th>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="s" items="${listagem}">
			   <tr>
			     <td>${s.id}</td>
			     <td>${s.nome}</td>
			     <td>${s.cpf}</td>
			     <td>${s.email}</td>
			     <td>${s.usuario.nome}</td>
			     <td><a href="/solicitante/${s.id}/excluir">Excluir</a></td>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>