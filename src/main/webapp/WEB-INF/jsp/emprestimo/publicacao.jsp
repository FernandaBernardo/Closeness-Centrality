<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao=""/>
<tags:menuEmprestimos />
<div class="corpo informacao">
	<h3>Título:</h3> ${publicacao.titulo} <br>
	<h3>Local:</h3> ${publicacao.local} <br>
	<h3>Biblioteca:</h3> ${publicacao.biblioteca.nome} <br>
	<h3>Seção:</h3> ${publicacao.secao.nome} <br>
	
	<a class="novo-emprestimo" href="<c:url value="/emprestimo/novo"/>?publicacao.id=${publicacao.id}" >Novo empréstimo</a>
</div>
<tags:footer />