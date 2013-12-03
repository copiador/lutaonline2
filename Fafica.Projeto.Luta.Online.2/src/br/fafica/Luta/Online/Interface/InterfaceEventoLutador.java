package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;

public interface InterfaceEventoLutador {
	
	public List<Lutador> pegarIdLutadoresIdEventoNaoPagaram(Evento evento);
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(Evento evento);
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoPagaram(Evento evento);
	public void atualizaPagamentoLutador(Lutador lutador);

}
