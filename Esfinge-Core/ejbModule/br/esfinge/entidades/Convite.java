package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.esfinge.enums.StatusConvite;

@Entity
@Table(name="tb_usuario_convite")
public class Convite implements Serializable{

	private static final long serialVersionUID = -7759812373074347528L;
	
	@Column(name="data_convite", nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataConvite;
	
	@Column(name="status_convite", nullable=false)
	@Enumerated(EnumType.ORDINAL)
	private StatusConvite statusConvite;
	
	@ManyToOne
	private Usuario usuario;

}
