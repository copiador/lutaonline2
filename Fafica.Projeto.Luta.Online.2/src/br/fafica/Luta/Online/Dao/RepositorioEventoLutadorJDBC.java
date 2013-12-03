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

		List<Lutador> listaLutadoresDoEventoNaoPagaram = new ArrayList<Lutador>();
		
		String sql = "SELECT DISTINCT(TB_LUTADOR.ID) AS"
				+ " ID_LUTADOR, TB_LUTA_EVENTO.EV_ID AS ID_EVENTO FROM TB_LUTADOR "
				+ "INNER JOIN TB_LUTA_EVENTO ON TB_LUTA_EVENTO.LUT_ID = "
				+ "TB_LUTADOR.ID AND TB_LUTA_EVENTO.EV_ID = ? AND "
				+ "TB_LUTA_EVENTO.PAGAMENTO = 0;";
		try {

			PreparedStatement stmt = GerenteConexaoJDBC.getConexao().prepareStatement(sql);
			stmt.setInt(1, evento.getId());
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				int idLutador = rs.getInt("id_lutador");
				int idEvento = rs.getInt("id_evento");
				
				Evento eventoComID = new Evento();
				Lutador lutador = new Lutador();
				//seta o id do event oe id do lutador par os objetos para ser colocados na lista
				eventoComID.setId(idEvento);
				lutador.setId(idLutador);
				lutador.setEvento(eventoComID);
				//adiciona na lista
				listaLutadoresDoEventoNaoPagaram.add(lutador);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaLutadoresDoEventoNaoPagaram;
	}

}
