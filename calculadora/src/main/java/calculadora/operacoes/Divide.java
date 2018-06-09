package calculadora.operacoes;

import calculadora.model.Conta;

public class Divide {
	
	public float dividir(Conta conta) {
		if( conta.getValorUm()== 0 || conta.getValorDois() == 0) {
			return (conta.getValorUm()*0);
		}
		return (conta.getValorUm() / conta.getValorDois());
	}	
}
