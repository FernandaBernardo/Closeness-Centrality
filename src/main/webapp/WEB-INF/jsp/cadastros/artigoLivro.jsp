<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroArtigoLivro"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaArtigoLivro" />" method="POST">
		<tags:cadastroPublicacao />
		Livro: <input type="text" name="livro"size="50" required><br>
		Número do Capítulo: <input type="text" name="numeroCapitulo"size="10" required><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />