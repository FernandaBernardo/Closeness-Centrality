<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="adicionaArtigoPeriodico" method="POST">
	 	<tags:cadastroPublicacao />
		Periodico: <input type="text" name="periodico"size="50"><br><br>
		
		<input type="hidden" name="cadastroArtigoPeriodicoLogic">
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />