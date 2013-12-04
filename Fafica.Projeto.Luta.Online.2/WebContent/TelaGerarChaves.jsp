<%@include file="topAdm.jsp"%>
<div id="main">
	<h5>TELA GERAR CHAVES DO EVENTO:</h5><h2>${evento.nome} </h2> 
	<fieldset class="thumbnail inner-border">
	
	<div id="form">
	
	<form action="Controladora2" method="get">
		CHAVE FAIXA: <input type="button" value="BRANCA"><br>
		CHAVE FAIXA: <input type="button" value="AZUL"><br> 
		CHAVE FAIXA: <input type="button" value="ROXA"><br> 
		CHAVE FAIXA: <input type="button" value="MAROM"><br> 
		CHAVE FAIXA: <input type="button" value="PRETA"><br>
	</form>
	
	</div>
	</fieldset>
	<div id="listaLutadoresEvento">
	
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
</div>
<%@include file="bot.jsp"%>