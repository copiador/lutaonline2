package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Usuario;

public interface InterfaceUsuario {

	public void cadastrarUsuario(Usuario usuario);
	public List<Usuario> listarUsuario();
}
