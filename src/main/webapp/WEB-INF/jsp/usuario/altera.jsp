<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<nav class="corpo">
	<form action="<c:url value="/usuario/atualiza" />" method="POST">
		Nome: <input type="text" name="nome" value="${nome}"><br>
		CPF: <input type="text" name="cpf" value="${cpf}"/><br>
		Telefone: <input type="text" name="telefone" value="${telefone}"/><br>
		<input type="hidden" name="nomeAntigo" value="${nome}">

		<input type="submit" value="Atualizar" />
	</form>
</nav>

<tags:footer />