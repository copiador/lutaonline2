

<div id="main">


	<form action="ServletLutadorRediret" method="get">
		<input type="hidden" name="acao" value="cadastrar">
		
		<fieldset class="thumbnail inner-border">

			<label>Nome</label> <input type="text"
				placeholder="Digite o nome do atleta" class="span5" name="nome"> <label>Endereço
			</label> <input type="text" class="span5"> <label>Data
				Nascimento</label> <input type="text"> <label>Estado</label> <input
				type="text"> <label>Cidade</label> <input type="text">
			<label>Endereço</label> <input type="text"> <label>Bairro</label>
			<input type="text">
		</fieldset>

		<fieldset class="thumbnail inner-border">
			<label>Sexo</label> <input type="text" name="sexo"> <label>Faixa:</label>
			<select name="faixa">
				<option value="branca">Branca</option>
				<option value="azul">Azul</option>
				<option value="azul">Roxa</option>
				<option value="marron">Marron</option>
				<option value="preta">Preta</option>
			</select> <label>CPF</label> <input type="text" name="cpf"><br> <input
				type="submit" value="Cadastrar" class="btn-large btn btn-danger">
		</fieldset>

	</form>
</div>