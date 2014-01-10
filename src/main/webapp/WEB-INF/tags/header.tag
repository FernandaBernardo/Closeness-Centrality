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
		<a href="<c:url value="/home/home" />">Início</a> 
		<a href="<c:url value="/home/usuarios" />">Usuários</a>
		<a href="<c:url value="/home/cadastros" />">Cadastros</a>
		<a href="<c:url value="/home/emprestimos" />">Empréstimos</a>
		<a href="<c:url value="/home/consultas" />">Consultas</a>
	</nav>