package br.esfinge.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.esfinge.enums.EstadoCivil;

@Entity
@Table(name="tb_perfil")
public class Perfil extends EntidadeGenerica implements Serializable{

	private static final long serialVersionUID = -1966212312156562110L;

	@Column(name="per_nome", nullable=false)
	private String nome;
	
	@Column(name="per_apelido")
	private String apelido;
	
	@Column(name="per_datanasc")
	private Date dataNascimento;
	
	@Column(name="per_foto")
	private byte[] foto;
	
	@Column(name="per_livros")
	private String[] livros;
	
	@Column(name="per_sexo", nullable=false)
	private Character sexo;
	
	@Column(name="per_interesses")
	private String[] interesses;
	
	@Column(name="per_estadocivil")
	@Enumerated(EnumType.ORDINAL)
	private EstadoCivil estadoCivil;
	
	@OneToOne
	@JoinColumn(name="per_usu_id", referencedColumnName="tb_id")
	private Usuario usuario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String[] getLivros() {
		return livros;
	}

	public void setLivros(String[] livros) {
		this.livros = livros;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String[] getInteresses() {
		return interesses;
	}

	public void setInteresses(String[] interesses) {
		this.interesses = interesses;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result + Arrays.hashCode(interesses);
		result = prime * result + Arrays.hashCode(livros);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		Perfil other = (Perfil) obj;
		if (apelido == null) {
			if (other.apelido != null)
				return false;
		} else if (!apelido.equals(other.apelido))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (estadoCivil != other.estadoCivil)
			return false;
		if (!Arrays.equals(foto, other.foto))
			return false;
		if (!Arrays.equals(interesses, other.interesses))
			return false;
		if (!Arrays.equals(livros, other.livros))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}
