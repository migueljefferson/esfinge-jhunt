package br.esfinge.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.esfinge.enums.StatusConvite;

@Entity
@Table(name="tb_convite")
public class Convite implements Serializable{

	private static final long serialVersionUID = 5719735525601453492L;

	@Id
	@Column(name="id_convite")
	@SequenceGenerator(name="seq_convite",sequenceName="seq_convite",initialValue=1)
	@GeneratedValue(generator="seq_convite",strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="data_convite", nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConvite;
	
	@Column(name="conv_statusconvite", nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private StatusConvite statusConvite;
	
	@ManyToOne
	@JoinColumn(name="id_usuario",referencedColumnName="id_usuario")
	private Usuario amigo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Usuario getAmigo() {
		return amigo;
	}

	public void setAmigo(Usuario amigo) {
		this.amigo = amigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amigo == null) ? 0 : amigo.hashCode());
		result = prime * result
				+ ((dataConvite == null) ? 0 : dataConvite.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((statusConvite == null) ? 0 : statusConvite.hashCode());
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
		Convite other = (Convite) obj;
		if (amigo == null) {
			if (other.amigo != null)
				return false;
		} else if (!amigo.equals(other.amigo))
			return false;
		if (dataConvite == null) {
			if (other.dataConvite != null)
				return false;
		} else if (!dataConvite.equals(other.dataConvite))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (statusConvite != other.statusConvite)
			return false;
		return true;
	}

	
}
