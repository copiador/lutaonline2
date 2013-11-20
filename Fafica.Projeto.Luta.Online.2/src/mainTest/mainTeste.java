package mainTest;




import br.fafica.Luta.Online.Model.AcaoLogar;

import br.fafica.Luta.Online.Model.Usuario;


public class mainTeste {
  
	public static void main(String[] args) {

		AcaoLogar acaoLogar = new AcaoLogar();
		
		Usuario usuario = new Usuario();
		Usuario logado = new Usuario();
		
		usuario.setLogin("jose");
		usuario.setSenha("favoritos");
		
		logado = acaoLogar.usuarioExisteNoBanco(usuario);
		
		System.out.println(logado.getEmail());
		
		//lutador.setNome("julia");
		//lutador.setFaixa("amarela");
		//lutador.setSexo("feminino");
		//lutador.setcpf("088999999");
		
		//fachada.controler.editarLutador(lutador2);

		
		//Controler controler = new Controler();
		//controler.cadastrarLutador(lutador);
		//Fachada fachada = Fachada.getInstanceFachada();
		//fachada.controler.cadastrarLutador(lutador);
		
	}
}
