<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao="consultas"/>
<tags:menuConsultas/>
<nav class="corpo">
	<br/><br/>
	<table>
		<tr>
		<th>Autores Cadastrados</th>
	</tr>
			<c:forEach items="${autor}" var="autor">
				<tr>
					<td width="600" height="30" align="left">${autor.nome}</td>
				</tr>
			</c:forEach>
	</table>

</nav>
<tags:footer />