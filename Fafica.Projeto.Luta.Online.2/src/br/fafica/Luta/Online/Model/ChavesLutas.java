package br.fafica.Luta.Online.Model;


import java.util.ArrayList;
import java.util.List;

import br.fafica.Luta.Online.Interface.InterfaceChaves;

public class ChavesLutas implements InterfaceChaves{
	
	private List<Lutador> listaLutadorFaixaBranca;
	private List<Lutador> listaLutadorFaixaAzul;
	private List<Lutador> listaLutadorFaixaRoxa;
	private List<Lutador> listaLutadorFaixaMarrom;
	private List<Lutador> listaLutadorFaixaPreta;
	
	public ChavesLutas(){
		listaLutadorFaixaBranca = new ArrayList<Lutador>();
		listaLutadorFaixaAzul = new ArrayList<Lutador>();
		listaLutadorFaixaRoxa = new ArrayList<Lutador>();
		listaLutadorFaixaMarrom = new ArrayList<Lutador>();
		listaLutadorFaixaPreta = new ArrayList<Lutador>();
	}
	
	
	public List<Lutador> getListaLutadorFaixaBranca() {
		return listaLutadorFaixaBranca;
	}

	public void setListaLutadorFaixaBranca(List<Lutador> listaLutadorFaixaBranca) {
		this.listaLutadorFaixaBranca = listaLutadorFaixaBranca;
	}

	public List<Lutador> getListaLutadorFaixaAzul() {
		return listaLutadorFaixaAzul;
	}

	public void setListaLutadorFaixaAzul(List<Lutador> listaLutadorFaixaAzul) {
		this.listaLutadorFaixaAzul = listaLutadorFaixaAzul;
	}

	public List<Lutador> getListaLutadorFaixaRoxa() {
		return listaLutadorFaixaRoxa;
	}

	public void setListaLutadorFaixaRoxa(List<Lutador> listaLutadorFaixaRoxa) {
		this.listaLutadorFaixaRoxa = listaLutadorFaixaRoxa;
	}

	public List<Lutador> getListaLutadorFaixaMarrom() {
		return listaLutadorFaixaMarrom;
	}

	public void setListaLutadorFaixaMarrom(List<Lutador> listaLutadorFaixaMarrom) {
		this.listaLutadorFaixaMarrom = listaLutadorFaixaMarrom;
	}

	public List<Lutador> getListaLutadorFaixaPreta() {
		return listaLutadorFaixaPreta;
	}

	public void setListaLutadorFaixaPreta(List<Lutador> listaLutadorFaixaPreta) {
		this.listaLutadorFaixaPreta = listaLutadorFaixaPreta;
	}

	


}
