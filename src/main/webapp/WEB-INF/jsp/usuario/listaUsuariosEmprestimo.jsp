<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<div class="corpo">
	<ul>
		<h2>${titulo}</h2>
		<c:forEach items="${usuarios}" var="usuario">
			<li>${usuario.nome}</li>	
		</c:forEach>
	</ul>
</div>

<tags:footer />