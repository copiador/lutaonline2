package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Evento;

public interface InterfaceEvento {
	
	public void cadastrarEvento(Evento evento);
	public void excluirEvento(Evento evento);
	public List<Evento> listarEvento();
	public Evento buscarEventoID(Evento evento);

}
