<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroMonografia"/>
<tags:menuCadastro />
<nav class="corpo">
	
	<form action="<c:url value="/cadastros/adicionaMonografia" />" method="POST">
	<tags:cadastroPublicacao tipo="monografia"/>

		Autores: <input type="text" name="monografia.autores"size="50"><br>
		Nome da Instituição: <input type="text" name="monografia.nomeInstituicao"size="50"><br>
		Número da Monografia: <input type="text" name="monografia.numeroMonografia"size="50"><br><br>
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />