<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoAnaisConferencia"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="adicionaArtigoAnaisConferencia" method="POST">
	 	<tags:cadastroPublicacao />
		Artigos: <input type="text" name="artigos"size="50"><br>
		Editora: <input type="text" name="editora"size="50"><br>
		Número do Volume: <input type="text" name="numeroVolume"size="50"><br><br>
		
		<input type="hidden" name="cadastroArtigoAnaisConferenciaLogic">
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />