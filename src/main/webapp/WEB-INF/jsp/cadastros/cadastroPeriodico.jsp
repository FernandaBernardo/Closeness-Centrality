<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="adicionaPeriodico" method="POST">
		<tags:cadastroPublicacao />
		Editora:<input type="text" name="editora"size="50"><br><br>
		
		<input type="hidden" name="cadastroArtigoPeriodicoLogic">
		
	    <input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />