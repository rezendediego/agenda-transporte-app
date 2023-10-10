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
	<div class="container mt-3">
		<h2>Cadastramento de Motorista</h2>
		<form action="/motorista/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="qualificacaoMotorista">Qualificacao Motorista:</label> <input type="text"
					class="form-control" id="qualificacaoMotorista" placeholder="Entre com qualificacao Motorista entre 0.0 e 5.0"
					name="qualificacaoMotorista">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="cpf">Cpf:</label> <input type="text"
					class="form-control" id="cpf" placeholder="Entre com seu cpf"
					name="cpf">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="nomeMotorista">Nome:</label> <input type="text"
					class="form-control" id="nomeMotorista" placeholder="Entre com seu nome"
					name="nomeMotorista">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="celularMotorista">Celular Motorista:</label> <input type="text"
					class="form-control" id="celularMotorista" placeholder="Entre com numero celular Motorista"
					name="celularMotorista">
			</div>
			
			<div class="mb-3 mt-3">
				<label for="tipoCarro">Tipo Carro:</label> <input type="text"
					class="form-control" id="tipoCarro" placeholder="Entre com seu nome"
					name="tipoCarro">
			</div>
			

			
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
</body>
</html>