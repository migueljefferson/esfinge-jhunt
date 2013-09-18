package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.esfinge.enums.StatusResumo;

@Entity
public class Resumo implements Serializable{

	
	private static final long serialVersionUID = -4818489979236368386L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idResumo;
	
	private String titulo;
	
	private String texto;
	
	private String[] palavraChave;
	
	private String referencia;
	
	@Column(updatable=false)
	@Temporal(TemporalType.DATE)
	private Date dataPublicacao;
	
	@Enumerated(EnumType.ORDINAL)
	private StatusResumo statusResumo;
	
	public Long getIdResumo() {return idResumo;}
	public void setIdResumo(Long idResumo) {this.idResumo = idResumo;}

	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}

	public String getTexto() {return texto;}
	public void setTexto(String texto) {this.texto = texto;}

	public String[] getPalavraChave() {return palavraChave;}
	public void setPalavraChave(String[] palavraChave) {this.palavraChave = palavraChave;}

	public String getReferencia() {return referencia;}
	public void setReferencia(String referencia) {this.referencia = referencia;}

	public StatusResumo getStatusResumo() {return statusResumo;}
	public void setStatusResumo(StatusResumo statusResumo) {this.statusResumo = statusResumo;}

	public Date getDataPublicacao() {return dataPublicacao;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataPublicacao == null) ? 0 : dataPublicacao.hashCode());
		result = prime * result
				+ ((idResumo == null) ? 0 : idResumo.hashCode());
		result = prime * result + Arrays.hashCode(palavraChave);
		result = prime * result
				+ ((referencia == null) ? 0 : referencia.hashCode());
		result = prime * result
				+ ((statusResumo == null) ? 0 : statusResumo.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Resumo other = (Resumo) obj;
		if (dataPublicacao == null) {
			if (other.dataPublicacao != null)
				return false;
		} else if (!dataPublicacao.equals(other.dataPublicacao))
			return false;
		if (idResumo == null) {
			if (other.idResumo != null)
				return false;
		} else if (!idResumo.equals(other.idResumo))
			return false;
		if (!Arrays.equals(palavraChave, other.palavraChave))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (statusResumo != other.statusResumo)
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
}
