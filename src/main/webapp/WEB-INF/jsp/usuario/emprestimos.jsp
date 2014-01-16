<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<nav class="corpo">
	<form action="<c:url value="/usuario/lista" />" method="POST">
		Nome: <input type="text" name="nome" /><br> 
		<input type="submit" value="Salvar" />
	</form>
</nav>

<tags:footer />