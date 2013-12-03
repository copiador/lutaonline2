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
						<p>Não consta nenhum lutador que não pagou</p>
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

<%@include file="bot.jsp"%>
