package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="tb_usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 7125655873018001520L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Email(message="Informe um e-mail válido!",regexp="[a-zA-Z0-9\\-\\_\\.]+@[a-zA-z0-9\\-\\_\\.]+")
	private String email;

	@Column(nullable=false) 
	@Size(min=6, message="A senha deve conter no mínimo 6 caracteres!")
	private String senha;

	@Column(nullable=false, updatable=false)
	@Temporal(TemporalType.DATE) 
	private Date dataCadastro;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(table="tb_usuario_convite", referencedColumnName="usuario")
	private List<Usuario> amigos;
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	public String getSenha() {return senha;}
	public void setSenha(String senha) {this.senha = senha;}

	public void setDate(Date dataCadastro){this.dataCadastro = dataCadastro;}
	public Date getDataCadastro() {return dataCadastro;} 
	
	public Long getAmigos() {return id;}
	public void setAmigos(Long id) {this.id = id;}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
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
		Usuario other = (Usuario) obj;
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
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		return true;
	}
	
	
	
}
