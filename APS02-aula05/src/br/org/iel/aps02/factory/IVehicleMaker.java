package br.org.iel.aps02.factory;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

import br.org.iel.aps02.model.IVehicle;

public class IVehicleMaker {
	
	static Map<Integer, IVehicle> banco = new TreeMap<Integer, IVehicle>();
	private IVehicle veiculo;
	public void cria(String marca, String modelo) {
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setId(Random.class.hashCode());
		banco.put(veiculo.getId(), veiculo);
		
		System.out.println(this.veiculo.getMarca() + "\t"+ this.veiculo.getModelo());
	}

	public void descreveVeiculo(IVehicle veiculo) {
		System.out.println(this.veiculo.getMarca() + "\t"+ this.veiculo.getModelo());
	}
}
