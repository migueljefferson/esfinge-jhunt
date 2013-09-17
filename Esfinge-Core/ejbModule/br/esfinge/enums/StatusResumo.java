package br.esfinge.enums;

public enum StatusResumo {

	PUBLICADO(1, "Publicado"),
	RASCUNHO(2, "Rascunho");
	
	private StatusResumo(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	private int id;
	private String descricao;
	
	public int getId() {return id;}
	public String getDescricao() {return descricao;}
}
