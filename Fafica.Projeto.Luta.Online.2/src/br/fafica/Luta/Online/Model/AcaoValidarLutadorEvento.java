package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoValidarLutadorEvento implements InterfaceAcao {
	
	private Fachada fachada;
	private Lutador lutador;
	private Evento evento;
	
	
	public AcaoValidarLutadorEvento(){
		fachada = Fachada.getInstanceFachada();
		lutador = new Lutador();
		evento = new Evento();
	}
	

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//recupera o id do evento e o id lutador.
		int idLutador = Integer.parseInt(request.getParameter("idLutador"));
		lutador.setId(idLutador);
		int idEvento = Integer.parseInt(request.getParameter("IdEvento"));
	
		System.out.println("id evento" + idEvento);
		
		System.out.println("id lutador"+ idLutador);
		
		
		fachada.controler.atualizaPagamentoLutador(lutador);
		
		request.setAttribute("mensagem", "Lutador Validado Com Sucesso");
		request.setAttribute("idEvento", idEvento);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Controladora2?acao=listarLutadorEventoNaoPagaramAtualizado");
		dispatcher.forward(request, response);
		
		
	}
	
	

}
