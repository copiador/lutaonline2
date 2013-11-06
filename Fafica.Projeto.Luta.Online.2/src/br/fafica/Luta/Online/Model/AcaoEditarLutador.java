package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoEditarLutador implements InterfaceAcao {

	private Fachada fachada;
	private Lutador lutador;

	public AcaoEditarLutador() {
		lutador = new Lutador();
		fachada = Fachada.getInstanceFachada();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String cpf = request.getParameter("cpf");

		lutador.setId(id);
		lutador.setNome(nome);
		lutador.setSexo(sexo);
		lutador.setcpf(cpf);
		
		fachada.controler.editarLutador(lutador);

		request.setAttribute("mensagem", "Lutador Editado com sucesso!");

		// encaminha a requição para página de listar todos os clientes
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("Controladora2?acao=listarLutadores");
		dispatcher.forward(request, response);

	}

}
