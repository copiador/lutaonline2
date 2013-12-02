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

public class AcaoListarEventoTelaCadastrarLutador implements InterfaceAcao {

	private Fachada fachada;
	private List<Evento> listaEvento;
	
	public AcaoListarEventoTelaCadastrarLutador(){
		fachada = Fachada.getInstanceFachada();
		listaEvento = new ArrayList<Evento>();
	}
	
	
	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		listaEvento = fachada.controler.listarEvento();
		
		request.setAttribute("eventos", listaEvento);
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("TelaCadastroDeAtletasAdministrador.jsp");
		dispatcher.forward(request, response);
		

	}

}
