<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroMonografia"/>
<tags:menuCadastro />
<nav class="corpo">
	
	<form action="adicionaMonografia" method="POST">
	<tags:cadastroPublicacao />
		Autores: <input type="text" name="autores"size="50"><br>
		Nome da Instituição: <input type="text" name="nomeInstituicao"size="50"><br>
		Número da Monografia: <input type="text" name="numeroMonografia"size="50"><br><br>
		
		<input type="hidden" name="cadastroMonografiaLogic">
		
		<input type="submit" value="Salvar"size="50">
	</form>
  </nav>

<tags:footer />