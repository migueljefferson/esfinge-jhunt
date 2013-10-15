package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.esfinge.enums.StatusResumo;

@Entity
@Table(name="tb_resumo")
public class Resumo extends EntidadeGenerica implements Serializable{

	private static final long serialVersionUID = -3624600370647459509L;

	@Column(name="res_titulo")
	private String titulo;
	
	@Column(name="res_texto")
	private String texto;
	
	@Column(name="res_palavraschave")
	private String[] palavrasChave;
	
	@Column(name="res_referencia")
	private String referencia;
	
	@Column(name="res_datapublicacao", updatable=false)
	@Temporal(TemporalType.DATE)
	private Date dataPublicacao;
	
	@Column(name="res_status", nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private StatusResumo status;
	
	@ManyToOne
	@JoinColumn(name="res_usu_id", referencedColumnName="tb_id")
	private Usuario usuario;
	
	@NotNull
	@ManyToMany(mappedBy="tb_resumo", fetch=FetchType.LAZY)
	private Set<Assunto> assuntos;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String[] getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(String[] palavrasChave) {
		this.palavrasChave = palavrasChave;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public StatusResumo getStatus() {
		return status;
	}

	public void setStatus(StatusResumo status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Set<Assunto> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Set<Assunto> assuntos) {
		this.assuntos = assuntos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((assuntos == null) ? 0 : assuntos.hashCode());
		result = prime * result
				+ ((dataPublicacao == null) ? 0 : dataPublicacao.hashCode());
		result = prime * result + Arrays.hashCode(palavrasChave);
		result = prime * result
				+ ((referencia == null) ? 0 : referencia.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
		Resumo other = (Resumo) obj;
		if (assuntos == null) {
			if (other.assuntos != null)
				return false;
		} else if (!assuntos.equals(other.assuntos))
			return false;
		if (dataPublicacao == null) {
			if (other.dataPublicacao != null)
				return false;
		} else if (!dataPublicacao.equals(other.dataPublicacao))
			return false;
		if (!Arrays.equals(palavrasChave, other.palavrasChave))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (status != other.status)
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
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
	
}
