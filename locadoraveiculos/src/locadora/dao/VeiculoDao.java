package locadora.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import locadora.conexao.ConexaoHibernate;
import locadora.entitys.Veiculo;

public class VeiculoDao extends BaseDao<Veiculo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Atributos da classe
	 */
	private EntityManager em;

	// /**
	// * Construtor
	// */
	// public VeiculoDao() {
	// super();
	// this.setEm(em);
	// }

	/**
	 * Método responsável por fornecer a sessão do entity manager
	 */
	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

	/**
	 * Método para listar todos os veiculos
	 * 
	 * @return
	 */
	public List<Veiculo> listar() {
		EntityManager em = new ConexaoHibernate().getEntityManager();
		em.getTransaction().begin();
		TypedQuery<Veiculo> query = em.createQuery("SELECT DISTINCT v FROM Veiculo v ORDER BY v.id", Veiculo.class);

		em.getTransaction().commit();
		em.close();
		return query.getResultList();
	}

	/**
	 * Getters and setters
	 */
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
