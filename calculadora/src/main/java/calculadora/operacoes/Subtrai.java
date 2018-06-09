package calculadora.operacoes;

import calculadora.model.Conta;

public class Subtrai {

	public float subtrair(Conta conta) {
		return conta.getValorUm() - conta.getValorDois();
	}
}
