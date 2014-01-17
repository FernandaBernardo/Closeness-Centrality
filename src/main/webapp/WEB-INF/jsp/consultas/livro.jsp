<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultas />
<nav class="corpo">
	<table  >
		<tr>
		<th>Titulo</th>
		<th>Edição</th>
		<th>Data</th>
		<th>Local</th>
		<th>Biblioteca</th>
		<th>Editora</th>
	</tr>
			<c:forEach items="${livro}" var="livro">
				<tr>
					<td width="600" height="30" align="center">${livro.titulo}</td>
					<td width="600" height="30" align="center">${livro.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${livro.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${livro.local}</td>
					<td width="600" height="30"align="center">${livro.biblioteca.nome}</td>	
					<td width="600" height="30"align="center">${livro.editora}</td>
				</tr>
			</c:forEach>
	</table>
</nav>

<tags:footer />