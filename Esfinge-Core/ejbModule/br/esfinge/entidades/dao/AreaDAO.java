package br.esfinge.entidades.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.esfinge.entidades.Area;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

@Stateless(mappedName="ejb/AreaDAO")
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
