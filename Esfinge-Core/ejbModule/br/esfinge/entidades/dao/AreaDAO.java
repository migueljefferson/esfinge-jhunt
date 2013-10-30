package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Area;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class AreaDAO extends InterfaceDAOImpl<Area, Long> {

	public AreaDAO() {
		super.setEntidade(Area.class);
		super.setNomeEntidade("Area");
	}
	
	@Override
	public void atualizar(Area entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Area carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Area entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public void salvar(Area entidade) {
		super.salvar(entidade);
	}
	
	@Override
	public List<Area> listar() {
		return super.listar();
	}
	
}
