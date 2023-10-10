<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppAgendaTransporte</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>
	
	<div class="container-fluid mt-3">
		<h3>Listagem de Motoristas.</h3>
		<h5>
			<a href="/motorista/cadastro">Novo</a> 
			<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
  				<path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
  				<path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
			</svg>
		</h5>
		
		<table class="table table-striped table-success">
			<thead>
				<tr>
					<th>ID Motorista</th>
					<th>Qualificação Motorista</th>
					<th>Cpf</th>
					<th>Nome Motorista</th>
					<th>Celular Motorista</th>
					<th>Tipo Carro</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="m" items="${listaMotorista}">
				<tr>
					<td>${m.id}</td>
					<td>${m.qualificacaoMotorista}</td>
					<td>${m.cpf}</td>
					<td>${m.nomeMotorista}</td>
					<td>${m.celularMotorista}</td>
					<td>${m.tipoCarro}</td>
					<td><a href="/motorista/${m.id}/excluir">Excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>