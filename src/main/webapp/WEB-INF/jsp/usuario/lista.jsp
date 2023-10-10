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
	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container-fluid mt-3">
		<h3>Listagem de Usuarios.</h3>

		<table class="table table-striped table-success">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome Usuario</th>
					<th>Email</th>
					<th>Senha</th>
					<th>Motoristas</th>
					<th>Corridas Cadastradas</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="u" items="${listaUsuario}">
					<tr>
						<td>${u.id}</td>
						<td>${u.nomeUsuario}</td>
						<td>${u.email}</td>
						<td>${u.senha}</td>
						<td>${u.motoristas.size()}</td>
						<td>${u.corridas.size()}</td>
						<td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>