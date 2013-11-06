package br.fafica.Luta.Online.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoListarLutador implements InterfaceAcao {
	
	private List<Lutador> listLutador;
	private Fachada fachada;
	
	public AcaoListarLutador() {
		listLutador = new ArrayList<Lutador>();
		fachada = Fachada.getInstanceFachada();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		listLutador = fachada.controler.listarLutadores();
	
		
		request.setAttribute("lutadores", listLutador);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/TelaListarAtletasAdministrador.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
