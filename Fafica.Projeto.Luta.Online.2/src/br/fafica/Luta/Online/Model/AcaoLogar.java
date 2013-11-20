package br.fafica.Luta.Online.Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fafica.Luta.Online.Fachada.Fachada;
import br.fafica.Luta.Online.Interface.InterfaceAcao;

public class AcaoLogar implements InterfaceAcao {

	private Fachada fachada;
	private List<Usuario> listaUsuario;
	private Usuario usuario;

	public AcaoLogar() {
		this.fachada = Fachada.getInstanceFachada();
		this.listaUsuario = new ArrayList<Usuario>();
		this.usuario = new Usuario();
	}

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		Usuario usuarioLogado = new Usuario();
		
		usuarioLogado = usuarioExisteNoBanco(usuario);

		
		
	}

	public Usuario usuarioExisteNoBanco(Usuario usuario) {
		
		listaUsuario = fachada.controler.ListarUsuario();
		
		for (Usuario usuarioset : listaUsuario) {

			String loginset = usuarioset.getLogin();
			String senhaset = usuarioset.getSenha();
			// coloca um usuario em cada atributo dos usuarios da lista
			Usuario usuarioTeste = new Usuario();
			usuarioTeste.setLogin(loginset);
			usuarioTeste.setSenha(senhaset);
			// testa se o login do usuario da lista é o mesmo login do usuario da pagina
			//testa o login
			if (usuarioTeste.getLogin().equals(usuario.getLogin())) {
				System.out.println("login ok");
				//testa a senha
				if (usuarioTeste.getSenha().equals(usuario.getSenha())) {
					System.out.println("senha ok");
					Usuario usuarioOK = usuarioset;
					return usuarioOK;//retorna o usuario logado
				}
			}

		}

		return null;//se ele não existir retorna null;
	}

}
