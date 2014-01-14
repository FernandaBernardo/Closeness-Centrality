<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao=""/>
<tags:menuEmprestimos />

<form class="corpo" action='<c:url value="/emprestimo/adiciona"/>'>
	Título: <input type="text" name="titulo" value="${publicacao.titulo}"><br>
	Usuário: <input type="text" name="usi" ><br>
	Data Retirada: <input type="text" name="data">
	<input type="hidden" name="id" value="${publicacao.id}">
</form>

<tags:footer />