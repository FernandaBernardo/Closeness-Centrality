<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	<form id="form" action="<c:url value="/cadastros/adicionaPeriodico" />" method="POST">
		<tags:cadastroPublicacao />
		Editora:<input type="text" name="editora"size="50" required><br><br>
		
	    <input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />