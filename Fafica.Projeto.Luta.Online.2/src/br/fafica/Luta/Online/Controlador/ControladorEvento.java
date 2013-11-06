package br.fafica.Luta.Online.Controlador;

import br.fafica.Luta.Online.Dao.RepositorioLutadorJDBC;

public class ControladorEvento {
	
	private RepositorioLutadorJDBC rp;
	
	
	public ControladorEvento() {
		rp = new RepositorioLutadorJDBC();
	}

}
