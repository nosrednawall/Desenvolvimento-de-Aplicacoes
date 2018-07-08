package br.org.iel.desenvolvimento_de_aplicacoes.aula08.controller;

import br.org.iel.desenvolvimento_de_aplicacoes.aula08.entity.Conta;

//classe criada para efetuar as lógicas do programa, referente a gorjeta
public class Logica {
	
	//método retorna a gorjeta
	public float calculaGorjeta(Conta conta) {

		return (float) ((conta.getPorcentagemGorjeta() / 100.0) * conta.getValorConta());
	}

	//método retorna o total da conta
	public float calculaTotal(Conta conta) {
		return conta.getTotalGorjeta() + conta.getValorConta();
	}
}
