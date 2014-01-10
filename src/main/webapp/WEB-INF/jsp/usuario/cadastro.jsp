<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<form action="<c:url value="/usuario/adiciona" />" method="POST">
	Nome: <input type="text" name="usuario.nome" /><br> 
	CPF: <input type="text"	name="usuario.cpf" /><br> 
	<input type="submit" value="Gravar" />
</form>

<tags:footer />