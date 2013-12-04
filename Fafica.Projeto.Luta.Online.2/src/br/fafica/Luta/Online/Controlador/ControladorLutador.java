package br.fafica.Luta.Online.Controlador;


import java.util.List;

import br.fafica.Luta.Online.Dao.RepositorioLutadorJDBC;
import br.fafica.Luta.Online.Interface.InterfaceLutador;
import br.fafica.Luta.Online.Model.Lutador;

public class ControladorLutador implements InterfaceLutador {
	
	private RepositorioLutadorJDBC rp;
	
	
	public ControladorLutador(){
		rp = new RepositorioLutadorJDBC();
	}
		
	@Override
	public void cadastrarLutador(Lutador lutador) {
		rp.cadastrarLutador(lutador);
		
	}

	@Override
	public void editarLutador(Lutador lutador) {
		rp.editarLutador(lutador);
		
	}

	@Override
	public void excluirLutador(Lutador lutador) {
		rp.excluirLutador(lutador);
		
	}

	@Override
	public List<Lutador> listarLutadores() {
		return rp.listarLutadores();
	}

	@Override
	public Lutador buscarID(Lutador lutador) {
		return rp.buscarID(lutador);
		
	}

	@Override
	public void cadastrarLutadorEvento(Lutador lutador) {
		rp.cadastrarLutadorEvento(lutador);
		
	}

	@Override
	public Lutador pegarUltimoLutadorCadastrado() {
		
		return rp.pegarUltimoLutadorCadastrado();
	}

	@Override
	public List<Lutador> selecionaTodosOsAtributosDoLutadorPeloID(
			List<Lutador> listalutador) {
		
		return rp.selecionaTodosOsAtributosDoLutadorPeloID(listalutador);
	}

	




	

}
