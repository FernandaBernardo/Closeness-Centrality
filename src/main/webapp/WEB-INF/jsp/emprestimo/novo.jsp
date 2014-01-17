<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao=""/>
<tags:menuEmprestimos />

<form class="corpo novo" action='<c:url value="/emprestimo/adiciona"/>'>
	T�tulo: ${publicacao.titulo}
	<input type="hidden" name="titulo" value="${publicacao.titulo}"><br>
	Usu�rio: <input type="text" name="usuario" placeholder="Digite seu nome"><br>
	Data Retirada: ${dataRetirada}
	<input type="hidden" name="dataRetirada" value="${dataRetirada}"><br>
	Data Devolu��o: ${dataDevolucao}
	<input type="hidden" name="dataDevolucao" value="${dataDevolucao}">
	<input type="hidden" name="id" value="${publicacao.id}">
	<input class="novo-emprestimo" type="submit" value="Salvar">
</form>

<tags:footer />