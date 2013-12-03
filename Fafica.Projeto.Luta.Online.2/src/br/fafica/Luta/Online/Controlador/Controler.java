package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceControlador;
import br.fafica.Luta.Online.Model.Evento;
import br.fafica.Luta.Online.Model.Lutador;
import br.fafica.Luta.Online.Model.Usuario;


public class Controler implements InterfaceControlador{
	
	private ControladorLutador controleLutador;
	private ControladorEvento controladorEvento;
	private ControladorUsuario controladorUsuario;
	private ControladorEventoLutador controladorEventoLutador;

	public Controler(){
		this.controleLutador = new ControladorLutador();
		this.controladorEvento = new ControladorEvento();
		this.controladorUsuario = new ControladorUsuario();
		this.controladorEventoLutador = new ControladorEventoLutador();
	
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
	
	@Override
	public Lutador pegarUltimoLutadorCadastrado() {
		
		return controleLutador.pegarUltimoLutadorCadastrado();
	}
	
	@Override
	public void cadastrarEventoLutador(Lutador lutador) {
		controleLutador.cadastrarLutadorEvento(lutador);
		
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
	
	//Usuario
	@Override
	public List<Usuario> ListarUsuario() {
		return controladorUsuario.listarUsuario();
	}
	
	@Override
	public void cadastrarUsuario(Usuario usuario) {
		controladorUsuario.cadastrarUsuario(usuario);
		
	}
	
	//EVENTO LUTADOR
	
	@Override
	public List<Lutador> pegarLutadoresDoEventoNaoPagaram(Evento evento) {
		
		return controladorEventoLutador.pegarLutadoresDoEventoNaoPagaram(evento);
	}


	
	
	
	
	
}
