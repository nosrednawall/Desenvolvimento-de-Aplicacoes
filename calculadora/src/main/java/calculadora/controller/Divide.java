package calculadora.controller;

import calculadora.model.Conta;

public class Divide {
	
	public double dividir(Conta conta) {
		return conta.getValorUm() / conta.getValorDois();
	}	
}
