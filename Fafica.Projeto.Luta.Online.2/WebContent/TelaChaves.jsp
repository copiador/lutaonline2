<%@include file="topAdm.jsp"%>
<div id="main">
	<h5>TELA CHAVES:</h5>
	<h2>${evento.nome}</h2>
	<fieldset class="thumbnail inner-border">
		<c:forEach items="${listaLutador}" var="lutador">

			<div class="chaves">${lutador.id}${lutador.nome}${lutador.cpf}</div>


		</c:forEach>




	</fieldset>


	<div id="listaLutadoresEvento">





		<fieldset class="thumbnail inner-border">


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
							<p>Não consta nenhum lutador faixa preta</p>
						</td>
					</tr>
				</c:if>



				<c:forEach items="${listaLutador}" var="lutador">


					<tr class="error">

						<td>${lutador.id}</td>
						<td>${lutador.nome}</td>
						<td>${lutador.cpf}</td>
						<td>OK</td>

					</tr>

				</c:forEach>


			</table>

		</fieldset>
	</div>
</div>
<%@include file="bot.jsp"%>