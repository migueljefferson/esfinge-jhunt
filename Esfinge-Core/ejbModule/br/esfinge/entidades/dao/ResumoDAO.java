package br.esfinge.entidades.dao;

import java.util.List;

import br.esfinge.entidades.Resumo;
import br.esfinge.entidades.Usuario;
import br.esfinge.interfaceDAO.InterfaceDAOImpl;

public class ResumoDAO extends InterfaceDAOImpl<Resumo, Long>{

	public ResumoDAO() {
		super.setEntidade(Resumo.class);
		super.setNomeEntidade("Resumo");
	}
	
	@Override
	public void atualizar(Resumo entidade) {
		super.atualizar(entidade);
	}
	
	@Override
	public Resumo carregar(Long primaryKey) {
		return super.carregar(primaryKey);
	}
	
	@Override
	public void excluir(Resumo entidade) {
		super.excluir(entidade);
	}
	
	@Override
	public List<Resumo> listar() {
		return super.listar();
	}
	
	@Override
	public void salvar(Resumo entidade) {
		super.salvar(entidade);
	}
	
	@SuppressWarnings("unchecked")
	public List<Resumo> listarPorUsuario(Usuario usuario){
		return super.manager.createQuery("SELECT r FROM Resumo r Usuario u WHERE u.id = "
					+usuario.getId()).getResultList();
	}
	
}
