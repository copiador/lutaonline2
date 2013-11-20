package br.fafica.Luta.Online.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceUsuario;
import br.fafica.Luta.Online.Model.Usuario;

public class RepositorioUsuarioJDBC implements InterfaceUsuario {

	@Override
	public List<Usuario> listarUsuario() {
		List<Usuario> lutadorlist = new ArrayList<Usuario>();

		try {
			Statement stmt = GerenteConexaoJDBC.getConexao().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tb_usuario");

			while (rs.next()) {
				int id = rs.getInt("id");
				String login = rs.getString("login");
				String senha = rs.getString("senha");
				String email = rs.getString("email");

				Usuario usuario = new Usuario();

				usuario.setId(id);
				usuario.setLogin(login);
				usuario.setSenha(senha);
				usuario.setEmail(email);

				lutadorlist.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lutadorlist;

	}

	@Override
	public void cadastrarUsuario(Usuario usuario) {

		String sql = "insert into tb_usuario (login,senha,email) values (?,?,?)";
		PreparedStatement st;
	
		try {
			System.out.println("chegou aqui no final");
			st = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			st.setString(1, usuario.getLogin());
			st.setString(2, usuario.getSenha());
			st.setString(3, usuario.getEmail());
			System.out.println("chegou aqui no final");
			st.executeUpdate();
			System.out.println("cadastrou");
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
