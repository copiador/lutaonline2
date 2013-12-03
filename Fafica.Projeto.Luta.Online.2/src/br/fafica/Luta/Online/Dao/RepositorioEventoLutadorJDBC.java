package br.fafica.Luta.Online.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.fafica.Luta.Online.Interface.InterfaceEventoLutador;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;

public class RepositorioEventoLutadorJDBC implements InterfaceEventoLutador {

	@Override
	public List<Lutador> pegarIdLutadoresIdEventoNaoPagaram(Evento evento) {

		List<Lutador> listaIdLutadoresIdEventoNaoPagaram = new ArrayList<Lutador>();

		String sql = "SELECT DISTINCT(TB_LUTADOR.ID) AS"
				+ " ID_LUTADOR, TB_LUTA_EVENTO.EV_ID AS ID_EVENTO FROM TB_LUTADOR "
				+ "INNER JOIN TB_LUTA_EVENTO ON TB_LUTA_EVENTO.LUT_ID = "
				+ "TB_LUTADOR.ID AND TB_LUTA_EVENTO.EV_ID = ? AND "
				+ "TB_LUTA_EVENTO.PAGAMENTO = 0;";
		try {

			PreparedStatement stmt = GerenteConexaoJDBC.getConexao()
					.prepareStatement(sql);
			stmt.setInt(1, evento.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				int idLutador = rs.getInt("id_lutador");
				int idEvento = rs.getInt("id_evento");

				Evento eventoComID = new Evento();
				Lutador lutador = new Lutador();
				// seta o id do event oe id do lutador par os objetos para ser
				// colocados na lista
				eventoComID.setId(idEvento);
				lutador.setId(idLutador);
				lutador.setEvento(eventoComID);
				// adiciona na lista
				listaIdLutadoresIdEventoNaoPagaram.add(lutador);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaIdLutadoresIdEventoNaoPagaram;
	}

	@Override
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(
			Evento evento) {
		List<Lutador> pegarIdLutadorNomeLutadorCpfEventoNaoPagaram = new ArrayList<Lutador>();

		String sql = "SELECT DISTINCT(TB_LUTADOR.ID) AS ID_LUTADOR, TB_LUTADOR.CPF " +
				"AS CPF_LUTADOR, TB_LUTADOR.NOME, TB_LUTA_EVENTO.PAGAMENTO FROM " +
				"TB_LUTADOR INNER JOIN TB_LUTA_EVENTO ON TB_LUTA_EVENTO.LUT_ID = " +
				"TB_LUTADOR.ID AND TB_LUTA_EVENTO.EV_ID = ?" +
				" AND TB_LUTA_EVENTO.PAGAMENTO = 0;";
		try {

			PreparedStatement stmt = GerenteConexaoJDBC.getConexao()
					.prepareStatement(sql);
			stmt.setInt(1, evento.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				int idLutador = rs.getInt("id_lutador");
				String cpfLutador = rs.getString("cpf_lutador");
				String nomeLutador = rs.getString("nome");
				int pagamento = rs.getInt("pagamento");

				
				Lutador lutador = new Lutador();
				
				
				lutador.setId(idLutador);
				lutador.setCpf(cpfLutador);
				lutador.setNome(nomeLutador);
				
				// adiciona na lista
				pegarIdLutadorNomeLutadorCpfEventoNaoPagaram.add(lutador);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pegarIdLutadorNomeLutadorCpfEventoNaoPagaram;
	}

	@Override
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoPagaram(Evento evento) {
		List<Lutador> pegarIdLutadorNomeLutadorCpfEventoPagaram = new ArrayList<Lutador>();

		String sql = "SELECT DISTINCT(TB_LUTADOR.ID) AS ID_LUTADOR, TB_LUTADOR.CPF " +
				"AS CPF_LUTADOR, TB_LUTADOR.NOME, TB_LUTA_EVENTO.PAGAMENTO FROM " +
				"TB_LUTADOR INNER JOIN TB_LUTA_EVENTO ON TB_LUTA_EVENTO.LUT_ID = " +
				"TB_LUTADOR.ID AND TB_LUTA_EVENTO.EV_ID = ?" +
				" AND TB_LUTA_EVENTO.PAGAMENTO = 1;";
		try {

			PreparedStatement stmt = GerenteConexaoJDBC.getConexao()
					.prepareStatement(sql);
			stmt.setInt(1, evento.getId());
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				int idLutador = rs.getInt("id_lutador");
				String cpfLutador = rs.getString("cpf_lutador");
				String nomeLutador = rs.getString("nome");
				int pagamento = rs.getInt("pagamento");

				
				Lutador lutador = new Lutador();
				
				
				lutador.setId(idLutador);
				lutador.setCpf(cpfLutador);
				lutador.setNome(nomeLutador);
				
				// adiciona na lista
				pegarIdLutadorNomeLutadorCpfEventoPagaram.add(lutador);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pegarIdLutadorNomeLutadorCpfEventoPagaram;
	}

	@Override
	public void atualizaPagamentoLutador(Lutador lutador) {
		try {

			PreparedStatement ps = GerenteConexaoJDBC
					.getConexao()
					.prepareStatement(
							"UPDATE TB_LUTA_EVENTO SET PAGAMENTO = 1 WHERE LUT_ID = ?;");

			ps.setInt(1, lutador.getId());
			
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
