package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoCadastrarEvento implements InterfaceAcao {

	private Fachada fachada;
	private Evento evento;
	
	public AcaoCadastrarEvento(){
		fachada = Fachada.getInstanceFachada();
		evento = new Evento();
	}
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String nomeEvento = request.getParameter("nome");
		String dataEvento = request.getParameter("data");
		
		evento.setNome(nomeEvento);
		evento.setData(dataEvento);
		fachada.controler.cadastrarEvento(evento);
		
		request.setAttribute("mensagem", "Evento cadastrado com Sucesso!");
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("TelaNovoEvento.jsp");
		dispatcher.forward(request, response);
		
	}

}
