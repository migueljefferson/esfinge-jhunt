package br.esfinge.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.esfinge.enums.StatusConvite;

@Entity
@Table(name="tb_convite")
public class Convite extends EntidadeGenerica implements Serializable{

	private static final long serialVersionUID = 5719735525601453492L;

	@Column(name="con_dataconvite", nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConvite;
	
	@Column(name="con_statusconvite", nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private StatusConvite statusConvite;
	
	@ManyToOne
	@JoinColumn(name="con_convit_id", referencedColumnName="tb_id")
	private Usuario usuarioConvite;
	
	@ManyToOne
	@JoinColumn(name="con_convid_id", referencedColumnName="tb_id")
	private Usuario usuarioConvidado;

	public Date getDataConvite() {
		return dataConvite;
	}

	public void setDataConvite(Date dataConvite) {
		this.dataConvite = dataConvite;
	}

	public StatusConvite getStatusConvite() {
		return statusConvite;
	}

	public void setStatusConvite(StatusConvite statusConvite) {
		this.statusConvite = statusConvite;
	}

	public Usuario getUsuarioConvite() {
		return usuarioConvite;
	}

	public void setUsuarioConvite(Usuario usuarioConvite) {
		this.usuarioConvite = usuarioConvite;
	}

	public Usuario getUsuarioConvidado() {
		return usuarioConvidado;
	}

	public void setUsuarioConvidado(Usuario usuarioConvidado) {
		this.usuarioConvidado = usuarioConvidado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((dataConvite == null) ? 0 : dataConvite.hashCode());
		result = prime * result
				+ ((statusConvite == null) ? 0 : statusConvite.hashCode());
		result = prime
				* result
				+ ((usuarioConvidado == null) ? 0 : usuarioConvidado.hashCode());
		result = prime * result
				+ ((usuarioConvite == null) ? 0 : usuarioConvite.hashCode());
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
		Convite other = (Convite) obj;
		if (dataConvite == null) {
			if (other.dataConvite != null)
				return false;
		} else if (!dataConvite.equals(other.dataConvite))
			return false;
		if (statusConvite != other.statusConvite)
			return false;
		if (usuarioConvidado == null) {
			if (other.usuarioConvidado != null)
				return false;
		} else if (!usuarioConvidado.equals(other.usuarioConvidado))
			return false;
		if (usuarioConvite == null) {
			if (other.usuarioConvite != null)
				return false;
		} else if (!usuarioConvite.equals(other.usuarioConvite))
			return false;
		return true;
	}

}
