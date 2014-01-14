<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@attribute name="publicacoes" type="java.util.List" required="true"%>

<div class="corpo">
	<c:forEach items="${publicacoes}" var="publicacao">
		<a href="<c:url value='/emprestimo/publicacao/${publicacao.id}' />">${publicacao.titulo}</a><br>
	</c:forEach>
</div>
