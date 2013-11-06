package br.fafica.Luta.Online.Controlador;

import br.fafica.Luta.Online.Dao.RepositorioLutadorJDBC;

public class ControlerEvento {
	
	private RepositorioLutadorJDBC rp;
	
	
	public ControlerEvento() {
		rp = new RepositorioLutadorJDBC();
	}

}
