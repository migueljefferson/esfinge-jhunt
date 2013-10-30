package br.esfinge.interfaceDAO;

import java.util.List;

import javax.ejb.Local;

@Local
public interface InterfaceDAO<T, PK> {
	
	void salvar(T entidade);
	
	void atualizar(T entidade);
	
	void excluir(T entidade);
	
	T carregar(PK primaryKey);
	
	List<T> listar();

}
