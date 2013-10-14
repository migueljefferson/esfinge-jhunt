package br.esfinge.entidades;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_disciplina")
public class Disciplina extends EntidadeGenerica implements Serializable {

	private static final long serialVersionUID = -8788740074345133591L;

	@Column(name="dis_nome", nullable=false)
	private String nome;
	
	@Column(name="dis_descricao", nullable=false)
	private String descricao;

	@NotNull
	@ManyToMany(mappedBy="tb_disciplina", fetch=FetchType.LAZY)
	private Set<Assunto> assuntos;
	
	@NotNull
	@ManyToMany(mappedBy="tb_disciplina", fetch=FetchType.LAZY)
	private Set<Area> areas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Set<Assunto> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Set<Assunto> assuntos) {
		this.assuntos = assuntos;
	}

	public Set<Area> getAreas() {
		return areas;
	}

	public void setAreas(Set<Area> areas) {
		this.areas = areas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
		result = prime * result
				+ ((assuntos == null) ? 0 : assuntos.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (areas == null) {
			if (other.areas != null)
				return false;
		} else if (!areas.equals(other.areas))
			return false;
		if (assuntos == null) {
			if (other.assuntos != null)
				return false;
		} else if (!assuntos.equals(other.assuntos))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
