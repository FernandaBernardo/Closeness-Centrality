<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@attribute name="publicacoes" type="java.util.List" required="true"%>

<div class="corpo">
	<c:forEach items="${biblioteca}" var="biblioteca">
		<td>${biblioteca.nome}</td>
		<td>${biblioteca.endereco}</td>
	</c:forEach>
</div>
