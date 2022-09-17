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
		<h2>Cadastramento de produtos</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>

		<p>Listagem de produtos cadastrados: ${listagem.size()}</p>
		            
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>Valor</th>
		      <th>Código</th>
		      <th></th>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="p" items="${listagem}">
			   <tr>
			     <td>${p.id}</td>
			     <td>${p.nome}</td>
			     <td>${p.valor}</td>
			     <td>${p.codigo}</td>
			     <td><a href="/produto/${p.id}/excluir">Excluir</a></td>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>