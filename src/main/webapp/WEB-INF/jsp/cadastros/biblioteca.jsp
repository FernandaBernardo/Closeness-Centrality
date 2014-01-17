<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroBiblioteca"/>
<tags:menuCadastro />
<div class="corpo">
	<a class="novo-emprestimo" href='<c:url value="/biblioteca/adiciona"></c:url>'>Adiciona Biblioteca</a>
	<a class="novo-emprestimo" href='<c:url value="/biblioteca/secaoBiblioteca"></c:url>'>Adiciona Seção na Biblioteca</a>
</div>
<tags:footer />