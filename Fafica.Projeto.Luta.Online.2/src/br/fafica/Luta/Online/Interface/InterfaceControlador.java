package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;

public interface InterfaceControlador {
	
	public void cadastrarLutador(Lutador lutador);
	public void editarLutador(Lutador lutador);
	public void excluirLutador(Lutador lutador);
	public List<Lutador> listarLutadores();
	public Lutador buscarID(Lutador lutador);
//eventos
	public void cadastrarEvento(Evento evento);
	public void excluirEvento(Evento Evento);
	public List<Evento> listarEvento();
	public Evento buscarEventoID(Evento evento);
	
}
