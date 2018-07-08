package br.org.iel.aps02;

import java.util.Map;
import java.util.TreeMap;

import br.org.iel.aps02.factory.IVehicleMaker;
import br.org.iel.aps02.model.IVehicle;

public class Principal {
	
	static Map<Integer, IVehicle> banco;
	public static void main(String[] args) {
		banco = new TreeMap<Integer, IVehicle>();
		IVehicleMaker fabrica = new IVehicleMaker();
		
	
		fabrica.cria("Honda","Fit");
		fabrica.cria("Honda","Civic");
		
	}

}
