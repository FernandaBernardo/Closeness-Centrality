<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="cadastroArtigoAnaisConferencia"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="<c:url value="/cadastros/adicionaArtigoAnal" />" method="POST">
	 	<tags:cadastroPublicacao />
		Anal de Confer�ncia: <input type="text" name="anal"size="50"><br>
		P�gina Inicial: <input type="text" name="paginaInicial"size="50"><br>
		P�gina Final: <input type="text" name="paginaFinal"size="50"><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />