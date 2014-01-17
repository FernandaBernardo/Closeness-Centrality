<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultasPublicacao />
<nav class="corpo">
	<form action="<c:url value="/consultas/temaAutor" />">
		Tema: <input type="text" name="tema">
		<input type="submit" value="Consultar">
	</form>
</nav>
<tags:footer />