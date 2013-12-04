package mainTest;

import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {
		List<Lutador> listaLutadores = new ArrayList<Lutador>();
		List<Lutador> listaLutadoresFaixaPreta = new ArrayList<Lutador>();

		Fachada fachada = Fachada.getInstanceFachada();
		
		Lutador lutador = new Lutador();
		Lutador lutador1 = new Lutador();
		Lutador lutador2= new Lutador();
		Lutador lutador3 = new Lutador();
		Lutador lutador4 = new Lutador();
		Lutador lutador5 = new Lutador();
		
		lutador.setFaixa("preta");
		lutador1.setFaixa("roxa");
		lutador2.setFaixa("branca");
		lutador3.setFaixa("Preta");
		lutador4.setFaixa("Marrom");
		lutador5.setFaixa("Preta");
		
		listaLutadores.add(lutador);
		listaLutadores.add(lutador1);
		listaLutadores.add(lutador2);
		listaLutadores.add(lutador3);
		listaLutadores.add(lutador4);
		listaLutadores.add(lutador5);
		

		listaLutadoresFaixaPreta = fachada.controler.setChavePreta(listaLutadores);
		
		for (Lutador lutador6 : listaLutadoresFaixaPreta) {
			System.out.println(lutador6.getId());
			System.out.println(lutador6.getFaixa());
		}
		
		

		// lutador.setNome("julia");
		// lutador.setFaixa("amarela");
		// lutador.setSexo("feminino");
		// lutador.setcpf("088999999");

		// fachada.controler.editarLutador(lutador2);

		// Controler controler = new Controler();
		// controler.cadastrarLutador(lutador);
		// Fachada fachada = Fachada.getInstanceFachada();
		// fachada.controler.cadastrarLutador(lutador);

	}
}
