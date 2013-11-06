<%@include file="topAdm.jsp"%>

<div id="main">

	<fieldset class="thumbnail inner-border">
	

		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>NOME</th>
					<th>DATA</th>
				</tr>
			</thead>
			
			<c:if test="${empty lutadores}">
				<tr>
					<td align="center">
						<p>Nenhum Cliente cadastrado.</p>
					</td>
				</tr>
			</c:if>

			<c:forEach items="${eventos}" var="evento">

				<tr class="error">

					<td>${evento.id}</td>
					<td>${evento.nome}</td>
					<td>${evento.cpf}</td>					
					<td><a href="Controladora2?acao=excluirEvento&id=${evento.id}">Excluir</a></td>
				</tr>

			</c:forEach>
			

		</table>

	</fieldset>


</div>

<%@include file="bot.jsp"%>
