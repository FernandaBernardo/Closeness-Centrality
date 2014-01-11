<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<nav class="corpo">
	<form action="<c:url value="/usuario/adiciona" />" method="POST">
		Nome: <input type="text" name="usuario.nome" /><br> 
		CPF: <input type="text"	name="usuario.cpf" /><br>
		Telefone: <input type="text" name="usuario.telefone" /><br><br>
		<input type="submit" value="Salvar" />
	</form>
</nav>

<tags:footer />