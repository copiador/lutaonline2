package br.fafica.Luta.Online.Interface;

import java.util.List;

import br.fafica.Luta.Online.Model.Lutador;

public interface InterfaceChaves {
	//PARTE CHAVES LUTAS
	public List<Lutador> setChavePreta(List<Lutador> listaLutador);
	public List<Lutador> setChaveAzul(List<Lutador> listaLutador);
	public List<Lutador> setChaveBranca(List<Lutador> listaLutador);
	public List<Lutador> setChaveMarrom(List<Lutador> listaLutador);
	public List<Lutador> setChaveRoxa(List<Lutador> listaLutador);
	//PARTE FASES DAS LUTAS
	public List<Lutador> embaralhaLutador(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteA(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteB(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteC(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteD(List<Lutador> listaLutador);
	public List<Lutador> setFaseParteE(List<Lutador> listaLutador);
	public List<Lutador> ganhadores(List<Lutador> listaLutador);

}
