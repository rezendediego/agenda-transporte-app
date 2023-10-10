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
	<div class="container mt-3">
		<h2>${projeto.nome} - ${projeto.descricao} </h2>
		<br>
		<c:forEach var="c" items="${projeto.classes}">
			<br>
			<h5>${c.nome}</h5>			
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Campo</th>
						<th>Tipo</th>
						<th>Observação</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="a" items="${c.atributos}">
						<tr>
							<td>${a.campo}</td>
							<td>${a.tipo}</td>
							<td>${a.descricao}</td>
						</tr>					
					</c:forEach>						
				</tbody>
			</table>
		</c:forEach>		
	</div>	
</body>
</html>