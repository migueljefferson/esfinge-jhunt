package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Perfil;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class PerfilDAO extends InterfaceDAOImpl<Perfil, Long>{

	public PerfilDAO() {
		super.setEntidade(Perfil.class);
		super.setNomeEntidade("Perfil");
	}
	
	@Override
	public void atualizar(Perfil entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Perfil carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Perfil entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public List<Perfil> listar() {
		return super.listar();
	}
	
	@Override
	public void salvar(Perfil entidade) {
		super.salvar(entidade);
	}
	
}
