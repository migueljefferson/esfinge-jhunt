package br.esfinge.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assunto implements Serializable{

	private static final long serialVersionUID = 5538157042163510904L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idAssunto;
	
	@Column(nullable=false)
	private String nomeAssunto;
	
	private String descricaoAssunto;

	public Long getIdAssunto() {return idAssunto;}
	public void setIdAssunto(Long idAssunto) {this.idAssunto = idAssunto;}

	public String getNomeAssunto() {return nomeAssunto;}
	public void setNomeAssunto(String nomeAssunto) {this.nomeAssunto = nomeAssunto;}

	public String getDescricaoAssunto() {return descricaoAssunto;}
	public void setDescricaoAssunto(String descricaoAssunto) {this.descricaoAssunto = descricaoAssunto;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((descricaoAssunto == null) ? 0 : descricaoAssunto.hashCode());
		result = prime * result
				+ ((idAssunto == null) ? 0 : idAssunto.hashCode());
		result = prime * result
				+ ((nomeAssunto == null) ? 0 : nomeAssunto.hashCode());
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
		Assunto other = (Assunto) obj;
		if (descricaoAssunto == null) {
			if (other.descricaoAssunto != null)
				return false;
		} else if (!descricaoAssunto.equals(other.descricaoAssunto))
			return false;
		if (idAssunto == null) {
			if (other.idAssunto != null)
				return false;
		} else if (!idAssunto.equals(other.idAssunto))
			return false;
		if (nomeAssunto == null) {
			if (other.nomeAssunto != null)
				return false;
		} else if (!nomeAssunto.equals(other.nomeAssunto))
			return false;
		return true;
	}
	
}

