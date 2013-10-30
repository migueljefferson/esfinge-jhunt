package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Disciplina;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class DisciplinaDAO extends InterfaceDAOImpl<Disciplina, Long>{

	public DisciplinaDAO() {
		super.setEntidade(Disciplina.class);
		super.setNomeEntidade("Disciplina");
	}
	
	@Override
	public void atualizar(Disciplina entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Disciplina carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Disciplina entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public List<Disciplina> listar() {
		return super.listar();
	}
	
	@Override
	public void salvar(Disciplina entidade) {
		super.salvar(entidade);
	}
	
}
