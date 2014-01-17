<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<tags:header secao="consultas"/>
<tags:menuConsultasArtigo/>
	<br/><br/>
	<table  border="1">
		<tr>
		<th>Nome</th>
		<th>Endereço</th>
	</tr>
			<c:forEach items="${artigo}" var="artigo">
				<tr>
					<td width="600" height="30">${artigo}</td>
					<td width="600" height="30">${artigo}</td>
				</tr>
			</c:forEach>
	</table>

<tags:footer />