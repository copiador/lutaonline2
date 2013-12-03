package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;
import br.fafica.Luta.Online.Model.Usuario;

public interface InterfaceControlador {
	
	public void cadastrarLutador(Lutador lutador);
	public void editarLutador(Lutador lutador);
	public void excluirLutador(Lutador lutador);
	public List<Lutador> listarLutadores();
	public Lutador buscarID(Lutador lutador);
	public void cadastrarEventoLutador(Lutador lutador);
	public Lutador pegarUltimoLutadorCadastrado();
//eventos
	public void cadastrarEvento(Evento evento);
	public void excluirEvento(Evento Evento);
	public List<Evento> listarEvento();
	public Evento buscarEventoID(Evento evento);
//Usuario
	public List<Usuario> ListarUsuario();
	public void cadastrarUsuario(Usuario usuario);
//Evento Lutador	
	public List<Lutador> pegarIdLutadoresIdEventoNaoPagaram(Evento evento);
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoNaoPagaram(Evento evento);
	public List<Lutador> pegarIdLutadorNomeLutadorCpfEventoPagaram(Evento evento);
}
