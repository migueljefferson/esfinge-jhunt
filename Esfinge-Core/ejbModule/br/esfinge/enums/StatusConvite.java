package br.esfinge.enums;

public enum StatusConvite {
	
	RESUMEIRO(1, "Resumeiro(a)"), 
	AMIZADE_SOLICITADA(2, "Amizade solicitada"),
	AMIZADES_PENDENTES(3, "Amizades pendentes"),
	AMIGO(4, "Amigo");
	
	private StatusConvite(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	private int id;
	private String descricao;
	
	public int getId() {
		return id;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
