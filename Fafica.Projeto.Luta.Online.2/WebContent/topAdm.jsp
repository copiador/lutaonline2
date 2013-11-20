<%@include file="top.jsp"%>
		<div id="navAdm">
		BEM VINDO: ${usuario.login}
			<div class="tabbable">
				<nav>
					<ul class="nav nav-tabs">
						<li><a href="TelaNovoEvento.jsp" data-toggle="tab">Novo
								Evento</a></li>
						<li><a href="Controladora2?acao=listarEvento">Listar Evento</a></li>
						<li><a href="#">Consultar Chaves</a></li>
						<li><a href="TelaCadastroDeAtletasAdministrador.jsp">Cadastrar Atleta</a></li>
						<li><a href="Controladora2?acao=listarLutadores">Listar Atletas</a></li>
						<li><a href="Controladora2?acao=logount">Sair</a></li>
					</ul>
				</nav>
				<div class="tab-content">
					<div class="tab-pane active" id="tab1">
						<p>I'm in Section 1.</p>
					</div>
					<div class="tab-pane" id="tab2">
						<p>Howdy, I'm in Section 2.</p>
					</div>
				</div>
			</div>
		</div>
		
		
		