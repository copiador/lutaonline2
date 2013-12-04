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
	public List<Lutador> selecionaTodosOsAtributosDoLutadorPeloID(List<Lutador>listalutador);
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
	public void atualizaPagamentoLutador(Lutador lutador);
//chaves
	public List<Lutador> setChavePreta(List<Lutador> listaLutador);
	public List<Lutador> setChaveAzul(List<Lutador> listaLutador);
	public List<Lutador> setChaveBranca(List<Lutador> listaLutador);
	public List<Lutador> setChaveMarrom(List<Lutador> listaLutador);
	public List<Lutador> setChaveRoxa(List<Lutador> listaLutador);
//Parte das Lutas
	public List<Lutador> embaralhaLutador(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteA(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteB(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteC(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteD(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteE(List<Lutador> listaLutador);
	public List<Lutador> ganhadores(List<Lutador> listaLutador);
	
}
