package calculadora.operacoes;

import calculadora.model.Conta;

public class Multiplica {

	public float multiplicar(Conta conta) {
		return conta.getValorUm() * conta.getValorDois();
	}	
}
