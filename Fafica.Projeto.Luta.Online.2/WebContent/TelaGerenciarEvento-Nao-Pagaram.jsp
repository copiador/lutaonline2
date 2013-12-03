<%@include file="topAdm.jsp"%>

<div id="main">

	<fieldset class="thumbnail inner-border">
	${mensagem}
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOME</th>
					<th>CPF</th>
					<th>PAGAMENTO</th>
				</tr>
			</thead>

			<c:if test="${empty listaLutador}">
				<tr>
					<td align="center">
						<p>Nenhum Evento Cadastrado</p>
					</td>
				</tr>
			</c:if>

			<c:forEach items="${listaLutador}" var="lutador">

				<tr class="error">

					<td>${lutador.id}</td>
					<td>${lutador.nome}</td>
					<td>${lutador.cpf}</td>
					<td><a href="Controladora2?acao=validarPagamentoLutador&id=${lutador.id}">Validar Pagamento</a></td>
				</tr>

			</c:forEach>


		</table>

	</fieldset>


</div>

<%@include file="bot.jsp"%>
