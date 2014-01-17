<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@attribute name="publicacoes" type="java.util.List" required="true"%>

<div class="corpo lista">
        <ul>
                <c:forEach items="${publicacoes}" var="publicacao">
                        <li><a href="<c:url value='/emprestimo/publicacao/${publicacao.id}' />">${publicacao.titulo}</a></li>
                </c:forEach>
        </ul>
</div>