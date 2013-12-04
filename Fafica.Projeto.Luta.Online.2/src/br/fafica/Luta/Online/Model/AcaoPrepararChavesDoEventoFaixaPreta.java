package br.fafica.Luta.Online.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoPrepararChavesDoEventoFaixaPreta implements InterfaceAcao {

	private Fachada fachada;
	private List<Lutador> listaLutadorPagaram;
	private List<Lutador> listaLutadorPagaramAtributosCompletos;
	private List<Lutador> listaLutadorPagaramFaixaPreta;

	public AcaoPrepararChavesDoEventoFaixaPreta() {
		fachada = Fachada.getInstanceFachada();
		listaLutadorPagaram = new ArrayList<Lutador>();
		listaLutadorPagaramAtributosCompletos = new ArrayList<Lutador>();
		listaLutadorPagaramFaixaPreta = new ArrayList<Lutador>();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Evento evento = new Evento();
		Evento eventoCompleto = new Evento();
		// recupera o id do evento dos lutadores que pagaram
		int idEvento = Integer.parseInt(request.getParameter("id"));
		evento.setId(idEvento);
		// pega a lista dos lutadores que pagaram do evento X
		listaLutadorPagaram = fachada.controler
				.pegarIdLutadorNomeLutadorCpfEventoPagaram(evento);
		// pegar todos os lutadores com os atributos completos
		listaLutadorPagaramAtributosCompletos = fachada.controler
				.selecionaTodosOsAtributosDoLutadorPeloID(listaLutadorPagaram);
		for (Lutador lutador : listaLutadorPagaramAtributosCompletos) {
			System.out.println(lutador.getFaixa());
		}

		// pega a lista e seleciona apenas os faixa preta
		listaLutadorPagaramFaixaPreta = fachada.controler
				.setChavePreta(listaLutadorPagaramAtributosCompletos);
		// pega o evento completo possue o evento com todos os atributos
		eventoCompleto = fachada.controler.buscarEventoID(evento);
		// seta a lista de lutadores que já pagaram FAIXA PRETA
		request.setAttribute("listaLutador", listaLutadorPagaramFaixaPreta);
		// seta o evento completo para pagina, para que se possa dar melhor
		// visão ao usuario do que está se trabalhando
		request.setAttribute("evento", eventoCompleto);

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("TelaGerarChaves.jsp");
		dispatcher.forward(request, response);

	}

}
