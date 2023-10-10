<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<nav class="navbar navbar-expand-sm bg-success navbar-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="/sobre">AppAgendaTransporte</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
				<c:if test="${not empty usuariodisplay}">
				<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usuario</a></li>
					<li class="nav-item"><a class="nav-link" href="/motorista/lista">Motorista</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Corrida</a></li>
					<li class="nav-item"><a class="nav-link" href="/delivery/lista">Delivery</a></li>
					<li class="nav-item"><a class="nav-link" href="/pet/lista">Pet</a></li>
					<li class="nav-item"><a class="nav-link" href="/viagem/lista">Viagem</a></li>
					<li class="nav-item"><a class="nav-link" href="/agendamentocorrida/lista">AgendamentoCorrida</a></li>
				</c:if>
			</ul>


			<ul class="navbar-nav ms-auto">
				
				<c:if test="${empty usuariodisplay}">
					<li class="nav-item"><a class="nav-link" href="/usuario/cadastro"> 
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-fill" viewBox="0 0 16 16">
  							<path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
						</svg> Sign Up</a></li>
				
					<li class="nav-item"><a class="nav-link" href="/login"> 
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
  							<path fill-rule="evenodd" d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0v-2z"/>
  							<path fill-rule="evenodd" d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z"/>
						</svg> Login</a></li>
					</c:if>
				
				
				<c:if test="${not empty usuariodisplay}">
					<li class="nav-item"><a class="nav-link" href="/logout"> 
						<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-in-left" viewBox="0 0 16 16">
  							<path fill-rule="evenodd" d="M10 3.5a.5.5 0 0 0-.5-.5h-8a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h8a.5.5 0 0 0 .5-.5v-2a.5.5 0 0 1 1 0v2A1.5 1.5 0 0 1 9.5 14h-8A1.5 1.5 0 0 1 0 12.5v-9A1.5 1.5 0 0 1 1.5 2h8A1.5 1.5 0 0 1 11 3.5v2a.5.5 0 0 1-1 0v-2z"/>
  							<path fill-rule="evenodd" d="M4.146 8.354a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H14.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3z"/>
						</svg> Logout ${usuariodisplay.email}</a></li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>

