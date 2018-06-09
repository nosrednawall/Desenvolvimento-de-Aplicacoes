package calculadora.controller;

import calculadora.model.Conta;

public class Multiplica {

	public double multiplicar(Conta conta) {
		return conta.getValorUm() * conta.getValorDois();
	}	
}
