<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="cadastroPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaPeriodico" />" method="POST">
		<tags:cadastroPublicacao />
		Editora:<input type="text" name="editora"size="50"><br><br>
		
	    <input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />