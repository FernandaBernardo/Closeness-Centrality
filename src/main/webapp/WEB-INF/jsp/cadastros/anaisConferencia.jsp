<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroAnaisConferencia" />
<tags:menuCadastro />

<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaAnaisConferencia" />" method="POST">
		<tags:cadastroPublicacao />
		
		Artigos: <input type="text" name="artigos" size="50" required><br>
		Editora: <input type="text" name="editora" size="50" required><br>
		Número do Volume: <input type="text" name="numeroVolume" size="50" required><br><br> 
		
		<input type="submit" value="Salvar" size="50">
	</form>
</nav>

<tags:footer />
