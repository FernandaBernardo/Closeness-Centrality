<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<nav class="corpo">
	<form action="<c:url value="/usuario/adiciona" />" method="POST">
		Nome: <input type="text" name="usuario.nome" required autofocus/><br> 
		CPF: <input type="text"	name="usuario.cpf" required pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" placeholder="888.8898.888-88"/><br>
		Telefone: <input type="text" name="usuario.telefone" required pattern="\([0-9]{2}\)[\s][0-9]{5}-[0-9]{4}" placeholder="(11) 88888-8888"/><br><br>
		<input type="submit" value="Salvar" />
	</form>
</nav>

<tags:footer />