<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:header secao="consultas"/>
<tags:menuConsultas />
<nav class="corpo">
	<br/><br/>
	<table>
		<tr>
		<th>Periodico</th>
		<th>Data</th>
		<th>Local</th>
		<th>Editora</th>
		<th>Biblioteca</th>
		<th>Tema</th>
	</tr>
			<c:forEach items="${periodico}" var="periodico">
				<tr>
					<td width="600" height="30" align="center">${periodico.titulo}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${periodico.data.time}" pattern="dd/MM/yyyy"/>
						</td>
				
					<td width="600" height="30" align="center">${periodico.local}</td>
					<td width="600" height="30" align="center">${periodico.editora}</td>
					<td width="600" height="30" align="center">${periodico.biblioteca.nome}</td>
					<td width="600" height="30" align="center">${periodico.secao.nome}</td>
					
				</tr>
			</c:forEach>
	</table>

</nav>

<tags:footer />