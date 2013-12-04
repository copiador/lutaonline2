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


	@Override
	public List<Lutador> setChavePreta(List<Lutador> listaLutador) {
		
		//se o lutador da lista passada tiver faixa preta, adicione ele na lista de faixas prestas;
		for (Lutador lutador : listaLutador) {
			String faixaLutador = lutador.getFaixa();
			if(faixaLutador.equalsIgnoreCase("preta")){
				listaLutadorFaixaPreta.add(lutador);
			}
			
		}
		return listaLutadorFaixaPreta;
	}


	@Override
	public List<Lutador> setChaveAzul(List<Lutador> listaLutador) {
		for (Lutador lutador : listaLutador) {
			String faixaLutador = lutador.getFaixa();
			if(faixaLutador.equalsIgnoreCase("azul")){
				listaLutadorFaixaPreta.add(lutador);
			}
			
		}
		return listaLutadorFaixaAzul;
	}


	@Override
	public List<Lutador> setChaveBranca(List<Lutador> listaLutador) {
		for (Lutador lutador : listaLutador) {
			String faixaLutador = lutador.getFaixa();
			if(faixaLutador.equalsIgnoreCase("branca")){
				listaLutadorFaixaPreta.add(lutador);
			}
			
		}
		return listaLutadorFaixaBranca;
	}


	@Override
	public List<Lutador> setChaveMarrom(List<Lutador> listaLutador) {
		for (Lutador lutador : listaLutador) {
			String faixaLutador = lutador.getFaixa();
			if(faixaLutador.equalsIgnoreCase("marrom")){
				listaLutadorFaixaPreta.add(lutador);
			}
			
		}
		return listaLutadorFaixaMarrom;
	}


	@Override
	public List<Lutador> setChaveRoxa(List<Lutador> listaLutador) {
		for (Lutador lutador : listaLutador) {
			String faixaLutador = lutador.getFaixa();
			if(faixaLutador.equalsIgnoreCase("Roxa")){
				listaLutadorFaixaPreta.add(lutador);
			}
			
		}
		return listaLutadorFaixaRoxa;
	}
	
	

	


}
