package calculadora.controller;

import calculadora.model.Conta;
import calculadora.operacoes.Divide;
import calculadora.operacoes.Multiplica;
import calculadora.operacoes.Soma;
import calculadora.operacoes.Subtrai;

public class CalculadoraController {

	private Conta conta;

	public String calcula(float valorUm, float valorDois, String operacao) {
		this.conta = new Conta(valorUm, valorDois);

		switch (operacao) {
		case "SOMA":
			return "O resultado obtido foi: " + new Soma().somar(conta);
		case "DIVISAO":
			return "O resultado obtido foi: " + new Divide().dividir(conta);
		case "MULTIPLICACAO":
			return "O resultado obtido foi: " + new Multiplica().multiplicar(conta);
		case "SUBTRACAO":
			return "O resultado obtido foi: " + new Subtrai().subtrair(conta);
		default:
			return "O resultado obtido foi: " + new Divide().dividir(conta);
		}
	}
}
