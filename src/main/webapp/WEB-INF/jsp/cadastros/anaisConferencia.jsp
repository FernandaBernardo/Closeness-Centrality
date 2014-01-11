<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<tags:header secao="cadastroAnaisConferencia" />
<tags:menuCadastro />

<nav class="corpo">
	<form action="<c:url value="/cadastros/adicionaAnaisConferencia" />" method="POST">
		<tags:cadastroPublicacao tipo="anaisConferencia"/>
		
		Artigos: <input type="text" name="anaisConferencia.artigos" size="50"><br>
		Editora: <input type="text" name="anaisConferencia.editora" size="50"><br>
		Número do Volume: <input type="text" name="anaisConferencia.numeroVolume" size="50"><br><br> 
		
		<input type="submit" value="Salvar" size="50">
	</form>
</nav>

<tags:footer />
