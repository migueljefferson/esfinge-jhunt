package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Usuario;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class UsuarioDAO extends InterfaceDAOImpl<Usuario, String>{
	
	public UsuarioDAO() {
		super.setEntidade(new Usuario());
		super.setNomeEntidade("Usuario");
	}
	
	@Override
	public void salvar(Usuario entidade) {
		super.salvar(entidade);
	}
	
	@Override
	public void atualizar(Usuario entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public void excluir(Usuario entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public Usuario carregar(String primaryKey) {
		return super.carregar(primaryKey);
	}

	@Override
	public List<Usuario> listar() {
		return super.listar();
	}
}
