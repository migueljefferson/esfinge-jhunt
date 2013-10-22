package br.esfinge.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.esfinge.entidades.Usuario;
import br.esfinge.services.UsuarioServiceRemote;

@Stateless
public class UsuarioServiceImpl implements UsuarioServiceRemote{

	@PersistenceContext(unitName="EsfingePU")
	private EntityManager manager;
	
	@Override
	public Usuario inserir(Usuario usuario) {
		manager.persist(usuario);
		return usuario;
	}

}
