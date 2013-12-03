<%@include file="topAdm.jsp"%>

<div id="main">

	<fieldset class="thumbnail inner-border">
	${mensagem}
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOME</th>
					<th>DATA</th>
				</tr>
			</thead>

			<c:if test="${empty eventos}">
				<tr>
					<td align="center">
						<p>Nenhum Evento Cadastrado</p>
					</td>
				</tr>
			</c:if>

			<c:forEach items="${eventos}" var="evento">

				<tr class="error">

					<td>${evento.id}</td>
					<td>${evento.nome}</td>
					<td>${evento.data}</td>
					<td><a href="Controladora2?acao=excluirEvento&id=${evento.id}">Excluir</a></td>
					<td><a href="Controladora2?acao=listarLutadorEventoNaoPagaram&id=${evento.id}">Gerenciar-Nao-Pagaram</a></td>
					<td><a href="Controladora2?acao=excluirEvento&id=${evento.id}">Gerenciar-Pagaram</a></td>
					<td><a href="Controladora2?acao=excluirEvento&id=${evento.id}">Gerar Chaves</a></td>
				</tr>

			</c:forEach>


		</table>

	</fieldset>


</div>

<%@include file="bot.jsp"%>
