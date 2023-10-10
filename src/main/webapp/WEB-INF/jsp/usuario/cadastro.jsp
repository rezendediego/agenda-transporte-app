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
		<h2>Cadastramento de Usuario</h2>
		<form action="/usuario/incluir" method="post">
			<div class="mb-3 mt-3">
				<label for="nomeUsuario">Nome:</label> <input type="text"
					class="form-control" id="nomeUsuario" placeholder="Entre com seu nome"
					name="nomeUsuario">
			</div>
			<div class="mb-3 mt-3">
				<label for="email">E-mail:</label> <input type="email"
					class="form-control" id="email" placeholder="Entre com seu e-mail"
					name="email">
			</div>
			<div class="mb-3">
				<label for="senha">Senha:</label> <input type="password"
					class="form-control" id="senha" placeholder="Entre com sua senha"
					name="senha">
			</div>
			<button type="submit" class="btn btn-success">Cadastrar</button>
		</form>
	</div>
</body>
</html>