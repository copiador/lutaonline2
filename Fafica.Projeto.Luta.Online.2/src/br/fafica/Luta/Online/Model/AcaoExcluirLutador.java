package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoExcluirLutador implements InterfaceAcao {

	private Fachada fachada;
	private Lutador lutador;

	public AcaoExcluirLutador() {
		fachada = Fachada.getInstanceFachada();
		lutador = new Lutador();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		lutador.setId(id);

		fachada.controler.excluirLutador(lutador);

		request.setAttribute("mensagem", "Lutador excluído com sucesso!");

		// encaminha a requição para página de listar todos os clientes
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("controlador2?acao=listarLutadores");
		dispatcher.forward(request, response);

	}

}
