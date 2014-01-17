<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<nav class="corpo">
	<form action="<c:url value="/usuario/listaUsuariosEmprestimo" />" method="POST">
		Título: <input type="text" name="titulo" required autofocus/><br> 
		<input type="submit" value="Salvar" />
	</form>
</nav>

<tags:footer />