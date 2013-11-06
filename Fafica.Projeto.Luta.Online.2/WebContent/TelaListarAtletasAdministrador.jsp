<%@include file="topAdm.jsp"%>

<div id="main">

	<fieldset class="thumbnail inner-border">
	

		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOME</th>
					<th>CPF</th>
				</tr>
			</thead>
			
			<c:if test="${empty lutadores}">
				<tr>
					<td align="center">
						<p>Nenhum Cliente cadastrado.</p>
					</td>
				</tr>
			</c:if>

			<c:forEach items="${lutadores}" var="lutador">

				<tr class="error">

					<td>${lutador.id}</td>
					<td>${lutador.nome}</td>
					<td>${lutador.cpf}</td>					
					<td><a href="Controladora2?acao=buscarLutador&id=${lutador.id}">Editar</a></td>
					<td>Excluir</td>
				</tr>

			</c:forEach>
			

		</table>

	</fieldset>


</div>

<%@include file="bot.jsp"%>
