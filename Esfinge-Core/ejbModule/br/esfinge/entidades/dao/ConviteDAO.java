package br.esfinge.entidades.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.esfinge.entidades.Convite;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

@Stateless(mappedName="ejb/ConviteDAO")
public class ConviteDAO extends InterfaceDAOImpl<Convite, Long>{

	public ConviteDAO() {
		super.setEntidade(Convite.class);
		super.setNomeEntidade("Convite");
	}
	
	@Override
	public void atualizar(Convite entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Convite carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Convite entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public List<Convite> listar() {
		return super.listar();
	}
	
	@Override
	public void salvar(Convite entidade) {
		super.salvar(entidade);
	}
	
}
