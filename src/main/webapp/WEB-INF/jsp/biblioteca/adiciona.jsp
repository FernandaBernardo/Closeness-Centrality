<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="cadastroArtigoPeriodico"/>
<tags:menuCadastro />
<nav class="corpo">
	 <form action="<c:url value="/biblioteca/adicionaBiblioteca" />" method="POST" >
		Nome: <input type="text" name="nome"size="50" required><br>
		Endereço: <input type="text" name="endereco"size="50" required><br>
		
		<input type="submit" value="Salvar"size="50">
	 </form> 
  </nav>
<tags:footer />
