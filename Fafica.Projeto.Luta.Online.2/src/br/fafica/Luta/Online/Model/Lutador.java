package br.fafica.Luta.Online.Model;

public class Lutador {

	private int id;
	private String nome;
	private String sexo;
	private String faixa;
	private String cpf;
	private Evento evento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFaixa() {
		return faixa;
	}

	public void setFaixa(String faixa) {
		this.faixa = faixa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}
