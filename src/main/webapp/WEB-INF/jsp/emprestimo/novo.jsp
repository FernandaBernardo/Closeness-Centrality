<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao=""/>
<tags:menuEmprestimos />

<form class="corpo novo" action='<c:url value="/emprestimo/adiciona"/>'>
	<h3>Título:</h3> ${publicacao.titulo}
	<input type="hidden" name="titulo" value="${publicacao.titulo}"><br>
	<h3>Usuário:</h3> <input type="text" name="usuario" placeholder="Digite seu nome"><br>
	<h3>Data Retirada:</h3> ${dataRetirada}
	<input type="hidden" name="dataRetirada" value="${dataRetirada}"><br>
	<h3>Data Devolução:</h3> ${dataDevolucao}
	<input type="hidden" name="dataDevolucao" value="${dataDevolucao}">
	<input type="hidden" name="id" value="${publicacao.id}">
	<input class="novo-emprestimo" type="submit" value="Salvar">
</form>

<tags:footer />