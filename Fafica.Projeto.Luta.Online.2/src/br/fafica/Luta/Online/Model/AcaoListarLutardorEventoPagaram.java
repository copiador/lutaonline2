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

public class AcaoListarLutardorEventoPagaram implements InterfaceAcao {

	private Fachada fachada;
	private List<Lutador> listaLutadorPagaram;
	
	public AcaoListarLutardorEventoPagaram(){
		fachada = Fachada.getInstanceFachada();
		listaLutadorPagaram = new ArrayList<Lutador>();
	}
	
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Evento evento = new Evento();
		//recupera o id do evento dos lutadores que não pagaram
		int idEvento = Integer.parseInt(request.getParameter("id"));
		evento.setId(idEvento);
		//faz a consulta no banco de dados dos lutares que ñao pagaram
		listaLutadorPagaram = fachada.controler.pegarIdLutadorNomeLutadorCpfEventoPagaram(evento);
		System.out.println("listar ok");
		request.setAttribute("listaLutador", listaLutadorPagaram);
		request.setAttribute("evento", evento);
		System.out.println("listar ok");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("TelaGerenciarEventoPagaram.jsp");
		dispatcher.forward(request, response);
		

	}

}
