<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultasArtigo/>
<nav class="corpo">
	<table  >
		<tr>
		<th>Titulo</th>
		<th>Edição</th>
		<th>Data</th>
		<th>Local</th>
		<th>Biblioteca</th>
	</tr>
			<c:forEach items="${artigosAnal}" var="artigosAnal">
				<tr>
					<td width="600" height="30" align="center">${artigosAnal.titulo}</td>
					<td width="600" height="30" align="center">${artigosAnal.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${artigosAnal.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${artigosAnal.local}</td>
					<td width="600" height="30"align="center">${artigosAnal.biblioteca.nome}</td>
					
					
					
				</tr>
			</c:forEach>
	</table>
</nav>
<tags:footer />