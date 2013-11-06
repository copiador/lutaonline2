<%@include file="topAdm.jsp"%>

<div id="main">

	<form action="Controladora2" method="get">
		<input type="hidden" name="acao" value="editarLutador">
		<fieldset class="thumbnail inner-border">
		
		
			<label>Nome</label> <input type="text" class="span5"
				value="${lutador.nome}" name="nome"> <label>Endereço
			</label> <input type="text" class="span5"> <label>Data
				Nascimento</label> <input type="text"> <label>Estado</label> <input
				type="text"> <label>Cidade</label> <input type="text">
			<label>Endereço</label> <input type="text"> <label>Bairro</label>
			<input type="text">
		</fieldset>

		<fieldset class="thumbnail inner-border">
			<label>Sexo</label> <input type="text" value="${lutador.sexo}"
				name="sexo"> <label>Faixa:</label> <select name="faixa">
				<option value="branca">Branca</option>
				<option value="azul">Azul</option>
				<option value="azul">Roxa</option>
				<option value="marron">Marron</option>
				<option value="preta">Preta</option>
			</select> <label>CPF</label> <input type="text" value="${lutador.cpf}"
				name="cpf"><br> <input type="submit" value="Editar"
				class="btn-large btn btn-danger">

		</fieldset>
	</form>

</div>

<%@include file="bot.jsp"%>
