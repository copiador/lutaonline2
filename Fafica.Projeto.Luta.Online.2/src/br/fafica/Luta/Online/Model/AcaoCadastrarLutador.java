package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoCadastrarLutador implements InterfaceAcao{

	private Fachada fachada;
	
	public AcaoCadastrarLutador(){
		fachada = Fachada.getInstanceFachada();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Lutador lutador = new Lutador();
		
		String nome = request.getParameter("nome");
		String sexo = request.getParameter("sexo");
		String faixa = request.getParameter("faixa");
		String cpf = request.getParameter("cpf");
		// cria um objeto lutador com os dados da requi��o (formul�rio)
		//setou os tributos
		lutador.setNome(nome);
		lutador.setSexo(sexo);
		lutador.setFaixa(faixa);
		lutador.setcpf(cpf);
		fachada.controler.cadastrarLutador(lutador);
		// invoca o m�todo 'inserir' do DAO passando o objeto cliente a ser inserido
		//InterfaceLutador add = new RepositorioLutadorJDBC();
		//add.cadastrarLutador(lutador);
		//fachada.controler.cadastrarLutador(lutador);
		// uma mensagem � colocada em uma atributo da requi��o
		request.setAttribute("mensagem", "Cliente adicionado com sucesso!");
		// encaminha a requi��o para a tela de Cadastro de Atletas
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/TelaCadastroDeAtletasAdministrador.jsp");
		dispatcher.forward(request, response);
				
	}
	
}
