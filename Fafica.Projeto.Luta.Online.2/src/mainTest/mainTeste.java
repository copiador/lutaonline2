package mainTest;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;

public class mainTeste {

	public static void main(String[] args) {

		Fachada fachada = Fachada.getInstanceFachada();

		Evento evento = new Evento();
		evento.setId(6);

		Lutador lutadorAux = fachada.controler.pegarUltimoLutadorCadastrado();
		lutadorAux.setEvento(evento);
		fachada.controler.cadastrarEventoLutador(lutadorAux);

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
