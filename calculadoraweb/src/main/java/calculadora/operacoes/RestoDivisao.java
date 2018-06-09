package calculadora.operacoes;

import calculadora.model.Conta;

public class RestoDivisao {
	
	public float resto(Conta conta) {
		return conta.getValorUm() % conta.getValorDois();
	}	
}
