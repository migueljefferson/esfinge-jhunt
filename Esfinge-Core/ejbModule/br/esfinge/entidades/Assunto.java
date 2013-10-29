package br.esfinge.entidades;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tb_assunto")
public class Assunto implements Serializable{

	private static final long serialVersionUID = -7379324415832452881L;

	@Id
	@Column(name="id_assunto")
	@SequenceGenerator(name="seq_assunto",sequenceName="seq_assunto",initialValue=1)
	@GeneratedValue(generator="seq_assunto",strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@Column(nullable=false)
	private String descricao;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id_resumo",referencedColumnName="id_resumo")
	private Set<Resumo> resumos;
	
	@NotNull
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id_disc",referencedColumnName="id_disc")
	private Set<Disciplina> disciplinas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Set<Resumo> getResumos() {
		return resumos;
	}

	public void setResumos(Set<Resumo> resumos) {
		this.resumos = resumos;
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result
				+ ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((resumos == null) ? 0 : resumos.hashCode());
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
		Assunto other = (Assunto) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (resumos == null) {
			if (other.resumos != null)
				return false;
		} else if (!resumos.equals(other.resumos))
			return false;
		return true;
	}
	
}

