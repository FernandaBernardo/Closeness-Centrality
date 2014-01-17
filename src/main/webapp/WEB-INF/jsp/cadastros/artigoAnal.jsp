<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroArtigoAnaisConferencia"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form id="form" action="<c:url value="/cadastros/adicionaArtigoAnal" />" method="POST">
	 	<tags:cadastroPublicacao />
		Anal de Conferência: <input type="text" name="anal"size="50" required><br>
		Página Inicial: <input type="text" name="paginaInicial"size="50" required><br>
		Página Final: <input type="text" name="paginaFinal"size="50" required><br>
		Volume: <input type="text" name="volume"size="50" required><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />