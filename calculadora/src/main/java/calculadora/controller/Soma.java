package calculadora.controller;

import calculadora.model.Conta;

public class Soma {

	public double somar(Conta conta) {
		return conta.getValorUm() + conta.getValorDois();
	}	
}
