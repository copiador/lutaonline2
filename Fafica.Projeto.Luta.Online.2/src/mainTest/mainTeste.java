package mainTest;



import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;
import br.fafica.Luta.Online.Model.Usuario;


public class mainTeste {
  
	public static void main(String[] args) {

		Fachada fachada = Fachada.getInstanceFachada(); 
		List<Evento> eventos = new ArrayList<Evento>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		usuario.setLogin("joao");
		usuario.setEmail("jessemarquesads@gmail.com");
		usuario.setSenha("favoritos");
		
		fachada.controler.cadastrarUsuario(usuario);
		
		//usuarios = fachada.controler.ListarUsuario();
	
	
		
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
