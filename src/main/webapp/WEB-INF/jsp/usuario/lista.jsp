<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="usuarios" />

<tags:menuUsuarios />

<div class="corpo">
	<ul>
		<c:forEach items="${emprestimos}" var="emprestimo">
			<li>${emprestimo.publicacao.titulo} - ${emprestimo.dataRetirada} - ${emprestimo.dataDevolucao}</li>	
		</c:forEach>
	</ul>
</div>

<tags:footer />