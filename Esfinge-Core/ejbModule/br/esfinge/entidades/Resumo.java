package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;

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
	
	//Falta gerar os 'hashCode()' e 'equals()' 
}
