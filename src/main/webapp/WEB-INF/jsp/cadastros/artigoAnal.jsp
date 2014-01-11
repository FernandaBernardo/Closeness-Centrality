<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoAnaisConferencia"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="<c:url value="/cadastros/adicionaArtigoAnal" />" method="POST">
	 	<tags:cadastroPublicacao tipo="artigoAnal"/>
		Artigos: <input type="text" name="artigoAnal.artigos"size="50"><br>
		Editora: <input type="text" name="artigoAnal.editora"size="50"><br>
		Número do Volume: <input type="text" name="artigoAnal.numeroVolume"size="50"><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />