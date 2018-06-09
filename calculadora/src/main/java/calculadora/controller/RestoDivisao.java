package calculadora.controller;

import calculadora.model.Conta;

public class RestoDivisao {
	
	public double resto(Conta conta) {
		return conta.getValorUm() % conta.getValorDois();
	}	
}
