package br.esfinge.services;

import javax.ejb.Local;

import br.esfinge.entidades.Usuario;


@Local
public interface UsuarioServiceRemote {

	Usuario inserir(Usuario usuario);
	
}
