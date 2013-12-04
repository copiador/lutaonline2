package br.fafica.Luta.Online.Interface;

import java.util.List;
import br.fafica.Luta.Online.Model.Lutador;

public interface InterfaceLutador {
	
	public void cadastrarLutador(Lutador lutador);
	public void editarLutador(Lutador lutador);
	public void excluirLutador(Lutador lutador);
	public List<Lutador> listarLutadores();
	public Lutador buscarID(Lutador lutador);
	public void cadastrarLutadorEvento(Lutador lutador);
	public Lutador pegarUltimoLutadorCadastrado();
	public List<Lutador> selecionaTodosOsAtributosDoLutadorPeloID(List<Lutador>listalutador);

}
