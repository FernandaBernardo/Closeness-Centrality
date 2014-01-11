<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroArtigoPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="<c:url value="/cadastros/adicionaArtigoPeriodico" />" method="POST">
	 	<tags:cadastroPublicacao tipo="artigoPeriodico"/>
		Periodico: <input type="text" name="artigoPeriodico.periodico"size="50"><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />