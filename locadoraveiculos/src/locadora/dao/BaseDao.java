package locadora.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;

import locadora.conexao.ConexaoHibernate;

/**
 * 
 * @author anderson
 *
 * @param <T> será a classe passada como argumento
 * @param entity entidade que será salva
 */

public abstract class BaseDao<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//construtor em branco
    public BaseDao() {}

    //Administrador de entidade
    protected abstract EntityManager getEntityManager();

    /**
     * Método para salvar uma entidades
     * @param entity
     */
    public void save(T entity) {

		EntityManager em = new ConexaoHibernate().getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			em.close();
		} finally {
			em.getTransaction().commit();
			em.close();
		}
    
    }

    /**
     * Método para atualizar uma entidade
     * @param entity
     * @return
     */
    public void update(T entity) {
		EntityManager em = new ConexaoHibernate().getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			em.close();
		} finally {
			em.getTransaction().commit();
			em.close();
		}
    }
    
    /**
     * Método para remover uma entidade
     * @param entity
     */
    public void remove(T entity) {
        
		EntityManager em = new ConexaoHibernate().getEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			em.close();
		} finally {
			em.getTransaction().commit();
			em.close();
		}
    }

    /**
     * Método para procurar uma entidade pelo id
     * @param type
     * @param id
     * @return
     */
    public T find(Class<T> type, Object id) {
    	T entity;
    	EntityManager em = new ConexaoHibernate().getEntityManager();
		try {
			em.getTransaction().begin();
			entity = em.find(type, id);
			em.getTransaction().commit();
			em.close();
		} finally {
			em.getTransaction().commit();
			em.close();
		}
		return entity;
    }
}
