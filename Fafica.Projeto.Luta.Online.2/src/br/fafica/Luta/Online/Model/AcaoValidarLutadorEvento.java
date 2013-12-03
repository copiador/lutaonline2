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
	
	
	public AcaoValidarLutadorEvento(){
		fachada = Fachada.getInstanceFachada();
		lutador = new Lutador();
	}
	

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int idLutador = Integer.parseInt(request.getParameter("id"));
		lutador.setId(idLutador);
		
		fachada.controler.atualizaPagamentoLutador(lutador);
		
		request.setAttribute("mensagem", "Lutador Validado Com Sucesso");

		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("Controladora2?acao=listarLutadorEventoNaoPagaram");
		dispatcher.forward(request, response);
		
		
	}
	
	

}
