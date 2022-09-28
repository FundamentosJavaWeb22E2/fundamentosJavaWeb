<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		<h2>Cadastramento de pedidos</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>
		
		<form action="/pedido" method="get">
			<button type="submit" class="btn btn-gray">Novo</button>
		</form>

		<p>Listagem de pedidos cadastrados: ${listagem.size()}</p>

		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Descrição</th>
		      <th>Data</th>
		      <th>Web</th>
		      <th>Solicitante</th>
		      <th>Produtos</th>
		      <th></th>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="p" items="${listagem}">
						
			   <tr>
			     <td>${p.id}</td>
			     <td>${p.descricao}</td>
			     <td>
					<fmt:parseDate value="${p.data}" pattern="yyyy-MM-dd" var="dataFormat" type="date"/>
					<fmt:formatDate pattern="dd/MM/yyyy" value="${dataFormat}"/>
			     </td>
			     <td>${p.web}</td>
			     <td>${p.solicitante.nome}</td>
			     <td>${p.produtos}</td>
			     <td><a href="/pedido/${p.id}/excluir">Excluir</a></td>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>