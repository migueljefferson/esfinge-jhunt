package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Assunto;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class AssuntoDAO extends InterfaceDAOImpl<Assunto, Long>{

	public AssuntoDAO() {
		super.setEntidade(Assunto.class);
		super.setNomeEntidade("Assunto");
	}
	
	@Override
	public void atualizar(Assunto entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Assunto carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Assunto entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public List<Assunto> listar() {
		return super.listar();
	}
	
	@Override
	public void salvar(Assunto entidade) {
		super.salvar(entidade);
	}
	
	
	
}
