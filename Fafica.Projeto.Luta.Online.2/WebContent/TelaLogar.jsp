<%@include file="top.jsp" %>
		
		
		<div id="main">
			<div class="login">
			${logininvalido}
			<h2>DIGITE SEU LOGIN -</h2><br>
			<form action="Controladora2" method="post">
			<input type="hidden" name="acao" value="logar">
			Login:<input type="text" name="login"><br>
			Senha:<input type="text" name="senha"><br>
			
			<input type="submit">
			
			</form>
			</div>
		</div>


<%@include file="bot.jsp" %>	