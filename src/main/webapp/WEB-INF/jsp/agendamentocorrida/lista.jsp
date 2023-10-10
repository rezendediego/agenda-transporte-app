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
		<h3>Listagem de Corridas Agendadas.</h3>
		
		<table class="table table-striped table-success">
			<thead>
				<tr>
					<th>Id Agendamento Corrida</th>
					<th>Data Agendamento</th>
					<th>Confirmação Motorista</th>
					<th>Motorista</th>
					<th>Lista Corridas Agendadas</th>
					<th>Nome Cliente</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="a" items="${listaAgendamentoCorrida}">
				<tr>
					<td>${a.idAgendamentoCorrida}</td>
					<td>${a.dataAgendamento}</td>
					<td>${a.confirmacaoMotorista}</td>
					<td>${a.motorista}</td>
					<td>${a.listaCorridaAgendada}</td>
					<td>${a.nomeCliente}</td>
					<td><a href="/agendamentocorrida/${a.dataAgendamento}/excluir">Excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>