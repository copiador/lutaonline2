package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceControlador;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;


public class Controler implements InterfaceControlador{
	
	private ControladorLutador controleLutador;
	

	public Controler(){
		this.controleLutador = new ControladorLutador();
	
	}
	//Lutador
	@Override
	public void cadastrarLutador(Lutador lutador) {
		controleLutador.cadastrarLutador(lutador);
		
	}

	@Override
	public void editarLutador(Lutador lutador) {
		controleLutador.editarLutador(lutador);
		
	}

	@Override
	public void excluirLutador(Lutador lutador) {
		controleLutador.excluirLutador(lutador);
		
	}

	@Override
	public List<Lutador> listarLutadores() {
		return controleLutador.listarLutadores();
	}

	@Override
	public Lutador buscarID(Lutador lutador) {
		return controleLutador.buscarID(lutador);
		
	}
	
	//eventos
	
	@Override
	public void cadastrarEvento(Evento evento) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void excluirEvento(Evento Evento) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Evento> listarEvento() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Evento buscarEventoID(Evento evento) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
