package br.fafica.Luta.Online.Servet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Interface.InterfaceAcao;
import br.fafica.Luta.Online.Model.AcaoBuscarEventoID;
import br.fafica.Luta.Online.Model.AcaoBuscarLutadorID;
import br.fafica.Luta.Online.Model.AcaoCadastrarEvento;
import br.fafica.Luta.Online.Model.AcaoCadastrarLutador;
import br.fafica.Luta.Online.Model.AcaoEditarLutador;
import br.fafica.Luta.Online.Model.AcaoExcluirEvento;
import br.fafica.Luta.Online.Model.AcaoExcluirLutador;
import br.fafica.Luta.Online.Model.AcaoListarEvento;
import br.fafica.Luta.Online.Model.AcaoListarLutador;
import br.fafica.Luta.Online.Model.AcaoLogar;
import br.fafica.Luta.Online.Model.AcaoLogount;


/**
 * Servlet implementation class Controladora2
 */
@WebServlet("/Controladora2")
public class Controladora2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Map<String, InterfaceAcao> acoes = new HashMap<String, InterfaceAcao>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controladora2() {
		acoes.put("cadastrar", new AcaoCadastrarLutador());
		acoes.put("listarLutadores", new AcaoListarLutador());
		acoes.put("editarLutador", new AcaoEditarLutador());
		acoes.put("excluirLutador", new AcaoExcluirLutador());
		acoes.put("buscarLutador", new AcaoBuscarLutadorID());
		
		acoes.put("logar", new AcaoLogar());
		acoes.put("logount", new AcaoLogount());
		
		acoes.put("cadastrarEvento", new AcaoCadastrarEvento());
		acoes.put("excluirEvento", new AcaoExcluirEvento());
		acoes.put("listarEvento", new AcaoListarEvento());
		acoes.put("buscarEvento", new AcaoBuscarEventoID());
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// recupera o valor do parâmetro 'acao' da requisição
		System.out.println("casa");
		String acao = request.getParameter("acao");
		// pega a classe de 'Acao' baseado no parâmetro da requisição
		InterfaceAcao operacao = acoes.get(acao);
		if (operacao == null) {
			System.out.println("chegou aqui");
			// se operacao == null é porque não existe classe 'Acao' com
			// a String informada, então vamos usar a acao 'listar'
		}
		operacao.executar(request, response);
	}

}
