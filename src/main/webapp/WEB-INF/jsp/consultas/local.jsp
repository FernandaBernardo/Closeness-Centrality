<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultasArtigo/>
<nav class="corpo">
	<form action="<c:url value="/consultas/publicacaoLocal" />">
		Título: <input type="text" name="titulo">
		<input type="submit" value="Consultar">
	</form>
</nav>
<tags:footer />