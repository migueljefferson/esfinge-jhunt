package br.esfinge.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Serializable {

	private static final long serialVersionUID = -6317936336226130062L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idDisciplina;
	
	@Column(nullable=false)
	private String nomeDisciplina;
	
	private String descricaoDisciplina;

	public Long getIdDisciplina() {return idDisciplina;}
	public void setIdDisciplina(Long idDisciplina) {this.idDisciplina = idDisciplina;}

	public String getNomeDisciplina() {return nomeDisciplina;}
	public void setNomeDisciplina(String nomeDisciplina) {this.nomeDisciplina = nomeDisciplina;}

	public String getDescricaoDisciplina() {return descricaoDisciplina;}
	public void setDescricaoDisciplina(String descricaoDisciplina) {this.descricaoDisciplina = descricaoDisciplina;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descricaoDisciplina == null) ? 0 : descricaoDisciplina
						.hashCode());
		result = prime * result
				+ ((idDisciplina == null) ? 0 : idDisciplina.hashCode());
		result = prime * result
				+ ((nomeDisciplina == null) ? 0 : nomeDisciplina.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (descricaoDisciplina == null) {
			if (other.descricaoDisciplina != null)
				return false;
		} else if (!descricaoDisciplina.equals(other.descricaoDisciplina))
			return false;
		if (idDisciplina == null) {
			if (other.idDisciplina != null)
				return false;
		} else if (!idDisciplina.equals(other.idDisciplina))
			return false;
		if (nomeDisciplina == null) {
			if (other.nomeDisciplina != null)
				return false;
		} else if (!nomeDisciplina.equals(other.nomeDisciplina))
			return false;
		return true;
	}
	
}
