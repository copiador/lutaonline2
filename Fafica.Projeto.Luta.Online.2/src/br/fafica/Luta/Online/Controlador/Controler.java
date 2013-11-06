package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceControlador;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;


public class Controler implements InterfaceControlador{
	
	private ControladorLutador controleLutador;
	private ControladorEvento controladorEvento;

	public Controler(){
		this.controleLutador = new ControladorLutador();
		this.controladorEvento = new ControladorEvento();
	
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
		controladorEvento.cadastrarEvento(evento);
		
	}
	@Override
	public void excluirEvento(Evento evento) {
		controladorEvento.excluirEvento(evento);
		
	}
	@Override
	public List<Evento> listarEvento() {
		return controladorEvento.listarEvento();
	}
	@Override
	public Evento buscarEventoID(Evento evento) {
		return controladorEvento.buscarEventoID(evento);
	}
	
	
	
	
	
}
