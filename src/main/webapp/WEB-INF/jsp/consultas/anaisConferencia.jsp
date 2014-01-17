<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultas />
<nav class="corpo">
	<table  >
		<tr>
		<th>Título</th>
		<th>Edição</th>
		<th>Data</th>
		<th>Local</th>
		<th>Biblioteca</th>
		<th>Secao</th>
		<th>Editora</th>
	</tr>
			<c:forEach items="${anaisconferencia}" var="anaisconferencia">
				<tr>
					<td width="600" height="30" align="center">${anaisconferencia.titulo}</td>
					<td width="600" height="30" align="center">${anaisconferencia.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${anaisconferencia.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${anaisconferencia.local}</td>	
					<td width="600" height="30"align="center">${anaisconferencia.biblioteca.nome}</td>	
					<td width="600" height="30"align="center">${anaisconferencia.secao.nome}</td>	
					<td width="600" height="30"align="center">${anaisconferencia.editora}</td>							
				</tr>
			</c:forEach>
	</table>
</nav>
<tags:footer />