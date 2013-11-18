package br.fafica.Luta.Online.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceEvento;
import br.fafica.Luta.Online.Model.Evento;


public class RepositorioEventoJDBC implements InterfaceEvento {

	
	
	
	@Override
	public void cadastrarEvento(Evento evento) {
		
		String sql = "insert into tb_evento (nome,data) values (?,?)";
		PreparedStatement st;
		System.out.println("chegou aqui no final");
		try {
			
			st = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			st.setString(1, evento.getNome());
			st.setString(2, evento.getData());
			
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void excluirEvento(Evento evento) {
		
		try {
			PreparedStatement ps = GerenteConexaoJDBC.getConexao().prepareStatement("DELETE FROM tb_evento WHERE id = ?");
			ps.setInt(1, evento.getId());

			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Evento> listarEvento() {
		List<Evento> lutadorlist = new ArrayList<Evento>();

		try {
			Statement stmt = GerenteConexaoJDBC.getConexao().createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM tb_evento");

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String data = rs.getString("data");
				Evento evento = new Evento();
				evento.setId(id);
				evento.setNome(nome);
				evento.setData(data);

				lutadorlist.add(evento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lutadorlist;
	}

	@Override
	public Evento buscarEventoID(Evento evento) {
		try {

			PreparedStatement ps = GerenteConexaoJDBC.getConexao()
					.prepareStatement("SELECT * FROM tb_evento WHERE id = ?");
			ps.setInt(1, evento.getId());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				int idevento = rs.getInt("id");
				String nome = rs.getString("nome");
				String data = rs.getString("data");

				Evento setevento = new Evento();
				setevento.setId(idevento);
				setevento.setNome(nome);
				setevento.setData(data);
				
				return setevento;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
