package br.esfinge.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area implements Serializable{

	private static final long serialVersionUID = 8008199863066677364L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idArea;
	
	@Column(nullable=false)
	private String nomeArea;
	
	private String descricaoArea;

	public Long getIdArea() {return idArea;}
	public void setIdArea(Long idArea) {this.idArea = idArea;}

	public String getNomeArea() {return nomeArea;}
	public void setNomeArea(String nomeArea) {this.nomeArea = nomeArea;}

	public String getDescricaoArea() {return descricaoArea;}
	public void setDescricaoArea(String descricaoArea) {this.descricaoArea = descricaoArea;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricaoArea == null) ? 0 : descricaoArea.hashCode());
		result = prime * result + ((idArea == null) ? 0 : idArea.hashCode());
		result = prime * result
				+ ((nomeArea == null) ? 0 : nomeArea.hashCode());
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
		Area other = (Area) obj;
		if (descricaoArea == null) {
			if (other.descricaoArea != null)
				return false;
		} else if (!descricaoArea.equals(other.descricaoArea))
			return false;
		if (idArea == null) {
			if (other.idArea != null)
				return false;
		} else if (!idArea.equals(other.idArea))
			return false;
		if (nomeArea == null) {
			if (other.nomeArea != null)
				return false;
		} else if (!nomeArea.equals(other.nomeArea))
			return false;
		return true;
	}
	
}

