<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaPeriodico" />" method="POST">
		<tags:cadastroPublicacao tipo="periodico"/>
		Editora:<input type="text" name="periodico.editora"size="50"><br><br>
		
	    <input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />