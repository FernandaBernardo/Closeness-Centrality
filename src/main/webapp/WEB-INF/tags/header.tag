<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@attribute name="secao" type="java.lang.String" required="true"%>

<head>
	<meta charset="UTF-8">
	<title>Biblioteca</title>
	<link rel="stylesheet" href="<c:url value="/css/biblioteca.css" />">
</head>

<header class="${secao}"></header>
	
<body>
	<nav class="menu">
		<a href="/biblioteca/home">Início</a> 
		<a href="/biblioteca/usuarios">Usuários</a>
		<a href="/biblioteca/cadastros">Cadastros</a>
		<a href="/biblioteca/emprestimos">Empréstimos</a>
		<a href="/biblioteca/consultas">Consultas</a>
	</nav>