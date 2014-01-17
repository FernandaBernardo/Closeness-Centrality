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
			<c:forEach items="${artigosPeriodico}" var="artigo">
				<tr>
					<td width="600" height="30" align="center">${artigo.titulo}</td>
					<td width="600" height="30" align="center">${artigo.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${artigo.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${artigo.local}</td>
					<td width="600" height="30"align="center">${artigo.biblioteca.nome}</td>				
				</tr>
			</c:forEach>
	</table>
</nav>
<tags:footer />