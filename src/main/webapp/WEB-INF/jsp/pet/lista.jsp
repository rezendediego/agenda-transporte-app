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
		<h3>Listagem de Corridas de Transporte Pet .</h3>
		
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
					<th>Tipo Animal</th>
					<th>Acompanhante Humano</th>
					<th>Aguardar Consulta</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${listaPet}">
				<tr>
					<td>${p.idCorrida}</td>
					<td>${p.codigo}</td>
					<td>${p.dataAgendada}</td>
					<td>${p.tipoCorrida}</td>
					<td>${p.enderecoOrigem}</td>
					<td>${p.enderecoDestino}</td>
					<td>${p.quantidadePassageiros}</td>
					<td>${p.precoMinimo}</td>
					<td>${p.tipoAnimal}</td>
					<td>${p.acompanhanteHumano}</td>
					<td>${p.aguardarConsulta}</td>
					<td><a href="/pet/${p.codigo}/excluir">Excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>