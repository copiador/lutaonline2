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

public class AcaoListarLutardorEventoNaoPagaramAtualizado implements InterfaceAcao {

	private Fachada fachada;
	private List<Lutador> listaLutadorNaoPagaram;
	
	public AcaoListarLutardorEventoNaoPagaramAtualizado(){
		fachada = Fachada.getInstanceFachada();
		listaLutadorNaoPagaram = new ArrayList<Lutador>();
	}
	
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Evento evento = new Evento();
		//recupera o id do evento dos lutadores que não pagaram pelo sistema de atributos
		int idEvento = (int) request.getAttribute("idEvento");
		evento.setId(idEvento);
		//faz a consulta no banco de dados dos lutares que ñao pagaram
		listaLutadorNaoPagaram = fachada.controler.pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(evento);
		
		request.setAttribute("listaLutador", listaLutadorNaoPagaram);
		
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("TelaGerenciarEvento-Nao-Pagaram.jsp");
		dispatcher.forward(request, response);
		

	}

}
