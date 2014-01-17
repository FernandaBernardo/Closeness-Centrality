<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@attribute name="publicacoes" type="java.util.List" required="true"%>

<div class="corpo lista">
	<table>
		<tr>
		<th>Titulo</th>
		<th>Tema</th>
		<th>Data</th>
		<th>Local</th>
		<th>Edicao</th>
	</tr>
			<c:forEach items="${publicacoes}" var="publicacao">
				<tr>
					<td width="600" height="30" align="center">${publicacao.titulo}</td>
					<td width="600" height="30" align="center">${publicacao.secao.nome}</td>
					<td width="600" height="30" align="center">
						<fmt:formatDate value="${publicacao.data.time}" pattern="dd/MM/yyyy"/>
						</td>
					<td width="600" height="30" align="center">${publicacao.local}</td>
					<td width="600" height="30" align="center">${publicacao.edicao}</td>
				 
				</tr>
			</c:forEach>
	</table>
</div>
