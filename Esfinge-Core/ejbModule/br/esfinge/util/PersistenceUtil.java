package br.esfinge.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class PersistenceUtil {

	private static final EntityManager manager = buildEntityManager();
	
	private static EntityManager buildEntityManager(){
		EntityManagerFactory factory = null;
		try{
			factory = Persistence.createEntityManagerFactory("EsfingePU");
			return factory.createEntityManager();
		}finally{
			factory.close();
		}
	}
	
	public static EntityManager getEntityManager(){
		return manager;
	}
	
}
