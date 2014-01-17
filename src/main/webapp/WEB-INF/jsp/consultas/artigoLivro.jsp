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
			<c:forEach items="${artigoLivro}" var="artigoLivro">
				<tr>
					<td width="600" height="30" align="center">${artigoLivro.titulo}</td>
					<td width="600" height="30" align="center">${artigoLivro.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${artigoLivro.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${artigoLivro.local}</td>
					<td width="600" height="30"align="center">${artigoLivro.biblioteca.nome}</td>	
				</tr>
			</c:forEach>
	</table>
</nav>
<tags:footer />