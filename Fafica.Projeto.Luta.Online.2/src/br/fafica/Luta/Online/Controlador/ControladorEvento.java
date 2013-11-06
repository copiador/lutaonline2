package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Dao.RepositorioEventoJDBC;
import br.fafica.Luta.Online.Interface.InterfaceEvento;
import br.fafica.Luta.Online.Model.Evento;

public class ControladorEvento implements InterfaceEvento {
	
	private RepositorioEventoJDBC rp;
	
	
	public ControladorEvento() {
		rp = new RepositorioEventoJDBC();
	}


	@Override
	public void cadastrarEvento(Evento evento) {
		rp.cadastrarEvento(evento);
		
	}


	@Override
	public void excluirEvento(Evento evento) {
		rp.excluirEvento(evento);
		
	}


	@Override
	public List<Evento> listarEvento() {
		
		return rp.listarEvento();
	}


	@Override
	public Evento buscarEventoID(Evento evento) {
		
		return rp.buscarEventoID(evento);
	}

}
