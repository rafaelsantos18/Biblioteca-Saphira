package br.com.saphira.beans;

import java.util.List;

public class Cliente extends Pessoa{
	
	private String idCliente;
	private String senhaSistema;
	private List<Livro> livrosAlugados;
	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public List<Livro> getLivrosAlugados() {
		return livrosAlugados;
	}
	public void setLivrosAlugados(List<Livro> livrosAlugados) {
		this.livrosAlugados = livrosAlugados;
	}
	public String getSenhaSistema() {
		return senhaSistema;
	}
	public void setSenhaSistema(String senhaSistema) {
		this.senhaSistema = senhaSistema;
	}

}
