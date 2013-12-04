package br.fafica.Luta.Online.Model;

import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceChaves;

public class ChavesFases implements InterfaceChaves{

	private List<Lutador> chaveLutasFaseA;
	private List<Lutador> chaveLutasFaseB;
	private List<Lutador> chaveLutasFaseC;
	private List<Lutador> chaveLutasFaseD;
	private List<Lutador> chaveLutasFaseE;
	private List<Lutador> ganhadores;
	
	public ChavesFases(){
		chaveLutasFaseA = new ArrayList<Lutador>();
		chaveLutasFaseB = new ArrayList<Lutador>();
		chaveLutasFaseC = new ArrayList<Lutador>();
		chaveLutasFaseD = new ArrayList<Lutador>();
		chaveLutasFaseE = new ArrayList<Lutador>();
		ganhadores = new ArrayList<Lutador>();
	}
	
	public List<Lutador> getChaveLutasFaseA() {
		return chaveLutasFaseA;
	}
	public void setChaveLutasFaseA(List<Lutador> chaveLutasFaseA) {
		this.chaveLutasFaseA = chaveLutasFaseA;
	}
	public List<Lutador> getChaveLutasFaseB() {
		return chaveLutasFaseB;
	}
	public void setChaveLutasFaseB(List<Lutador> chaveLutasFaseB) {
		this.chaveLutasFaseB = chaveLutasFaseB;
	}
	public List<Lutador> getChaveLutasFaseC() {
		return chaveLutasFaseC;
	}
	public void setChaveLutasFaseC(List<Lutador> chaveLutasFaseC) {
		this.chaveLutasFaseC = chaveLutasFaseC;
	}
	public List<Lutador> getChaveLutasFaseD() {
		return chaveLutasFaseD;
	}
	public void setChaveLutasFaseD(List<Lutador> chaveLutasFaseD) {
		this.chaveLutasFaseD = chaveLutasFaseD;
	}
	public List<Lutador> getChaveLutasFaseE() {
		return chaveLutasFaseE;
	}
	public void setChaveLutasFaseE(List<Lutador> chaveLutasFaseE) {
		this.chaveLutasFaseE = chaveLutasFaseE;
	}
	public List<Lutador> getGanhadores() {
		return ganhadores;
	}
	public void setGanhadores(List<Lutador> ganhadores) {
		this.ganhadores = ganhadores;
	}

	@Override
	public List<Lutador> setChavePreta(List<Lutador> listaLutador) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
