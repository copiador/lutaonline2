<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page  import="java.util.List" %>
<%@ page  import="br.fafica.Luta.Online.Model.Lutador" %> 
<%@ page  import="br.fafica.Luta.Online.Model.Usuario" %> 
<%Usuario usuario = (Usuario) session.getAttribute("usuarioLogado");%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LUTA ONLINE</title>


<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap/css/bootstrap.css">
<script src="css/bootstrap/js/bootstrap.js" type="text/javascript"></script>

</head>
<body>

	
	<div id="site">
		
		<div id="header">
			<header>
				<div id="marcaHeader">
					
				</div>
				<div id="slideHeader">
					<img src="css/imagens/slideheader_luta_online.png">
				</div>
			</header>
		</div>

		<div id="navPrincipal">
			<nav>
				<ul class="nav nav-pills">
					<li><a href="index.jsp">Inicio</a></li>
					<li><a href="#">Campeonato</a></li>
					<li><a href="#">Fotos</a></li>
					<li><a href="#">Regras do Jiu-Jitsu</a></li>
					<li><a href="TelaLogar.jsp">Logar</a></li>
				</ul>

			</nav>

		</div>