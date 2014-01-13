<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroBiblioteca"/>
<tags:menuCadastro />
<div class="corpo">
	<a href='<c:url value="/biblioteca/adiciona"></c:url>'>Adiciona Biblioteca</a>
	<a href='<c:url value="/biblioteca/secaoBiblioteca"></c:url>'>Adiciona Se��o na Biblioteca</a>
</div>
<tags:footer />