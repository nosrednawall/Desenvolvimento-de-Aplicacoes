package calculadora.controller;

import calculadora.model.Conta;

public class Subtrai {
	
	public double subtrair(Conta conta) {
		return conta.getValorUm() - conta.getValorDois();
	}	
}
