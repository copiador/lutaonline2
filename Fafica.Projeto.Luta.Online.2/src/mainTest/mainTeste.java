package mainTest;



import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;


public class mainTeste {
  
	public static void main(String[] args) {

		Fachada fachada = Fachada.getInstanceFachada(); 
		List<Evento> eventos = new ArrayList<Evento>();
		
		Evento evento = new Evento();
		Evento evento2 = new Evento();
		
		evento.setId(4);
		
		evento2 =  fachada.controler.buscarEventoID(evento);
		
		System.out.println(evento2.getId());
		
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
