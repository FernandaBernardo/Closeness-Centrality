<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoLivro"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaArtigoLivro" />" method="POST">
		<tags:cadastroPublicacao tipo="artigoLivro"/>
		Autores: <input type="text" name="artigoLivro.autores"size="50"><br>
		Editora: <input type="text" name="artigoLivro.editora"size="50"><br>
		P�gina Inicial: <input type="text" name="artigoLivro.paginaInicial"size="10"><br>
		P�gina Final: <input type="text" name="artigoLivro.paginaFinal"size="10"><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />