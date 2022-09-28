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
		<h2>Cadastramento de usuários</h2>

		<c:if test="${not empty msg}">		
			<div class="alert alert-success">
				<strong>Successo!</strong> ${msg}
			</div>				
		</c:if>

		<p>Listagem de usuários cadastrados: ${listagem.size()}</p>
		            
		<table class="table table-striped">
		  <thead>
		    <tr>
		      <th>ID</th>
		      <th>Nome</th>
		      <th>E-mail</th>
		      <th>Senha</th>
		      <th>Administrador</th>
		      <th>Endereço</th>
		      <th>Solicitantes</th>
		      <th>Produtos</th>
		      <th>Pedidos</th>
		      
		      <c:if test="${user.admin}">
		      	<th></th>
		      </c:if>
		    </tr>
		  </thead>
		  
		  <tbody>
			<c:forEach var="u" items="${listagem}">
			   <tr>
			     <td>${u.id}</td>
			     <td>${u.nome}</td>
			     <td>${u.email}</td>
			     <td>${u.senha}</td>
			     <td>${u.admin}</td>
			     <td>${u.endereco.uf}</td>
			     <td>${u.solicitantes.size()}</td>
			     <td>${u.produtos.size()}</td>
			     <td>${u.pedidos.size()}</td>
			     
			     <c:if test="${user.admin}">			     
			     	<td>
				     	<c:choose>
				     		<c:when test = "${user.id != u.id}">
				     			<a href="/usuario/${u.id}/excluir">Excluir</a>
				     		</c:when>
				     	</c:choose>
			     	</td>
			     </c:if>
			   </tr>
			</c:forEach>
		  </tbody>
		</table>
	</div>
</body>
</html>