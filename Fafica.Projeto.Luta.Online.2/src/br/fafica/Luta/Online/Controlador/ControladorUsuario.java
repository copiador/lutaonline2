package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Dao.RepositorioUsuarioJDBC;
import br.fafica.Luta.Online.Interface.InterfaceUsuario;
import br.fafica.Luta.Online.Model.Usuario;

public class ControladorUsuario implements InterfaceUsuario {
	
	private RepositorioUsuarioJDBC rp;
	
	
	public ControladorUsuario(){
		this.rp = new RepositorioUsuarioJDBC();
	}

	@Override
	public List<Usuario> listarUsuario() {
		return rp.listarUsuario();
	}

	@Override
	public void cadastrarUsuario(Usuario usuario) {
		rp.cadastrarUsuario(usuario);
		
	}

}
