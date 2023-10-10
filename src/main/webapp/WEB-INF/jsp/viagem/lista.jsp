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
		<h3>Listagem de Corridas Viagem de Passageiros.</h3>
		
		<table class="table table-striped table-success">
			<thead>
				<tr>
					<th>Id Corrida</th>
					<th>Codigo</th>
					<th>Data Agendada</th>
					<th>Tipo Corrida</th>
					<th>Endereço Origem</th>
					<th>Endereço Destino</th>
					<th>Quantidade Passageiros</th>
					<th>Preço Minimo</th>
					<th>Area de Risco</th>
					<th>Possui Bagagem</th>
					<th>Distancia Viagem</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="v" items="${listaViagem}">
				<tr>
					<td>${v.idCorrida}</td>
					<td>${v.codigo}</td>
					<td>${v.dataAgendada}</td>
					<td>${v.tipoCorrida}</td>
					<td>${v.enderecoOrigem}</td>
					<td>${v.enderecoDestino}</td>
					<td>${v.quantidadePassageiros}</td>
					<td>${v.precoMinimo}</td>
					<td>${v.areaDeRisco}</td>
					<td>${v.possuiBagagem}</td>
					<td>${v.distanciaViagem}</td>
					<td><a href="/viagem/${v.codigo}/excluir">Excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>