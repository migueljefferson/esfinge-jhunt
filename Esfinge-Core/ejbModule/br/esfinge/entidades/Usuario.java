package br.esfinge.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1560701455472816037L;

	@Id
	@Column(name="id_usuario")
	@SequenceGenerator(name="seq_usuario",sequenceName="seq_usuario",initialValue=1)
	@GeneratedValue(generator="seq_usuario",strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name="usu_email", nullable=false)
	private String email;

	@Column(name="usu_senha", nullable=false) 
	private String senha;

	@Column(name="usu_datacadast", nullable=false, updatable=false)
	@Temporal(TemporalType.DATE) 
	private Date dataCadastro;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	private Set<Convite> amizades;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	private Set<Resumo> resumos;
	
	@OneToOne(cascade=CascadeType.ALL, optional=false, fetch=FetchType.EAGER, orphanRemoval=true)
	private Perfil perfil;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Set<Convite> getAmizades() {
		return amizades;
	}

	public void setAmizades(Set<Convite> amizades) {
		this.amizades = amizades;
	}

	public Set<Resumo> getResumos() {
		return resumos;
	}

	public void setResumos(Set<Resumo> resumos) {
		this.resumos = resumos;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((amizades == null) ? 0 : amizades.hashCode());
		result = prime * result
				+ ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((resumos == null) ? 0 : resumos.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Usuario other = (Usuario) obj;
		if (amizades == null) {
			if (other.amizades != null)
				return false;
		} else if (!amizades.equals(other.amizades))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (resumos == null) {
			if (other.resumos != null)
				return false;
		} else if (!resumos.equals(other.resumos))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
}
