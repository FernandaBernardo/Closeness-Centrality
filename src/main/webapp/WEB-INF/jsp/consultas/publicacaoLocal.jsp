<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultasArtigo/>
<div class="corpo">
	<h1>${publicacao.titulo}</h1>
	<h3>Local: ${publicacao.local}</h3>
</div>
<tags:footer />