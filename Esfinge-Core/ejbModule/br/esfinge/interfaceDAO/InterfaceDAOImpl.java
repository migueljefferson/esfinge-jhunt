package br.esfinge.interfaceDAO;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;

public class InterfaceDAOImpl<T, PK> implements InterfaceDAO<T, PK> {

	private Session sessao;
	private T entidade;
	
	public void setSessao(Session sessao){
		this.sessao = sessao;
	}
	
	@Override
	public void salvar(T entidade) {
		this.sessao.save(entidade);
	}

	@Override
	public void atualizar(T entidade) {
		this.sessao.update(entidade);
	}

	@Override
	public void excluir(T entidade) {
		this.sessao.delete(entidade);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T carregar(PK primaryKey) {
		return (T) this.sessao.get(entidade.getClass(), (Serializable) primaryKey);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar() {
		return this.sessao.createCriteria(entidade.getClass()).list();
	}

}
