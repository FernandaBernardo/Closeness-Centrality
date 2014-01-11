<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="cadastroLivro"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="<c:url value="/cadastros/adicionaLivro" />" method="POST" >
	 	<tags:cadastroPublicacao />
		Autores: <input type="text" name="autores"size="50"><br>
		Título Original: <input type="text" name="tituloOriginal"size="50"><br>
		Número da Edição: <input type="text" name="numeroEdicao"size="50"><br>
		Editora: <input type="text" name="editora"size="50"><br>
		Número de Páginas: <input type="text" name="numeroPaginas"size="50"><br><br>
		
		<input type="submit" value="Salvar"size="50">
	 </form> 
  </nav>
<tags:footer />