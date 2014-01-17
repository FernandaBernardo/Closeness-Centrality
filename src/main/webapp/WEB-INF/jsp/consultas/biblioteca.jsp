<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="consultas"/>
<tags:menuConsultas/>
<nav class="corpo">
	<br/><br/>
	<table>
		<tr>
		<th>Nome</th>
		<th>Endereco</th>
	</tr>
			<c:forEach items="${biblioteca}" var="biblioteca">
				<tr>
					<td width="600" height="30" align="center">${biblioteca.nome}</td>
					<td width="600" height="30" align="center">${biblioteca.endereco}</td>
				</tr>
			</c:forEach>
	</table>

</nav>
<tags:footer />