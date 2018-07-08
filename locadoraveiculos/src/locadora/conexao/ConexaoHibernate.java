package locadora.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author anderson
 *
 */
public class ConexaoHibernate {

	/**
	 * Cria uma unidade de persistencia com o banco através das configurações do
	 * nome da unidade de persistencia descrita no persistence.xml
	 */
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("livraria");

	/**
	 * Retorna a unidade instanciada
	 * @return
	 */
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
