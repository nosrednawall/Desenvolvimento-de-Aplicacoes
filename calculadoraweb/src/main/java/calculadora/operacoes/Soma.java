package calculadora.operacoes;

import calculadora.model.Conta;

public class Soma {

	public float somar(Conta conta) {
		return conta.getValorUm() + conta.getValorDois();
	}	
}
