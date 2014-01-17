<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroMonografia"/>
<tags:menuCadastro />
<nav class="corpo">
	<form id="form" action="<c:url value="/cadastros/adicionaMonografia" />" method="POST">
		<tags:cadastroPublicacao />
		Autores: <input type="text" name="autores" size="50" required><br>
		Nome da Instituição: <input type="text" name="nomeInstituicao" size="50" required><br>
		Número da Monografia: <input type="text" name="numeroMonografia" size="50" required><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>
<tags:footer />