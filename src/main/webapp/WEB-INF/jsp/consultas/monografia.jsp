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
	</tr>
			<c:forEach items="${monografia}" var="monografia">
				<tr>
					<td width="600" height="30" align="center">${monografia.titulo}</td>
					<td width="600" height="30" align="center">${monografia.edicao}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${monografia.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30"align="center">${monografia.local}</td>	
					<td width="600" height="30"align="center">${monografia.biblioteca.nome}</td>	
					<td width="600" height="30"align="center">${monografia.secao.nome}</td>	


									
				</tr>
			</c:forEach>
	</table>
</nav>
<tags:footer />