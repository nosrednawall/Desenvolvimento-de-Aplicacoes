package agenciafinanceira.controller;

import agenciafinanceira.entity.Cotacao;

public class CalculoCambio {

	public String calculaCambio(Cotacao cotacao) {

		double valorReal = valoresCotacaoReal(cotacao);
		double valorInflacao = valoresInflacao(cotacao);
		double resultado = calcula(cotacao, valorReal, valorInflacao);

		return String.valueOf(resultado);
	}

	private double calcula(Cotacao cotacao, double valorReal, double valorInflacao) {
		double resultado = cotacao.getValorInformado()*valorReal;
		
		double diasInflacao = cotacao.getQtdaDias()*valorInflacao;
		
		return resultado+diasInflacao;
	}

	private double valoresInflacao(Cotacao cotacao) {
		double resultado;
		switch (cotacao.getMoedaCotada()) {
		case BOLIVARIANO:
			resultado = 0.01;
			break;

		case DOLAR_CANADENSE:
			resultado = 0.08;
			break;

		case DOLAR_EUA:
			resultado = 0.08;
			break;

		case EURO:
			resultado = 0.08;
			break;

		case GUARANIS:
			resultado = 0.01;
			break;

		case LIBRA_ESTERLINA:
			resultado = 0.08;
			break;

		case PESO_ARGENTINO:
			resultado = 0.02;
			break;

		case PESO_MEXICANO:
			resultado = 0.02;
			break;

		case PESO_USUGUAIO:
			resultado = 0.02;
			break;

		default:
			resultado = 0;
			break;
		}
		return resultado;
	}

	private double valoresCotacaoReal(Cotacao cotacao) {
		double resultado;
		switch (cotacao.getMoedaCotada()) {
		case BOLIVARIANO:
			resultado = 0.54;
			break;

		case DOLAR_CANADENSE:
			resultado = 2.83;
			break;

		case DOLAR_EUA:
			resultado = 3.74;
			break;

		case EURO:
			resultado = 4.34;
			break;

		case GUARANIS:
			resultado = 0.03;
			break;

		case LIBRA_ESTERLINA:
			resultado = 4.95;
			break;

		case PESO_ARGENTINO:
			resultado = 0.14;
			break;

		case PESO_MEXICANO:
			resultado = 0.18;
			break;

		case PESO_USUGUAIO:
			resultado = 0.12;
			break;

		default:
			resultado = 0;
			break;
		}
		return resultado;
	}


}
