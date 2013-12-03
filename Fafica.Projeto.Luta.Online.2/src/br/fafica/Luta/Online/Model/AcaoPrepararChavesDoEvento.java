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

public class AcaoPrepararChavesDoEvento implements InterfaceAcao {

	private Fachada fachada;
	private List<Lutador> listaLutadorPagaram;
	
	public AcaoPrepararChavesDoEvento(){
		fachada = Fachada.getInstanceFachada();
		listaLutadorPagaram = new ArrayList<Lutador>();
	}
	
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Evento evento = new Evento();
		Evento eventoCompleto = new Evento();
		//recupera o id do evento dos lutadores que n�o pagaram
		int idEvento = Integer.parseInt(request.getParameter("id"));
		evento.setId(idEvento);
		
		//faz a consulta no banco de dados dos lutares que �ao pagaram
		listaLutadorPagaram = fachada.controler.pegarIdLutadorNomeLutadorCpfEventoPagaram(evento);
		//o evento completo possue o evento com todos os atributos
		eventoCompleto = fachada.controler.buscarEventoID(evento);
		//seta a lista de lutadores que j� pagaram
		request.setAttribute("listaLutador", listaLutadorPagaram);
		//seta o evento completo para pagina, para que se possa dar melhor vis�o ao usuario do que est� se trabalhando
		request.setAttribute("evento", eventoCompleto);
	
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("TelaGerarChaves.jsp");
		dispatcher.forward(request, response);
		

	}

}
