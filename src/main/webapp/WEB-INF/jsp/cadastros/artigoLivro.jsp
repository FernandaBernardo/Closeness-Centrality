<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoLivro"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="adicionaArtigoLivro" method="POST">
		<tags:cadastroPublicacao />
		Autores: <input type="text" name="autores"size="50"><br>
		Editora: <input type="text" name="editora"size="50"><br>
		Página Inicial: <input type="text" name="paginaInicial"size="10"><br>
		Página Final: <input type="text" name="paginaFinal"size="10"><br><br>
			 
		<input type="hidden" name="cadastroArtigoLivroLogic">
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />