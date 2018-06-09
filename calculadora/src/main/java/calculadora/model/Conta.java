package calculadora.model;

public class Conta {

	private double valorUm;
	private double valorDois;

	@Override
	public String toString() {
		return "Conta [valorUm=" + valorUm + ", valorDois=" + valorDois + "]";
	}

	public double getValorDois() {
		return valorDois;
	}

	public void setValorDois(double valorDois) {
		this.valorDois = valorDois;
	}

	public double getValorUm() {
		return valorUm;
	}

	public void setValorUm(double valorUm) {
		this.valorUm = valorUm;
	}

}
