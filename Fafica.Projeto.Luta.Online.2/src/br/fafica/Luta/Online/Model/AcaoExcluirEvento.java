package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoExcluirEvento implements InterfaceAcao {

	private Fachada fachada;
	private Evento evento;
	
	public AcaoExcluirEvento(){
		fachada = Fachada.getInstanceFachada();
		evento = new Evento();
		
	}
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idEvento = Integer.parseInt(request.getParameter("id"));
		
		evento.setId(idEvento);
		
		fachada.controler.excluirEvento(evento);
		request.setAttribute("mensagem", "Evento excluido com Sucesso");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Controladora2?acao=listarEvento");
		dispatcher.forward(request, response);

	}

}
