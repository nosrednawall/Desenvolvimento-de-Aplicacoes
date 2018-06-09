package calculadora.model;

public class Conta {

	private float valorUm;
	private float valorDois;

	public Conta(float valorUm,float valorDois) {
		this.valorUm = valorUm;
		this.valorDois = valorDois;
	}
	
	@Override
	public String toString() {
		return "Conta [valorUm=" + valorUm + ", valorDois=" + valorDois + "]";
	}

	public float getValorDois() {
		return valorDois;
	}

	public void setValorDois(float valorDois) {
		this.valorDois = valorDois;
	}

	public float getValorUm() {
		return valorUm;
	}

	public void setValorUm(float valorUm) {
		this.valorUm = valorUm;
	}

}
