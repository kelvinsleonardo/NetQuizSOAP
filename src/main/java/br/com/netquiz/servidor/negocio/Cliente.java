package br.com.netquiz.servidor.negocio;

import java.io.Serializable;

public class Cliente implements Serializable{

	private static final long serialVersionUID = -3272215692577839892L;

	private String id;
	
	private String nome;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	private int pontuacao;
	
	public void setIncrementarPontuacao(){
		pontuacao++;
	}
}
