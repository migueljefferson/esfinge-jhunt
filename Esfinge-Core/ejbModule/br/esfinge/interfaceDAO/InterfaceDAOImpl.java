package br.esfinge.interfaceDAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class InterfaceDAOImpl<T, PK> implements InterfaceDAO<T, PK> {

	@PersistenceContext(unitName="EsfingePU")
	protected EntityManager manager;
	private Class<T> entidade;
	private String nomeEntidade;
	
	public void setEntidade(Class<T> entidade){
		this.entidade = entidade;
	}
	
	public void setNomeEntidade(String nomeEntidade){
		this.nomeEntidade = nomeEntidade;
	}
	
	@Override
	public void salvar(T entidade) {
		this.manager.getTransaction().begin();
		this.manager.persist(entidade);
		this.manager.getTransaction().commit();
		this.manager.close();
	}

	@Override
	public void atualizar(T entidade) {
		this.manager.getTransaction().begin();
		this.manager.merge(entidade);
		this.manager.getTransaction().commit();
		this.manager.close();
	}

	@Override
	public void excluir(T entidade) {
		this.manager.getTransaction().begin();
		this.manager.remove(entidade);
		this.manager.getTransaction().commit();
		this.manager.close();
	}

	@Override
	public T carregar(PK primaryKey) {
		return (T) this.manager.find(entidade, primaryKey);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar() {
		return this.manager.createQuery("SELECT e FROM "+nomeEntidade+" as e").getResultList();
	}

}
