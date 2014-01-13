<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<tags:header secao=""/>
<tags:menuCadastro />
<nav class="corpo">
		<select name="secao" form="form">
			<c:forEach items="${secoes}" var="secao">
				<option value="${secao.nome}">${secao.nome}</option>
			</c:forEach>
		</select>
		<select name="biblioteca" form="form">
			<c:forEach items="${bibliotecas}" var="biblioteca">
				<option value="${biblioteca.nome}">${biblioteca.nome}</option>
			</c:forEach>
		</select>
	<form id="form" action="<c:url value="/biblioteca/adicionaSecao" />">
		<input type="submit" value="Salvar" />
	</form>
</nav>
<tags:footer />
