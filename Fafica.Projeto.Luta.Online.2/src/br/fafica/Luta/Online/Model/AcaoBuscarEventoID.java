package br.fafica.Luta.Online.Model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoBuscarEventoID implements InterfaceAcao {
	
	private Fachada fachada;
	private Evento evento;
	
	public AcaoBuscarEventoID(){
		fachada = Fachada.getInstanceFachada();
		evento = new Evento();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

	}

}
