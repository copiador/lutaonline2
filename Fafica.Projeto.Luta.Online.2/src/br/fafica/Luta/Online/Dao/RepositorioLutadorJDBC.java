package br.fafica.Luta.Online.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import br.fafica.Luta.Online.Interface.InterfaceLutador;
import br.fafica.Luta.Online.Model.Lutador;

public class RepositorioLutadorJDBC implements InterfaceLutador {

	@Override
	public void cadastrarLutador(Lutador lutador) {

		String sql = "insert into tb_lutador (nome,sexo,faixa,cpf) values (?,?,?,?)";
		PreparedStatement st;
		System.out.println("chegou aqui no final");
		try {
			System.out.println("chegou aqui no final");
			st = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			st.setString(1, lutador.getNome());
			st.setString(2, lutador.getSexo());
			st.setString(3, lutador.getFaixa());
			st.setString(4, lutador.getCpf());
			System.out.println("chegou aqui no final");
			st.executeUpdate();
			System.out.println("cadastrou");
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editarLutador(Lutador lutador) {

		try {

			PreparedStatement ps = GerenteConexaoJDBC
					.getConexao()
					.prepareStatement(
							"UPDATE tb_lutador SET nome = ?, sexo = ?, cpf = ? WHERE id = ?");

			ps.setString(1, lutador.getNome());
			ps.setString(2, lutador.getSexo());
			ps.setString(3, lutador.getCpf());
			ps.setInt(4, lutador.getId());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluirLutador(Lutador lutador) {

		try {
			PreparedStatement ps = GerenteConexaoJDBC.getConexao()
					.prepareStatement("DELETE FROM tb_lutador WHERE id = ?");
			ps.setInt(1, lutador.getId());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Lutador> listarLutadores() {
		List<Lutador> lutadorlist = new ArrayList<Lutador>();

		try {
			Statement stmt = GerenteConexaoJDBC.getConexao().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tb_lutador");

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				Lutador lutador = new Lutador();
				lutador.setId(id);
				lutador.setNome(nome);
				lutador.setCpf(cpf);

				lutadorlist.add(lutador);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lutadorlist;

	}

	@Override
	public Lutador buscarID(Lutador lutador) {

		try {

			PreparedStatement ps = GerenteConexaoJDBC.getConexao()
					.prepareStatement("SELECT * FROM tb_lutador WHERE id = ?");
			ps.setInt(1, lutador.getId());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int idlutador = rs.getInt("id");
				String nome = rs.getString("nome");
				String sexo = rs.getString("sexo");
				String faixa = rs.getString("faixa");
				String cpf = rs.getString("cpf");

				Lutador setlutador = new Lutador();
				setlutador.setId(idlutador);
				setlutador.setNome(nome);
				setlutador.setSexo(sexo);
				setlutador.setFaixa(faixa);
				setlutador.setCpf(cpf);

				return setlutador;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;

	}

	@Override
	public void cadastrarLutadorEvento(Lutador lutador) {
		// TODO Auto-generated method stub
		String sql = "insert into tb_luta_evento values (?,?,?)";
		PreparedStatement st;
		
		try {
			System.out.println("chegou aqui no final");
			st = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			st.setInt(1, lutador.getEvento().getId());
			st.setInt(2, lutador.getId());
			st.setInt(3, 0);
			System.out.println("chegou aqui no final");
			st.executeUpdate();
			System.out.println("cadastrou");
			st.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Lutador pegarUltimoLutadorCadastrado() {

		Lutador lutador = new Lutador();

		PreparedStatement ps;
		try {
			ps = GerenteConexaoJDBC.getConexao().prepareStatement(
					"SELECT max(id) from tb_lutador");

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				lutador.setId(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lutador;
	}

	@Override
	public List<Lutador> selecionaTodosOsAtributosDoLutadorPeloID(
			List<Lutador> listalutador) {
		
		String sql = "SELECT * FROM TB_LUTADOR WHERE ID = ?";
		
		List<Lutador> listaAtualizada = new ArrayList<Lutador>();

		try {
			for (Lutador lutador : listalutador) {
			
				PreparedStatement stmt = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			
				int id = lutador.getId();
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				
				int idLutador = rs.getInt("id");
				String nomeLutador = rs.getString("nome");
				String sexoLutador = rs.getString("sexo");
				String faixaLutador = rs.getString("faixa");
				String cpfLutador = rs.getString("cpf");
				
				
				
				Lutador lutadorCompleto = new Lutador();
				
				lutadorCompleto.setId(idLutador);
				lutadorCompleto.setNome(nomeLutador);
				lutadorCompleto.setSexo(sexoLutador);
				lutadorCompleto.setFaixa(faixaLutador);
				lutadorCompleto.setCpf(cpfLutador);
				
				listaAtualizada.add(lutadorCompleto);
			}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAtualizada;

		
	}
}
