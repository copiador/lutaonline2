package br.fafica.Luta.Online.Controlador;

import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceChaves;
import br.fafica.Luta.Online.Model.ChavesLutas;
import br.fafica.Luta.Online.Model.Lutador;

public class ControladorChaves implements InterfaceChaves {

	private InterfaceChaves chavesDasLutas;
	
	public ControladorChaves() {
		chavesDasLutas = new ChavesLutas();
		
		
	}

	@Override
	public List<Lutador> setChavePreta(List<Lutador> listaLutador) {
		return chavesDasLutas.setChavePreta(listaLutador);
	}

	@Override
	public List<Lutador> setChaveAzul(List<Lutador> listaLutador) {
		// TODO Auto-generated method stub
		return chavesDasLutas.setChaveAzul(listaLutador);
	}

	@Override
	public List<Lutador> setChaveBranca(List<Lutador> listaLutador) {
		// TODO Auto-generated method stub
		return chavesDasLutas.setChaveBranca(listaLutador);
	}

	@Override
	public List<Lutador> setChaveMarrom(List<Lutador> listaLutador) {
		// TODO Auto-generated method stub
		return chavesDasLutas.setChaveMarrom(listaLutador);
	}

	@Override
	public List<Lutador> setChaveRoxa(List<Lutador> listaLutador) {
		// TODO Auto-generated method stub
		return chavesDasLutas.setChaveRoxa(listaLutador);
	}
}
