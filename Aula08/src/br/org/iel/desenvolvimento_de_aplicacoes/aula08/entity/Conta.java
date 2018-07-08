package br.org.iel.desenvolvimento_de_aplicacoes.aula08.entity;

//classe do objeto conta
public class Conta {
	
	//atribustos em private
	private float valorConta;
	private float porcentagemGorjeta;
	private float totalConta;
	private float totalGorjeta;

	//construtor
	public Conta(float valorConta, float porcentagemGorjeta) {
		this.valorConta = valorConta;
		this.porcentagemGorjeta = porcentagemGorjeta;
	}
	
	//getters and setters
	public float getTotalGorjeta() {
		return totalGorjeta;
	}


	public void setTotalGorjeta(float totalGorjeta) {
		this.totalGorjeta = totalGorjeta;
	}

	public float getValorConta() {
		return valorConta;
	}


	public void setValorConta(float valorConta) {
		this.valorConta = valorConta;
	}


	public float getPorcentagemGorjeta() {
		return porcentagemGorjeta;
	}

	public void setPorcentagemGorjeta(float porcentagemGorjeta) {
		this.porcentagemGorjeta = porcentagemGorjeta;
	}

	public float getTotalConta() {
		return totalConta;
	}

	public void setTotalConta(float totalConta) {
		this.totalConta = totalConta;
	}
	
	
}
