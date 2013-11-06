package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoBuscarLutadorID implements InterfaceAcao {

	private Fachada fachada;
	
	public AcaoBuscarLutadorID(){
		fachada = Fachada.getInstanceFachada();
	}
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//pega o id do lutador
		int id = Integer.parseInt(request.getParameter("id"));
		Lutador lutador = new Lutador();
		lutador.setId(id);
		
		//recupera o lutador
		Lutador setlutador = fachada.controler.buscarID(lutador);
		System.out.println(setlutador.getNome());
		//redireciona o lutador para a pagina
		request.setAttribute("lutador", setlutador);
		
		// encaminha a requição para página de edição
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/TelaEditarLutador.jsp");
		dispatcher.forward(request, response);
		

	}

}
