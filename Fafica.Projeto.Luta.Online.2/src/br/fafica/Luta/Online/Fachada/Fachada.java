package br.fafica.Luta.Online.Fachada;

import br.fafica.Luta.Online.Controlador.Controler;

public class Fachada {

	private static Fachada fachada;
	public Controler controler;
	
	private Fachada(){
		controler = new Controler();
		
	}
	public static synchronized Fachada getInstanceFachada(){
		if (fachada == null){
			fachada = new Fachada();
		
	}
		return fachada;
	}
	
	
}
