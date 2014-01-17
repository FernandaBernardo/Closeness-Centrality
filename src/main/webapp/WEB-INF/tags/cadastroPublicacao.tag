<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

Título: <input type="text" name="titulo" size="70" required><br>
Data: <input type="text" name="data" size="20" required pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}" placeholder="dd/MM/yyyy"><br>
Local de Publicação: <input type="text" name="local" size="50" required><br>
Biblioteca:
<select name="biblioteca" form="form" required>
	<option selected="selected" value="">Selecione uma biblioteca</option>
	<c:forEach items="${bibliotecas}" var="biblioteca">
		<option value="${biblioteca.nome}">${biblioteca.nome}</option>
	</c:forEach>
</select><br>
Secao:
<select name="secao" form="form" required>
	<option selected="selected" value="">Selecione uma seção</option>
	<c:forEach items="${secoes}" var="secao">
		<option value="${secao.nome}">${secao.nome}</option>
	</c:forEach>
</select><br>
Edição: <input type="text" name="edicao" size="50" required><br>
