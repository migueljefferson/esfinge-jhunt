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

import br.esfinge.enums.EstadoCivil;

@Entity
public class Perfil implements Serializable{

	private static final long serialVersionUID = 3809292828036356581L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idPerfil;
	
	@Column(nullable=false)
	private String nomePerfil;
	
	private String apelido;
	
	private Date dataNascimento;
	
	private byte[] foto;
	
	private String[] livro;
	
	private Character sexo;
	
	private String[] interesses;
	
	@Enumerated(EnumType.ORDINAL)
	private EstadoCivil estadoCivil;

	public Long getIdPerfil() {return idPerfil;}
	public void setIdPerfil(Long idPerfil) {this.idPerfil = idPerfil;}

	public String getNomePerfil() {return nomePerfil;}
	public void setNomePerfil(String nomePerfil) {this.nomePerfil = nomePerfil;}

	public String getApelido() {return apelido;}
	public void setApelido(String apelido) {this.apelido = apelido;}

	public Date getDataNascimento() {return dataNascimento;}
	@SuppressWarnings("deprecation")
	public void setDataNascimento(int year, int month, int day) {this.dataNascimento = new Date(year, month, day);}

	public byte[] getFoto() {return foto;}
	public void setFoto(byte[] foto) {this.foto = foto;}

	public String[] getLivro() {return livro;}
	public void setLivro(String[] livro) {this.livro = livro;}

	public Character getSexo() {return sexo;}
	public void setSexo(Character sexo) {this.sexo = sexo;}

	public String[] getInteresses() {return interesses;}
	public void setInteresses(String[] interesses) {this.interesses = interesses;}

	public EstadoCivil getEstadoCivil() {return estadoCivil;}
	public void setEstadoCivil(EstadoCivil estadoCivil) {this.estadoCivil = estadoCivil;}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apelido == null) ? 0 : apelido.hashCode());
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result
				+ ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
		result = prime * result + Arrays.hashCode(foto);
		result = prime * result
				+ ((idPerfil == null) ? 0 : idPerfil.hashCode());
		result = prime * result + Arrays.hashCode(interesses);
		result = prime * result + Arrays.hashCode(livro);
		result = prime * result
				+ ((nomePerfil == null) ? 0 : nomePerfil.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		if (idPerfil == null) {
			if (other.idPerfil != null)
				return false;
		} else if (!idPerfil.equals(other.idPerfil))
			return false;
		if (!Arrays.equals(interesses, other.interesses))
			return false;
		if (!Arrays.equals(livro, other.livro))
			return false;
		if (nomePerfil == null) {
			if (other.nomePerfil != null)
				return false;
		} else if (!nomePerfil.equals(other.nomePerfil))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	
	
	
}
