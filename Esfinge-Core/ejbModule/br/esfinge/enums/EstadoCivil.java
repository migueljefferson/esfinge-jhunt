package br.esfinge.enums;

public enum EstadoCivil {

	SOLTEIRO(1, "Solteiro"),
	PEGANDO(2, "Pegando"),
	NAMORANDO(3, "Namorando"),
	NOIVO(4, "Noivo"),
	CASADO(5, "Casado"),
	DIVORCIADO(6, "Divorciado"),
	VIUVO(7, "Viuvo");
	
	private EstadoCivil(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	
	private int id;
	private String descricao;
	
	public int getId() {return id;}
	public String getDescricao() {return descricao;}
	
}