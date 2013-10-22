package br.esfinge.services;

import javax.ejb.Remote;

import br.esfinge.entidades.Usuario;


@Remote
public interface UsuarioServiceRemote {

	Usuario inserir(Usuario usuario);
	
}
