<%@include file="topAdm.jsp"%>

<div id="main">
	<form action="Controladora2" method="get">
	<input type="hidden" name="acao" value="cadastrarEvento">
		<fieldset class="thumbnail inner-border">
		${mensagem}
			<label>Nome do Evento</label> 
			<input type="text" placeholder="Digite o nome do evento" class="span5" name="nome">
			<label>Data do Evento</label> 
			<input type="text" placeholder="Data do evento" class="span2" name="data"> 
			  
			<input type="submit" value="Criar" class="btn-large btn btn-danger">
		</fieldset>
	</form>
</div>



<%@include file="bot.jsp"%>