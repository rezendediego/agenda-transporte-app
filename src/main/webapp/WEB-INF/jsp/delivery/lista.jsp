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
		<h3>Listagem de Corridas Delivery.</h3>
		
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
					<th>Tipo Produto</th>
					<th>Seguro Produto</th>
					<th>Responsavel Recebimento</th>
					<th>Usuario</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="d" items="${listaDelivery}">
				<tr>
					<td>${d.id}</td>
					<td>${d.codigo}</td>
					<td>${d.dataAgendada}</td>
					<td>${d.tipoCorrida}</td>
					<td>${d.enderecoOrigem}</td>
					<td>${d.enderecoDestino}</td>
					<td>${d.quantidadePassageiros}</td>
					<td>${d.precoMinimo}</td>
					<td>${d.tipoProduto}</td>
					<td>${d.seguroProduto}</td>
					<td>${d.responsavelRecebimento}</td>
					<td>${d.usuario.nomeUsuario}</td>
					<td><a href="/delivery/${d.id}/excluir">Excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
	</div>

</body>
</html>