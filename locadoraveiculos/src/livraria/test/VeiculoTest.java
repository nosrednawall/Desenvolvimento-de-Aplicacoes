package livraria.test;

import java.util.List;

import locadora.dao.VeiculoDao;
import locadora.entitys.Veiculo;

public class VeiculoTest {

	public static void main(String[] args) {
		VeiculoDao dao = new VeiculoDao();
		
		Integer idDoVeiculo = 1;

		/**
		 * Cria o objeto
		 */
		Veiculo veiculo = new Veiculo();
		imprime(veiculo);

		/**
		 * Atribui valores aos atributos do objeto
		 */
		veiculo.setMarca("Volvo");
		veiculo.setModelo("V890");
		veiculo.setChassi("8838383");

		imprime(veiculo);
		/**
		 * Persiste o objeto
		 */
		dao.save(veiculo);

		/**
		 * Lista veiculos e pega id
		 */
		List<Veiculo> veiculos = dao.listar();
		for (Veiculo veiculo2 : veiculos) {
			imprime(veiculo2);
			idDoVeiculo = veiculo2.getId();
		}
		
		/**
		 * Busca um veiculo
		 */
		Veiculo veiculo3 = dao.find(Veiculo.class, idDoVeiculo);
		imprime(veiculo3);

		/**
		 * Altera o veiculo
		 */
		veiculo3.setMarca("Marca Qualquer");
		veiculo3.setModelo("Modelo Qualquer");
		veiculo3.setChassi("Chassi Qualquer");

		dao.update(veiculo3);
		imprime(veiculo3);

		/**
		 * Limpa o veiculo
		 */
		veiculo3 = new Veiculo();
		imprime(veiculo3);

		/**
		 * Imprime os dados do veiculo alterado
		 */
		System.out.println(dao.find(Veiculo.class, idDoVeiculo));
		
		/**
		 * Remove o veiculo
		 */
		Veiculo veiculo4 = new Veiculo();
		veiculo4 = dao.find(Veiculo.class, idDoVeiculo);
		if(veiculo4 != null) {
			dao.remove(veiculo4);
		}
	}

	public static void imprime(Veiculo veiculo) {
		System.out.println(veiculo);
	}
}
