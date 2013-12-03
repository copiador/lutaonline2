package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Dao.RepositorioEventoLutadorJDBC;
import br.fafica.Luta.Online.Interface.InterfaceEventoLutador;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;

public class ControladorEventoLutador implements InterfaceEventoLutador {
	
	private RepositorioEventoLutadorJDBC rp;
	
	public ControladorEventoLutador(){
		rp = new RepositorioEventoLutadorJDBC();
		
	}

	@Override
	public List<Lutador> pegarIdLutadoresIdEventoNaoPagaram(Evento evento) {
	
		return rp.pegarIdLutadoresIdEventoNaoPagaram(evento);
	}

	@Override
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(
			Evento evento) {
		
		return rp.pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(evento);
	}

	@Override
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoPagaram(Evento evento) {
		
		return rp.pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(evento);
	}

	@Override
	public void atualizaPagamentoLutador(Lutador lutador) {
		rp.atualizaPagamentoLutador(lutador);
		
	}

}
