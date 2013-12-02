package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoCadastrarLutador implements InterfaceAcao {

	private Fachada fachada;

	public AcaoCadastrarLutador() {
		fachada = Fachada.getInstanceFachada();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Lutador lutador = new Lutador();
		Evento evento = new Evento();

		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String faixa = request.getParameter("faixa");
		String cpf = request.getParameter("cpf");
		int eventoId = Integer.parseInt(request.getParameter("evento"));

		// cria um objeto lutador com os dados da requição (formulário)
		// setou os tributos
		lutador.setNome(nome);
		lutador.setSexo(sexo);
		lutador.setFaixa(faixa);
		lutador.setcpf(cpf);

		evento.setId(eventoId);
		lutador.setEvento(evento);

		fachada.controler.cadastrarLutador(lutador);
		
		// invoca o método 'inserir' do DAO passando o objeto cliente a ser
		// inserido
		// InterfaceLutador add = new RepositorioLutadorJDBC();
		// add.cadastrarLutador(lutador);
		// fachada.controler.cadastrarLutador(lutador);
		// uma mensagem é colocada em uma atributo da requição
		request.setAttribute("mensagem", "Lutador adicionado com sucesso!");
		// encaminha a requição para a tela de Cadastro de Atletas
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("/TelaCadastroDeAtletasAdministrador.jsp");
		dispatcher.forward(request, response);

	}

}
