package mainTest;

import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {
		List<Lutador> listaLutadoresEvento = new ArrayList<Lutador>();

		Fachada fachada = Fachada.getInstanceFachada();

		Lutador lutador = new Lutador();
		lutador.setId(68);

		fachada.controler.atualizaPagamentoLutador(lutador);
		
		
		

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
